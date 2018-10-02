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
    private int nroCamas;
    private String tipoCama;
    private int nroBano;

    public HabitacionSencilla(int nroCamas, String tipoCama, int nroBano, String codigoHab, String tipoHab) {
        super(codigoHab, tipoHab, nroCamas);
        this.tipoCama = tipoCama;
        this.nroBano = nroBano;
    }
    
    @Override
    public String getDetalle(){
        return getCodigoHab()+"-"+getTipoCama()+"-"+getNroBano();
    }

    public int getNroCamas() {
        return nroCamas;
    }

    public void setNroCamas(int nroCamas) {
        this.nroCamas = nroCamas;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    public int getNroBano() {
        return nroBano;
    }

    public void setNroBano(int nroBano) {
        this.nroBano = nroBano;
    }
}
