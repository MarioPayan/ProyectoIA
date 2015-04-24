/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoia;

import java.io.IOException;

/**
 *
 * @author kazemu
 */
public class Control {
    
    private int matrix[][];
    private int posStart[];
    private int posEnd[];
    
    Control(String fileIn) throws IOException {
        Reader reader = new Reader(fileIn);
        this.matrix=reader.getMatrix();
        
        System.out.println("##### Lectura y datos iniciales #####");
        
        findPosStart();
        System.out.println("Posicion inicial: "+posStart[0]+"-"+posStart[1]);
        
        findPosEnd();
        System.out.println("Posicion final: "+posEnd[0]+"-"+posEnd[1]);
        
        Aux aux = new Aux(matrix.length);
        aux.printMatrix(matrix);
    }
    
    int[] findPosStart(){
        posStart = new int[2];
        for(int j=0;j<matrix.length;j++){
            for(int k=0;k<matrix.length;k++){
                if(matrix[j][k]==0){
                    posStart[0]=j;
                    posStart[1]=k;
                    j=k=matrix.length;
                }
            }
        }
        return posStart;
    }
    
    int[] findPosEnd(){
        posEnd = new int[2];
        for(int j=0;j<matrix.length;j++){
            for(int k=0;k<matrix.length;k++){
                if(matrix[j][k]==7){
                    posEnd[0]=j;
                    posEnd[1]=k;
                    j=k=matrix.length;
                }
            }
        }
        return posEnd;
    }
    
    void busquedaAsterisco1(){
        System.out.println("########## Inicio de busqueda A* ##########");
        BusquedaAsterisco1 busquedaAsterisco1 = new BusquedaAsterisco1(matrix, posStart[0], posStart[1],posEnd[0], posEnd[1]);
        busquedaAsterisco1.run();
        System.out.println("\n");
    }
    void busquedaAmplitud(){
        System.out.println("##### Inicio de busqueda por Amplitud #####");
        BusquedaAmplitud busquedaAmplitud = new BusquedaAmplitud(matrix, posStart[0], posStart[1]);
        busquedaAmplitud.run();
        System.out.println("\n");
    }
}
