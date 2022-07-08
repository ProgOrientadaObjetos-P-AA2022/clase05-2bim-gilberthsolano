/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {
    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    // private double edadminima;
    
    
    public void establecerEstudiante(ArrayList<Persona> lista){
        estudiantes = lista;
    }
    
    public ArrayList<Persona> obtenerEstudiante(){
        return estudiantes;
    }
    
    public void establecerPromedioEdades(){
        double suma = 0;
        for(Persona e: obtenerEstudiante()){
            suma = suma+ e.obtenerEdad();
        }
        promedioEdades = suma/obtenerEstudiante().size();
    }
    
    public double obtenerPromedioEdades(){
        
        return promedioEdades;
    }
      @Override
    public String toString() {
        String cadena = String.format("Listado de estudiantes\n");
        for (int i = 0; i < obtenerEstudiante().size(); i++) {
            cadena = String.format("%sNombre: %s\n",
                    cadena,
                    
                    obtenerEstudiante().get(i).obtenerNombre());
        }
        cadena = String.format("%sPromedio de edades: %.2f\n", 
                cadena,
                obtenerPromedioEdades());
        return cadena;
    } 

    
    
}
