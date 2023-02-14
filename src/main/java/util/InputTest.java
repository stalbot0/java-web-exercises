package util;

public class InputTest {
    public static void main(String[] args) {
        Input myInput = new Input();

        System.out.println("getString");
        System.out.println(myInput.getString());

        System.out.println("yesNo");
        System.out.println(myInput.yesNo());

        System.out.println("getInt w/ args");
        myInput.getInt(1, 50, "hello");

        System.out.println("getInt 0 arg");
        myInput.getInt();

        System.out.println("getDub w/ args");
        myInput.getDouble(1, 50);

        System.out.println("getDub 0 arg");
        myInput.getDouble();
    }
}
