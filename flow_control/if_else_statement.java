public class if_else_statement {
    public static void main(String[] args) {
        // example : you received a mark, either you passed or you failed
        int mark = 90;
        if (mark > 50) {
            System.out.println("Passed"); // test Expression 90 > 50, therefore "Passed" will be printed
        } else{
            System.out.println("Failed");
        }

        // example : you mother asks you do the dishes. You either do, or you don't
        String dishes = "Yes";
        if (dishes == "Yes") {
            System.out.println("Dishes washed!"); // test Expression dishes == Yes. This is true, therefore "Dishes washed!" will be printed
        } else{
            System.out.println("Dishes not washed!");
        }
    }
}