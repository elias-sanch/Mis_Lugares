package com.example.mislugares;

/** Clase que representa un número complejo.
 *
 */
public class Complejo {
    //Declaración de atributos
    protected double real, imaginario;

    //Declaración de constructor
    public Complejo (double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    //Declaracion de metodos
    /** Transcribe el complejo a String
     * @return Un string con la parte entera y la imaginaria
     */
    public String toString () {
        return real + " + " + imaginario + "i";
    }

    /** Suma al complejo de este objeto otro complejo.
     * @param v El complejo que sumamos
     */
    public void suma (Complejo v) {
        real = real + v.real;
        imaginario = imaginario + v.imaginario;
    }

    public void suma(double re, double im) {
        real = real + re;
        imaginario = imaginario + im;
    }

    public void suma(double re) {
        real = real + re;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }
}
