public class user_defined_parameter {
    public static int addTwoInts(int a, int b) // int a and int b are the parameters
    {
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int sum = addTwoInts(one, two);
        /*
         * When the addTwoInts function is called, it is passed two arguments, namely
         * variable one and variable two. The variables values are then copied into the
         * parameters a, and b respectively.
         */
        System.out.println("Sum:" + sum); //
    }
}