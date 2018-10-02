/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author Brian Vanegas
 */
public class HabitacionDoble extends Habitacion {
    private int nroBano;
    private String tipoCama;

    public HabitacionDoble(int nroCamas, String tipoCama, int nroBano, String codigoHab, String tipoHab) {
        super(codigoHab, tipoHab, nroCamas);
        this.nroBano = nroBano;
        this.tipoCama = tipoCama;
    }
    
    @Override
    public String getDetalle(){
        return getCodigoHab()+"-"+getTipoCama()+"-"+getNroBano();
    }

    public int getNroBano() {
        return nroBano;
    }

    public void setNroBano(int nroBano) {
        this.nroBano = nroBano;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }
    
    
    
}
