package Tareas;

import java.util.Scanner;

public class principalTarea {

public static void main(String a[]){
      ListaTarea objTarea=new ListaTarea();
      Scanner leer=new Scanner(System.in);
      int opcion;
//menu de opciones
//agregar la tarea
//mostrar tareas
//salir
    do{//control de menu antes de salir
        System.out.println(":-:-: Menu de opciones :-:-:");
        System.out.println("1.- Agregar tareas");
        System.out.println("2.-Mostrar Tareas");
        System.out.println("3.- Completar tarea"
                + "\n4.- Salir");
        System.out.println("Digite la opcion deseada");
        opcion=leer.nextInt();
        leer.nextLine();
        switch(opcion){
            case 1:
                System.out.println("Ingrese la tarea");
                String nvatarea=leer.nextLine();
                objTarea.AgregarTarea(nvatarea);
              break;
            case 2 : 
                objTarea.mostrarTareas();
                break;
            case 3 : 
                System.out.println("Ingrese la tarea a completar");
                String tareaCompleta=leer.nextLine();
                objTarea.completarTareas(tareaCompleta);
                break;
                
            default:
                System.out.println("Opcion no valida"); 
                
        }
    }while(opcion!=4);
}
}
