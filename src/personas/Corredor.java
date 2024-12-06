package personas;

import carreras.Carrera;
import carreras.Patrocinable;

import java.util.ArrayList;
import java.util.List;

public class Corredor implements Patrocinable {
    String nombre;
    int cantCarrerasCorridas = 0;
    int distanciaMaxima;
    int puntaje;
    Boolean certificado;
    Carrera carrera;
    List<Integer> distancias;

    public Corredor(String nombre, Boolean certificado) {
        this.nombre = nombre;
        this.certificado = certificado;
        this.distancias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public boolean fueAdmitido(Carrera c) {
        boolean admitido = false;
        if (c.admitirCorredor(this, c.getDistancia())) {
            int distancia = c.getDistancia();
            if(distancia>this.distanciaMaxima){
                distanciaMaxima=distancia;
            }
            cantCarrerasCorridas += 1;
            admitido = true;

        }
        return admitido;
    }

    public int getCantCarrerasCorridas() {
        return cantCarrerasCorridas;
    }

    public int getDistanciaMaxima() {
        for (int i = 0; i <= distancias.size(); i++) {
            if (i > distanciaMaxima) {
                distanciaMaxima = i;
            }
        }
        return distanciaMaxima;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    public Boolean getCertificado() {
        return certificado;
    }

    public void setCertificado(Boolean certificado) {
        this.certificado = certificado;
    }

    public Boolean puedeObtenerPatrocinio() {
        boolean patrocinio = false;
        if (cantCarrerasCorridas >= 3) {
            patrocinio = true;
        }
        return patrocinio;
    }

    @Override
    public String toString() {
        return "Corredor{" +
                "nombre='" + nombre + '\'' +
                ", cantCarrerasCorridas=" + cantCarrerasCorridas +
                ", distanciaMaxima=" + distanciaMaxima +
                ", puntaje=" + puntaje +
                ", certificado=" + certificado +
                '}';
    }

    @Override
    public boolean patrocinable() {
        boolean patrocinio = false;
        if (puedeObtenerPatrocinio()) {
            patrocinio = true;
        }
        return patrocinio;
    }
}

;
