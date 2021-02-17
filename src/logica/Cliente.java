/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Date;

/**
 *
 * @author Vinni 
 */
public class Cliente {
    private String nombre;
    private Date fechaNac;
    
    public Cliente(String nombre, Date fechaNac){
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public void modificarNombre(String nombre){
        this.nombre = nombre;
    }
    public Date obtenerFechaNac(){
        return fechaNac;
    }
    public void modificarFechaNac(Date fechaNac){
        this.fechaNac = fechaNac;
    }    

    @Override
    public String toString() {
        return this.nombre+ " "+this.fechaNac;
    }
    private int saberEdad(){
        //calcular la edad 
        return 18;
    }
    public boolean esCandidato(){
        int edad = this.saberEdad();
        if (edad >= 18 ){
            return true;
        }
        return false; 
                
    }

    
    
}
