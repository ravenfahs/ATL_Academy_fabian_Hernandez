/*
    2) Conversor de millas a kilómetros:
    Pídele al usuario que ingrese una distancia en millas.
    Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
    Muestra la distancia en kilómetros al usuario

* */

import java.util.Scanner;

public class ConversorDeMi_km {
    public static void main(String[] args) {

        //Variables del problema
        double kilometro;
        double millas;

        //Constante de conversion
        double cte = 1.60934;

        //Saludo del programa
        System.out.println("--Programa para convertir millas a kilometros--");

        //Captura de datos
        System.out.println("Digitar Millas: ");
        Scanner capturaDeMillas = new Scanner(System.in);
        millas = capturaDeMillas.nextFloat();

        //Cálculo de millas a kilómetros
        kilometro = millas*cte;

        //Mostar resultados de la conversion
        System.out.println("Millas registradas: "+ millas+ " Resultado de la conversion de millas a kilometros es: "+ kilometro+" Kms");

    }
}
