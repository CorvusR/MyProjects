package dao;

public class SecondImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("second");
    }
}
