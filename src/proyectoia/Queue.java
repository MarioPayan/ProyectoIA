/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoia;
import java.util.ArrayList;

/**
 *
 * @author kazemu
 */

public class Queue extends ArrayList{
 
 //se añade un elemento a la cola. Se añade al final de esta.
 public void encolar(Nodo nodo){
  if(nodo != null){
   this.add(nodo);
   System.out.println(" Posición (X,Y) del nodo: ("+ nodo.getX()+","+nodo.getY()+")");
   System.out.println("Tamaño cola "+ this.size());
  }else{
   System.out.println("Ingrese un nodo");
  }  
 }

 //se elimina el elemento frontal de la cola, es decir, el primer elemento que entró.
 public void desencolar(){
  if(this.size() > 0){
   this.remove(0);
  }
 }
 
 //se devuelve el elemento frontal de la cola, es decir, el primer elemento que entró.
 public Nodo frente(){
  Nodo nodoAux = null;
  if(this.size() > 0){
   nodoAux = (Nodo) this.get(0);
  }
  return nodoAux;  
 }
 
 //devuelve cierto si la pila está vacía o falso en caso contrario (empty).
 public boolean vacia(){
  return this.isEmpty();
 }
 
 public int posPrioridad(){
     Nodo nodoAux = (Nodo) this.get(0);
     int menor = nodoAux.getF_n();
     int posMenor = 0;     
     int tamanio = this.size();
     for(int i=1; i<tamanio; i++){
         if(nodoAux.getF_n() > ((Nodo) this.get(i)).getF_n() ){
             nodoAux = (Nodo) this.get(i);
             menor = nodoAux.getF_n();
             posMenor=i;
             
         }
     }
     return posMenor;
 }
 public Nodo prioridad(int pos){
     return (Nodo) this.get(pos);
 }
 
  public void removerP(int pos){  
     if(this.size() > 0){
     this.remove(pos);
    }
 }
 

}
