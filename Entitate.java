
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
public class Entitate {
    String key;
    int RF;
    int nrAtribute;
    ArrayList<Atribute> atribute;
    public Entitate(String key, int RF, int nrAtribute){
        this.key = key;
        this.RF = RF;
        this.nrAtribute = nrAtribute;
        atribute = new ArrayList<>(nrAtribute);
    }
    
    
    public void addAtribute(Atribute atr, String to_add){
        atr.insertValue(to_add);
       
    }
}
