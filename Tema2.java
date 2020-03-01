
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author caesa
 */
public class Tema2 {
    
    public static void main(String[] argv) throws FileNotFoundException, IOException{
        
        File file;
        file = new File(argv[0]);
        
        BufferedReader buff = new BufferedReader(new FileReader(file));
        
        String line;
        line = buff.readLine();
        
        String v[] = line.split(" ");
        
        String numeBaza = v[1];
        int nrNoduri = Integer.decode(v[2]);
        int MaxCapacity = Integer.decode(v[3]);
        
        BazaDeDate baza = new BazaDeDate(numeBaza, nrNoduri, MaxCapacity);
        ArrayList<Entitate> copieEnt = new ArrayList<>();
        
        baza.init();
        
        while ((line = buff.readLine()) != null){
            citire(line, baza, copieEnt);
        }
    }
    
    
    public static void addAtributToEntity(String type, String to_add, ArrayList<Atribute> ProprEnt){
        if (type.compareTo("Integer") == 0){
            IntegerAtribut first = new IntegerAtribut();
            first.addCreate(to_add, type);
            ProprEnt.add(first);
            return;
        }
            
        if (type.compareTo("String") == 0){
            StringAtribut second = new StringAtribut();
            second.addCreate(to_add, type);
            ProprEnt.add(second);
            return;
        }
        else{
            FloatAtribut third = new FloatAtribut();
            third.addCreate(to_add, type);
            ProprEnt.add(third);
            return;
        }
        
    }
    
    public static void citire(String line, BazaDeDate baza, ArrayList<Entitate> copieEnt){
        String v[] = line.split(" ");
        if (v[0].compareTo("CREATE") == 0){
            
            int RF = Integer.decode(v[2]);
            int nrAtribute = Integer.decode(v[3]);
            
            Entitate ent = new Entitate(v[1], RF, nrAtribute);
            
            for (int i = 4; i < v.length ; i += 2){
                addAtributToEntity(v[i+1], v[i], ent.atribute);
            }
            copieEnt.add(ent);
        }
        if (v[0].compareTo("INSERT") == 0){
            for (Entitate aux : copieEnt){
                if (v[1].compareTo(aux.key) == 0){
                    
                    int rf = aux.RF;
                    while (rf > 0){
                        for(Noduri nod : baza.noduri){
                            nod.currentCapacity ++;
                            nod.entitati.add(aux);
                            rf --;
                        }
                    }
                }
            }
        }
    }
    
}
