package BuilderDesignPattern;

public class Student {
    String name;
    int id;
    double psp;
    int age;
    int gradYear;
    String email;

    private Student(StudentHelper studentHelper) {
        this.age = studentHelper.age;
        this.id = studentHelper.id;
        this.email = studentHelper.email;
        this.psp = studentHelper.psp;
        this.name = studentHelper.name;
        if(studentHelper.gradYear != 0) {
            this.gradYear = studentHelper.gradYear;
        }
    }

    static StudentHelper getInstance() {
        return new StudentHelper();
    }

    static class StudentHelper {
        String name;
        int id;
        double psp;
        int age;
        int gradYear;
        String email;

        public String getName() {
            return name;
        }

        public StudentHelper setName(String name) {
            this.name = name;
            return this;
        }

        public int getId() {
            return id;
        }

        public StudentHelper setId(int id) {
            this.id = id;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public void setPsp(double psp) {
            this.psp = psp;
        }

        public int getAge() {
            return age;
        }

        public StudentHelper setAge(int age) {
            this.age = age;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public void setGradYear(int gradYear) {
            this.gradYear = gradYear;
        }

        public String getEmail() {
            return email;
        }

        public StudentHelper setEmail(String email) {
            this.email = email;
            return this;
        }

        public Student build() {
            if (this.age < 10) {
                throw new IllegalArgumentException("Age can't be less than 10");
            }
            return new Student(this);
        }
    }
}
