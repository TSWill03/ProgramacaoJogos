package com.wicolly.atividades.dia02I02I2026.IfElse;

import java.util.Scanner;

public class NumeroMaior {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;

        System.out.println("Digite o primeiro numero");
        numero1 = scan.nextInt();
        System.out.println("Digite o segundo numero");
        numero2 = scan.nextInt();
        System.out.println("Digite o terceiro numero");
        numero3 = scan.nextInt();


        if(numero1 > numero2 && numero1 > numero3){
            System.out.println("o primeiro numero " + numero1 + " e o maior");
        }
        else if(numero2 > numero1 && numero2 > numero3){
            System.out.println("o segundo numero " + numero2 + " e o maior");
        }
        else if(numero3 > numero1 && numero3 > numero2){
            System.out.println("o terceiro numero " + numero3 + " e o maior");
        }
    }
}
