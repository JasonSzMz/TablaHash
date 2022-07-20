/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testhash;


/**
 *
 * @author JasonDGR
 */


public class DatosTabla {
    private String name;
    private int limite;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLimite() {
        return limite;
    }
        //marcos
    public void setLimite(int limite) {
        this.limite = limite;
    }
    
    
    public int getSumCode(){
        int x, indice, code=0;
        int value=0;
        
        for(x=0; x< getName().length(); x++){
            value=getName().charAt(x);
            code += getName().charAt(x);
            System.out.println(getName().charAt(x) + " valor ->" + value);
        }
        
        System.out.println("Suma de los codigos -> "+ code);
        
        indice = code%getLimite();
        
        return indice;
    }
    
}
