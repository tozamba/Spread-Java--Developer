package br.com.dio;

import java.lang.invoke.SwitchPoint;

public class controledeFluxo {
    public static void main(String[] args) {
    int mes = 7;
    String semana = "Segunda";

    if(mes == 1){
        System.out.println("Janeiro");
    }
    if(mes == 2){
        System.out.println("Fevereiro");
    }
    if(mes == 3){
        System.out.println("Março");
    }
    if(mes == 4){
        System.out.println("Abril");
    }
    if(mes == 5){
        System.out.println("Maio");
    }
    if(mes == 6){
        System.out.println("Junho");
    }
    if(mes == 7){
        System.out.println("Julho");
    }
    if(mes == 8){
        System.out.println("Agosto");
    }
    if(mes == 9){
        System.out.println("Setembro");
    }
    if(mes == 10){
        System.out.println("Outubro");
    }
    if(mes == 11){
        System.out.println("Novembro");
    }
    if(mes == 12){
        System.out.println("Dezembro");
    }

        if (mes == 7 || mes == 1 || mes == 12) {
            System.out.println("Férias");
        }

        switch (semana){
            case "Segunda":
                System.out.println("Segunda");
                break;
            case "Terca":
                System.out.println("Terça");
                break;
            case "Quarta":
                System.out.println("Quarta");
                break;
            case "Quinta":
                System.out.println("Quinta");
                break;
            case "Sexta":
                System.out.println("Sexta");
                break;
            case "Sabado":
                System.out.println("Sabado");
                break;
            case "Domingo":
                System.out.println("Domingo");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + semana);
        }

    }
}
