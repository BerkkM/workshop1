public class stringMethods {
    public static void main(String[] args) {
        // length()
        String str = "Hello, world!";
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // charAt(int index)
        char ch = str.charAt(1);
        System.out.println("Character at index 1: " + ch);

        // toUpperCase()
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseStr);

        // toLowerCase()
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerCaseStr);

        // substring(int beginIndex)
        String subStr1 = str.substring(7);
        System.out.println("Substring from index 7: " + subStr1);

        // substring(int beginIndex, int endIndex)
        String subStr2 = str.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + subStr2);

        // indexOf(String str)
        int index = str.indexOf("world");
        System.out.println("Index of 'world': " + index);

        // endsWith(String suffix)
        boolean endsWithWorld = str.endsWith("world!");
        System.out.println("String ends with 'world!': " + endsWithWorld);
    }
}
