package model;

public class Student {
    private String name;   //姓名
    private int age;      //年龄
    private char sex;      //性别
    private String number; //学号

    public Student(String name,int age,char sex,String number){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
