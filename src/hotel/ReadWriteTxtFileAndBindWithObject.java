/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
/**
 *
 * @author Brian Vanegas
 */
public class ReadWriteTxtFileAndBindWithObject {

	  public static void main(String[] args) throws Exception {
	        BufferedReader br = new BufferedReader(new FileReader("Personas.txt"));

	        ArrayList<Person> list = new ArrayList<Person>();
	        Person p = null;
	        String readLine = br.readLine();

	        while(readLine != null){
	        	
                    String [] person  = readLine.split("\\|");
	             
	            //System.out.println("Array Lenth:"+person.length); 
	            //System.out.println("aGE:"+person[0]);
	            
	            p = new Person(Integer.parseInt(person[0].trim()), person[1], person[2]);
                    list.add(p);
                    readLine = br.readLine();
	        }
                
                int reply = JOptionPane.showConfirmDialog(null, "Deseas ingresar una persona?", "Crear Persona", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    String _age = JOptionPane.showInputDialog("Escribe la edad de la persona: ");
                    String nombre = JOptionPane.showInputDialog("Escribe el nombre de la persona: ");
                    String ciudad = JOptionPane.showInputDialog("Escribe la ciudad de la persona: ");
                    Person newP = new Person(Integer.parseInt(_age), nombre, ciudad);
                    list.add(newP);
                    JOptionPane.showMessageDialog(null, "Persona registrada con éxito!");
                }

	        FileOutputStream fout = new FileOutputStream("Personas.txt");

	        for(Person prsn : list){
	            fout.write(prsn.toString().getBytes());
	            fout.write('\n');
	            
	            System.out.println(prsn.toString());
	        }

	    }

	}
//src\\main\\resources\\ReadFromTxtFileAndBindWithObjectInput
//src\\main\\resources\\ReadFromTxtFileAndBindWithObjectOutput