public class Gestion {

    public static void main(String[] args) {
        Producto producto1 = new Producto("Salchicha", "Embutidos", 50);
        Producto producto2 = new Producto("Chorizo", "Embutidos", 30);
        Producto producto3 = new Producto("Carne de res", "Carne", 100);
        Producto producto4 = new Producto("Pechuga de pollo", "Carne", 80);
        Producto producto5 = new Producto("Hamburguesa clásica", "Hamburguesas", 60);
        Producto producto6 = new Producto("Hamburguesa vegana", "Hamburguesas", 40);

        int empleados = 15;

    
        int totalStock = calcularTotalStock(producto1, producto2, producto3, producto4, producto5, producto6);
        int embutidosC = Categoria("Embutidos", producto1, producto2, producto3, producto4, producto5, producto6);
        int carneC = Categoria("Carne", producto1, producto2, producto3, producto4, producto5, producto6);
        int hamburguesasC = Categoria("Hamburguesas", producto1, producto2, producto3, producto4, producto5, producto6);

    
        System.out.println("Cantidad total de stock disponible: " + totalStock);
        System.out.println("Número de empleados: " + empleados);
        System.out.println("Cantidad de productos de Embutidos: " + embutidosC);
        System.out.println("Cantidad de productos de Carne: " + carneC);
        System.out.println("Cantidad de productos de Hamburguesas: " + hamburguesasC);
    }


    public static int Categoria(String categoria, Producto producto1, Producto producto2, Producto producto3, Producto producto4, Producto producto5, Producto producto6) {
        int cont = 0;
        if (producto1.getCategoria().equals(categoria)) cont++;
        if (producto2.getCategoria().equals(categoria)) cont++;
        if (producto3.getCategoria().equals(categoria)) cont++;
        if (producto4.getCategoria().equals(categoria)) cont++;
        if (producto5.getCategoria().equals(categoria)) cont++;
        if (producto6.getCategoria().equals(categoria)) cont++;
        return cont;
    }

    public static int calcularTotalStock(Producto producto1, Producto producto2, Producto producto3, Producto producto4, Producto producto5, Producto producto6) {
        return producto1.getStock() + producto2.getStock() + producto3.getStock() + producto4.getStock() + producto5.getStock() + producto6.getStock();
    }
}