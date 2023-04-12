package com.company;
import java.util.Scanner;
public class ScannerMain {

    public static void main(String[] args) {
        System.out.println("Marbellys Campos");

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Nombre:   ");
        String nombre = scanner.nextLine();

        System.out.printf("Edad:");
        Integer edad = scanner.nextInt();

        System.out.println("El nombre ingresado es "+ nombre);
        System.out.println("La edad es "+ edad);
    }


}
