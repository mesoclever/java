public class DataType_String{
    public static void main(String[] args) {
        String sName = "Johnny"; // valid string
        //String sSuranme = 'Bravo'; // invalid string due to apostrophes being used ''
        String sMaidenName = "123Super"; // valid string. The number 123 is treated as text because it is enclosed in the ""
        String sStatus = ":)"; // valid string. the colon :, followed by the bracket ) are characters. But anything enclosed inside of the quotation marks are treated as strings.

        System.out.println(sName);
        System.out.println(sMaidenName);
        System.out.println(sStatus);
    }
    
}