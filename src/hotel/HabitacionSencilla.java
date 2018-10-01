/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.io.FileNotFoundException;

/**
 *
 * @author Brian Vanegas
 */
public class HabitacionSencilla extends Habitacion {
    int nroCamas;
    String tipoCama;
    int nroBano;

    public HabitacionSencilla(int nroCamas, String tipoCama, int nroBano, String codigoHab, String tipoHab) {
        super(codigoHab, tipoHab);
        this.nroCamas = nroCamas;
        this.tipoCama = tipoCama;
        this.nroBano = nroBano;
    }
    
    public int getNroCamas() {
        return nroCamas;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public int getNroBano() {
        return nroBano;
    }
    
    @Override
    public String getDetalle(){
        return "Habitación "+codigoHab;
    }
}
