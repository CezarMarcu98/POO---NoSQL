/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author caesa
 */
public class FloatAtribut implements Atribute{
    String numeAtribut;
    float fl;

    public FloatAtribut() {
    }

    @Override
    public void addCreate(String add_value, String add_name) {
        //System.out.println(add_value);
        //float value = Float.parseFloat(add_value);
       // fl = value;
        numeAtribut = add_name;
    }

    @Override
    public void insertValue(String add_value) {
        float value = Float.parseFloat(add_value);
        fl = value;
        
    }
    
}
