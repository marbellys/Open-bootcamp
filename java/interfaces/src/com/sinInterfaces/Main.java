package com.sinInterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

    Empleado francesca = new Empleado();
    francesca.activo = true;
    francesca.nombre = "Francesca";
    francesca.edad = 16;
    francesca.salario = 1238d;

    Empleado natasha = new Empleado("Natasha",16,3000,true);

    //almacenar en la bd

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        empleadoCRUD.crear(francesca);
        empleadoCRUD.crear(natasha);

    //busca todos los empleados

        List<Empleado> empleados = empleadoCRUD.buscarTodos();

        System.out.println(empleados);

    }



}
