package br.com.gabrielbmmaia.transformador;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner readinput = new Scanner(System.in);
        Transformador transformador = new Transformador();

        System.out.println("Para qual tipo de temperatura deseja transformar ? 0 - Celsius / 1 - Fahrenheit.");
        int a = readinput.nextInt();
        System.out.println("Digite a temperatura: ");
        float b = readinput.nextFloat();

        if(a == 0){
            float valorTransformado = transformador.transformaParaCelsius(b);
            System.out.println("A temperatura: " + b + " Fº em Celsius fica: " + valorTransformado + " Cº.");
        }
        if(a == 1){
            float valorTransformado = transformador.transformaParaFahrenheit(b);
            System.out.println("A temperatura: " + b + " Cº em Fahrenheit fica: " + valorTransformado + " Fº.");
        }

    }
}
