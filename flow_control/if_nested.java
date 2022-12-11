public class if_nested {
 public static void main(String[] args) {
     String worker = "waiter";
     String weather = "sunny";
     String clothes = "";

     if (worker == "waiter") 
     {
         if(weather == "Lighting")
         {
            clothes = "Rubber hat, Raincoat and Jeans";
         }
         else if(weather == "rainy") 
         {
            clothes = "Raincoat and Jeans";
         }
         else 
         {
            clothes = "White shirt and Jeans";
         }
     } 
     else if (worker == "hostess")
     {
         if(weather == "Lighting")
         {
             clothes = "Rubber hat, Raincoat and Dress";
         }
         else if(weather == "rainy") 
         {
            clothes = "Raincoat and Dress";
         }
         else 
         {
            clothes = "White shirt and Dress";
         }
     }

     System.out.println("Worker : " + worker + " | " + "Clothes : " + clothes);

 } 
}