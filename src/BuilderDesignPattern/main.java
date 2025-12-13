package BuilderDesignPattern;

public class main {
    static void main(String[] args) {
        Student s = Student.getInstance()
                    .setAge(9)
                    .setName("Shashidhar")
                    .build();

       System.out.println("debug");
    }
}
