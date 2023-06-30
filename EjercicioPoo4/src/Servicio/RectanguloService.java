/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class RectanguloService {
    
    public Rectangulo crearRectangulo(){
        Scanner r = new Scanner(System.in);
        
        System.out.println("Ingrese la Base del rectangulo");
        double base = r.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        double altura = r.nextDouble();
        
        
        return new Rectangulo(base,altura);
    }
    
    public static void superficie(double base,double altura){
        
        double sup = base * altura;
        
        System.out.println("La superficie del rectangulo es = " + sup);
        
        
    }
    
    public static void perimetro(double base,double altura){
        
        double pe= (base + altura) * 2;
        
        System.out.println("El perimetro del rectangulo es = " + pe );
        
    }
    public static void dibujarRectangulo(double base,double altura){
        for (int i = 1; i <= base; i++) {
            for (int j = 1; j <=altura; j++) {
                if ((i==1) || (i== base) || (j ==1)||(j==altura))
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
    
        } 
        
    }
    
}
//La clase incluirá un método para crear el rectángulo
//con los datos del Rectángulo dados por el usuario. También incluirá un método para
//calcular la superficie del rectángulo y un método para calcular el perímetro del
//rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
//asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
//setters y constructores correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.