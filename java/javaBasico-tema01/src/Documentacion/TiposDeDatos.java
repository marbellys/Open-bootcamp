package Documentacion;

public class TiposDeDatos {
    public static void main(String[] args) {
       System.out.println("Marbellys Campos");
        /* variables :
           tipo  nomnbre = valor;
           o
           tipo nombre;
           nombre=valor;
         */
                //Variables enteras
        byte nro1 = 1; // 1 byte
        short nro2 =2; // 2 bytes
        int nro3 =3;   // 4 bytes
        long nro4 = 4; // 8 bytes
        System.out.println("byte:"+nro1+" short:"+nro2+" int:"+nro3+" long:"+nro4);

        //Variables punto flotante
        float nro5 =4.9f;
        double nro6 =7.89d;
        System.out.println("float:"+nro5+" double:"+nro6);

        //booleans
        boolean verdadero =true;
        boolean falso =false;
        System.out.println("booleano:"+verdadero+" y "+falso);

        // Los tipos de datos primitivos no pueden ser nulos,
        // para eso existen los tipos de datos envoltorios q comienzan con mayuscula:

        Integer nro9= null;
        Long nro22 = 2L;

        //caracteres
        char sexo = 'F';

        String nombre = "Marbellys";
        System.out.println("caracter:"+sexo+" String:"+nombre);

    }
}
