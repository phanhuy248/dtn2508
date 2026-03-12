public class ConvertStringDemo {
    public static void main(String[] args) {
        int intValue = 10;
        double doubleValue = 3.14;
        boolean boolValue = true;

        String str1 = String.valueOf(intValue);
        String str2 = String.valueOf(doubleValue);
        String str3 = String.valueOf(boolValue);

        int age = 13;
        String str4 = "Tuổi của bạn là: "+ age;
        String piValue = "" + 3.14;
    }
}
