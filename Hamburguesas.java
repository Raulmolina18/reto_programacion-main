import java.util.Scanner;

public class Hamburguesas {
    protected String nombre;
    protected String tipo;
    protected String origen;
    protected double precio;

    protected Hamburguesas(String nombre, String tipo, String origen, double precio) {
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

    /*Metodo mostrarInformacionHamburguesas que no devuelve nada y muestra la informacion de los hamburguesas */
    public void mostrarInformacionHamburguesas() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Origen: " + origen);
        System.out.println("Precio: " + precio);
    }

    /*Metodo mostrarHamburguesas con parametro de Scanner que muestra la opcion de pedir hamburguesas */
    public static void mostrarHamburguesas(Scanner sc) {
        /*Variables hamburguesaPollo, hamburguesaVegana y hamburguesaIberica de tipo String */
        String hamburguesaPollo = "Hamburguesa de pollo";
        String hamburguesaVegana = "Hamburguesa vegana";
        String hamburguesaIberica = "Hamburguesa iberica";

        /*Variables costeHamburguesaPollo, costeHamburguesaVegana y costeHamburguesaIberica de tipo double 
          * con su respectivo valor
         */
        double costeHamburguesaPollo = 3.50;
        double costeHamburguesaVegana = 1.50;
        double costeHamburguesaIberica = 4.0;

        /*Variable cuenta de tipo double iguadandolo a 0.0 */
        double cuenta = 0.0;

        System.out.println("Hamburguesa de pollo");
        System.out.println("Hamburguesa vegana");
        System.out.println("Hamburguesa iberica");

        System.out.println("Introduzca el tipo de hamburguesa que desee pedir entre los disponibles: ");
        String nombreHamburguesa = sc.nextLine();

        System.out.println("Introduzca el tipo de hamburguesa que desee pedir por segunda vez: ");
        String nombreHamburguesaDos = sc.nextLine();

        System.out.println("Introduzca el tipo de hamburguesa que desee pedir por tercera vez");
        String nombreHamburguesaTres = sc.nextLine();

        /*Varios if else if haciendo si nombreHamburguesa sea igual a hamburguesaPollo imprimiendo varios println
         * y la cuenta, lo mismo con hamburguesaVegana y hamburguesaIberica
        */
        if(nombreHamburguesa.equals(hamburguesaPollo)) {
            System.out.println("Ha seleccionado la hamburguesa de pollo");
            System.out.println("La hamburguesa de pollo vale 3.50 euros");
            System.out.println("La hamburguesa de pollo es de origen portugues ");
            cuenta = cuenta + costeHamburguesaPollo;
            System.out.println("La cuenta total asciende a " + cuenta + " euros");
        } else if(nombreHamburguesa.equals(hamburguesaVegana)) {
            System.out.println("Ha seleccionado la hamburguesa vegana");
            System.out.println("La hamburguesa vegana vale 1.50 euros");
            System.out.println("La hamburguesa vegana es de origen finlandes ");
            cuenta = cuenta + costeHamburguesaVegana;
            System.out.println("La cuenta total asciende a " + cuenta + " euros");
        } else if(hamburguesaIberica.equals(hamburguesaIberica)) {
            System.out.println("Ha seleccionado la hamburguesa iberica");
            System.out.println("La hamburguesa iberica vale 4 euros");
            System.out.println("La hamburguesa iberica es de origen espanyol");
            cuenta = cuenta + costeHamburguesaIberica;
            System.out.println("La cuenta total asciende a " + cuenta + " euros");
        }

        /*Condicion if si nombreHamburguesa no es igual a hamburguesaPollo o hamburguesaVegana o hamburguesaIberica imprime
         * un println que introduzca uno de los embutidos disponibles
         */
        if(nombreHamburguesa != hamburguesaPollo || nombreHamburguesa != hamburguesaVegana || nombreHamburguesa != hamburguesaIberica) {
            System.out.println("Por favor introduce una de las hamburguesas que tenemos disponibles");
        }

        /*Varios if else if haciendo si nombreHamburguesaDos sea igual a hamburguesaPollo imprimiendo varios println
         * y la cuenta, lo mismo con hamburguesaVegana y hamburguesaIberica
        */
        if(nombreHamburguesaDos.equals(hamburguesaPollo)) {
            System.out.println("Ha seleccionado la hamburguesa de pollo");
            System.out.println("La hamburguesa de pollo vale 3.50 euros");
            System.out.println("La hamburguesa de pollo es de origen portugues ");
            cuenta = cuenta + costeHamburguesaPollo;
            System.out.println("La cuenta total asciende a " + cuenta + " euros");
        } else if(nombreHamburguesaDos.equals(hamburguesaVegana)) {
            System.out.println("Ha seleccionado la hamburguesa vegana");
            System.out.println("La hamburguesa vegana vale 1.50 euros");
            System.out.println("La hamburguesa vegana es de origen finlandes ");
            cuenta = cuenta + costeHamburguesaVegana;
            System.out.println("La cuenta total asciende a " + cuenta + " euros");
        } else if(nombreHamburguesaDos.equals(hamburguesaIberica)) {
            System.out.println("Ha seleccionado la hamburguesa iberica");
            System.out.println("La hamburguesa iberica vale 4 euros");
            System.out.println("La hamburguesa iberica es de origen espanyol");
            cuenta = cuenta + costeHamburguesaIberica;
            System.out.println("La cuenta total asciende a " + cuenta + " euros");
        }

        /*Condicion if si nombreHamburguesaDos no es igual a hamburguesaPollo o hamburguesaVegana o hamburguesaIberica imprime
         * un println que introduzca uno de los embutidos disponibles
         */
        if(nombreHamburguesaDos != hamburguesaPollo || nombreHamburguesaDos != hamburguesaVegana || nombreHamburguesaDos != hamburguesaIberica) {
            System.out.println("Por favor introduce una de las hamburguesas que tenemos disponibles");
        }

        /*Varios if else if haciendo si nombreHamburguesaDos sea igual a hamburguesaPollo imprimiendo varios println
         * y la cuenta, lo mismo con hamburguesaVegana y hamburguesaIberica
        */
        if(nombreHamburguesaTres.equals(hamburguesaPollo)) {
            System.out.println("Ha seleccionado la hamburguesa de pollo");
            System.out.println("La hamburguesa de pollo vale 3.50 euros");
            System.out.println("La hamburguesa de pollo es de origen portugues ");
            cuenta = cuenta + costeHamburguesaPollo;
            System.out.println("La cuenta total asciende a " + cuenta + " euros");
        } else if(nombreHamburguesaTres.equals(hamburguesaVegana)) {
            System.out.println("Ha seleccionado la hamburguesa vegana");
            System.out.println("La hamburguesa vegana vale 1.50 euros");
            System.out.println("La hamburguesa vegana es de origen finlandes ");
            cuenta = cuenta + costeHamburguesaVegana;
            System.out.println("La cuenta total asciende a " + cuenta + " euros");
        } else if(nombreHamburguesaTres.equals(hamburguesaIberica)) {
            System.out.println("Ha seleccionado la hamburguesa iberica");
            System.out.println("La hamburguesa iberica vale 4 euros");
            System.out.println("La hamburguesa iberica es de origen espanyol");
            cuenta = cuenta + costeHamburguesaIberica;
            System.out.println("La cuenta total asciende a " + cuenta + " euros");
        }

        /*Condicion if si nombreHamburguesaDos no es igual a hamburguesaPollo o hamburguesaVegana o hamburguesaIberica imprime
         * un println que introduzca uno de los embutidos disponibles
         */
        if(nombreHamburguesaTres != hamburguesaPollo || nombreHamburguesaTres != hamburguesaVegana || nombreHamburguesaTres != hamburguesaIberica) {
            System.out.println("Por favor introduce una de las hamburguesas que tenemos disponibles");
        }

    }
}
