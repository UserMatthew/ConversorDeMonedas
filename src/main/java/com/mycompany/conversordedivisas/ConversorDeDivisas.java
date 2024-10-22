package com.mycompany.conversordedivisas;

import com.mycompany.conversordedivisas.Clases.ConsultarMonedas;
import com.mycompany.conversordedivisas.Clases.ConversorMoneda;
import java.util.Scanner;

public class ConversorDeDivisas {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMonedas consulta = new ConsultarMonedas();

        while (true) {
            System.out.println("************************************");
            System.out.println("");
            System.out.println("Sea bienvenido/a al Conversor de monedas :3");
            System.out.println("");
            System.out.println("¿Ingrese el valor de la opcion que desea tomar?");
            System.out.println("1) Dólar >>> Peso Argentino");
            System.out.println("2) Peso Argentino >>> Dólar");
            System.out.println("3) Real Brasileño >>> Dólar");
            System.out.println("4) Dólar >>> Real Brasileño");
            System.out.println("5) Dólar >>> Peso colombiano");
            System.out.println("6) Peso Colombiano >>> Dólar");
            System.out.println("7) Salir");
            System.out.println("");
            System.out.println("************************************");

            var busqueda = lectura.nextLine();

            if (busqueda.equalsIgnoreCase("1")) {
                ConversorMoneda.Convertir("USD", "ARS", consulta, lectura);
            }
            if (busqueda.equalsIgnoreCase("2")) {
                ConversorMoneda.Convertir("ARS", "USD", consulta, lectura);
            }
            if (busqueda.equalsIgnoreCase("3")) {
                ConversorMoneda.Convertir("BRL", "USD", consulta, lectura);
            }
            if (busqueda.equalsIgnoreCase("4")) {
                ConversorMoneda.Convertir("USD", "BRL", consulta, lectura);
            }
            if (busqueda.equalsIgnoreCase("5")) {
                ConversorMoneda.Convertir("USD", "COP", consulta, lectura);
            }
            if (busqueda.equalsIgnoreCase("6")) {
                ConversorMoneda.Convertir("COP", "USD", consulta, lectura);
            }
            if (busqueda.equalsIgnoreCase("7")) {
                break;
            }

        }
    }
}
