package com.sinInterfaces;

public class Empleado{

    //propiedades
    String nombre;
    int edad;
    double salario;
    boolean activo;

    //constructores
    public Empleado() {
        }

    public Empleado(String nombre, int edad, double salario, boolean activo) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.activo = activo;
        }

    //metodos


    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", activo=" + activo +
                '}';
    }
}
