/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoo4;

import Entidad.Rectangulo;
import Servicio.RectanguloService;
import static Servicio.RectanguloService.dibujarRectangulo;
import static Servicio.RectanguloService.perimetro;
import static Servicio.RectanguloService.superficie;

/**
 *
 * @author Notebook
 */
public class EjercicioPoo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RectanguloService r = new RectanguloService();
        Rectangulo r1 = r.crearRectangulo();
        
        superficie(r1.getBase(),r1.getAltura());
        perimetro(r1.getBase(),r1.getAltura());
        dibujarRectangulo(r1.getBase(),r1.getAltura());
        
        
    }
    
}
