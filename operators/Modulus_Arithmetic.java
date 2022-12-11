public class Modulus_Arithmetic {
    public static void main (String [] args) {
		int x = 15;
		int int_remainder = x % 10;
		System.out.println("The result of 15 % 10 is the "
				+ "remainder of 15 divided by 10. The remainder is " + int_remainder); // 5
		double d = 15.25;
		double double_remainder= d % 10;
		System.out.println("The result of 15.25 % 10 is the "
                + "remainder of 15.25 divided by 10. The remainder is " + double_remainder); // 5.25
    }
}