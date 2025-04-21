package Tareas;
/*
Supongamos que queremos implementar una lista enlazada 
simple para gestionar una lista de tareas pendientes. 
Cada nodo de la lista representará una tarea con un 
nombre y un estado (pendiente o completado).
*/
public class Nodo {
    //para las tareas
    String nombre;//nombre tarea
    boolean estado;//estatus de la tarea true o false
    Nodo siguiente;//dato tipo Nodo

    public Nodo(String nombre) {
        this.nombre = nombre;
        this.estado = false;//
        this.siguiente = null;
    }
    
}
