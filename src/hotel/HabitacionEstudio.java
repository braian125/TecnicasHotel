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
public class HabitacionEstudio extends HabitacionSencilla {
    int nSofaCama;

    public HabitacionEstudio(int nroCamas, String tipoCama, int nroBano, String codigoHab, String tipoHab, int nSofaCama) {
        super(nroCamas, tipoCama, nroBano, codigoHab, tipoHab);
        this.nSofaCama = nSofaCama;
    }
    
    @Override
    public String getDetalle(){
        return "Habitación "+codigoHab;
    }
}
