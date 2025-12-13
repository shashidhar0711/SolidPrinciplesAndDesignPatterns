package PrototypeAndRegistryDesignPattern;

public class InStudent extends Student implements Prototype<Student>{

    String batch;
    int rank;

    InStudent() {

    }

    InStudent(InStudent obj) {
        super(obj);
        this.batch = obj.batch;
        this.rank = obj.rank;
    }

    @Override
    public Student clone() {
        InStudent inStudent = new InStudent(this);
        return inStudent;
    }
}
