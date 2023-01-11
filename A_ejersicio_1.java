package a_ejersicio_1;

import java.util.Scanner;
/**
 *
 * @author Kevin mauricio
 */
public class A_ejersicio_1 {

    public static void main(String[] args) {
     
    Scanner Teclado = new Scanner(System.in);    
        
        int tam;
        System.out.println("Ingresa el tamaño del arreglo");
        tam = Teclado.nextInt();
        System.out.println("El tamaño de mi arreglo es  de : ["
                + ""+tam+"] posiciones");
        
        int vector [] = new int [tam];
        int opt;
        int quitar =0;
        do{
            System.out.println("Bienvenido este es el menu de opciones\n"
                    + "1° Agregar\n"
                    + "2° Mostrar\n"
                    + "3° Eliminar\n"
                    + "4° Salir");
                
            switch(opt = Teclado.nextInt())
            {
                case 1:
                       for(int i=0; i<vector.length; i++)
                       {
                           System.out.println("Agregar ");
                           vector[quitar] = Teclado.nextInt();
            // Una que termina se le suma 1 para que cambie de posicion de la 0 a 1 de 1 a 2 de 2 a 3 de 3 a 4
                           quitar=quitar+1;  // es lo mismo que decir  quitar++;
                       }
                       System.out.println("Datos guardados con exito");
                    
                    break;
                
                     case 2:
                         //Aqui deja de mostrar hasta quitar
                         for(int i=0; i<quitar; i++)
                         {
                         System.out.println("posicion ["+i+"]= "+ vector[i]);
                          
                         }
                    
                    break;
                    
                     case 3:
                         // Aqui solo estoy eliminando la ultima posicion 
                         quitar--;
                         System.out.println("Ultimo dato eliminado con exito");
                    
                    break;
                    
                     case 4:
                         System.out.println("El programa a finalizado");
                    break;
            }
        }while(4!=opt); 
        System.out.println("Gracias por usar el programa de kevin");
     
}
    
}
