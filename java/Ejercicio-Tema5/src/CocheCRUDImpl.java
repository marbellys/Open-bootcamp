public  class CocheCRUDImpl implements CocheCRUD {

    String guardar= "Guardar Coches";
    String buscarT="Buscar Todos los Coches";
    String eliminar = "Eliminar Coche";


    @Override
    public void save() {
        System.out.println("guardar");
    }

    @Override
    public void findAll() {
        System.out.println("buscar");

    }

    @Override
    public void delete() {
        System.out.println("eliminar");

    }

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "guardar='" + guardar + '\'' +
                ", buscarTodos='" + buscarT + '\'' +
                ", eliminar='" + eliminar + '\'' +
                '}';
    }
}
