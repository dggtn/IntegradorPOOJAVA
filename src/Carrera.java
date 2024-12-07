import java.util.ArrayList;
import java.util.List;

public abstract class Carrera implements Sponsoreable{
    private String nombre;
    protected int distancia;
    protected List<Corredor> inscriptos;

    public Carrera(int distancia, String nombre) {
        this.distancia = distancia;
        this.nombre = nombre;
        this.inscriptos = new ArrayList<>();
    }


    public abstract void inscribirCorredor(Corredor c);

    public int cantidadInscriptos(){
        return inscriptos.size();
    }
}
