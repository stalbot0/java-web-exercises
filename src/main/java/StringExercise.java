public class StringExercise {

    public static void main(String[] args) {
        String noEdu = "We don't need no education";
        System.out.println(noEdu);

        String noThoughtCtrl = "We don't need no thought control";
        System.out.println(noThoughtCtrl);

        char value = '"';
        String checkItOut = "Check " + value + "this" + value + " out!, " + value + "s inside of " + value + "s!";
        System.out.println(checkItOut);

        String windowsDrive = "In windows, the main drive is usually C:\\";
        System.out.println(windowsDrive);

        String amazingBackslash = """
                I can do backslashes \\, double backslashes \\\\,
                and the amazing triple backslash \\\\\\!
                """;
        System.out.println(amazingBackslash);
    }

}
