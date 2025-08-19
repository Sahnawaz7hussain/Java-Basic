class Main {
    public static void main(String[] args) {
        String str = "Wow Nice GrEaT wOw";
        transformStringToLowercase(str);
    }

    public static void loopThroughString(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void reverseLoopOnString(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }
    }

    public static void subStringOfString(String str, int beginIndex, int endIndex) {
        String newSubString = str.substring(beginIndex, endIndex);
        System.out.println(newSubString);
    }

    public static void indexOfSubString(String str, String subStr) {
        int index = str.indexOf(subStr);
        System.out.println(index);
    }

    public static void compareStrings(String str1, String str2) {
        boolean res = str1.equals(str2);
        System.out.println(res);
    }

    public static void transformStringToUppercase(String str) {
        System.out.println(str.toUpperCase());
    }

    public static void transformStringToLowercase(String str) {
        System.out.println(str.toLowerCase());
    }

}