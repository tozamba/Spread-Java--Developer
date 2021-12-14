package br.com.dio;

public class operadoresAritmeticos {

    public static void main(String[] args) {
        System.out.println("PrePos");
        prePos();
        System.out.println("Aritmético");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedencia");
        precedencia();
    }

    private static void prePos(){
        int k = 10;

        int i = ++k;
        int j = k--;
        int x = k;

        System.out.println("i: "+i);
        System.out.println("i: "+j);
        System.out.println("i: "+x);
    }

    private static void aritmetico(){

        float f = 1.5f;

        float g = f + 4.5f;
        long  l = 10398L * 5L;
        double d = 45d / 4d;
        int k = 15 % 4;

        System.out.println("f: "+f);
        System.out.println("g: "+g);
        System.out.println("l: "+l);
        System.out.println("d: "+d);
        System.out.println("k: "+k);

    }

    private static void atribuicao(){

        double f = 147.852236986225874123d;

        double d = f;
        int i1 = 5;
        int j1 = 3;
        int I = 2;
        int k = 15;

        d /= 2.7d;
        i1 += 5;
        j1 -= 3;
        I *= 3;
        k %= 2;

        System.out.println("f: "+f);
        System.out.println("d: "+d);
        System.out.println("i1: "+i1);
        System.out.println("j1: "+j1);
        System.out.println("d: "+d);
        System.out.println("I: "+I);
        System.out.println("k: "+k);

    }

    private static void precedencia(){

        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k;

        System.out.println("i++ + --j * k: " +a);
        System.out.println("i: " +i);

        int b = k / --i % 3 + 1;

        System.out.println("k / --i % 3 + 1: " +b);
        System.out.println("i: " +i);

        int c = 2;

        c *= i *= 5;

        System.out.println("c *= i *= 5: " +c);

    }

}
