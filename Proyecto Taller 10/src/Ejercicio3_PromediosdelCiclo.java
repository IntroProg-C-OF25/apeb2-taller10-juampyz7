
/**
 * El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuáles al finalizar el periodo,
 * la Dirección de la carrera de Computación a solicitado las siguientes estadísticas de la materia
 * INTRODUCCIÓN A LA PROGRAMACIÓN en función a los promedios por estudiante, dichos promedios
 * se deben calcular (ponderar, ya que el docente ingresa todo sobre 10pts.) de 3 calificaciones
 * (ACD que representa el 35% de la nota, APE del 35% y la nota del AA con un peso del 30%).
 * En resumen, los requerimientos son los siguientes:
 * Registre los nombres de cada estudiante de dicho paralelo.
 * Genere aleatoriamente las notas ACD, APE, AA, para cada uno de los 28 estudiantes de 0-10 pts.
 * Calcule el promedio de cada uno de los estudiantes del paralelo dada la siguiente ponderación:
 * ACD->35%, APE->35%, y el AA->30%.
 * Obtenga el promedio del curso, del paralelo C.
 * Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por encima del promedio del curso.
 * Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por debajo del promedio del curso.
 * Muestre el estudiante con su calificación, si es el del mayor promedio (el más alto de la clase).
 * Muestre el estudiante con su calificación, si es el del menor promedio (el más bajo de la clase).
 * @author Usuario iTC
 */
import java.util.Scanner;

public class Ejercicio3_PromediosdelCiclo {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int totalEstudiantes = 28;
        double sumaTotal = 0, promedioCurso;
        String[] nombres = new String[totalEstudiantes];
        double[] acd = new double[totalEstudiantes]; // ACD (35%)
        double[] ape = new double[totalEstudiantes]; // APE (35%)
        double[] aa = new double[totalEstudiantes];  // AA (30%)
        double[] promedios = new double[totalEstudiantes];
        System.out.println("Ingrese los nombres de los " + totalEstudiantes + " estudiantes: ");
        for (int i = 0; i < totalEstudiantes; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            nombres[i] = tcl.nextLine();
        }
        for (int i = 0; i < totalEstudiantes; i++) {
            acd[i] = Math.random() * 10;
            ape[i] = Math.random() * 10;
            aa[i] = Math.random() * 10;
            promedios[i] = acd[i] * 0.35 + ape[i] * 0.35 + aa[i] * 0.30;
            sumaTotal += promedios[i];
        }
        promedioCurso = sumaTotal / totalEstudiantes;
        System.out.println("\nPromedio del curso: " + promedioCurso);
        System.out.println("\nLos estudiantes por encima del promedio del curso son: ");
        for (int i = 0; i < totalEstudiantes; i++) {
            if (promedios[i] > promedioCurso) {
                System.out.println(nombres[i] + " - Promedio: " + promedios[i]);
            }
        }
        System.out.println("\nLos estudiantes por debajo del promedio del curso son: ");
        for (int i = 0; i < totalEstudiantes; i++) {
            if (promedios[i] < promedioCurso) {
                System.out.println(nombres[i] + " - Promedio: " + promedios[i]);
            }
        }
        int indiceMayor = 0, indiceMenor = 0;
        for (int i = 1; i < totalEstudiantes; i++) {
            if (promedios[i] > promedios[indiceMayor]) {
                indiceMayor = i;
            }
            if (promedios[i] < promedios[indiceMenor]) {
                indiceMenor = i;
            }
        }
        System.out.println("\nEl estudiante con el mayor promedio es: ");
        System.out.println(nombres[indiceMayor] + " - Promedio: " + promedios[indiceMayor]);

        System.out.println("\nEl estudiante con el menor promedio es: ");
        System.out.println(nombres[indiceMenor] + " - Promedio: " + promedios[indiceMenor]);
    }
}
/***
 * run:
Ingrese los nombres de los 28 estudiantes: 
Estudiante 1: Willy
Estudiante 2: Mateo
Estudiante 3: Josue
Estudiante 4: Andree
Estudiante 5: Sebastian
Estudiante 6: Emilia
Estudiante 7: Nicole
Estudiante 8: Carolina
Estudiante 9: Yezabel
Estudiante 10: Juan
Estudiante 11: Pablo
Estudiante 12: Michelle
Estudiante 13: Scarlett
Estudiante 14: Sara
Estudiante 15: Kathya
Estudiante 16: Dayanara
Estudiante 17: Nicolas
Estudiante 18: Alex
Estudiante 19: Antonny
Estudiante 20: Cristopher
Estudiante 21: Katherine
Estudiante 22: Ivan
Estudiante 23: Jostim
Estudiante 24: Angeles
Estudiante 25: Jorge
Estudiante 26: Luis
Estudiante 27: Diego
Estudiante 28: Javier

Promedio del curso: 5.058016621218738

Los estudiantes por encima del promedio del curso son: 
Willy - Promedio: 8.64722468399275
Mateo - Promedio: 6.309256990302737
Josue - Promedio: 6.0965389719400225
Andree - Promedio: 7.972717971082001
Nicole - Promedio: 5.168161540362851
Juan - Promedio: 6.228233243949894
Kathya - Promedio: 6.77564698144119
Nicolas - Promedio: 6.874290279013866
Alex - Promedio: 6.869973874526746
Cristopher - Promedio: 7.124954644487024
Jorge - Promedio: 6.850812177509447
Luis - Promedio: 7.050852985058821

Los estudiantes por debajo del promedio del curso son: 
Sebastian - Promedio: 4.0360592291419675
Emilia - Promedio: 3.7254694643286745
Carolina - Promedio: 4.7262185039482505
Yezabel - Promedio: 2.7459091702209513
Pablo - Promedio: 1.1264566375929481
Michelle - Promedio: 3.0126306786531156
Scarlett - Promedio: 3.8460342649008843
Sara - Promedio: 3.8028685372833153
Dayanara - Promedio: 4.845125414170883
Antonny - Promedio: 4.200791711083916
Katherine - Promedio: 3.635329399854723
Ivan - Promedio: 4.872460208017397
Jostim - Promedio: 4.687481153489325
Angeles - Promedio: 4.251078447766352
Diego - Promedio: 4.257243626054278
Javier - Promedio: 1.8846446039503295

El estudiante con el mayor promedio es: 
Willy - Promedio: 8.64722468399275

El estudiante con el menor promedio es: 
Pablo - Promedio: 1.1264566375929481
BUILD SUCCESSFUL (total time: 2 minutes 13 seconds)
 */
