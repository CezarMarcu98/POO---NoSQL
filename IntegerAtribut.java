/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author caesa
 */
public class IntegerAtribut implements Atribute{
    String numeAtribut;
    int id;

    public IntegerAtribut() {
    }

    
    @Override
    public void addCreate(String add_value, String add_name) {
       // this.id = Integer.decode(add_value);
        numeAtribut = add_name;
    }

    @Override
    public void insertValue(String add_value) {
        this.id = Integer.decode(add_value);
        
    }
    
}
