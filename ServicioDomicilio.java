public class ServicioDomicilio {
    protected String pedirMenuEmbutidos;
    protected String pedirMenuHamburguesas;
    protected String pedirMenuCarnes;
    
    public ServicioDomicilio(String pedirMenuEmbutidos, String pedirMenuHamburguesas, String pedirMenuCarnes) {
        this.pedirMenuEmbutidos = pedirMenuEmbutidos;
        this.pedirMenuHamburguesas = pedirMenuHamburguesas;
        this.pedirMenuCarnes = pedirMenuCarnes;
    }

    public String getPedirMenuEmbutidos() {
        return pedirMenuEmbutidos;
    }

    public void setPedirMenuEmbutidos(String pedirMenuEmbutidos) {
        this.pedirMenuEmbutidos = pedirMenuEmbutidos;
    }

    public String getPedirMenuHamburguesas() {
        return pedirMenuHamburguesas;
    }

    public void setPedirMenuHamburguesas(String pedirMenuHamburguesas) {
        this.pedirMenuHamburguesas = pedirMenuHamburguesas;
    }

    public String getPedirMenuCarnes() {
        return pedirMenuCarnes;
    }

    public void setPedirMenuCarnes(String pedirMenuCarnes) {
        this.pedirMenuCarnes = pedirMenuCarnes;
    }

    /*Metodo mostrarPedirEnServicioDomicilio que muestra si lo quiere pedir en uno de los menus disponibles */
    public void mostrarPedirEnServicioDomicilio() {
        System.out.println("Pedir embutidos: " + pedirMenuEmbutidos);
        System.out.println("Pedir hamburguesas: " + pedirMenuHamburguesas);
        System.out.println("Pedir carnes: " + pedirMenuCarnes);
    }
}
