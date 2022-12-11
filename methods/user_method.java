public class user_method {
    // user defined method to add a new line
    public static void newLine() {
        System.out.println();
    }

    // user defined method to return the value of pi
    public static double pi() {
        return 3.14159265359;
    }

    public static void main(String[] args)
    {
        /* What is the area of a circle with radius of 1.2 m ?
        *  Area	= π*r^2
        */
        double radiusSquared = 1.2*1.2;
        double area = pi() * radiusSquared; // calling the pi() Method
        System.out.print("Area: " + area); // 4.5238934211696

        /* What is the diameter of the above circle? 
        * Diameter = 2 * Radius
        */
        newLine(); // calling newLine Method
        double diameter = 2 * 1.2;
        System.out.print("Diameter:" + diameter); // 2.4

    }
}