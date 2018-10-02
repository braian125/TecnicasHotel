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
public class Habitacion {
    private String codigoHab;
    private String tipoHab;
    private int nroCamas;
    private FileHelper file = new FileHelper();
    static final String FILE = "Habitaciones.txt"; 
    private ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();

    public Habitacion(String codigoHab, String tipoHab, int nroCamas) {
        this.codigoHab = codigoHab;
        this.tipoHab = tipoHab;
        this.nroCamas = nroCamas;
    }
    
    public Habitacion() throws FileNotFoundException {
        ArrayList lines  = file.FileHelper(FILE);
        
        for(Object line : lines) {
            String[] arrHab = String.valueOf(line).split("\\|");
            switch(arrHab[1].trim()) {
                case "Sencilla":
                    habitaciones.add(new HabitacionSencilla(Integer.parseInt(arrHab[4].trim()), arrHab[3], Integer.parseInt(arrHab[2].trim()), arrHab[0], arrHab[1]));
                    break;
                
                case "Doble":
                    habitaciones.add(new HabitacionDoble(Integer.parseInt(arrHab[4].trim()), arrHab[3], Integer.parseInt(arrHab[2].trim()), arrHab[0], arrHab[1]));
                    break;
                
                case "Matrimonial":
                    habitaciones.add(new HabitacionMatrimonial(Integer.parseInt(arrHab[4].trim()), arrHab[3], Integer.parseInt(arrHab[2].trim()), arrHab[0], arrHab[1]));
                    break;
                
                case "Estudio":
                    habitaciones.add(new HabitacionEstudio(Integer.parseInt(arrHab[4].trim()), arrHab[3], Integer.parseInt(arrHab[2].trim()), arrHab[0], arrHab[1], Integer.parseInt(arrHab[5].trim())));
                    break;
            }
        } 
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }
    
    public String getDetalle() {
        return "Habitación: "+codigoHab;
    }

    public String getCodigoHab() {
        return codigoHab;
    }

    public void setCodigoHab(String codigoHab) {
        this.codigoHab = codigoHab;
    }

    public String getTipoHab() {
        return tipoHab;
    }

    public void setTipoHab(String tipoHab) {
        this.tipoHab = tipoHab;
    }

    public int getNroCamas() {
        return nroCamas;
    }

    public void setNroCamas(int nroCamas) {
        this.nroCamas = nroCamas;
    }
}
