public class user_defined_parameter_pythagoras
{
    /*
     * Pythagoras theorem is defined by a^2 + b^2 = c^2
     */
    public static int Pythagoras(int a, int b)
    {
        int c = (a*a) + (b*b);
        return c;
    }
    public static void main(String[] args) {
        int three = 3;
        int four = 4;
        
        int hypotenuse = Pythagoras(three, four);
        System.out.println("hypotenuse(3,4):" + hypotenuse);

        System.out.println("hypotenuse(5,3) : " + Pythagoras(5, 3));
    }
}