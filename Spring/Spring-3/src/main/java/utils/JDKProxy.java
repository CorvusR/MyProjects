package utils;

import dao.StudentDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = {StudentDao.class};
        Proxy.getInvocationHandler(JDKProxy.class.getClassLoader(), interfaces,);
    }
}

class StudentDaoProxy implements InvocationHandler {
    private Object obj;

    public StudentDaoProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}