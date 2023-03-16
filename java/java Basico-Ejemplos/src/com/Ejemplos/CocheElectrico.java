package com.Ejemplos;
public class CocheElectrico extends Coche {
    //propiedades
    String motorElectrico;

    //Constructores

    public CocheElectrico(String color, String fabricante, String modelo, Double peso,Double largo,String motorElectrico){
        super(color,fabricante,modelo,peso,largo); //invocamos el constructor de clase superior
        this.motorElectrico=motorElectrico;

        //se utiliza el metodo super para no repetir codigo que esta en la clase Coche:
        /*
        this.color=color;
        this.fabricante=fabricante;
        this.modelo=modelo;
        this.peso=peso;
        this.largo=largo;
         */

    }
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
