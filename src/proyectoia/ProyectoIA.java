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
public class ProyectoIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Control control = new Control("fichero");
        control.busquedaAmplitud();
        
    }
    
}
