
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
public class BazaDeDate {
    String nume;
    int nrNoduri;
    int maxCapacity;
    ArrayList<Noduri> noduri;
    
    public BazaDeDate(String name, int noNodes, int maxCap){
        this.nume = name;
        this.nrNoduri = noNodes;
        this.maxCapacity = maxCap;
        noduri = new ArrayList<>(nrNoduri);
    }
    
    public void init(){
        for (int i = 0; i <maxCapacity; i++){
            Noduri nod = new Noduri(maxCapacity);
            nod.currentCapacity = 0;
            noduri.add(nod);
        }
    }
}
