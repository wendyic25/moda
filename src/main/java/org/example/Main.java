package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String nombreCliente;
        String tipoCliente;
        int cantidadArticulos;
        double descuento;
        double totalDescuento;
        double precioTotal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre y apellidos del cliente: ");
        nombreCliente = scanner.nextLine();


        System.out.println("Ingrese el tipo de cliente (Regular o VIP): ");
        tipoCliente = scanner.nextLine();

        System.out.println("Ingrese la cantidad de artículos comprados: ");
        cantidadArticulos = scanner.nextInt();

        System.out.println("Ingrese el precio total de la compra (sin descuento): ");
        precioTotal = scanner.nextInt();


        double descuento1= calcularDescuento(tipoCliente, cantidadArticulos);
        double totalConDescuento = precioTotal - (precioTotal * descuento1/ 100);


        System.out.println("****Resumen de la compra:****");
        System.out.println("***Nombre del cliente: " + nombreCliente);
        System.out.println("***Tipo de cliente: " + tipoCliente);
        System.out.println("***Cantidad de artículos: " + cantidadArticulos);
        System.out.println("**Precio total de la compra: $" + precioTotal);
        System.out.println("***Descuento aplicado: " + descuento1 + "%");
        System.out.println("***Cantidad descontada: $" + (precioTotal * descuento1 / 100));
        System.out.println("**Total a pagar: $" + totalConDescuento);
    }


    private static double calcularDescuento(String tipoCliente, int cantidadArticulos) {
        if (tipoCliente.equalsIgnoreCase("Regular")) {
            if (cantidadArticulos >= 1 && cantidadArticulos <= 3) {
                return 5;
            } else if (cantidadArticulos >= 4 && cantidadArticulos <= 6) {
                return 10;
            } else if (cantidadArticulos > 6) {
                return 15;
            }
        } else if (tipoCliente.equalsIgnoreCase("VIP")) {
            if (cantidadArticulos >= 1 && cantidadArticulos <= 3) {
                return 10;
            } else if (cantidadArticulos >= 4 && cantidadArticulos <= 6) {
                return 15;
            } else if (cantidadArticulos > 6) {
                return 20;
            }
        }


        System.out.println("Tipo de cliente o cantidad de artículos no válidos. Se aplicará descuento del 0%");
        return 0;










    }
}