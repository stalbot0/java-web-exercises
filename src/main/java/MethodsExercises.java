public class MethodsExercises {

    public static void main(String[] args) {
        //1
        System.out.println("" + addition(1, 0));
        System.out.println(subtraction(8, 6));
        System.out.println(multiplication(1, 3));
        System.out.println(division(16, 4));
        System.out.println(modulus(15, 3));

        //2
    }

    //1. basic arithmetic
    public static int addition(int int1, int int2) {
        return int1 + int2;
    }
    public static int subtraction(int int1, int int2) {
        return int1 - int2;
    }
    public static int multiplication(int int1, int int2) {
        return int1 * int2;
    }
    public static int division(int int1, int int2) {
        if(int2 == 0) {
            return 0;
        }
        return int1 / int2;
    }
    public static int modulus(int int1, int int2) {
        return int1 % int2;
    }

    //2. method validation


}
