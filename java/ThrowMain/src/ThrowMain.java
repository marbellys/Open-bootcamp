
import java.util.Scanner;
public class ThrowMain {
    public static void main(String[] args) {

        try{
            leerNombres();
        }catch(NameFormatException e){
            e.printStackTrace();
        }
    }

    /**
     * Metodo q lee nombres de la consola y verifica qtengan longitud igual o mayor
     * que 8 caracteres
     */
    //con throws s ele dice al metodo que va a lanzar una exception
    private static void leerNombres() throws NameFormatException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca su nombree:");
        while (teclado.hasNext()) {
            System.out.println("Introduzca un nombre");
            String nombre = teclado.nextLine();
            if (nombre.length() <8) {
                teclado.close();
                //creamos un objeto NameFormatException y con throw, lo lanzamos (lanzamos la excepcion)
                throw new NameFormatException("El nombre debe contener minimo 8 caracteres");
            }
       }
        teclado.close();

        }
 }



