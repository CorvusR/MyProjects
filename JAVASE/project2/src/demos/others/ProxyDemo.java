package demos.others;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Factory {
    public void manufacture();
}

class ComputerFactory implements Factory {
    @Override
    public void manufacture() {
        System.out.println("生产");
    }
}

class MyInvocationHandler implements InvocationHandler {
    private Object proxyObj;

    public Object bind(Object proxyObj) {
        this.proxyObj = proxyObj;
        return Proxy.newProxyInstance(proxyObj.getClass().getClassLoader(), proxyObj.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("收钱");
        Object result = method.invoke(proxyObj, args);
        System.out.println("代理完成");
        return result;
    }
}

public class ProxyDemo {
    public static void main(String[] args) {
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        ComputerFactory computerFactory = new ComputerFactory();
        Object factoryProxy = myInvocationHandler.bind(computerFactory);
        Factory factory = (Factory) factoryProxy;
        factory.manufacture();
    }
}