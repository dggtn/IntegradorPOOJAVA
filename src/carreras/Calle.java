package carreras;


import personas.Corredor;

import java.util.List;

public class Calle extends Carrera implements Puntuable {
    Corredor corredor;
    private Boolean certificado;
    private String tipo = "Calle";

    public String getTipo() {
        return tipo;
    }

    public Calle(int distancia, String nombre) {
        super(distancia, nombre);
    }

    public void setInscriptos(List<Corredor> inscriptos) {
        this.inscriptos = inscriptos;
    }


    public String getNombre() {
        return nombre;
    }

    @Override
    public int getDistancia() {
        return distancia;
    }


    @Override
    public List<Corredor> mostrarInscriptos() {
        return inscriptos;
    }

    @Override
    public List<Corredor> getInscriptos() {
        return inscriptos;
    }


    public boolean necesitaCertificado(int distancia) {
        if (distancia >= 10) {
            certificado = true;
        }
        return certificado;
    }

    @Override
    public Boolean admitirCorredor(Corredor corredor, int distancia) {
        boolean admitido = false;
        if (distancia >= 10 & corredor.getCertificado()) {
            inscriptos.add(corredor);
            puntuar(corredor);
            admitido = true;
        } else if (distancia < 10) {
            admitido = false;
        }
        return admitido;
    }

    @Override
    public Integer getDesnivel() {
        return 0;
    }

    @Override
    public String toString() {
        return "Calle{" +
                "inscriptos=" + inscriptos +
                '}';
    }


    @Override
    public void puntuar(Corredor c) {
        int puntajeActual = 0;
        if (c.getPuntaje() < 10) {
            puntajeActual = c.getPuntaje() + 1;
            c.setPuntaje(puntajeActual);

        }
    }


    @Override
    public boolean patrocinable() {
        boolean patrocinio = false;
        if (inscriptos.size() >= 100) {
            patrocinio = true;
        }
        return patrocinio;
    }


    ;
}