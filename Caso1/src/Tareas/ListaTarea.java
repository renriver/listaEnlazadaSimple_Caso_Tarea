/*
Supongamos que queremos implementar una lista enlazada 
simple para gestionar una lista de tareas pendientes. 
Cada nodo de la lista representará una tarea con un 
nombre y un estado (pendiente o completado).
*/
package Tareas;


public class ListaTarea {
  //ingresar
  //mostrarTarea
    Nodo cabeza;//variable tipo Nodo
    
    public void AgregarTarea(String tarea){
        Nodo nuevoNodo= new Nodo(tarea);
     if(cabeza==null)
     {   //vacia
         cabeza=nuevoNodo;    
     }
     else{ //almenos hay un elemento
       Nodo nodoTem=cabeza;
       while(nodoTem.siguiente!=null)//recorrer la lista
          {
                nodoTem=nodoTem.siguiente;
           }//while
       nodoTem.siguiente=nuevoNodo;
       }//else
        System.out.println("La nueva tarea "+tarea);
     }//fin de metodo
  //metodo para mostrar la lista de Tareas
   public void mostrarTareas(){
     //recorrer la lista
     Nodo nodoTem=cabeza;
     if(nodoTem==null)
     {
         System.out.println("No existen Tareas");
     }
      nodoTem=cabeza;
       System.out.println(" Lista de tareas");
        while(nodoTem!=null){
         String estado=nodoTem.estado? "ok": "[]";
            System.out.println(estado+nodoTem.nombre+"");
         nodoTem=nodoTem.siguiente;
        }//while
     
  }//mostrasTareas
   //completarTareas
   public boolean completarTareas(String tarea)
   {
       Nodo actual=cabeza; 
          while(actual!=null){
            if(actual.nombre.equalsIgnoreCase(tarea)){
              actual.estado=true;
                System.out.println("Tarea entregada");
                return true;
            }//if
            actual=actual.siguiente;
          }//while
          System.out.println("Tarea no encontrada");
         //return true encuentre la tarea
       
       //       false cuando no encuentre la tarea
       return false;
   }//completarTareas
   
}
