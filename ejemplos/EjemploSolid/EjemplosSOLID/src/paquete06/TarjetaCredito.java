/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class TarjetaCredito {

    private String nombre;
    private String codigo;
    private double cupoMaximo;

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void establecerCupoMaximo(double cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCodigo() {
        return codigo;
    }

    public double obtenerCupoMaximo() {
        return cupoMaximo;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre:%s\n"
                + "Codigo:%s\n"
                + "Cupo Maximo:%.2f\n", 
                obtenerNombre(),
                obtenerCodigo(),
                obtenerCupoMaximo());
        return cadena;
    }

}
