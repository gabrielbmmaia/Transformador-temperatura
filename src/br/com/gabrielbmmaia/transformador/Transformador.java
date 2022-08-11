package br.com.gabrielbmmaia.transformador;

public class Transformador {


    public float transformaParaCelsius(float f){
        return (((f-32)/9)*5);
    }

    public float transformaParaFahrenheit(float f){
        return ((f/5)*9)+32;
    }

}
