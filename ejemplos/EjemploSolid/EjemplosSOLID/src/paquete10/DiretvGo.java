/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

import java.io.Serializable;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class DiretvGo implements APIMovie, Serializable{
        private String apiKey;


    @Override
    public void establecerApiKey(String ak) {
          apiKey = ak+123123;
    }

    @Override
    public String obtenerApiKey() {
        return apiKey;
        
    }
    
}
