public class StringTrimDemo {
    public static void main(String[] args) {
        String java1 = "java".trim();
        String java2 = "java ".trim();
        String java3 = " java ".trim();
        String java4 = " java".trim();
        String java5 = "\n \t java\n \r ".trim();
        String java6 = "jav   a".trim();
        String java7 = "ja \n va".trim();

        boolean isSame = "java".equals("java".trim());
    }
}
