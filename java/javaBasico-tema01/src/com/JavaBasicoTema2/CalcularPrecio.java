package com.JavaBasicoTema2;

public class CalcularPrecio {

    public static void main(String[] args) {

        float precio = 20.0f;
        var precioConIva= precioIva(precio);
        System.out.println("El precio bruto es:"+ precio+"\ny El precio con IVA es:"+precioConIva);
    }

    public static float precioIva(float precio){
        float iva = 0.16f;
        return precio + (precio * iva);

    }
}
