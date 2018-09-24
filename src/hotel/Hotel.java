/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author Brian Vanegas
 */
public class Hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        Habitacion hab = new Habitacion();
        ArrayList<Habitacion> habitaciones = hab.getHabitaciones();
        for(Habitacion habitacion: habitaciones) {
            System.out.println(habitacion.getDetalle());
        }
            
    }
    
}
