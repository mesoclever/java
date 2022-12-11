public class string_value_of {
    public static void main(String[] args) {
        // create int type variable
        // create int type variable
        int num = 10;
        System.out.println("The integer value is: " + num); // 10

        // converts int to string type
        String data = String.valueOf(num);
        System.out.println("The string value is: " + data);

        // converting other data types
        double d = 102939939.939;
        boolean b = true;
        long l = 1232874;

        System.out.println("Return Value : " + String.valueOf(d));
        System.out.println("Return Value : " + String.valueOf(b));
        System.out.println(d);
        System.out.println("Return Value : " + String.valueOf(l));
    }

 
}