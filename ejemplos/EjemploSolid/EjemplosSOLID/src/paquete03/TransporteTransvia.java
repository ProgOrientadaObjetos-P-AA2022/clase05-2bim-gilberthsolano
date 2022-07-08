/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class TransporteTransvia {

    private String cooperativaTransvia;
    private double tarifa;

    public String obtenerCooperativaTransvia() {
        return cooperativaTransvia;
    }

    public void establecerCooperativaTransvia(String cooperativaTransvia) {
        this.cooperativaTransvia = cooperativaTransvia;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

    public void establecerTarifa() {
       tarifa= 1+0.30;
    }

}
