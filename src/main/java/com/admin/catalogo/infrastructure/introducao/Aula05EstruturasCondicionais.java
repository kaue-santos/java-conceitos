package com.admin.catalogo.infrastructure.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        if (true) {
            System.out.println("dentro do if");
        } else {
            System.out.println("dentro do else");
        }


        if (true) {
            System.out.println("dentro do if");
        } else if (true) {
            System.out.println("dentro do else if");
        } else  {
            System.out.println("dentro do else");
        }

        String resultado = true ? "true" : "false";
        System.out.println(resultado);

        int dia = 2;

        // char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Erro");
                break;

        }

    }
}
