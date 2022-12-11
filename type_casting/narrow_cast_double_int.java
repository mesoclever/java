public class narrow_cast_double_int {
    public static void main(String[] args) {
        // create double type variable
        double num = 10.99;
        System.out.println("The double value: " + num); //10.99

        // convert into int type
        int data = (int) num;
        System.out.println("The integer value: " + data); // 10
    }
}