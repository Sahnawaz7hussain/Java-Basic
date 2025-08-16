
public class Strings {
    public static void main(String[] args) {
        String fName = "  Sahnawaz  ";
        String lName = new String("Hussain");
        String fullName = fName + " " + lName;
        System.out.println("Full Name: " + fullName);
        // System.out.println(lName.length());
        // fName = fName.replace('h', 's'); // We can replace characters in a string
        fName = fName.toUpperCase(); // Convert to uppercase
        printEachCharacterInNewLine(fName);

    }

    public static void printEachCharacterInNewLine(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

}