public class StrBuffer {
    public static void main(String[] args) {
        /*
         * A StringBuffer in Java is a special class used to create and modify strings
         * in a flexible way. Unlike regular strings, which cannot be changed, a
         * StringBuffer allows you to add, remove, or change characters efficiently. It
         * is useful when you need to perform many string operations, like building or
         * editing text.
         */
        StringBuffer str1 = new StringBuffer("Sahnawaz");

        // append string
        str1.append(" Hussain");

        // convert to String
        String s2 = str1.toString();

        // delete a part of string
        str1.delete(2, 4);

        // find a substring from the string buffer;
        StringBuffer sbStr = new StringBuffer(str1.substring(2, 5));
        System.out.println(sbStr);
    }
}
