/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author caesa
 */
public class StringAtribut implements Atribute{
    String numeAtribut;
    String numeProd;

    public StringAtribut() {
    }


    @Override
    public void addCreate(String add_value, String add_name) {
        numeAtribut = add_name;
        //numeProd = add_value;
    }

    @Override
    public void insertValue(String add_value) {
        
        numeProd = add_value;
    }
    
    
}
