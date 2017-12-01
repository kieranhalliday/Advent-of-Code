public class interviewPractice {

    public static void main(String args[]) {

        assert ("abc".equals(reverseString("cba")));
        assert ("1234".equals(reverseString("4321")));
    }

    private static String reverseString(String string) {
        if (string == null) {
            return null;
        }

        StringBuilder stringBuilder = new StringBuilder(string);

        return stringBuilder.reverse().toString();
    }
}
