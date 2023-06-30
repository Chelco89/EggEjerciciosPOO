/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11poo;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio11POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r =new Scanner(System.in);
        
        
        System.out.println("Ingrese dia");
        int dia = r.nextInt();
        System.out.println("Ingrese mes");
        int mes = r.nextInt();
        System.out.println("Ingrese año");
        int anio = r.nextInt();
        Date fecha = new Date(anio-1900,mes-1,dia);
        System.out.println("FECHA INGRESADA " + fecha);
        
        Date fechaActual = new Date();
        System.out.println("FECHA ACTUAL " + fechaActual);
        
        
        int Anios = fechaActual.getYear()- fecha.getYear();
        
        
        System.out.println("ENTRE LA FECHA INGRESADA Y LA FECHA ACTUAL");
        System.out.println("HAY " + Anios + " AÑOS DE DIFERENCIA");
    }
    
}
//En este ejercicio deberemos instanciar en el main, una fecha usando la clase
//Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
//usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
//deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
//se puede conseguir instanciando un objeto Date con constructor vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();