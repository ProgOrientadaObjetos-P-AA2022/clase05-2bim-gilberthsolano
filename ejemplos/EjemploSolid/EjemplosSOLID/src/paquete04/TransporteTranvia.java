/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class TransporteTranvia extends Transporte{
   private String cooperativaTranvia;
   
    @Override
    public void establecerTarifa() {
        tarifa=1+1.50;
    }

    public String obtenerCooperativaTranvia() {
        return cooperativaTranvia;
    }

    public void establecerCooperativaTranvia(String cooperativaTranvia) {
        this.cooperativaTranvia = cooperativaTranvia;
    }
    
    
    
}
