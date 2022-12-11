public class string_parse {
    public static void main(String[] args) {
        // create string type variable
        String data = "10";
        System.out.println("The string value is: " + data);

        // convert string variable to int
        int num = Integer.parseInt(data);
        System.out.println("The integer value is: " + num);

        // convert string variable to double
        int dbl = Double.parseDouble(data);
        System.out.println("The double value is: " + dbl);

        // convert string variable to double
        int lng = Long.parseLong(data);
        System.out.println("The long value is: " + lng);
        
    }
}