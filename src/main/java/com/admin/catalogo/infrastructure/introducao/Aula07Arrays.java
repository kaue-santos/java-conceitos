package com.admin.catalogo.infrastructure.introducao;

import java.util.Arrays;

public class Aula07Arrays {
    public static void main(String[] args) {
        int[] idades = new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println("idades: " + Arrays.toString(idades));
        System.out.println("idades: " + idades[0]);

        for(int x:idades){
            System.out.println("idades: " + x);
        }

        int[][] dias = new int[3][3];

        System.out.println("dias: " + dias[0][0]);

        dias[0] = new int[] {1,2,3,4,5,6,7,8,9,10};
        dias[1] = new int[] {1,2};
        dias[2] = new int[] {1,2,3,4,5};
        for(int[] arrBase:dias){
            for(int x:arrBase){
                System.out.println("dias: " + x);
            }
        }
    }
}
