public class DataType_Integer {
    public static void main(String[] args) {
        int a = +10; // 10 is an integer literal
        int b = -2; // negative int

        int sum = 2 + 2; // 4
        int difference = 2- 2; // 0
        int product = 2 * 2; // 4
        int qoutient = 1 / 1;  // 1
        int remainder = 2 % 2; // 0
        
        // int runTimeError = 1 / 0; // Division by zero not result in run time error

        int c = 3 * 5 - 2; // 13 * has precedence
        int d = 3 + 5 / 2; // 5 / has precedence

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("sum:" + sum);
        System.out.println("difference:" + difference);
        System.out.println("product:" + product);
        System.out.println("qoutient:" + qoutient);
        System.out.println("remainder:" + remainder);
        System.out.println("c:" + c);
        System.out.println("d: " + d);

    }
}