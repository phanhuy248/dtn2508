public class EscapeSeqDemo {
    public static void main(String[] args) {
        String name = "\"Huy Phan\"";
        System.out.println(name);

        String m = "\u004D";
        System.out.println(m);
        String unicodeName = "\u004Dandan\u0021";
        System.out.println(unicodeName);
    }
}
