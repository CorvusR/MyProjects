package dao;

public class FirstImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("first");
    }
}
