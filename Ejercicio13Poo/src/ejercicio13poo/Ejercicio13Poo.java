/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13poo;

import Entidad.Curso;
import Servicio.CursoService;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio13Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r = new Scanner(System.in).useDelimiter("\n");
       
        CursoService c = new CursoService();
        Curso c1 = new Curso();
        
        
        c.crearCurso();
        c.calcularGananciaSemanal();
        
        
    }
    
}
