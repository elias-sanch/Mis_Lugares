package com.example.mislugares;

public class GeoPuntoAlt extends GeoPunto {
    private double altitud;

    public GeoPuntoAlt(double longitud, double latitud, double altitud) {
        super(longitud, latitud);
        this.altitud = altitud;
    }

    public GeoPuntoAlt(double longitud, double latitud) {
        super(longitud, latitud);
        this.altitud = 0;
    }

    @Override
    public double distancia(GeoPunto punto) {
        double d = super.distancia(punto);

        if (punto instanceof GeoPuntoAlt) {
            double dh = altitud - ((GeoPuntoAlt) punto).altitud;
            return Math.sqrt(d*d + dh*dh);
        }
        else
            return d;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

}
