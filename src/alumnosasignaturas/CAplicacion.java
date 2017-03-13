
package alumnosasignaturas;


import java.util.Scanner;


public class CAplicacion {

    public static Scanner teclado=new Scanner (System.in);
    public static void main(String[] args) {
     CGrupo grupo=new CGrupo("1DAM");
     
     int op;   
     op=menu();   
       
     switch(op){
         
         case 1:  
             matricular();
         
         
         
     }  
        
        
        
        
        
        
    }
    public static int menu(){
        int op;
        System.out.println("1.Matricular\n2.Baja de alumno\n3.Poner notas\n4.Mostrar "
                + "expediente\n5.Mostrar datos de todo el grupo\n6.Salir");
        System.out.println("Introduce una opción: ");
        
        op=teclado.nextInt();
        return op;
    }
    public static void matricular(){
        System.out.println("Introduce el nombre del grupo: ");
        String nombre=teclado.nextLine();
        
        
        
        
        }
    
    }

