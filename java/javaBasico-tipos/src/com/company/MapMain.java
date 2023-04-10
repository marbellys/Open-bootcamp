package com.company;
import java.util.HashMap;
import java.util.Map;
public class MapMain {
    public static void main(String[] args) {

        Map<String,String> personas =new HasMap<>();

        personas.put("nombre","jose");
        personas.put("nombre","Luis");
        personas.put("nombre","pedro");

        System.out.println(personas);

        //sacamos las claves
        for(String key : personas.KeySet())
            System.out.println(key);

        //sacamos las valores
        for(String value : personas.values())
            System.out.println(value);

        //sacamos el par clave  y valor
        for (Map.Entry<String,String> pair : personas.entrySet()){
            System.out.println(pair.getKey()+" "+pair.getValue());
        }
    }

}
