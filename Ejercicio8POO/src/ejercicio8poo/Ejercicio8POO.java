/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8poo;

import Entidad.Cadena;
import Service.CadenaService;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio8POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r = new Scanner(System.in);
        Cadena c = new Cadena();
        CadenaService cs = new CadenaService();
        
        System.out.println("Ingrese una frase");
        c.setFrase(r.nextLine());
        c.setLongitud(c.getFrase().length());
        System.out.println("la frase " + c.getFrase()+ " tiene " + c.getLongitud()+ " caracteres");
        cs.mostrarVocales(c.getFrase(), c.getLongitud());
        cs.invertirFrase(c.getFrase(), c.getLongitud());
        System.out.println("Ingrese caracter a buscar en la frase");
        char letra = r.next().charAt(0); 
        cs.vecesRepetido(letra, c.getFrase(), c.getLongitud());
        
    }
    
}
//En el main se creará el objeto y se le pedirá al usuario que ingrese
//una frase que puede ser una palabra o varias palabras separadas por un espacio en
//blanco y a través de los métodos set, se guardará la frase y la longitud de manera
//automática según la longitud de la frase ingresada. Deberá además implementar los
//siguientes métodos: