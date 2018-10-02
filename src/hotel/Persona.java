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
    private static final String FILE = "Personas.txt";
    private ArrayList<Persona> personas = new ArrayList<Persona>();

    public Persona(String identificacion, String nombres, String ciudad) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.ciudad = ciudad;
    }
    
    public Persona() {
        FileHelper file = new FileHelper();
        ArrayList lines  = file.FileHelper(FILE);
        
        for(Object line : lines) {
            String[] persona = String.valueOf(line).split("\\|");
            personas.add(new Persona(persona[0].trim(), persona[1].trim(), persona[2].trim()));
        }
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

    public ArrayList<Persona> getPersonas() {
        return personas;
    }
    
    public String getFILE() {
        return FILE;
    }
    
    @Override
    public String toString() {
        return this.identificacion + " | " + this.nombres + " | " + this.ciudad;
    }
}
