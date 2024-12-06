import carreras.*;
import personas.Corredor;
import personas.Sponsor;



public class Main {
    public static void main(String[] args) {
        Calle carreraMaya = new Calle(10, "carreraMaya");
        Trail patagoniaRun = new Trail(45, "patagoniaRun", 3000,45);
        Recreativa recreo = new Recreativa(5,"recre");

        //carreras:
        recreo.getTipo();
        recreo.getDistancia();
        recreo.getDesnivel();
        recreo.getInscriptos();




        Corredor monica = new Corredor("monica",true);
        Corredor paul = new Corredor("Paul",false);
        monica.setCertificado(true);
        Corredor juan = new Corredor("juan",true);
        Corredor andres = new Corredor("andres",false);
        andres.setCertificado(true);
        Corredor julia = new Corredor("julia",true);
        Corredor luciano = new Corredor("luciano",false);
        julia.setCertificado(true);

        luciano.setCertificado(true);
        juan.setCertificado(false);
        paul.setCertificado(false);


        System.out.println("Corredores aceptados carrera tipo calle Maya");
        System.out.println("Monica: "+carreraMaya.admitirCorredor(monica,carreraMaya.getDistancia()));
        System.out.println("Julia: "+carreraMaya.admitirCorredor(julia,carreraMaya.getDistancia()));

        System.out.println("Corredores no aceptados carrera tipo calle Maya");
        System.out.println("Juan: "+carreraMaya.admitirCorredor(juan,carreraMaya.getDistancia()));
        System.out.println("Paul: "+patagoniaRun.admitirCorredor(paul,patagoniaRun.getDistancia()));



        paul.fueAdmitido(patagoniaRun);
        monica.fueAdmitido(patagoniaRun);
        paul.fueAdmitido(carreraMaya);
        monica.fueAdmitido(carreraMaya);

        System.out.println("Cant carreras corridas de monica: "+ monica.getCantCarrerasCorridas());
        System.out.println("Cant carreras corridas de paul: "+ paul.getCantCarrerasCorridas());

        Sponsor saucony = new Sponsor();

        System.out.println(patagoniaRun.getNombre());
        saucony.patrocinar(patagoniaRun);
        saucony.cantPatrocinada();

        System.out.println(carreraMaya.getNombre());
        saucony.patrocinar(carreraMaya);
        saucony.cantPatrocinada();

        System.out.println(monica.getNombre());
        saucony.patrocinar(monica); // Debe ser agregado a la lista de saucony

        System.out.println(paul.getNombre());
        saucony.patrocinar(paul);

        System.out.println(patagoniaRun.getInscriptos());
        System.out.println(saucony);

    }
};

