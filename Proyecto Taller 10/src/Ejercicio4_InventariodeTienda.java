
/**
 * Crea un programa que gestione el inventario de una tienda. Utiliza una matriz bidimensional para
 * almacenar los productos disponibles en la tienda, con información como nombre, precio y cantidad.
 * El programa debe permitir agregar nuevos productos, actualizar existencias, buscar productos y eliminarlos.
 *
 * @author Usuario juampyz7
 */
import java.util.Scanner;

public class Ejercicio4_InventariodeTienda {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int maximoProd = 100;
        String[] nombres = new String[maximoProd];
        double[] precios = new double[maximoProd];
        int[] cantidades = new int[maximoProd];
        int numeroProd = 0;
        while (true) {
            System.out.println("\n--- Gestion de Inventario ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar existencias");
            System.out.println("3. Buscar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Mostrar inventario");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = tcl.nextInt();
            tcl.nextLine();
            if (opcion == 1) {
                if (numeroProd < maximoProd) {
                    System.out.print("Ingrese el nombre del producto: ");
                    nombres[numeroProd] = tcl.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    precios[numeroProd] = tcl.nextDouble();
                    System.out.print("Ingrese la cantidad del producto: ");
                    cantidades[numeroProd] = tcl.nextInt();
                    numeroProd++;
                    System.out.println("Producto agregado.");
                } else {
                    System.out.println("El inventario se encuentra lleno");
                }
            } else if (opcion == 2) {
                System.out.print("Ingrese el nombre del producto a actualizar: ");
                String nombre = tcl.nextLine();
                for (int i = 0; i < numeroProd; i++) {
                    if (nombres[i].equalsIgnoreCase(nombre)) {
                        System.out.print("Ingrese la nueva cantidad: ");
                        cantidades[i] = tcl.nextInt();
                        System.out.println("Cantidad actualizada");
                        break;
                    }
                    if (i == numeroProd - 1) {
                        System.out.println("Producto no disponible");
                    }
                }
            } else if (opcion == 3) {
                System.out.print("Ingrese el nombre del producto a buscar: ");
                String nombre = tcl.nextLine();
                for (int i = 0; i < numeroProd; i++) {
                    if (nombres[i].equalsIgnoreCase(nombre)) {
                        System.out.println("Producto: " + nombres[i]);
                        System.out.println("Precio: " + precios[i]);
                        System.out.println("Cantidad: " + cantidades[i]);
                        break;
                    }
                    if (i == numeroProd - 1) {
                        System.out.println("Producto no disponible");
                    }
                }
            } else if (opcion == 4) {
                System.out.print("Ingrese el nombre del producto a eliminar: ");
                String nombre = tcl.nextLine();
                for (int i = 0; i < numeroProd; i++) {
                    if (nombres[i].equalsIgnoreCase(nombre)) {
                        for (int j = i; j < numeroProd - 1; j++) {
                            nombres[j] = nombres[j + 1];
                            precios[j] = precios[j + 1];
                            cantidades[j] = cantidades[j + 1];
                        }
                        numeroProd--;
                        System.out.println("Producto eliminado");
                        break;
                    }
                    if (i == numeroProd - 1) {
                        System.out.println("Producto no disponible");
                    }
                }
            } else if (opcion == 5) {
                System.out.println("\n--- Inventario ---");
                if (numeroProd == 0) {
                    System.out.println("El inventario se encuentra vacío");
                } else {
                    for (int i = 0; i < numeroProd; i++) {
                        System.out.println((i + 1) + ". Nombre: " + nombres[i] + ", Precio: " + precios[i] + ", Cantidad: " + cantidades[i]);
                    }
                }
            } else if (opcion == 6) {
                System.out.println("Saliendo del programa");
                break;
            } else {
                System.out.println("Opcion no disponible, vuelve a intentarlo");
            }
        }
    }
}
/***
 * run:

--- Gestion de Inventario ---
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
6. Salir
Seleccione una opcion: 1
Ingrese el nombre del producto: huevos
Ingrese el precio del producto: 0,15
Ingrese la cantidad del producto: 10
Producto agregado.

--- Gestion de Inventario ---
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
6. Salir
Seleccione una opcion: 6
Saliendo del programa
BUILD SUCCESSFUL (total time: 16 seconds)
 */