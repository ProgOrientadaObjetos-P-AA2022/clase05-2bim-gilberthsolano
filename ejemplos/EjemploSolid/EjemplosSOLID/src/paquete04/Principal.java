/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;
// cambios -8- julio -2022
/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();

        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        TransporteTranvia tranvia= new TransporteTranvia();
        tranvia.establecerCooperativaTranvia("Cuenca City");
        tranvia.establecerTarifa();

        TiposTransporte tipos = new TiposTransporte();
        ArrayList<Transporte> transportes = new ArrayList<>();
        transportes.add(bus);
        transportes.add(taxi);
        transportes.add(tranvia);
        tipos.establecerTransportes(transportes);
        tipos.establecerPromedioTarifas();
//        tipos.establecerTransporteBus(bus);
//        tipos.establecerTransporteTaxi(taxi);


        System.out.printf("Promedio de Tarifas: %.2f",
                tipos.obtenerPromedioTarifas());

    }
}
