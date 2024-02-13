package com.stem;

import java.util.Scanner;

public class Nube {

    public enum TiposDeNube{   // Se escribe con Mayus la primera letra porque es una clase chiquita en la que ponemos tipos de cosas.
        CIRROS,
        CUMULOS,
        ESTRATOS,
        NIMBOS,
        DESCONOCIDO;

        public static String mostrar(){     // Al tratarse de una clase podemos hacer diversas cosas dentro.
            return "[CIRROS, CUMULOS, ESTRATOS, NIMBOS]";
        }
    }

    private TiposDeNube tipo;
    private double altura;
    private double tamanio; //cm3

    public Nube(){
        this.tipo = TiposDeNube.CIRROS;
        this.altura = 3000;
        this.tamanio = 1000;
    }

    public Nube(TiposDeNube tipo, double altura, double tamanio){
        this.tipo = tipo;
        this.altura = altura;
        this.tamanio = tamanio;
    }

    public Nube(Nube n){
        this.tipo = n.tipo;
        this.altura = n.altura;
        this.tamanio = n.tamanio;
    }

    public double unir(Nube n){   // Terminar
        double salida = -1;
        if(this.altura == n.altura){
            this.tamanio += n.tamanio;
            n.tamanio = 0;
            n.altura = 0;
            salida = this.tamanio;
        }
        return salida;
    }

    public double crecer(){
        this.tamanio *= 1.5;
        return this.tamanio;
    }

    /**
     * 
     * @param metros
     * @return
     */
    public double sube(double metros){
        if(metros > 0) this.altura += metros;
        else this.baja(-metros);
        return this.altura;
    }

    /**
     * 
     * @param metros
     * @return
     */
    public double baja(double metros){
        if(metros > 0) this.altura -= metros;
        if(this.altura < 0) this.altura = 0;
        return this.altura;
    }

    public boolean puedeLlover(){
        return this.tamanio>=200 && this.altura>=1000;
    }

    public double llover(){
        if(this.puedeLlover()){
            this.tamanio /= 3;
        }
        return this.tamanio;
    }

    public String toString(){
        return "altura: " + this.altura + ". tamaño: " + this.tamanio;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public static void main(String[] args) {
        Nube nube1 = new Nube(TiposDeNube.NIMBOS, 10, 30);
        //Nube nube1 = new Nube(NIMBOS, 10, 30);    - ERROR -
        //Nube nube1 = new Nube("NIMBOS", 10, 30);  - ERROR -

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tipo de nube " + TiposDeNube.mostrar() + " : ");

        String tipoString = sc.nextLine();
        tipoString = tipoString.toUpperCase();

        TiposDeNube tipoFormatoEnum = TiposDeNube.valueOf(tipoString);


        Nube nube2 = new Nube(tipoFormatoEnum, 10, 30);
    }
}
