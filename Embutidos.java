public class Embutidos {
    protected String nombre;
    protected String tipo;
    protected String origen;
    protected double precio;

    protected Embutidos(String nombre, String tipo, String origen, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.origen = origen;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrarInformacionEmbutidos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Origen: " + origen);
        System.out.println("Precio: " + precio);
    }
}
