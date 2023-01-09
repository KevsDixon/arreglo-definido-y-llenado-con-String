package a_arreglo_palabras.pkg11;

import java.util.Scanner;
/**
 *
 * @author Kevin Mauricio 
 */
public class A_Arreglo_Palabras11 {
    public static void main(String[] args) {
       
        Scanner Teclado = new Scanner(System.in);
        String palabra= "";
         
        String arreglo[] = new String[5];
        
        System.out.println("Ingresa 5 palabras");
        int i=0;
        while(i<5)
        {    System.out.println("Agregar Palabra");
            palabra = Teclado.next();
            palabra = palabra.toUpperCase(); // metodo que conbierte  todo en mayuscula
            if(palabra.length()<=10)
            {
                arreglo[i]=palabra;
                i++;
                
            }
            else
            {
                System.out.println("Palabra no aseptada ingresa otra palabra nueva");  
            }
          
        }
            
        System.out.println("Mostrar las palabras del arreglo");
         for(i=0; i<arreglo.length; i++)
         {
             System.out.println(arreglo[i]);
         }
    }
    
}
