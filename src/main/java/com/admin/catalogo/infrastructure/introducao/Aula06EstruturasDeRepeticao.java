package com.admin.catalogo.infrastructure.introducao;

public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args) {
        // while , do while, for

        int count = 0;
        while (count < 10) {
            System.out.println("while " + count);
            count++;
        }

        do {
            System.out.println("do while " + count);
        } while (count < 10);

        for (int i = 0; i <= 10; i++) {
            System.out.println("for " + i);
        }

        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println("for " + i);
        }

        int valorMax2 = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                continue;
            }
            System.out.println("for " + i);
        }
    }
}
