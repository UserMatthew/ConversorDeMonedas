/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversordedivisas.Clases;

import java.util.Scanner;

public class ConversorMoneda {

    public static void Convertir(String monedaBase, String monedaTarget, ConsultarMonedas consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase,monedaTarget);
        System.out.println("La tasa de conversion para hoy es\n1 " + monedaBase + " = " + monedas.conversion_rate()+" " +monedaTarget);
        System.out.println("Ingrese la cantidad de " +monedaBase + " que desea convertir");
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad + " " + monedaBase + " es igual a " + cantidadConvertida +" "+ monedas.target_code());      
        
    }

}
