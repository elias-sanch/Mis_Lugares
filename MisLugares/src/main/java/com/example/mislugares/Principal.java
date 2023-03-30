package com.example.mislugares;

public class Principal {
    public static void main(String[] main) {
        GeoPunto p1, p2;
        GeoPuntoAlt p3, p4;
        p1 = new GeoPunto(-65.75306, -19.58361);
        p2 = new GeoPunto(-65.26274, -19.03332);
        p3 = new GeoPuntoAlt(-65.26274, -19.03332, 100);
        p4 = new GeoPuntoAlt(-65.75306, -19.58361);

        System.out.println("Distancia entre p1 y p2: " + p1.distancia(p2));
        System.out.println("Distancia entre p3 y p1: " + p3.distancia(p1));
        System.out.println("Distancia entre p4 y p3: " + p3.distancia(p4));

        Lugar lugar = new Lugar("Escuela Politécnica Superior de Gandía",
                "C/ Paranimf, 1 46730 Gandia (SPAIN)", -0.166093, 38.995656,
                962849300, "http://www.epsg.upv.es",
                "Uno de los mejores lugares para formarse.", 3);

        System.out.println("Lugar " + lugar);
    }
}
