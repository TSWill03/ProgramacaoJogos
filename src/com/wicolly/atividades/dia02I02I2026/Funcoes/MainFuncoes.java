package com.wicolly.atividades.dia02I02I2026.Funcoes;

import java.util.ArrayList;

public class MainFuncoes {
    public static void main(String[] args) {
        Funcoes funcoes = new Funcoes();
        System.out.println("a)");
        funcoes.imprimirTela("Irineuu");

        System.out.println("b)");
        funcoes.q2();

        System.out.println("c)");
        funcoes.q3(73 , 13);

        System.out.println("d)");
        int[] myNum = {10,20,30,40,50,60};
        funcoes.q4(myNum);

        System.out.println("e)");
        funcoes.q5(10);
        funcoes.q5(0);
        funcoes.q5(23);

        System.out.println("f)");
        int[] myNumq6 = {53,96,42,41,10,20,30,11,23};
        funcoes.q6(myNumq6);

        System.out.println("g)");
        ArrayList<Integer> numeros1ArrayList = new ArrayList<Integer>();
        numeros1ArrayList.add(1); numeros1ArrayList.add(2); numeros1ArrayList.add(3); numeros1ArrayList.add(4); numeros1ArrayList.add(5);
        ArrayList<Integer> numeros2ArrayList = new ArrayList<Integer>();
        numeros2ArrayList.add(-1); numeros2ArrayList.add(-2); numeros2ArrayList.add(-3); numeros2ArrayList.add(-4); numeros2ArrayList.add(-5);
        System.out.println(funcoes.q7(numeros1ArrayList, numeros2ArrayList));

        System.out.println("h)");
        System.out.println(funcoes.q8("qual palavra digitarei?"));

        System.out.println("i)");
        System.out.println(funcoes.q9("qual palavra digitarei?"));

        System.out.println("j)");
        funcoes.q10("qual palavra digitarei?");
    }
}
