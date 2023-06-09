package com.example.mislugares;

import java.util.Objects;

public class GeoPunto {
    protected double longitud, latitud;

    static public GeoPunto SIN_POSICION = new GeoPunto(0.0, 0.0);

    public GeoPunto(double longitud, double latitud) {
        this.longitud = longitud;
        this.latitud = latitud;
    }

    public GeoPunto(int longitud, int latitud) {
        this.longitud = longitud * 1E6;
        this.latitud = latitud * 1E6;
    }

    @Override
    public String toString() {
        return "GeoPunto {" +
                "longitud=" + longitud +
                ", latitud=" + latitud +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeoPunto geoPunto = (GeoPunto) o;
        return Double.compare(geoPunto.getLongitud(), getLongitud()) == 0 && Double.compare(geoPunto.getLatitud(), getLatitud()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLongitud(), getLatitud());
    }

    public double distancia(GeoPunto punto) {
        final double RADIO_TIERRA = 6371000; // En metros
        double dLat = Math.toRadians(latitud - punto.latitud);
        double dLon = Math.toRadians(longitud - punto.longitud);
        double lat1 = Math.toRadians(punto.latitud);
        double lat2 = Math.toRadians(latitud);
        double a = Math.sin(dLat/2) * Math.sin(dLat/2) + Math.sin(dLon/2) * Math.sin(dLon/2) *
                    Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

        return c * RADIO_TIERRA;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
}
