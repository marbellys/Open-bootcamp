package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * C create
 * R etrive
 * U pdate
 * D elete
 */
public class EmpleadoCRUD {

    //creamos una lista para emular la bd
    List<Empleado> empleados = new ArrayList<>();


    //crear empleado en la bd
    public void crear(Empleado empleado){
        empleados.add(empleado);

    }

    //recuperar empleado
    //va a retornar una lista de empleados
    public List<Empleado> buscarTodos(){
        return  empleados;

    }


}
