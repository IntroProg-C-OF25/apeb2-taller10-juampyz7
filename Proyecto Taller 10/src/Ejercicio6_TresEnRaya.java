
/**
 * Crea un juego de tres en raya utilizando una matriz bidimensional de 3x3.
 * Permita a dos jugadores marcar sus movimientos alternativamente.
 * El juego debe verificar si alguno de los jugadores ha ganado o si hay un empate.
 *
 * @author Usuario iTC
 */
import java.util.Scanner;

public class Ejercicio6_TresEnRaya {

    public static void main(String[] args) {
        String[][] tablero = {
            {" ", " ", " "},
            {" ", " ", " "},
            {" ", " ", " "}
        };
        Scanner tcl = new Scanner(System.in);
        int turnos = 0;
        String jugadorActual = "X";
        while (true) {
            // Mostrar el tablero
            System.out.println("\nTablero: ");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j]);
                    if (j < 2) {
                        System.out.print(" | ");
                    }
                }
                System.out.println();
                if (i < 2) {
                    System.out.println("--+---+--");
                }
            }

            // Turno del jugador
            System.out.println("Turno del jugador " + jugadorActual);
            System.out.print("Ingrese fila (0, 1 o 2): ");
            int fila = tcl.nextInt();
            System.out.print("Ingrese columna (0, 1 o 2): ");
            int columna = tcl.nextInt();
            // Validar movimiento
            if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna].equals(" ")) {
                tablero[fila][columna] = jugadorActual;
                turnos++;
                // Verificar si hay ganador
                boolean ganador = false;
                // Verificar filas y columnas
                for (int i = 0; i < 3; i++) {
                    if (tablero[i][0].equals(jugadorActual) && tablero[i][1].equals(jugadorActual) && tablero[i][2].equals(jugadorActual)) {
                        ganador = true;
                    }
                    if (tablero[0][i].equals(jugadorActual) && tablero[1][i].equals(jugadorActual) && tablero[2][i].equals(jugadorActual)) {
                        ganador = true;
                    }
                }
                // Verificar diagonales
                if (tablero[0][0].equals(jugadorActual) && tablero[1][1].equals(jugadorActual) && tablero[2][2].equals(jugadorActual)) {
                    ganador = true;
                }
                if (tablero[0][2].equals(jugadorActual) && tablero[1][1].equals(jugadorActual) && tablero[2][0].equals(jugadorActual)) {
                    ganador = true;
                }
                if (ganador) {
                    System.out.println("\n¡Jugador " + jugadorActual + " ha ganado la partida!");
                    break;
                }
                // Verificar empate
                if (turnos == 9) {
                    System.out.println("\n¡Esto es un Empate!");
                    break;
                }
                // Cambiar de jugador
                jugadorActual = jugadorActual.equals("X") ? "O" : "X";
            } else {
                System.out.println("Movimiento incorrecto, vuelve a intentarlo");
            }
        }
    }
}
/***
 * run:

Tablero: 
  |   |  
--+---+--
  |   |  
--+---+--
  |   |  
Turno del jugador X
Ingrese fila (0, 1 o 2): 2
Ingrese columna (0, 1 o 2): 2

Tablero: 
  |   |  
--+---+--
  |   |  
--+---+--
  |   | X
Turno del jugador O
Ingrese fila (0, 1 o 2): 1
Ingrese columna (0, 1 o 2): 1

Tablero: 
  |   |  
--+---+--
  | O |  
--+---+--
  |   | X
Turno del jugador X
Ingrese fila (0, 1 o 2): 0
Ingrese columna (0, 1 o 2): 1

Tablero: 
  | X |  
--+---+--
  | O |  
--+---+--
  |   | X
Turno del jugador O
Ingrese fila (0, 1 o 2): 1
Ingrese columna (0, 1 o 2): 2

Tablero: 
  | X |  
--+---+--
  | O | O
--+---+--
  |   | X
Turno del jugador X
Ingrese fila (0, 1 o 2): 1
Ingrese columna (0, 1 o 2): 0

Tablero: 
  | X |  
--+---+--
X | O | O
--+---+--
  |   | X
Turno del jugador O
Ingrese fila (0, 1 o 2): 0
Ingrese columna (0, 1 o 2): 0

Tablero: 
O | X |  
--+---+--
X | O | O
--+---+--
  |   | X
Turno del jugador X
Ingrese fila (0, 1 o 2): 2
Ingrese columna (0, 1 o 2): 2
Movimiento incorrecto, vuelve a intentarlo

Tablero: 
O | X |  
--+---+--
X | O | O
--+---+--
  |   | X
Turno del jugador X
Ingrese fila (0, 1 o 2): 2
Ingrese columna (0, 1 o 2): 0

Tablero: 
O | X |  
--+---+--
X | O | O
--+---+--
X |   | X
Turno del jugador O
Ingrese fila (0, 1 o 2): 0
Ingrese columna (0, 1 o 2): 2

Tablero: 
O | X | O
--+---+--
X | O | O
--+---+--
X |   | X
Turno del jugador X
Ingrese fila (0, 1 o 2): 2
Ingrese columna (0, 1 o 2): 2
Movimiento incorrecto, vuelve a intentarlo

Tablero: 
O | X | O
--+---+--
X | O | O
--+---+--
X |   | X
Turno del jugador X
Ingrese fila (0, 1 o 2): 2
Ingrese columna (0, 1 o 2): 1

�Jugador X ha ganado la partida!
BUILD SUCCESSFUL (total time: 3 minutes 20 seconds)
 */