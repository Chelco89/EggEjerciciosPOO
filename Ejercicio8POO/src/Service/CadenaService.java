/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

/**
 *
 * @author Notebook
 */
public class CadenaService {
    public void mostrarVocales(String frase, int longitud){
     int contador=0;   
        
        for (int i = 0; i < longitud; i++) {
             if ((frase.charAt(i) == 'a')||(frase.charAt(i) == 'e')||(frase.charAt(i) == 'i')||(frase.charAt(i) == 'o')||(frase.charAt(i) == 'u')){
                 contador++;
             }
        } System.out.println("La frase " + frase + " contiene " + contador + " vocales");
     
    }
    
    public void invertirFrase(String frase,int longitud){
        String invertir = "";
        for (int i = longitud -1 ; i > -1; i--) {
            invertir = invertir + frase.charAt(i);
        }
        
        System.out.println(invertir);
    }
    
    public void vecesRepetido(char letra,String frase,int longitud){
        int contador = 0;
       
        for (int i = 0; i < longitud ; i++) {
            if(frase.charAt(i)==letra){
            contador++;  
        }
            
        }
        if (contador==0){
            System.out.println("La letra ingresada no se encuentra en la frase");
        }else{
        System.out.println("La letra " + letra + " se repite en la frase "+ contador + " veces");
    }
    
    }
}

//a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
//frase ingresada.
//b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
//ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
//c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
//contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
//e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
//compone la clase con otra nueva frase ingresada por el usuario.
//f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante.
//g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
//la frase resultante.
//h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no.