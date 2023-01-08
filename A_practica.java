package a_practica;

import java.util.Scanner;
/**
 *
 * @author Kevin Mauricio
 */
public class A_practica {

public static void main(String[] args) {
        
    Scanner Teclado = new Scanner(System.in);
       /* 
        int x;
      
        System.out.println("ingresa un numero a evaluar");
        x = Teclado.nextInt();
        
        if(x<10)
        {   // considera solo los numeoros menores al 10 es decir hasta el 9
            System.out.println("se ejecuta el primer if");
        }
        else if(x>10)
        { // considera todos los numeros mayores a 10 es decir del 11 hasta el infinito
            System.out.println("se ejecuta el segundo if");
        }
        else
        { // aqui solo considera al 10 por que el 10 no se considera en la primer condicion ni en la segunda
            System.out.println("se ejecuta el else");    
        }
     */
       
       String arreglo[] = new String[5];
       
       
       for(int i=0; i<arreglo.length; i++)
       {
           System.out.println("Agregar nombre");
           arreglo[i] = Teclado.next(); 
           
       }
        System.out.println("Nombres guardados con exito");
       
        
       for(int i=0; i<arreglo.length; i++) 
       {
           System.out.println("Nombre en la posicion :["+i+"] "+ arreglo[i]);
       }
       
    }
}
