package com.wicolly.atividades.dia02I02I2026.For;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero");
        numero = scan.nextInt();

        for(int i = 0; i <= 10; i++){

            System.out.println(numero + " x " + i + " = " + numero*i);
        }
    }
}
