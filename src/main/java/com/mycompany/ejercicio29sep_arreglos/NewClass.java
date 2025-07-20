package com.mycompany.ejercicio29sep_arreglos;

public class NewClass {
    public static void main(String[] args) {
        int[][] arreglo = {{4,7,1,3,5},{2,0,6,9,7},{3,1,2,6,4}};
        int[][] arreglo2 = new int[arreglo[0].length][arreglo.length];
        
        imprimir(arreglo);
        System.out.println("");
        
        for (int i = 0; i < arreglo[0].length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                arreglo2[i][j] = arreglo[j][i];
            }
        }
        
        imprimir(arreglo2);
    }
    
    public static void imprimir (int[][] arreglo) {
        for (int[] i : arreglo) {
            for (int j : i) {
                System.out.print("|"+j);
            }
            System.out.println("|");
        }
    }
}
