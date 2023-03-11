public class Main {
    public static void main(String[] args) {
        System.out.println("Marbellys Campos!");
        Cliente cliente = new Cliente();
        cliente.nombre = "Natasha Espinoza Campos";
        cliente.edad =16;
        cliente.telefono =41645689;
        cliente.credito = 200.90;

        System.out.println("mi nombre es "+cliente.nombre+", edad "+cliente.edad+", tef "+cliente.telefono+", mi credito es "+cliente.credito);

        Trabajador trabaj = new Trabajador();
        trabaj.nombre = "Francesca Espinoza Campos";
        trabaj.edad =16;
        trabaj.telefono =41645689;
        trabaj.salario = 1200.90;
        System.out.println("mi nombre es "+trabaj.nombre+", edad "+trabaj.edad+", tef "+trabaj.telefono+", mi salario es "+trabaj.salario);



    }
}
class Persona{
    int edad;
    String nombre;
    int telefono;

}

class Cliente extends Persona{
    double credito;

}
class  Trabajador extends Persona{
    double salario;
}