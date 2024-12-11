public class ServicioDomicilio {
    protected String pedirEnCarniceria;
    protected String pedirDesdeCasa;

    protected ServicioDomicilio(String pedirEnCarniceria, String pedirDesdeCasa) {
        this.pedirEnCarniceria = pedirEnCarniceria;
        this.pedirDesdeCasa = pedirDesdeCasa;
    }
    public String getPedirEnCarniceria() {
        return pedirEnCarniceria;
    }
    public void setPedirEnCarniceria(String pedirEnCarniceria) {
        this.pedirEnCarniceria = pedirEnCarniceria;
    }
    public String getPedirDesdeCasa() {
        return pedirDesdeCasa;
    }
    public void setPedirDesdeCasa(String pedirDesdeCasa) {
        this.pedirDesdeCasa = pedirDesdeCasa;
    }

    /*Metodo mostrarPedirEnServicioDomicilio que muestra si lo quiere pedir en carniceria
     * o desde casa
     */
    public void mostrarPedirEnServicioDomicilio() {
        System.out.println("Pedir en carniceria: " + pedirEnCarniceria);
        System.out.println("Pedir desde casa: " + pedirDesdeCasa);
    }
}
