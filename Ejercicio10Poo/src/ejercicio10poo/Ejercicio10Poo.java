/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10poo;

import java.util.Arrays;

/**
 *
 * @author Notebook
 */
public class Ejercicio10Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   double [] arrayA = new double [50];
   double [] arrayB = new double [20];
  
        System.out.println("El VECTOR A DE 50 NUMEROS ALEATORIOS");
for (int i = 0; i < 50; i++) {
    arrayA[i] = (int)(Math.random()*50+1);
    System.out.print("[" + arrayA[i]+ "]");
    
  } System.out.println(" ");
    
   System.out.println("El VECTOR A DE 50 NUMEROS ORDENADOS");
        for (int i = 0; i < 50; i++) {
         Arrays.sort(arrayA);
         System.out.print("[" + arrayA[i]+ "]");
        }System.out.println(" ");
  

        
         System.out.println("El VECTOR B DE 20 NUMEROS COMBINADOS");
        for (int i = 0; i < 20; i++) {
           Arrays.fill(arrayB, 0, 10, arrayA[i]);
           Arrays.fill(arrayB, 10, 20, 0.5);
           System.out.print("["+ arrayB[i]+"]");
        }  System.out.println(" ");

    }
}

//10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
//de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
//programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
//Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
//ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
//0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
//20.

    

