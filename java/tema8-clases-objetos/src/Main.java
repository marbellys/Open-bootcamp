public class Main {
    public static void main(String[] args) {
        System.out.println("Marbellys Campos!");
        //Crear clase Persona.
        //Crear variables las privadas edad, nombre y telefono de la clase Persona.
        //Crear gets y sets de cada propiedad.
        //Crear un objeto persona en el main.
        //Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.

        Persona persona = new Persona();
        Persona persona2 = new Persona();

        persona.setEdad(14);
        persona.setNombre("Francesca Espinoza");
        persona.setTelefono("424989986");

        persona2.setEdad(16);
        persona2.setNombre("Natasha Espinoza");
        persona2.setTelefono("426989956");

        System.out.println(persona.getNombre()+" con edad "+persona.getEdad()+" tiene nro tlf "+persona.getTelefono());

        System.out.println(persona2.getNombre()+" con edad "+persona2.getEdad()+" tiene nro tlf "+persona2.getTelefono());

    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }
}