package carreras;

import personas.Corredor;

import java.util.ArrayList;
import java.util.List;

public abstract class Carrera implements Patrocinable {
    protected String nombre;
    protected int distancia;
    protected List<Corredor> inscriptos;
    protected String tipo;

    public Carrera(int distancia, String nombre) {
        this.distancia = distancia;
        this.nombre = nombre;
        this.inscriptos = new ArrayList<>();
    }
    public abstract String getNombre();
    public abstract int getDistancia();
    public abstract String getTipo();
    public abstract List<Corredor> mostrarInscriptos();


    public abstract List<Corredor> getInscriptos();


    public abstract Boolean admitirCorredor(Corredor corredor, int distancia);

    public abstract Integer getDesnivel();

}
