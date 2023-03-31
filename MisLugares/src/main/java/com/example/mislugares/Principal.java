package com.example.mislugares;

public class Principal {
    public static void main(String[] main) {
        Object[] objects = new Object[4];

        objects[0] = new Complejo(1, 2);
        objects[1] = new GeoPunto(-69, 29);
        objects[2] = new GeoPuntoAlt(-68, 30, 1050);
        objects[3] = new GeoPuntoAlt(-70, 31, 500);

        for(Object object: objects) {
            System.out.println(object);
            if (object instanceof GeoPuntoAlt) {
                if (((GeoPuntoAlt) object).getAltitud() > 1000) {
                    System.out.println("Punto elevado");
                }
            }
        }
    }
}
