package com.admin.catalogo.infrastructure;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero1 = 10;
        int numero2 = 20;

        System.out.println(numero1-numero2);

        // %

        int resto = 20 % 2;

        System.out.println(resto);

        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;

        System.out.println(isDezMaiorQueVinte);

        // && || !

        int idade = 20;
        float salario = 10f;

        boolean isDentroDaLei = idade > 18 && salario > 30;

        System.out.println(isDentroDaLei);
    }
}
