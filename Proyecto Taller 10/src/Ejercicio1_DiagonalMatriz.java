
/**
 * Dada una matriz cuadrada (m X m) de valores enteros aleatorios,
 * desarrollar su procesamiento para presentar los elementos:
 * De la diagonal principal.
 * De la diagonal segundaria.
 * Ubicados bajo la diagonal principal.
 * Ubicados sobre la diagonal principal.
 * Ubicados bajo la diagonal secundaria.
 * Ubicados sobre la diagonal secundaria.
 *
 * @author Usuario juampyz7
 */
import java.util.Scanner;

public class Ejercicio1_DiagonalMatriz {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int tamanioMatriz = 0;
        System.out.print("Deme el tamanio de la matriz: ");
        tamanioMatriz = tcl.nextInt();
        int matriz[][] = new int[tamanioMatriz][tamanioMatriz];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("DIAGONAL PRINCIPAL OBVIA: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("");
        System.out.println("DIAGONAL PRINCIPAL EFICIENTE: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + "\t");
        }
        System.out.println("");
        System.out.println("DIAGONAL SECUNDARIA OBVIA: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if ((i + j) == matriz.length - 1) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("");
        System.out.println("DIAGONAL SECUNDARIA EFICIENTE: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - i - 1] + "\t");
        }
        System.out.println("");
        System.out.println("UNICADOS BAJO LA DIAGONAL PRINCIPAL OBVIA: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i > j) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("");
        System.out.println("UBICADOS BAJO LA DIAGONAL PRINCIPAL EFICIENTE: ");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("");
        System.out.println("UBICADOS SOBRE LA DIAGONAL PRINCIPAL OBVIA: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i > j) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("");
        System.out.println("UBICADOS SOBRE LA DIAGONAL PRINCIPAL EFICIENTE: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("");
        System.out.println("UBICADOS BAJO LA DIAGONAL SECUNDARIA: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i + j > matriz.length - 1) { 
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("");
        System.out.println("UBICADOS BAJO LA DIAGONAL SECUNDARIA EFICIENTE: ");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = matriz.length - i; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("");
        System.out.println("UBICADOS SOBRE LA DIAGONAL SECUNDARIA: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i + j < matriz.length - 1) { 
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("");
        
        System.out.println("UBICADOS SOBRE LA DIAGONAL SECUNDARIA EFICIENTE: ");
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = 0; j < matriz.length - 1 - i; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("");
    }
}
/***
 * run:
Deme el tamanio de la matriz: 3
0	9	9	
2	1	8	
1	7	5	

DIAGONAL PRINCIPAL OBVIA: 
0	1	5	
DIAGONAL PRINCIPAL EFICIENTE: 
0	1	5	
DIAGONAL SECUNDARIA OBVIA: 
9	1	1	
DIAGONAL SECUNDARIA EFICIENTE: 
9	1	1	
UNICADOS BAJO LA DIAGONAL PRINCIPAL OBVIA: 
2	1	7	
UBICADOS BAJO LA DIAGONAL PRINCIPAL EFICIENTE: 
2	1	7	
UBICADOS SOBRE LA DIAGONAL PRINCIPAL OBVIA: 
2	1	7	
UBICADOS SOBRE LA DIAGONAL PRINCIPAL EFICIENTE: 
9	9	8	
UBICADOS BAJO LA DIAGONAL SECUNDARIA: 
8	7	5	
UBICADOS BAJO LA DIAGONAL SECUNDARIA EFICIENTE: 
8	7	5	
UBICADOS SOBRE LA DIAGONAL SECUNDARIA: 
0	9	2	
UBICADOS SOBRE LA DIAGONAL SECUNDARIA EFICIENTE: 
0	9	2	
BUILD SUCCESSFUL (total time: 2 seconds)
 */