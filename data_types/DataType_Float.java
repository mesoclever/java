public class DataType_Float {
    public static void main(String[] args) {
        float a = 3.141f + 2.0f; // 5.141
        float b = 3.141f - 2.0f; // 1.111
        float c = 3.141f / 2.0f; // 1.5705
        float d = 5.0f / 3.0f;   // 1.66667
        float e = 10.0f % 3.141f; //0.577
        float f = 1.0f / 0.0f; // Infinity

        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);
        System.out.println("d:" + d);
        System.out.println("e:" + e);
        System.out.println("f:" + f);
    }
}