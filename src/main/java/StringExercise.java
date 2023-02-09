public class StringExercise {

    public static void main(String[] args) {
        String noEdu = """
                We don't need no education
                We don't need no thought control
                """;
        System.out.println(noEdu);

        String checkItOut = "Check \"this\" out!, \"s inside of \"s!\n";
        String checkItOut2 = """
                Check "this" out!, "s inside of "s!
                """;
        System.out.println(checkItOut);
        System.out.println(checkItOut2);

        String windowsDrive = "In windows, the main drive is usually C:\\";
        System.out.println(windowsDrive);

        String amazingBackslash = """
                I can do backslashes \\, double backslashes \\\\,
                and the amazing triple backslash \\\\\\!
                """;
        System.out.println(amazingBackslash);
    }

}
