/*
 * 
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
package paquete10;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<GeneradorPeliculas> listagenerador = new ArrayList();
        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");

        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        System.out.println(gp.obtenerUrl());

        System.out.println("---------------------------");

        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("1234575");

        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");
        System.out.println(gp2.obtenerUrl());
        System.out.println("--------------------");

        DiretvGo direc = new DiretvGo();
        direc.establecerApiKey("Directv12333222");

        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(direc);
        gp3.establecerUrl("http://api.movie?api=");
        System.out.println(gp3.obtenerUrl());

        System.out.println("---------------------------");
        Starplus star = new Starplus();
        star.establecerApiKey("StrarPlus2938843");

        GeneradorPeliculas gp4 = new GeneradorPeliculas();
        gp4.establecerLlave(star);
        gp4.establecerUrl("http://api.movie?api=");
        System.out.println(gp4.obtenerUrl());
        String nombreArchivo="/Users/gilbertsolanosotomayor/Documents/clase05-2bim-gilberthsolano/ejemplos/EjemploSolid/EjemplosSOLID/src/paquete10/datos/generador.data";
        GeneradorPeliculas[] lista = {gp, gp2, gp3, gp4};
        Escritura escr1 = new Escritura(nombreArchivo);
        for (int i = 0; i < lista.length; i++) {
            escr1.establecerRegistroGenerador(lista[i]);
            escr1.establecerSalida();
        }

        escr1.cerrarArchivo();
        Lectura lect1 = new Lectura(nombreArchivo);
        listagenerador = lect1.obtenerGenerador();
        if (listagenerador != null) {
            for (GeneradorPeliculas generadorPeliculas : listagenerador) {
                System.out.println(generadorPeliculas);
            }
        }
        lect1.cerrarArchivo();

    }
}
