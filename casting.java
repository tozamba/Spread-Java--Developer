package br.com.dio;

public class casting {

    public static void main(String[] args) {
        System.out.println("castingByte");
        castingByte();
        //Testandi os tipos de variaveis.
    }
        private static void castingByte() {

            byte a;
            short b;
            char c;
            int d;
            long e;
            float f;
            double g;

            g = 12356564.7976931348623147d;
            System.out.println("Double: " + g);

            f = (float) g;
            System.out.println("Float: " + f);

            e = (long) f;
            System.out.println("Long: " + e);

            d = (int) e;
            System.out.println("Int: " + d);

            c = (char) d;
            System.out.println("Char: " + c);

            b = (short) c;
            System.out.println("Short" + b);

            a = (byte) d;
            System.out.println("Byte" + a);
        }
}
