
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import modell.Ember;

public class FileOlvasas {

    public static void main(String[] args) throws IOException {
        InputStream szoveg = FileOlvasas.class.getClassLoader().getResourceAsStream("text\\emberek.csv");
        BufferedReader bf = new BufferedReader(new InputStreamReader(szoveg));
        ArrayList<Ember> emberek = new ArrayList<>();
        String sor;
        while((sor = bf.readLine()) != null){
            String[] s = sor.split(";");
            String nev = s[0];
            String cim = s[1];
            Ember ember = new Ember(nev, cim);
            emberek.add(ember);
        }
        
        for (Ember ember : emberek) {
            System.out.println(ember);
        }
    }
    
}
