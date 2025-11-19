package com.admin.catalogo.infrastructure.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(int num1, int num2){
        int soma = num1 + num2;
        System.out.println(soma);
    }

    public double divisao(int num1, int num2){
        int divisao = num1 / num2;
        return divisao;
    }
}
