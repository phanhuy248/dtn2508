public class InternMethodDemo {
    public static void main(String[] args) {
        String s1 = "hello";
        String obj = new String("hello").intern();
        System.out.println(s1 == obj);

        String s3 = "hello";
        String s4 = new String("hello");
        System.out.println(s3 == s4);
        String s5 = s4.intern();
        System.out.println(s5 == s3);
    }
}
