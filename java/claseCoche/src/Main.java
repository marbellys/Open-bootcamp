public class Main {
    public static void main(String[] args) {

        System.out.println("Crear una clase coche.\n" +
                           "Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.\n" +
                           "Una función que incremente el número de puertas que tiene el coche.\n" +
                           "Crear un objeto miCoche en el main y añadirle una puerta.\n" +
                           "Mostrar el número de puertas que tiene el objeto.");

        coche miCoche = new coche();
        miCoche.incPuertas();

        System.out.println("cantidad de puertas: "+ miCoche.nroPuertas);

    }
  }
class coche{
    public int nroPuertas=2;

    public  void incPuertas(){
        this.nroPuertas++;
    }

}