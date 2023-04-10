package com.company;
import java.util.Arrays;
public class ArrayMain {
    public static void main(String[] args) {

        System.out.println("Marbellys Campos!");
        //  int[] notas =new int[10];

        int[] notasFinales = {20,10,5,15,12,17,19,18};

        String[] nombres = {"maria","juana","lui","pedrito"};

        int[] notas = {6,8,3};

        notas[2]=20;

        for (int not:notas
        ) {
            System.out.println("mis notas: "+not);
        }

        for (int i=0;i<notasFinales.length; i++)
            System.out.println("las notas son: "+notasFinales[i]);

        for (int item:notasFinales) {
            System.out.println("\nlas notas con foreach son: "+item);
        }

        for (String nombre:nombres) {
            System.out.println("nombre: "+ nombre);

        }

        //metodo BinarySearh
        // int notaF = notasFinales.binarySearch(notasFinales,2);
        //System.out.println("la posicion 2 es: "+notaF);

        // metodo Sort

        //System.out.println("las notas ordenadas :"+ notasFinales.sorted());
        //notasFinales.sort(notasFinales);

        //metodo equals   comprab dos arrays
        System.out.println("son iguales? "+notasFinales.equals(notas));

    }

}
