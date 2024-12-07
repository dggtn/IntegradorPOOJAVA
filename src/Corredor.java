public class Corredor implements Sponsoreable{

    private int cantidadDeCarreras;
    private int distanciaMaxima;
    private int puntos;
    private String nombre;
    private boolean tieneCertificado;

    public Corredor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Corredor{" +
                "cantidadDeCarreras=" + cantidadDeCarreras +
                ", distanciaMaxima=" + distanciaMaxima +
                ", puntos=" + puntos +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public int cantidadCarrerasCorridas() {
        return cantidadDeCarreras;
    }

    public void agregarCarreraCorrida() {
        cantidadDeCarreras++;
    }

    public boolean tieneCertificadoMedico() {
        return tieneCertificado;
    }

    public void darCertificadoMedico(boolean c) {
        this.tieneCertificado = c;
    }

    public int verPuntos() {
        return puntos;
    }

    public void agregarPuntos(int p) {
        puntos+=p;
    }

    public void actualizarDistanciaMaxima(int nuevaDistancia){
        if(nuevaDistancia>distanciaMaxima){
            distanciaMaxima = nuevaDistancia;
        }
    }
    public int verDistanciaMasLargaCorrida() {
        return distanciaMaxima;
    }

    @Override
    public boolean esPatrocinable() {
        boolean patrocinio = false;
        if(cantidadDeCarreras>3){
            patrocinio= true;
        }
        return patrocinio;
    }
}
