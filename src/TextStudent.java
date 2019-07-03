import model.Student;

public class TextStudent {
    public static void main(String[] args) {
        Student s1 = new Student("张三",12,'男',"1234");
        System.out.println("姓名："+s1.getName());
        System.out.println("年龄："+s1.getAge());
        System.out.println("性别："+s1.getSex());
        System.out.println("学号："+s1.getNumber());
    }
}
