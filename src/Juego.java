/*
        5) Juego de adivinar el número:
        Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número,
        recibe el nombre del jugador y se puede configurar el número de intentos que quiere jugar.
*/

import java.util.Random;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {

        //Variables del Juego
        String nombre;
        int numeroDeIntentos;
        int numeroSeleccionado;
        int numeroAleatorio;
        boolean bandera = true;

        //un numero random de 1 a 100: Pueden ver para mirar cual sería el numero que salio y ganar o no hacer pruebas
        Random random = new Random();
        numeroAleatorio = random.nextInt(101);
        //Des comentar esta linea para ganar a la primera
        //System.out.println("Numero Ramdon: "+numeroAleatorio);

        //Captura de datos: Nombre del participante
        System.out.println("¿Cuál es tu nombre?: ");
        Scanner recibirNombre = new Scanner(System.in);
        nombre = recibirNombre.next();

        //Captura de datos: Numero de intentos
        System.out.println("¿Cuantos intentos quieres hacer?: ");
        Scanner recibirIntentos = new Scanner(System.in);
        numeroDeIntentos = recibirIntentos.nextInt();

        //Captura de datos: Numero para jugar a adivinar
        System.out.println("Intenta adivinar el número ganador que esta entre 1 y 100, ¿Cuál podría ser?: ");
        Scanner recibirNumero = new Scanner(System.in);

        //Controlar la cantidad de veces y comparar si es o no la respuesta correcta
        for (int i = 0; i < numeroDeIntentos; i++) {
            numeroSeleccionado = recibirNumero.nextInt();

            if (numeroSeleccionado != numeroAleatorio){
                System.out.println("Intenta con otro número...");
            }
            else {
                System.out.println("Felicitaciones ganaste...... " + nombre + "!!!!!!!");
                bandera = false;
                break;
            }
        }

        //Diálogos para terminar el juego
        if (bandera){
            System.out.println("Opps ya no tienes más intentos, Sigue intentando con otro nuevo numero....");
        }
        else {
            System.out.println("Fin del juego!!!!");
        }
    }
}
