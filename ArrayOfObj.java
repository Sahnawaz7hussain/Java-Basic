class Student {
    int rol;
    String name;
    int marks;

    public Student(int rol, String name, int marks) {
        this.rol = rol;
        this.name = name;
        this.marks = marks;
    }

    public void getStudentDetails() {
        System.out.println("Name: " + this.name + ", Roll: " + this.rol + ", Marks: " + this.marks);
    }
}

public class ArrayOfObj {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Hussain", 88);
        Student s2 = new Student(2, "Karim", 98);
        Student s3 = new Student(1, "Hasim", 76);

        Student[] studentsArr = new Student[3];
        studentsArr[0] = s1;
        studentsArr[1] = s2;
        studentsArr[2] = s3;

        for (Student student : studentsArr) {
            student.getStudentDetails();

        }

    }

}
