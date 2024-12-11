public class Carniceria {
    protected int productos;
    protected int empleados;
    protected int utensilios;

    public Carniceria(int productos, int empleados, int utensilios) {
        this.productos = productos;
        this.empleados = empleados;
        this.utensilios = utensilios;
    }

    public int getProductos() {
        return productos;
    }

    public void setProductos(int productos) {
        this.productos = productos;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    public int getUtensilios() {
        return utensilios;
    }

    public void setUtensilios(int utensilios) {
        this.utensilios = utensilios;
    }

    /*Metodo mostrarInformacion que muestra toda la informacion de la carniceria */
    public void mostrarInformacion() {
        System.out.println("Productos: " + productos);
        System.out.println("Empleados: " + empleados);
        System.out.println("Utensilios: " + utensilios);
    }


}