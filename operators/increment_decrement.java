public class increment_decrement {
    public static void main(String[] args) {
        int x = 100;
        int y = 100;

        int a = x++;
        int b = y--;

        System.out.println("a:" + a); // 100
        System.out.println("b:" + b); // 100

        int s = 100;
        int t = 100;

        int c = ++s;
        int d = --t;
        
        System.out.println("c:" + c); // 101
        System.out.println("d:" + d); // 99

        System.out.println("x:" + x + " | " + "y:" + y + " | " + "s:" + s + " | " + "t:" + t ); // x:101 | y:99 | s:101 | t:99
    }
}