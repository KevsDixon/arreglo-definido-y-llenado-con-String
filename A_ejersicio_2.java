package a_ejersicio_2;

import java.util.Scanner;
/**
 *
 * @author Kevin Mauricio 
 */
public class A_ejersicio_2 {

    public static void main(String[] args) {
      
    Scanner Teclado = new Scanner(System.in);    
    // Determino el tamaño del arreglo     
    int tam;    
    System.out.println("ingresa el tamaño del arreglo");
    tam = Teclado.nextInt();        
    System.out.println("El arreglo es de : ["+tam +"] posiciones");    
        
    //creo el arreglo   
      int vector[] = new int[tam];    
      int opt;  
      int quitar =0;
      int eliminar;
      do{
          System.out.println("Bienvenido al menu de opciones\n"
                  + "1° Agregar\n"
                  + "2° Mostrar\n"
                  + "3° eliminar Especial\n"
                  + "4° Salir");
          switch(opt = Teclado.nextInt())
          {
              case 1:
                     
                  for(int i=0; i<vector.length; i++)
                  {
                      System.out.println("Agregar numero");
        vector[quitar] = Teclado.nextInt();// Aqui el dato digitado por el usuario se guardado se queda en posicion [1]
                      quitar=quitar+1; // quitar = 0 +1=1    quitar=1
                  }
                  System.out.println("Datos guardados con exito");
               break;
               
              case 2:
              
                 for(int i=0; i<quitar; i++)
                 {
                     System.out.println("posicion ["+ i +"]="+vector[i]);
                 }
               break;
               
               case 3:
                
                   System.out.println("Escoje que posicion deceas eliminar");
                   eliminar = Teclado.nextInt();
                   for(int i=eliminar; i<vector.length-1; i++)
                   {
                       vector[i] = vector[i+1];
                   }
                   System.out.println("Dato eliminado con exito");
                    for(int i=0; i<vector.length-1; i++)
                    {
                        System.out.println(vector[i]);
                    }
                   quitar--;
                  
               break;
               
               case 4:
                   System.out.println("El programa ha finalizado con exito");
               break;
          }
           
      }while(4!=opt);
        System.out.println("Gracias por usar el programa de kevin");
    }
    
}
