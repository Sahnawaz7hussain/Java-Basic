class Student {
    private String name;
    private int roll;
    private static final String SCHOOL_NAME = "XYZ School"; // Use final if school name is constant

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void printStudentDetails() {
        System.out.println(this.name + ", " + this.roll + ", " + SCHOOL_NAME);
    }

    public static void printSchoolName() {
        System.out.println(SCHOOL_NAME);
    }
}

public class StaticImplementation {
    public static void main(String[] args) {
        Student s1 = new Student("Hussain", 5);
        s1.printStudentDetails();

        // Static method called with class name
        Student.printSchoolName();

        // Access static variable directly (if not private)
        // System.out.println(Student.SCHOOL_NAME); // if it's public or has a getter
    }
}