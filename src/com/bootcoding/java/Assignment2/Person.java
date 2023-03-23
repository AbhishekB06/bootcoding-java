package com.bootcoding.java.Assignment2;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBasic() {
        return basic;
    }

    public void setBasic(int basic) {
        this.basic = basic;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", basic=" + basic +
                '}';
    }

    private String name;
    private  int  age;
    private int basic;
}
class MyPerson{
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Deepak");
        person.setAge(27);
        person.setBasic(100000);
        System.out.println(person);
    }
}