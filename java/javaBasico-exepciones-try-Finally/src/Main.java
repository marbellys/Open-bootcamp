public class Main {
    public static void main(String[] args) {

        System.out.println("Marbellys Campos");

        try {
            int res = 5 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("CIERRE DE RECURSOS");
        }

        System.out.println("fin programa");
    }
}
