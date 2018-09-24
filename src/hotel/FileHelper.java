/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Brian Vanegas
 */
public class FileHelper {
    BufferedReader br;
    String readLine;
    ArrayList<String> lines = new ArrayList<String>();
    
    public ArrayList FileHelper(String fileName) {
        try{
            br = new BufferedReader(new FileReader(fileName));
            readLine = br.readLine();
            
            while(readLine != null){
                lines.add(readLine);
                readLine = br.readLine();
            }
        } catch(IOException e){
            System.out.println("Hay un problema:" + e);
        }
        return lines;
    }
}
