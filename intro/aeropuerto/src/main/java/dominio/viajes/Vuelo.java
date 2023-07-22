package dominio.viajes;

import dominio.personas.Pasajero;
import dominio.personas.Tripulacion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Vuelo {

    private LocalDateTime diaLlegada;
    private LocalDateTime diaPartida;

    private Double duracionEstimadaEnMinutos;
    private Avion avion;
    private List<Pasajero> pasajeros;
    private Tripulacion tripulacion;

    public LocalDateTime getDiaLlegada() {
        return diaLlegada;
    }

    public void setDiaLlegada(LocalDateTime diaLlegada) {
        this.diaLlegada = diaLlegada;
    }

    public LocalDateTime getDiaPartida() {
        return diaPartida;
    }

    public void setDiaPartida(LocalDateTime diaPartida) {
        this.diaPartida = diaPartida;
    }

    public Integer cantidadDePasajeros(){
        return this.pasajeros.size();
    }

    public Double capacidadRealOcupadaPorPasajeros(){
        return (this.cantidadDePasajeros()*100.00)/ this.avion.getCantidadDePasajeros();
    }
}
