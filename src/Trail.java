public class Trail extends Carrera {
    private int desnivel;
    private int cupoMaximo;

    public Trail(int distancia, String nombre, int desnivel) {
        super(distancia, nombre);
        this.desnivel = desnivel;
    }

    @Override
    public void inscribirCorredor(Corredor c) {
        if (inscriptos.size() < cupoMaximo) {
            inscriptos.add(c);
            cantidadInscriptos();
            int puntoPorDesnivel = desnivel / 1000;
            int puntoPorDistancia = distancia / 20;
            int totalPuntos = puntoPorDesnivel + puntoPorDistancia;
            c.agregarPuntos(totalPuntos);
        }

    }

    public void modificarCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;

    }

    public void modificarDistancia(int i) {
        this.distancia = i;
    }

    @Override
    public boolean esPatrocinable() {
        return desnivel >= 2000 || tieneCorredorCon5Puntos();
    }

    private boolean tieneCorredorCon5Puntos() {
        boolean corredorEncontrado = false;
        int i = 0;

        while (!corredorEncontrado && i < this.inscriptos.size()) {
            corredorEncontrado = this.inscriptos.get(i).verPuntos() >= 5;
            i++;
        }

        return corredorEncontrado;
    }

}

