package carreras;

import personas.Corredor;

import java.util.List;

public class Trail extends Carrera implements Puntuable {
    private float desnivel;
    private int cupoMaximo;
    private String tipo = "Recreativa";

    public String getTipo() {
        return tipo;
    }


    @Override
    public List<Corredor> mostrarInscriptos() {
        return inscriptos;
    }

    @Override
    public String getNombre() {
        return "";
    }

    @Override
    public int getDistancia() {
        return distancia;
    }

    public Trail(Integer distancia, String nombre, float desnivel, int cupoMaximo) {
        super(distancia, nombre);
        this.desnivel = desnivel;
        this.cupoMaximo = cupoMaximo;
    }


    @Override
    public List<Corredor> getInscriptos() {
        return inscriptos;
    }


    @Override
    public Boolean admitirCorredor(Corredor c, int distancia) {
        boolean admitido = false;
        if (inscriptos.size() < cupoMaximo) {
            puntuar(c);
            inscriptos.add(c);
            admitido = true;

        }
        return admitido;
    }

    @Override
    public Integer getDesnivel() {
        return 0;
    }


    public Integer getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(Integer cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }


    @Override
    public void puntuar(Corredor c) {
        int puntajeActual = 0;
        int puntosXdistancia = distancia / 1000;
        int puntosXdesnivel = distancia / 20;
        int totalPuntos = puntosXdistancia + puntosXdesnivel;
        c.setPuntaje(totalPuntos);
    }

    private boolean contasConCorredorAlMenos5Puntos(Trail trail) {
        boolean cuentaConMasIgual5puntos = false;
        for (int i = 0; i <= inscriptos.size(); i++) {
            if (inscriptos.get(i).getPuntaje() >= 5) {
                cuentaConMasIgual5puntos = true;
            }
        }
        return cuentaConMasIgual5puntos;
    }

    @Override
    public boolean patrocinable() {
        boolean patrocinio = false;
        if (desnivel >= 2000 || contasConCorredorAlMenos5Puntos(this)) {
            patrocinio = true;
        }
        return patrocinio;
    }


    @Override
    public String toString() {
        return "Trail{" +
                "inscriptos=" + inscriptos +
                '}';
    }

}




