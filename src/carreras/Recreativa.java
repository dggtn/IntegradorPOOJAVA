package carreras;

import personas.Corredor;

import java.util.List;

public class Recreativa extends Carrera {
    private String tipo = "Recreativa";

    public String getTipo() {
        return tipo;
    }

    public Recreativa(int distancia, String nombre) {
        super(distancia, nombre);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getDistancia() {
        return distancia;
    }

    public List<Corredor> getInscriptos() {
        return inscriptos;
    }

    @Override
    public List<Corredor> mostrarInscriptos() {
        return getInscriptos();
    }


    @Override
    public Boolean admitirCorredor(Corredor corredor, int distancia) {
        return true;
    }

    @Override
    public Integer getDesnivel() {
        return 0;
    }

    @Override
    public boolean patrocinable() {
        System.out.println("Al ser carrera recreativa no puede ser patrocinable");
        return false;
    }


    @Override
    public String toString() {
        return "Recreativa{" +
                "inscriptos=" + inscriptos +
                '}';
    }


}
