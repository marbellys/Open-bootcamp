package com.conInterfaces;

import com.sinInterfaces.Empleado;

import java.util.List;

/**
 * solo se declaran los metodos, es decir no los implementa
 * Actua como un contrato, dic lo q hay que hacer pero no lo hace
 */
public interface EmpleadosCRUD {
    void  guardar(Empleado empleado);

    List<Empleado> buscarTodos();

    void borrar(Empleado empleado);
}
