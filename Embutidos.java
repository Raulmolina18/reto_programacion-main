import java.util.Scanner;

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

    /*Metodo mostrarInformacionEmbutidos que no devuelve nada y muestra la informacion de los embutidos */
    public void mostrarInformacionEmbutidos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Origen: " + origen);
        System.out.println("Precio: " + precio);
    }

    /*Metodo mostrarEmbutidos con parametro de Scanner que muestra la opcion de pedir embutidos*/
    public static void mostrarEmbutidos(Scanner sc) {
        /*Variables salchicha, salchichon y chorizo de tipo String */
        String salchicha = "Salchicha";
        String salchichon = "Salchichon";
        String chorizo = "Chorizo";

        /*Variables costeSalchicha, costeSalchichon y costeChorizo de tipo double con su 
         * respectivo valor
         */
        double costeSalchicha = 2.50;
        double costeSalchichon = 3.50;
        double costeChorizo = 1.50;

        /*Variable cuenta de tipo double iguadandolo a 0.0 */
        double cuenta = 0.0;

        System.out.println("Salchicha");
        System.out.println("Salchichon");
        System.out.println("Chorizo");

        System.out.println("Introduzca el nombre del embutido que desea pedir entre los disponibles: ");
        String nombreEmbutido = sc.nextLine();

        System.out.println("Introduzca el nombre del embutido que desea pedir por segunda vez: ");
        String nombreEmbutidoDos = sc.nextLine();

        System.out.println("Introduzca el nombre del embutido que desea pedir entre los disponibles: ");
        String nombreEmbutidoTres = sc.nextLine();

        /*Varios if else if haciendo si nombreEmbutido sea igual a salchicha imprimiendo varios println
         * y la cuenta, lo mismo con salchichon y chorizo
        */
        if(nombreEmbutido.equals(salchicha)) {
            System.out.println("Ha seleccionado salchicha");
            System.out.println("La salchicha vale " + costeSalchicha + " euros");
            System.out.println("La salchicha es de origen frances ");
            cuenta = cuenta + costeSalchicha;
            System.out.println("La cuenta total asciende a " + cuenta + "euros");
        } else if(nombreEmbutido.equals(salchichon)) {
            System.out.println("Ha seleccionado salchichon");
            System.out.println("El salchichon vale  " + costeSalchichon + " euros");
            System.out.println("El salchichon es de origen aleman ");
            cuenta = cuenta + costeSalchichon;
            System.out.println("La cuenta total asciende a " + cuenta + "euros");
        } else if(nombreEmbutido.equals(chorizo)) {
            System.out.println("Ha seleccionado chorizo");
            System.out.println("El chorizo vale " + costeChorizo + " euros");
            System.out.println("El chorizo es de origen italiano");
            cuenta = cuenta + costeChorizo;
            System.out.println("La cuenta total asciende a " + cuenta + " euros");
        }

        /*Condicion if si nombreEmbutido no es igual a salchicha o salchichon o chorizo imprime
         * un println que introduzca uno de los embutidos disponibles
         */
        if(nombreEmbutido != salchicha || nombreEmbutido != salchichon || nombreEmbutido != chorizo) {
            System.out.println("Por favor introduce uno de los embutidos que tenemos disponibles");
        }

        /*Varios if else if haciendo si nombreEmbutidoDos sea igual a salchicha imprimiendo varios println
         * y la cuenta, lo mismo con salchichon y chorizo
        */
        if(nombreEmbutidoDos.equals(salchicha)) {
            System.out.println("Ha seleccionado salchicha");
            System.out.println("La salchicha vale " + costeSalchicha + " euros");
            System.out.println("La salchicha es de origen frances ");
            cuenta = cuenta + costeSalchicha;
            System.out.println("La cuenta total asciende a " + cuenta + "euros");
        } else if(nombreEmbutidoDos.equals(salchichon)) {
            System.out.println("Ha seleccionado salchichon");
            System.out.println("El salchichon vale  " + costeSalchichon + " euros");
            System.out.println("El salchichon es de origen aleman ");
            cuenta = cuenta + costeSalchichon;
            System.out.println("La cuenta total asciende a " + cuenta + "euros");
        } else if(nombreEmbutidoDos.equals(chorizo)) {
            System.out.println("Ha seleccionado chorizo");
            System.out.println("El chorizo vale " + costeChorizo + " euros");
            System.out.println("El chorizo es de origen italiano");
            cuenta = cuenta + costeChorizo;
            System.out.println("La cuenta total asciende a " + cuenta + " euros");
        }

        /*Condicion if si nombreEmbutidoDos no es igual a salchicha o salchichon o chorizo imprime
         * un println que introduzca uno de los embutidos disponibles
         */
        if(nombreEmbutidoDos != salchicha || nombreEmbutidoDos != salchichon || nombreEmbutidoDos != chorizo) {
            System.out.println("Por favor introduce uno de los embutidos que tenemos disponibles");
        }

        /*Varios if else if haciendo si nombreEmbutidoTres sea igual a salchicha imprimiendo varios println
         * y la cuenta, lo mismo con salchichon y chorizo
        */
        if(nombreEmbutidoTres.equals(salchicha)) {
            System.out.println("Ha seleccionado salchicha");
            System.out.println("La salchicha vale " + costeSalchicha + " euros");
            System.out.println("La salchicha es de origen frances ");
            cuenta = cuenta + costeSalchicha;
            System.out.println("La cuenta total asciende a " + cuenta + "euros");
        } else if(nombreEmbutidoTres.equals(salchichon)) {
            System.out.println("Ha seleccionado salchichon");
            System.out.println("El salchichon vale  " + costeSalchichon + " euros");
            System.out.println("El salchichon es de origen aleman ");
            cuenta = cuenta + costeSalchichon;
            System.out.println("La cuenta total asciende a " + cuenta + "euros");
        } else if(nombreEmbutidoTres.equals(chorizo)) {
            System.out.println("Ha seleccionado chorizo");
            System.out.println("El chorizo vale " + costeChorizo + " euros");
            System.out.println("El chorizo es de origen italiano");
            cuenta = cuenta + costeChorizo;
            System.out.println("La cuenta total asciende a " + cuenta + " euros");
        }

        /*Condicion if si nombreEmbutidoTres no es igual a salchicha o salchichon o chorizo imprime
         * un println que introduzca uno de los embutidos disponibles
         */
        if(nombreEmbutidoTres != salchicha || nombreEmbutidoTres != salchichon || nombreEmbutidoTres != chorizo) {
            System.out.println("Por favor introduce uno de los embutidos que tenemos disponibles");
        }
    }

}
