import java.util.Scanner;
public class else_if {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
   
      float income;
   
      float tax;
      
      System.out.println("Enter in your income:");
      income = input.nextFloat();
   
      if (income >= 1 && income < 205900)
      
      {
      
         tax = ((income * 18)/100);
      
         System.out.println("Rate of tax: 18% = " + tax);
      
      }
      
      else if (income >= 205901 && income < 321600)
      
      {
      
         tax = ((income * 26)/100) + 37062;
      
         System.out.println("Rate of tax: 26% + 37062 = " + tax);
      
      }
      
      else if (income >= 321600 && income < 445100)
      
      {
      
         tax = ((income * 31)/100) + 67144;
      
         System.out.println("Rate of tax: 31% + 67144 = " + tax);
      
      }
      
      else if (income >= 445100 && income < 584200)
      
      {
      
         tax = ((income * 36)/100) + 105429;
      
         System.out.println("Rate of tax: 36% + 105429 = " +
            tax);
      
      }
      
      else if (income >= 584201 && income < 744800)
      
      {
      
         tax = ((income * 39)/100) + 155505;
      
         System.out.println("Rate of tax: 39% + 155505 = " +
            tax);
      
      }
      
      else if (income >= 744801 && income < 1577300)
      
      {
      
         tax = ((income * 41)/100) + 218139;
      
         System.out.println("Rate of tax: 41% + 218139 = " +
            tax);
      
      }
      
      else
      
      {
      
         tax = ((income * 45)/100) + 218139;
      
         System.out.println("Rate of tax: 41% + 559464 = " +
            tax);
      
      }
   
   }
}
