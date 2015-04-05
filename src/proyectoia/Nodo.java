/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoia;

/**
 *
 * @author kazemu
 */
public class Nodo {
    private int x;
    private int y;
    private int[][] path;
    private int cost;
    private int charge;
    
    Nodo(int x, int y, int[][] path, int cost, int charge){
        this.x=x;
        this.y=y;
        this.path=path;
        this.cost=cost;
        this.charge=charge;
    }
    
    int getX(){
        return x;
    }
    
    int getY(){
        return y;
    }
    
    int[][] getPath(){
        return path;
    }
    
    int getCost(){
        return cost;
    }
    
    int getCharge(){
        return charge;
    }
    
    boolean travel(int x, int y){
        for(int i=0;i<path.length;i++){
            if(path[i][0]==x && path[i][1]==y){return true;}
        }
        return false;
    }
    
    void print(){
        String pathString="";
        for(int i=0;i<path.length;i++){
            pathString+="("+path[i][0]+","+path[i][1]+") ";
        }
        System.out.println("--------------------------");
        System.out.println("Posicion: ("+ x + "," + y + ")");
        System.out.println("Camino: "+ pathString);
        System.out.println("Costo: " + cost);
        System.out.println("Carga: " + charge);
    }
}
