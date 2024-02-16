import java.util.Scanner;
import java.util.ArrayList;

public class Pregunta {

    private String enunciado;
    private String respuestaCorrecta;
    private int puntuacion;

    public Pregunta(String enunciado, String repuestaCorrecta, int puntuacion){
        this.enunciado = enunciado;
        this.respuestaCorrecta = respuestaCorrecta;
        this.puntuacion = puntuacion;
    }

    // public void respuestaEsCorrecta(String respuesta){
    //     String correcion = "";
    //     if (this.respuestaCorrecta == respuesta){
    //         correcion += "Cooooorrecto!";
    //     } else {
    //         correcion += "Miiic! Fallaste...";
    //     }
    //     System.out.println(correcion);
    // }

    public boolean respuestaEsCorrecta(String respuesta){
        return this.respuestaCorrecta.equals(respuesta);
    }

    public void cambiarRespuestaCorrecta(String nuevaRespuesta){
        this.setRespuestaCorrecta(nuevaRespuesta);
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String toString() {
      return this.enunciado;
    }

    public static void main(String[] args){

        String respuesta = "";
        String nuevaRespuesta;
        Scanner sc = new Scanner(System.in);

        Pregunta Pregunta1 = new Pregunta("¿En que año estamos?", "2024", 2);
        Pregunta Pregunta2 = new Pregunta("¿Cuánto es 1+2?", "3", 2);
        Pregunta Pregunta3 = new Pregunta("¿Que se dice?", "gracias", 2);
        Pregunta Pregunta4 = new Pregunta("¿Eres un Boeing AH-64 Apache?", "sí", 2);
        Pregunta Pregunta5 = new Pregunta("¿La pastilla roja o azul?", "roja", 2);

        ArrayList<Pregunta> listaPreguntas = new ArrayList<Pregunta>();

        listaPreguntas.add(Pregunta1);
        listaPreguntas.add(Pregunta2);
        listaPreguntas.add(Pregunta3);
        listaPreguntas.add(Pregunta4);
        listaPreguntas.add(Pregunta5);

        //int numAleatorio = (int)Math.floor((Math.random()*5)+1);

        for (int i = 0 ; i < 2 ; i++){
            // Generamos un aleatorio entre 1 y 5 incluidos
            int numAleatorio = (int)Math.floor((Math.random()*5));
            System.out.println(listaPreguntas.get(numAleatorio));
            respuesta = sc.nextLine();
            System.out.println(Pregunta1.respuestaEsCorrecta(respuesta));
        }

        //System.out.println(listaPreguntas.get(numAleatorio));
    }
}
