/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class Escritura {

    private ObjectOutputStream salida;
    private ArrayList<GeneradorPeliculas> listaGenerador = new ArrayList<>();
    private GeneradorPeliculas registrogenerador;
    private String nombreArchivo;

    public Escritura(String nombre) {
        nombreArchivo = nombre;
        establecerListaGenerador();
        try {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            if (obtenerlistageneradores().size() > 0) {
                for (int i = 0; i < obtenerlistageneradores().size(); i++) {
                    establecerRegistroGenerador(obtenerlistageneradores().get(i));
                    establecerSalida();

                }
            }
        } catch (Exception e) {
        }
    }

    public void establecerNombreArchivo(String c) {
        nombreArchivo = c;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public void establecerListaGenerador() {
        Lectura l = new Lectura(obtenerNombreArchivo());
        l.establecerGenerador();
        listaGenerador = l.obtenerGenerador();
    }

    public ArrayList<GeneradorPeliculas> obtenerlistageneradores() {
        return listaGenerador;
    }

    public void establecerRegistroGenerador(GeneradorPeliculas c) {
        this.registrogenerador = c;

    }

    public GeneradorPeliculas obtenerRegistroCiudad() {
        return registrogenerador;
    }

    public void cerrarArchivo() {
        try // cierra el archivo
        {
            if (salida != null) {
                salida.close();
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");

        } // fin de catch
    }

    public void establecerSalida() {
        try {
            salida=new ObjectOutputStream(new FileOutputStream("/Users/gilbertsolanosotomayor/Documents/clase05-2bim-gilberthsolano/ejemplos/EjemploSolid/EjemplosSOLID/src/paquete10/datos/generador.data"));
            
            salida.writeObject(registrogenerador);

        } catch (IOException ioe) {
            System.out.println("Error en escribir archivo");
        }
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

}
