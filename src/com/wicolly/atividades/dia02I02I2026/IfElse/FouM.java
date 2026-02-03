package com.wicolly.atividades.dia02I02I2026.IfElse;

import java.util.Scanner;

public class FouM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String letra;
        System.out.println("Digite F ou M");
        letra = scan.next();
        letra = letra.toUpperCase();

        if(letra.equals("M") || letra.equals("F")){
            if(letra.equals("M")){
                System.out.println("Masculino");
            }
            else {
                System.out.println("Feminino");
            }
            }
        else {
            System.out.println("Sexo invalido");
        }


    }
}
