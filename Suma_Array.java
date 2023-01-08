package suma_array;

import java.util.Scanner;

/**
 *
 * @author GATEWAY
 */
public class Suma_Array {

    public static void main(String[] args) {
       
        Scanner Teclado = new Scanner(System.in);
        int tam;
        int total =0;
        System.out.println("ingresa el tamaño del arreglo");
        tam = Teclado.nextInt();
        System.out.println("El tamaño de arreglo es de : "+tam);
        
        int arreglo[] = new int [tam];
        for(int i=0; i<arreglo.length; i++)
        {
            System.out.println("Agrega numero");
            arreglo[i] = Teclado.nextInt();
            total=total+arreglo[i];
        }
        System.out.println("datos guardados con exito");
        
        
        for(int i=0; i<arreglo.length; i++)
        {
            System.out.println("pocicion ["+i+"] es : "+ arreglo[i]);
            
        }
        System.out.println("La suma del arreglo es : "+total);
    }
    
}
