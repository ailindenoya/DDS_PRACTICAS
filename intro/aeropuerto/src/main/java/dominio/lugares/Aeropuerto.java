package dominio.lugares;

import dominio.viajes.Vuelo;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Aeropuerto {
    private String nombre;
    private String codigoInternacional;
    private Ciudad ciudad;
    private List<Vuelo> vuelos;

    public Integer cantidadDeVuelosQuePartieronElDia(LocalDate unDia){
        return 0; //this.vuelos.stream().filter();
    }
}
