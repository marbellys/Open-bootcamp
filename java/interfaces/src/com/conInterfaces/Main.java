package com.conInterfaces;

import com.sinInterfaces.Empleado;

public class Main {

   /* si en el futuro se decide cambiar solo hay comentariar o uno o el otro*/

    //static EmpleadosCRUD empleadoCRUD = new EmpleadosCRUDExcel();
    static EmpleadosCRUD empleadoCRUD = new EmpleadosCRUDMySQL();


    public static void main(String[] args) {
        empleadoCRUD.buscarTodos();
        empleadoCRUD.guardar(new Empleado());

    }
}
