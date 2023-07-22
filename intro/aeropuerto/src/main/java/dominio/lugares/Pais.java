package dominio.lugares;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Pais {
    private String nombre;
    private Continente continente;
    private List<Ciudad> ciudades;

    public Pais(String nombre, Continente continente, List<Ciudad> ciudades) {
        this.nombre = nombre;
        this.continente = continente;
        this.ciudades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Continente getContinente() {
        return continente;
    }

    public void setContinente(Continente continente) {
        this.continente = continente;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }
    public void agregarCiudades(Ciudad ... ciudades){ // obligar a que llegue uno. no puede haber
        Collections.addAll(this.ciudades, ciudades);                    /// variables de mas de uno como parametros
    }
}
