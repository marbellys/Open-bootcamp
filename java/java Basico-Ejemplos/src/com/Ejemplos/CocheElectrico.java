package com.Ejemplos;

public class CocheElectrico extends Coche {
    //propiedades
    String motorElectrico;

    //Constructor
    public CocheElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    public CocheElectrico() {

    }

     @Override
  public String toString() {
        return "CocheElectrico {" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                ", motorElectrico='" + motorElectrico + '\'' +
                '}';
    }
}
