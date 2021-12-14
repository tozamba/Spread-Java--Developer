package br.com.dio;

public class operadoresRelacionais {
    public static void main(String[] args) {
        int a=20, b=10, c=15;
        String nome1 = "Maria", nome2 = "Maria", nome3 = "Joao";

        boolean b1 = true, b3 = true;
        boolean b2 = false, b4 = false;

        //Comparação Utilizando operadores logicos: >, <, ==, !=, >=, <=
        if (a > b){
            System.out.println("A Maior que B");
        }else if (a == b) {
            System.out.println("A Igual que B");
        }else{
            System.out.println("A Menor que B");
        }

        System.out.println("Nome1 == Nome2: " +(nome1 == nome2));
        System.out.println("Nome1 == Nome3: " +(nome1 != nome3));

        // Comparação utilizando &&(and), ||(or), ^(xor), !(negacao)
        System.out.println("B1 && B2: " +(b1 && b2));
        System.out.println("B1 && B3: " +(b1 && b3));
        System.out.println("B1 && B3 && B4: " +(b1 && b3 && b4));

        System.out.println("B1 || B2: " +(b1 || b2));
        System.out.println("B1 || B3: " +(b1 || b3));
        System.out.println("B1 || B2 || B3: " +(b1 || b2 || b3));

        System.out.println("B1 ^ B2: " +(b1 ^ b2));
        System.out.println("B1 ^ B3: " +(b1 ^ b3));
        System.out.println("B1 ^ B2 ^ B3: " +(b1 ^ b2 ^ b3));

        System.out.println("(a + b) > b + c && true: " +((a + b) > (b + c) && true));
        System.out.println("(a + b) < b + c && true: " +((a + b) < (b + c) && true));
        System.out.println("(a + b) < b + c && true: " +((a + b) < (b + c) || true));

    }
}
