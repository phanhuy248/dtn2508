public class EmptyCheckDemo {
    public static void main(String[] args) {
        String myString = "";
        boolean isEmpty = myString.isEmpty();
        boolean isLengthZero = myString.length()==0;
        boolean isEqualEmpty = "".equals(myString);

        String nullString = null;
        boolean isEqualNull = "".equals(nullString);
        //boolean isEmptyNull = nullString.isEmpty();

        String blankString = "          ";
        boolean isBlankEmpty = blankString.isEmpty();
        boolean isBlank = blankString.isBlank();
    }
}
