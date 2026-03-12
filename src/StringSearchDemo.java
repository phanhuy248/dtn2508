public class StringSearchDemo {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = str.indexOf("World");
        int index1 = str.indexOf("!");
        int index2 = str.indexOf("@");

        boolean contains = str.contains("World");
        boolean contains1 = str.contains("@");

        boolean startWith = str.startsWith("Hello");
        boolean endWith = str.endsWith("Hello");

        boolean matchs = str.matches(".*World.*");
    }
}
