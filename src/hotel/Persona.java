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
public class Persona {
    private String identificacion;
    private String nombres;
    private String ciudad;

    public Persona(String identificacion, String nombres, String ciudad) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.ciudad = ciudad;
    }
    
    public Persona() throws FileNotFoundException {
        FileHelper file = new FileHelper();
        ArrayList lines = file.FileHelper("Personas.txt");
        
        /*for(Object line : lines){
            System.out.println(line);
            String [] persona  = line.split("\\|");
        }*/
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    
}
