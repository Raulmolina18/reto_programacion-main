public class Producto {
    private String nombre;
    private String categoria;
    private int stock;

   
    public Producto(String nombre, String categoria, int stock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = stock;
    }

    
    public String getCategoria() {
        return categoria;
    }

    public int getStock() {
        return stock;
    }

    public String getNombre() {
        return nombre;
    }

    /*Metodo toStringProducto que no devuelve nada y muestra en un println los datos de la clase Producto */
    public void toStringProducto() {
        System.out.print("Producto  [nombre=" + nombre + ", categoria=" + categoria + ", stock=" + stock + "]");
    }
}