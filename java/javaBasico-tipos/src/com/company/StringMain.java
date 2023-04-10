package com.company;

public class StringMain {

    public static void main(String[] args) {

        System.out.println("Marbellys Campos!");

        String direccion  = "  Urbanizacion el Tiamo, Conjunto Residencial Villas de Tepuy   ";
        String dirBd = "Urb. El Tiamo Conj Res. Villas del Tepuy";

        System.out.println("En mayuscula ---->"+direccion.toUpperCase());
        System.out.println("cant caracteres---> "+direccion.length());
        System.out.println("sin espacios ini y fin----> "+direccion.trim());

        if (direccion.equalsIgnoreCase(dirBd)){
            System.out.printf("Las direcciones son iguales");
        }
        else System.out.println("Las direcciones sosn diferentes");

        System.out.println("substr----> "+direccion.substring(6,12));
        System.out.println("indexOf----> "+direccion.indexOf("Tiamo"));


    }
}
