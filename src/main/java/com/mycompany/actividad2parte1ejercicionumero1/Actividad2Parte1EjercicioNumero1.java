/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2parte1ejercicionumero1;

import java.util.Scanner;
public class Actividad2Parte1EjercicioNumero1 {

    public static void main(String[] args) {
        String nombre, codigo;
        int NumHoras, ValorHora, SalarioBruto;
        double Porcentaje, SalarioNeto;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        nombre = leer.nextLine();
        System.out.println("ingrese su codigo de empleado");
        codigo = leer.nextLine();
        NumHoras = 160;
        ValorHora = 30;
        Porcentaje = 0.12;
        SalarioBruto = NumHoras*ValorHora;
        SalarioNeto = SalarioBruto-(Porcentaje*SalarioBruto);
        System.out.println("Hola "+nombre+" con codigo: "+codigo);
        System.out.println("de acuerdo con nuetra base de datos su Salario bruto es de: "+SalarioBruto);
        System.out.println("Menos la retencion de la fuente su salario final es de: "+SalarioNeto);
        
    }
}
