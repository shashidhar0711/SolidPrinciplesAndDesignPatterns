package PrototypeAndRegistryDesignPattern;

public class main {

    static void FillRegistry(StudentRegistry studentRegistry) {
        InStudent Ins = new InStudent();
        studentRegistry.Add("InStudent", Ins);
        Student stu = new Student();
        studentRegistry.Add("Student", stu);
        Student s2 =  new Student();
        s2.name = "Shashidhar";
        studentRegistry.Add("ShashidharStudent", s2);
    }


    static void main(String[] args) {
        Student student = new Student();
        student.name = "Shashi";
        student.id = 1;

        Student student2 = student.clone();

        InStudent inStudent = new InStudent();
        inStudent.id = 4;
        inStudent.name = "Shashidhar";
        inStudent.batch = "A";
        inStudent.rank = 5;

        Student ins = inStudent.clone();

        // Creating the registry
        StudentRegistry studentRegistry = new StudentRegistry();
        FillRegistry(studentRegistry);

        Student CopyOfStudent = studentRegistry.Get("Student");
        CopyOfStudent.name = "Sridhar";
//        CopyOfStudent.clone(); // it may create a copy object of student with name was changed by someone
        Student CopyOfStudent2 = studentRegistry.Get("ShashidharStudent");

        System.out.println("debug");
    }
}
