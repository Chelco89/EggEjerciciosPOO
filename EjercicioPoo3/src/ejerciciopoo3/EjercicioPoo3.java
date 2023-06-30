/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoo3;

import Entidad.Operacion;
import Servicio.OperacionService;
import static Servicio.OperacionService.dividir;
import static Servicio.OperacionService.multiplicar;
import static Servicio.OperacionService.restar;
import static Servicio.OperacionService.sumar;

/**
 *
 * @author Notebook
 */
public class EjercicioPoo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        OperacionService n = new OperacionService();
        Operacion n1 = n.crearOperacion();
        
        
        
        sumar(n1.getNumero1(),n1.getNumero2());
        restar(n1.getNumero1(),n1.getNumero2());
        multiplicar(n1.getNumero1(),n1.getNumero2());
        dividir(n1.getNumero1(),n1.getNumero2());
        
        
        
        
    }
    
}
//Crear una clase llamada Operacion que tenga como atributos privados numero1 y
//numero2. A continuación, se deben crear los siguientes métodos:
//a) Método constructor con todos los atributos pasados por parámetro.
//b) Metodo constructor sin los atributos pasados por parámetro.
//c) Métodos get y set.
