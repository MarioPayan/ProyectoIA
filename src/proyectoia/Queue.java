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
 
 public void encolar(Nodo nodo){
  if(nodo != null){
   this.add(nodo);
  }else{
   System.out.println("Ingrese un nodo");
  }  
 }

 public void desencolar(){
  if(this.size() > 0){
   this.remove(0);
  }
 }
 
 public Nodo frente(){
  Nodo nodoAux = null;
  if(this.size() > 0){
   nodoAux = (Nodo) this.get(0);
  }
  return nodoAux;  
 }
 
 public boolean vacia(){
  return this.isEmpty();
 }
 
 public int posPrioridad(){
     Nodo nodoAux = (Nodo) this.get(0);
     int posMenor = 0;     
     int tamanio = this.size();
     for(int i=1; i<tamanio; i++){
         if(nodoAux.getF_n() > ((Nodo) this.get(i)).getF_n() ){
             nodoAux = (Nodo) this.get(i);
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
