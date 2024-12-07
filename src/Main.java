public class Main {

    public static void main(String[] argumentos) {
        System.out.println("INICIO");

        //corredor

        Corredor juan = new Corredor("Juan");
        System.out.println(juan);

        Corredor daniela = new Corredor("Daniela");
        daniela.darCertificadoMedico(true);
        juan.darCertificadoMedico(true);

        //carrera calle

        Carrera calle = new Calle(5, "carrera5k");
        Carrera callecita = new Calle(9, "9k");
        Carrera callecitas = new Calle(19, "19k");

        calle.inscribirCorredor(juan);
        callecita.inscribirCorredor(juan);
        callecitas.inscribirCorredor(juan);
        callecitas.inscribirCorredor(daniela);

        System.out.println(calle.cantidadInscriptos());
        System.out.println(callecitas.cantidadInscriptos());

        System.out.println(juan.cantidadCarrerasCorridas());
        System.out.println(daniela.cantidadCarrerasCorridas());


        //carerra trail
        Trail trail = new Trail(60, "trailRunning", 2000);
        trail.modificarCupoMaximo(15);


        System.out.println(trail.cantidadInscriptos());

        //carrera Recreativa

        Recreativa recreativas = new Recreativa(5, "5k");
        recreativas.inscribirCorredor(juan);
        recreativas.cantidadInscriptos();

        //puntos
        System.out.println("Juan tiene " + juan.verPuntos());
        System.out.println("Daniela tiene " + daniela.verPuntos());

        System.out.println(juan.verDistanciaMasLargaCorrida());


        //cantCarrerasCorridasActualizado
        System.out.println(daniela.cantidadCarrerasCorridas());

        //puntosActualizados
        System.out.println(daniela.verPuntos());

       //sponsors

        Sponsor saucony = new Sponsor("saucony");

        System.out.println(saucony.patrocinar(calle));

        System.out.println(saucony.patrocinar(trail));


        System.out.println(saucony.patrocinarCorredor(daniela));

        trail.inscribirCorredor(daniela);
        calle.inscribirCorredor(daniela);
        callecitas.inscribirCorredor(daniela);

        System.out.println(saucony.patrocinarCorredor(daniela));
        calle.inscribirCorredor(daniela);
    }

}

