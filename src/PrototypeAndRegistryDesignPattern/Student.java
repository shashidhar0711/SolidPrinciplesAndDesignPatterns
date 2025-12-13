package PrototypeAndRegistryDesignPattern;

public class Student implements Prototype<Student>{

    String name;
    int id;

    Student() {

    }

    Student (Student obj) {
        this.name = obj.name;
        this.id = obj.id;
    }

    @Override
    public Student clone() {
        Student s = new Student(this);
        return s;
    }
}
