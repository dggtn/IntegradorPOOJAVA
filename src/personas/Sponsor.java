package personas;

import carreras.Carrera;
import carreras.Patrocinable;
import carreras.Trail;

import java.util.ArrayList;
import java.util.List;

public class Sponsor {
    private List<Patrocinable> registroPatrocinados;
    private int patrocinados = 0;

    public int cantPatrocinada() {
        return patrocinados;
    }

    public Sponsor() {
        this.registroPatrocinados = new ArrayList<>();
    }

    public List<Patrocinable> getRegistroPatrocinados() {
        return registroPatrocinados;
    }


    @Override
    public String toString() {
        return "Sponsor{" +
                "registroPatrocinados=" + registroPatrocinados +
                '}';
    }

    public void patrocinar(Patrocinable p) {
        if(p.patrocinable()){
            registroPatrocinados.add(p);
        }
    }
}
