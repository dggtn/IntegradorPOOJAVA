public class Calle extends Carrera {

    public Calle(int distancia, String nombre) {
        super(distancia, nombre);
    }


    @Override
    public void inscribirCorredor(Corredor c) {
        if (distancia < 10 || c.tieneCertificadoMedico()) {
            c.actualizarDistanciaMaxima(distancia);
            for (int i = 0; i < inscriptos.size(); i++) {
                if(inscriptos.get(i)!=c){
                    c.agregarCarreraCorrida();
                    inscriptos.add(c);
                }
            }

            if (c.verPuntos() < 10) {
                c.agregarPuntos(1);
            }
        }
    }

    @Override
    public boolean esPatrocinable() {
        boolean patrocinio = false;
        if (inscriptos.size() >= 100) {
            patrocinio = true;
        }
        return patrocinio;
    }



}
