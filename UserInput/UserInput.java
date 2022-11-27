import java.util.Scanner;

public class UserInput {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
  
   int a;
   float b;
   String s;      
   
   System.out.println("Enter a string");
   s = input.nextLine();
   System.out.println("You entered string " + s);
   
   System.out.println("Enter an integer");
   a = input.nextInt();
   System.out.println("You entered integer " + a);
   
   System.out.println("Enter a float");
   b = input.nextFloat();
   System.out.println("You entered float " + b);

   }
}
