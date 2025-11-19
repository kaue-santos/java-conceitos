package com.admin.catalogo.infrastructure.javacore.Bintroducaometodos.test;

import com.admin.catalogo.infrastructure.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros(10, 20);

        Calculadora calculadora2 = new Calculadora();
        double divisao = calculadora2.divisao(100, 20);
        System.out.println(divisao);
    }
}
