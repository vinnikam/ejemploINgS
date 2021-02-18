/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import dao.Cliente;

/**
 *
 * @author Vinni 
 */
public class Prestamo {

    private Cliente cliente;
    private Double intereses;
    private int plazo;
    private Double valorPrestamo;

    public Prestamo(Cliente cliente, int plazo, Double valorPrestamo){
        this.cliente = cliente;
        this.plazo = plazo;
        this.valorPrestamo = valorPrestamo;
        this.cargarInteres();
    }
    
    public Cliente obtenerCliente() {
        return cliente;
    }

    public Double obtenerIntereses() {
        return intereses;
    }

    public int obtenerPlazo() {
        return plazo;
    }
    

    public Double obtenerValorPrestamo() {
        return valorPrestamo;
    }

    
    public Double hacerSimulacion(){
        if (this.cliente.esCandidato()){
            Double rta = (valorPrestamo/plazo)*intereses;
            return rta;
        }
        return null;
    }

    private void cargarInteres() {
       
        if(plazo == 12){
            intereses = 0.015;
        }
        if(plazo == 24){
            intereses = 0.012;
        }
        if(plazo == 36){
            intereses = 0.09;
        }

    }
}
