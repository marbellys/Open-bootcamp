package com.Ejemplos;

public class CocheMain {
    public static void main(String[] args) {

        String coche = "alfa romeo";

        Coche cocheObj = new Coche();

        Coche cocheObj2 = new Coche("rojo","honda","civic",200.00,10.0);

        cocheObj2.acelerar(50);

        System.out.println(cocheObj2);

        cocheObj2.peso=2200.00;
        System.out.println(cocheObj2);

        CocheElectrico cocheElectricoObj = new CocheElectrico();

        cocheElectricoObj.motorElectrico="motor electrico 200W";

        System.out.println(cocheElectricoObj);


    }
}
