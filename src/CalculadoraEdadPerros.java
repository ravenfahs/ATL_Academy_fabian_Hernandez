/*
*   1) Calculadora de edad de perros:
*   Pídele al usuario que ingrese la edad de su perro.
*   Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).
*
*/

import java.util.Scanner;

public class CalculadoraEdadPerros {
    public static void main(String[]args){

        //Variables del problema
        String nombreCanino;
        int edadCanino;
        float edadCaninoHumanos;

        //Bienvenida del programa
        System.out.println("---Programa para calcular la edad---");
        System.out.println("Ingresa el nombre de tu can: ");
        Scanner capturaDelNombreCanino = new Scanner(System.in);
        nombreCanino = capturaDelNombreCanino.next();

        //Captura de datos, edad del cam
        System.out.println("Ingresa la edad del can: ");
        Scanner capturaDeEdadCanino = new Scanner(System.in);
        edadCanino = capturaDeEdadCanino.nextInt();

        //Cálculo de edad del cam (16*Ln(edadDelCam)+31)
        edadCaninoHumanos = (float) Math.log((float) edadCanino) * 16 + 31;
        //Mostar en consola el resultado del cálculo
        System.out.println("La edad del cam "+nombreCanino +" em años humanos es de: "+edadCaninoHumanos+ " aproximadamente..");
    }
}

