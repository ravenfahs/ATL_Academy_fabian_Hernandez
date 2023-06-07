/*
    4) Calculadora de propinas:
    Pídele al usuario que ingrese el total de la cuenta en un restaurante.
    Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
    Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).
*/

import java.util.Scanner;

public class CPropinas {
    public static void main(String[] args) {

        //Variables del problema
        double factura;
        double porcentajeFactura;
        double propina;
        double totalFactura;

        //Calcular la propina
        System.out.println("---Programa la calcular propinas---");

        //Captura de datos de la factura
        System.out.println("Ingresar el valor de la factura del restaurante...");
        Scanner capturaFactura = new Scanner(System.in);
        factura = capturaFactura.nextDouble();

        //Captura de datos del porcentaje de la factura
        System.out.println("Ingresar el porcentaje del valor de la propina de la factura...");
        Scanner capturaPorcentaje = new Scanner(System.in);
        porcentajeFactura = capturaPorcentaje.nextDouble();

        //Cálculo de la propina
        propina = factura * (porcentajeFactura / 100);
        totalFactura = factura + propina;

        //Mostrar resultados
        System.out.println("El valor de factura total es: " + totalFactura + " la propina es de: " + propina + " y el valor de la factura es: " + factura);
    }
}
