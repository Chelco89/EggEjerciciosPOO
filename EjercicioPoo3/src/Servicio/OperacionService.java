/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class OperacionService {
    public Operacion crearOperacion(){
        Scanner r = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        int numero1 = r.nextInt();
        System.out.println("Ingrese segundo numero");
        int numero2 = r.nextInt();
        return new Operacion(numero1,numero2);
        
        
    }
    
    public static void sumar(int num1,int num2){
        
        int suma = num1+num2;
        System.out.println("La suma del numero " + num1 + " y el numero = " + num2 + " es igual a =" + suma);
    }
    
    
    public static void restar(int num1,int num2){
        
        int resta = num1-num2;
        System.out.println("La resta del numero " + num1 + " y el numero = " + num2 + " es igual a =" + resta);
    }
    
    public static void multiplicar(int num1,int num2){
        int mult = num1*num2;
        if (num1==0 || num2==0) {
            System.out.println( "el resultado es " +0 +" no esta permitido hacer una multiplicacion por 0");
        }else {
            System.out.println("La multipicacion del numero " + num1 + " X " + num2 + " es igual a =" + mult );
        }
        
    }  
     public static void dividir(double num1,double num2){
        double div = num1/num2;
        if (num1== 0 || num2==0) {
            System.out.println( "el resultado es " +0 +" no esta permitido hacer una division por 0");
        }else {
            System.out.println("La division del numero " + num1 + " / " + num2 + " es igual a =" + div );
        }    
     }
}

    

//d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
//en los atributos del objeto.
//e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//f) Método restar(): calcular la resta de los números y devolver el resultado al main
//g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
//fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
//Si no, se hace la multiplicación y se devuelve el resultado al main
//h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main.