import java.util.ArrayList;
import java.util.List;

public class Sponsor {
    private String nombre;
    private List<Sponsoreable> registroUnico;

    public Sponsor(String nombre) {
        this.nombre = nombre;
        this.registroUnico = new ArrayList<>();
    }

    public boolean patrocinar(Carrera c) {
        boolean patrocinio=false;
        if (c.esPatrocinable()) {
            patrocinio = true;
        }
        return patrocinio;
    }
    public boolean patrocinarCorredor(Corredor c) {
        boolean patrocinio=false;
        if (c.esPatrocinable()) {
            patrocinio = true;
        }
        return patrocinio;
    }
};
