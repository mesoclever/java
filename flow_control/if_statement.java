public class if_statement {
    public static void main(String[] args) {
        int percentage = 95;

        if (percentage > 50) {        // test Expression 95 > 50. This is true, therefore "Pass" get printed
            System.out.println("Pass");
        }

        if (percentage < 50 ) {
            System.out.println("Fail"); // test Expression 95 < 50. This is false, therefore "Fail" is not printed
        }
    }
}