/*Encapsulation in Java is the practice of bundling data (variables) and methods that operate on that data into a single unit—typically a class. It restricts direct access to some components, using access modifiers like private, and provides controlled access through public getters and setters. This promotes data hiding, enhances security, and improves maintainability by preventing unintended interference and allowing changes without affecting external code. */
class Person {
    private String name;
    private int age;

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

}

public class EncapsulatonImplement {

    public static void main(String[] args) {
        Person p1 = new Person();
        /*
         * Can't access private variables directly for that whe have to use getter and
         * setters method
         */
        p1.setName("Rohit Kumar");
        p1.setAge(40);

        System.err.println(p1.getName() + " is " + p1.getAge() + " years old.");

        Person p2 = new Person();
        p2.setName("Hussain");
        p2.setAge(30);

        System.err.println(p2.getName() + " is " + p2.getAge() + " years old.");
    }
}