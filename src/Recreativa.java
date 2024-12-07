public class Recreativa extends Carrera{

    public Recreativa(int distancia, String nombre) {
        super(distancia, nombre);
    }

    @Override
    public void inscribirCorredor(Corredor c) {
        inscriptos.add(c);

    }

    @Override
    public boolean esPatrocinable() {
        return false;
    }
}
