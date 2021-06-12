package projects.student;

import java.util.*;

public class Implements implements Interfaces {
    private Map<Integer, Bean> students = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void showAll() {
        Set<Integer> sids = students.keySet();
        for (int a : sids) {
            System.out.println(students.get(a));
        }
    }

    @Override
    public boolean add() {

        int id = Utils.inputNum("请输入学号", sc);
        String name = Utils.inputString("请输入姓名", sc);
        int age = Utils.inputNum("请输入年龄", sc);
        Bean.Gender gender = Utils.inputString("请输入性别", sc).equals("男") ? Bean.Gender.男 : Bean.Gender.女;
        Bean bean = new Bean(id, name, age, gender);
        students.put(id, bean);
        System.out.println("添加成功!");
        return true;
    }

    @Override
    public Bean findById(int id) {
        id = Utils.inputNum("请输入学号", sc);
        Bean student = students.get(id);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("学生不存在，请重新输入");
        }
        return student;
    }

    @Override
    public List<Bean> findByName(String name) {
        List<Bean> list = new ArrayList<>();
        name = Utils.inputString("请输入姓名", sc);
        for (int key : students.keySet()) {
            if (students.get(key).getName().equals(name)){
                list.add(students.get(key));
            }
        }
        for (Bean bean : list) {
            System.out.println(bean);
        }
        return list;
    }

    @Override
    public boolean removeById(int id) {
        id = sc.nextInt();
        students.remove(id);
        return true;
    }

    @Override
    public boolean modifyById(int id) {
        id = sc.nextInt();
        int newId = sc.nextInt();
        String newName = sc.next();
        int newAge = sc.nextInt();
        Bean.Gender newGender = sc.next().equals("男")? Bean.Gender.男: Bean.Gender.女;
        students.get(id).setId(newId);
        students.get(id).setAge(newAge);
        students.get(id).setGender(newGender);
        students.get(id).setName(newName);
        return true;
    }
}
