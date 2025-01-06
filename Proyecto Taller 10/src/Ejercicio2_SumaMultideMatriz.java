
/** *
 * Dadas dos matrices (cuadradas y/o rectangulares) de valores enteros aleatorios,
 * desarrollar su procesamiento para calcular y presentar:
 * La suma de las dos matrices (considerar las restricciones matemáticas para ello).
 * La multiplicación de las dos matrices (considerar las reglas matemáticas para ello).
 * @author juampyz7
 */
import java.util.Scanner;

public class Ejercicio2_SumaMultideMatriz {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el numero de filas de la matriz 1: ");
        int filas1 = tcl.nextInt();
        System.out.print("Ingrese el numero de columnas de la matriz 1: ");
        int columnas1 = tcl.nextInt();
        System.out.print("Ingrese el numero de filas de la matriz 2: ");
        int filas2 = tcl.nextInt();
        System.out.print("Ingrese el numero de columnas de la matriz 2: ");
        int columnas2 = tcl.nextInt();
        int[][] matriz1 = new int[filas1][columnas1];
        int[][] matriz2 = new int[filas2][columnas2];
        System.out.println("La Matriz 1 es igual");
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                matriz1[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("La Matriz 2 es igual");
        for (int i = 0; i < filas2; i++) {
            for (int j = 0; j < columnas2; j++) {
                matriz2[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Matriz 1: ");
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Matriz 2: ");
        for (int i = 0; i < filas2; i++) {
            for (int j = 0; j < columnas2; j++) {
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("");
        if (filas1 == filas2 && columnas1 == columnas2) {
            System.out.println("La suma de las matrices es:");
            int[][] suma = new int[filas1][columnas1];
            for (int i = 0; i < filas1; i++) {
                for (int j = 0; j < columnas1; j++) {
                    suma[i][j] = matriz1[i][j] + matriz2[i][j];
                    System.out.print(suma[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Las matrices no cumplen las dimensiones para poder sumarse");
        }
        System.out.println("");
        if (columnas1 == filas2) {
            System.out.println("La multiplicacion de las matrices es: ");
            int[][] producto = new int[filas1][columnas2];
            for (int i = 0; i < filas1; i++) {
                for (int j = 0; j < columnas2; j++) {
                    producto[i][j] = 0;
                    for (int k = 0; k < columnas1; k++) {
                        producto[i][j] += matriz1[i][k] * matriz2[k][j];
                    }
                    System.out.print(producto[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Las matrices no cumplen las dimensiones para poder multiplicarse");
        }
    }
}
/***
 * run:
Ingrese el numero de filas de la matriz 1: 4
Ingrese el numero de columnas de la matriz 1: 4
Ingrese el numero de filas de la matriz 2: 4
Ingrese el numero de columnas de la matriz 2: 4
La Matriz 1 es igual
La Matriz 2 es igual
Matriz 1: 
5	5	8	6	
7	0	3	4	
4	9	2	6	
9	2	6	0	

Matriz 2: 
2	7	4	2	
1	9	6	7	
0	6	1	1	
9	8	7	1	

La suma de las matrices es:
7	12	12	8	
8	9	9	11	
4	15	3	7	
18	10	13	1	

La multiplicacion de las matrices es: 
69	176	100	59	
50	99	59	21	
71	169	114	79	
20	117	54	38	
BUILD SUCCESSFUL (total time: 5 seconds)
 */
