public class Assignment_Operator {
    public static void main(String[] args) {
        // create variables
        int a = 4;
        int var;

        // assign value using =
        var = a;
        System.out.println("var using =: " + var); // 4

        // assign value using =+
        var += a;
        System.out.println("var using +=: " + var); // 8

        // assign value using =*
        var *= a;
        System.out.println("var using *=: " + var); // 32
    }
}