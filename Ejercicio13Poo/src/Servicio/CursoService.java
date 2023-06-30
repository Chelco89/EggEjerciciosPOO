/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class CursoService {
    Scanner r = new Scanner(System.in).useDelimiter("\n");
    
    Curso c = new Curso();
    public void cargarAlumnos(String []alumnos){
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre del alumno ");
             alumnos[i]= r.next();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("[" + alumnos[i] + "]");
        }System.out.println("");
        
    }
    
    public Curso crearCurso(){
        
        System.out.println("Ingrese nombre del Curso");
        c.setNombreCurso(r.next());
//         private String nombreCurso;
        System.out.println("Ingrese cantidad horas por dia ");
        c.setCantidadHorasPorDia(r.nextInt());
//    private int cantidadHorasPorDia;
        System.out.println("Ingrese Cantidad de Dias por semana");
        c.setCantidadDiasPorSemana(r.nextInt());
//    private int cantidadDiasPorSemana;
        System.out.println("Ingrese Turno M o T");
        c.setTurno(r.next());
//    private String turno;
        System.out.println("Ingrese precio por hora");
        c.setPrecioPorHora(r.nextDouble());
        //    private double precioPorHora;
        cargarAlumnos(c.getAlumnos());
        
//    private String alumnos [] = new String [5];
         return new Curso();
    }
    public void calcularGananciaSemanal(){
        double ganancias;
        ganancias = c.getCantidadHorasPorDia()* c.getCantidadDiasPorSemana()* c.getPrecioPorHora()* 5;
        System.out.println("Las ganancias en una semana por curso es de = " + ganancias);
        
        
        
    }
    
}
// método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
//que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
//en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
//nombre de cada alumno.
// Método crearCurso(): el método crear curso, le pide los valores de los atributos al
//usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
//al atributo alumnos
// Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
//en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
//día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
//se repite el encuentro.