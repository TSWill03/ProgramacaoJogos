package com.wicolly.atividades.dia02I02I2026.Funcoes;

import java.util.ArrayList;

import java.util.Scanner;

public class Funcoes {
    Scanner scan = new Scanner(System.in);

    public void imprimirTela(String CoisaASerImpressa){
        System.out.println(CoisaASerImpressa);
    }

    public void q2(){
        System.out.print("Digite um numero ");
        System.out.println(scan.next());
    }

    public void q3(int num1, int num2){
        System.out.println(num1+num2);
    }

    public void q4(int[]nuns ){
        for(int n : nuns){
            System.out.println(n);
        }
    }

    public void q5(int num){
        if(num == 0){
            System.out.println("O numero " + num + " e igual a 0");
        } else if (num > 0) {
            System.out.println("O numero " + num + "  é positivo");
        } else {
            System.out.println("O numero " + num + "  e negativo");

        }
    }
    public void q6(int[]nuns ){
        int soma = 0;
        for(int n : nuns){
            soma = soma + n;
        }
        System.out.println("A soma do Array é "+soma);
    }

    public ArrayList<Integer> q7(ArrayList<Integer> nuns1, ArrayList<Integer> nuns2){
        ArrayList<Integer> somaArray = new ArrayList<Integer>();
        if (nuns1.size() == nuns2.size()){
            for(int i = 0; i < nuns1.size(); i++){
                somaArray.add(nuns1.get(i));
                somaArray.add(nuns2.get(i));
            }
        }
        else {
            System.out.println("Coloque Arrays de tamanhos iguais");
        }
        return somaArray;
    }

    public String q8(String palavra){
        return palavra.toUpperCase();
    }

    public static String q9(String s) {
        if (s == null) return "";
        s = s.trim();
        if (s.isEmpty()) return "";

        return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }

    public void q10(String palavra){
        for(int i = 0; i < palavra.length(); i++){
            System.out.println(palavra.charAt(i));
        }
    }
}

