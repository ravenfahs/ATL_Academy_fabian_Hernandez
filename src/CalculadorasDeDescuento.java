/*
        3) Calculadora de descuento:
        Pídele al usuario que ingrese el precio original de un producto.
        Pídele al usuario que ingrese el porcentaje de descuento.
        Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
        Muestra el precio final al usuario
 */

import java.util.Scanner;

public class CalculadorasDeDescuento {
    public static void main(String[] args) {

        //Variables del problema
        double valorPrecioProducto;
        double descuento;
        double precioFinal;

        //Captura de valor del producto
        System.out.println("--Programa para calcular el descuento de un producto, capturando el valor del producto y el descuento---");
        System.out.println("Ingresar el valor del producto...");
        Scanner datoProducto = new Scanner(System.in);
        valorPrecioProducto = datoProducto.nextDouble();

        //Captura del valor del descuento del producto
        System.out.println("Ingresar el valor del descuento....");
        Scanner datoDelDescuento = new Scanner(System.in);
        descuento = datoDelDescuento.nextDouble();

        //Cálculo del descuento del producto
        precioFinal = valorPrecioProducto - (valorPrecioProducto * descuento / 100);

        //Mostrar el final del producto
        System.out.println("...Valor del precio del producto: " +valorPrecioProducto + " Descuento del producto: " + descuento+ " Valor final del producto con el descuento: " + precioFinal);

    }

}
