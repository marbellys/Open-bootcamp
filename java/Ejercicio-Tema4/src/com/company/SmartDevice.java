package com.company;

/*
En este ejercicio tendréis que crear una clase SmartDevice.
Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

Agregaréis atributos tal cual tendrían esos objetos en la realidad.
Crear constructor vacío y con todos los parámetros para cada clase.
Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
*/
public class SmartDevice {
    String marca;
    String modelo;
    Double costo;

    public SmartDevice(){

    }
    public SmartDevice(String marca, String modelo, Double costo){
        this.marca = marca;
        this.modelo = modelo;
        this.costo = costo;

    }

    public static class SmartPhone extends SmartDevice {
        String sistOperativo;
        int ram;

        public SmartPhone() {
            super();
        }

        public SmartPhone(String marca, String modelo, Double costo,String sistOperativo, int ram) {
            super(marca,modelo,costo);
            this.sistOperativo = sistOperativo;
            this.ram = ram;
        }

        @Override
        public String toString() {
            return "SmartPhone{" +
                    "sistOperativo='" + sistOperativo + '\'' +
                    ", ram=" + ram +
                    ", marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", costo=" + costo +
                    '}';
        }
    }

    public  static class  SmartWatch extends SmartDevice{
        double pulgadas;

        public  SmartWatch(){
            super();
        }

        public  SmartWatch(String marca, String modelo, Double costo,double pulgadas){
            super(marca,modelo,costo);
            this.pulgadas = pulgadas;
        }

        @Override
        public String toString() {
            return "SmartWatch{" +
                    "pulgadas=" + pulgadas +
                    ", marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", costo=" + costo +
                    '}';
        }
    }

    public static void main(String[] args) {
        System.out.println("Marbellys Campos");

        SmartWatch miTv = new SmartWatch();

        miTv.pulgadas =52.4;
        miTv.marca = "SONY";
        miTv.modelo = "SMART45-23";
        miTv.costo = 2345d;

        SmartPhone miTlf = new SmartPhone();

        miTlf.ram = 8 ;
        miTlf.sistOperativo = "Android V.8";
        miTlf.marca = "Sansum";
        miTlf.modelo = "A53";
        miTlf.costo = 200d;


        System.out.println("mi TV: " + miTv);
        System.out.println("mi Telefono: " + miTlf);
    }
}
