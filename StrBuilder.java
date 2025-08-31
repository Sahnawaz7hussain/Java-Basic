public class StrBuilder {
    public static void main(String[] args) {
        /*
         * A StringBuilder in Java is similar to StringBuffer but is faster because it's
         * not thread-safe. It's a mutable sequence of characters that lets you modify
         * strings without creating new objects. You can append, insert, delete, or
         * replace characters. Use StringBuilder when you need to manipulate strings
         * frequently in a single thread.
         */

        StringBuilder str1 = new StringBuilder("Hello");
        str1.append(" World");
        str1.append(8);
        str1.append('a');
        str1.deleteCharAt(3);
        System.out.println(str1);
    }
}
