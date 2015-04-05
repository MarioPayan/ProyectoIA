/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoia;

import java.io.*;

/**
 *
 * @author kazemu
 */
public class Reader {
    
    private int matrix[][];
    private int tam;
    
    Reader(String fileIn) throws FileNotFoundException, IOException{
        File file = new File(fileIn);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        
        line = br.readLine();
        tam = Integer.parseInt(line);
        matrix = new int[tam][tam];
        
        for(int i=0;i<tam;i++){
            line = br.readLine();
            for(int j=0;j<tam;j++){
                matrix[i][j] = Character.getNumericValue(line.charAt(j*2));
            }
        }
        
        br.close();
        fr.close();
    }
    
    public int[][] getMatrix(){
        return matrix;
    }
}
