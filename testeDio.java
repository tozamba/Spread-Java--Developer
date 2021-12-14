package br.com.dio;

import java.io.IOException;
import java.util.Scanner;

public class testeDio {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;
        int i = 5;
        int n = 0;

//continue a solução
        for (i = 5; i > 0; i-- ) {
            n = leitor.nextInt();
            if (n >= 0){
                if(n != 0)
                    positivo++;
            }
            else
                negativo++;
            if (n % 2 == 0)
                par++;
            else
                impar++;
        }
//insira suas variaveis corretamente
        System.out.println( par+" par(es)");
        System.out.println( impar+" impar(es)");
        System.out.println( positivo+" positivo(s)");
        System.out.println( negativo+" negativo(s)");
    }
}
