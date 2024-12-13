import java.util.Scanner;

public class Carnes {
    protected String nombre;
    protected String tipo;
    protected String origen;
    protected double precio;

    protected Carnes(String nombre, String tipo, String origen, double precio) {
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

    /*Metodo mostrarInformacionCarnes que no devuelve nada y muestra la informacion de las carnes */
    public void mostrarInformacionCarnes() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Origen: " + origen);
        System.out.println("Precio: " + precio);
    }
    
    /*Metodo mostrarCarnes con un parametro de Scanner que muestra la opcion de pedir carnes */
    public static void mostrarCarnes(Scanner sc) {
        /*Variables carneDeAve, carneDeVaca y carneDeCerdo de tipo String */
        String carneDeAve = "Carne de Ave";
        String carneDeVaca = "Carne de Vaca";
        String carneDeCerdo = "Carne de Cerdo";

        /*Variables costeCarneAve, costeCarneVaca y costeCarneCerdo de tipo double con su 
         * respectivo valor
         */
        double costeCarneAve = 3.50;
        double costeCarneVaca = 5.0;
        double costeCarneCerdo = 4.0;

        /*Variable cuenta de tipo double iguadandolo a 0.0 */
        double cuenta = 0.0;

        System.out.println("Carne de Ave");
        System.out.println("Carne de Vaca");
        System.out.println("Carne de Cerdo");
        
        System.out.println("Introduzca el tipo de carne que desee pedir: ");
        String nombreCarne = sc.nextLine();

        System.out.println("Introduzca el tipo de carne que desee pedir por segunda vez: ");
        String nombreCarneDos = sc.nextLine();

        System.out.println("Introduzca el tipo de carne que desee pedir por tercera vez: ");
        String nombreCarneTres = sc.nextLine();
        
        /*Varios if else if haciendo si nombreCarne sea igual a carneDeAve imprimiendo varios println
         * y la cuenta, lo mismo con carneDeVaca y carneDeCerdo
        */
        if(nombreCarne.equals(carneDeAve)) {
            System.out.println("Ha seleccionado la carne de ave");
            System.out.println("La carne de ave vale 3.50 euros por kilo");
            System.out.println("La carne de ave es de origen estadounidense ");
            cuenta = cuenta + costeCarneAve;
            System.out.println("La cuenta total asciende a " + cuenta + " euros");
        } else if(nombreCarne.equals(carneDeVaca)) {
            System.out.println("Ha seleccionado la carne de vaca");
            System.out.println("La carne de vaca vale 5 euros por kilo");
            System.out.println("La carne de vaca es de origen noruego ");
            cuenta = cuenta + costeCarneVaca;
            System.out.println("La cuenta total asciende a " + cuenta + " euros");
        } else if(nombreCarne.equals(carneDeCerdo)) {
            System.out.println("Ha seleccionado la carne de cerdo");
            System.out.println("La carne de cerdo vale 4 euros");
            System.out.println("La carne de cerdo es de origen chino");
            cuenta = cuenta + costeCarneCerdo;
            System.out.println("La cuenta total asciende a " + cuenta + " euros");
        }

        /*Condicion if si nombreCarne no es igual a carneDeAve o carneDeVaca o carneDeCerdo imprime
         * un println que introduzca una de las carnes disponibles
         */
        if(nombreCarne != carneDeAve || nombreCarne != carneDeVaca || nombreCarne != carneDeCerdo) {
            System.out.println("Por favor introduce una de las carnes que tenemos disponibles");
        }

        /*Varios if else if haciendo si nombreCarneDos sea igual a carneDeAve imprimiendo varios println
         * y la cuenta, lo mismo con carneDeVaca y carneDeCerdo
        */
        if(nombreCarneDos.equals(carneDeAve)) {
            System.out.println("Ha seleccionado la carne de ave");
            System.out.println("La carne de ave vale 3.50 euros por kilo");
            System.out.println("La carne de ave es de origen estadounidense ");
            cuenta = cuenta + costeCarneAve;
            System.out.println("La cuenta total asciende a " + cuenta + " euros");
        } else if(nombreCarneDos.equals(carneDeVaca)) {
            System.out.println("Ha seleccionado la carne de vaca");
            System.out.println("La carne de vaca vale 5 euros por kilo");
            System.out.println("La carne de vaca es de origen noruego ");
            cuenta = cuenta + costeCarneVaca;
            System.out.println("La cuenta total asciende a " + cuenta + " euros");
        } else if(nombreCarneDos.equals(carneDeCerdo)) {
            System.out.println("Ha seleccionado la carne de cerdo");
            System.out.println("La carne de cerdo vale 4 euros");
            System.out.println("La carne de cerdo es de origen chino");
            cuenta = cuenta + costeCarneCerdo;
            System.out.println("La cuenta total asciende a " + cuenta + " euros");
        }

        /*Condicion if si nombreCarneDos no es igual a carneDeAve o carneDeVaca o carneDeCerdo imprime
         * un println que introduzca una de las carnes disponibles
         */
        if(nombreCarneDos != carneDeAve || nombreCarneDos != carneDeVaca || nombreCarneDos != carneDeCerdo) {
            System.out.println("Por favor introduce una de las carnes que tenemos disponibles");
        }

        /*Varios if else if haciendo si nombreCarneTres sea igual a carneDeAve imprimiendo varios println
         * y la cuenta, lo mismo con carneDeVaca y carneDeCerdo
        */
        if(nombreCarneTres.equals(carneDeAve)) {
            System.out.println("Ha seleccionado la carne de ave");
            System.out.println("La carne de ave vale 3.50 euros por kilo");
            System.out.println("La carne de ave es de origen estadounidense ");
            System.out.println();
            cuenta = cuenta + costeCarneAve;
            System.out.println("La cuenta total asciende a " + cuenta + " euros");
        } else if(nombreCarneTres.equals(carneDeVaca)) {
            System.out.println("Ha seleccionado la carne de vaca");
            System.out.println("La carne de vaca vale 5 euros por kilo");
            System.out.println("La carne de vaca es de origen noruego ");
            System.out.println();
            cuenta = cuenta + costeCarneVaca;
            System.out.println("La cuenta total asciende a " + cuenta + " euros");
        } else if(nombreCarneTres.equals(carneDeCerdo)) {
            System.out.println("Ha seleccionado la carne de cerdo");
            System.out.println("La carne de cerdo vale 4 euros");
            System.out.println("La carne de cerdo es de origen chino");
            System.out.println();
            cuenta = cuenta + costeCarneCerdo;
            System.out.println("La cuenta total asciende a " + cuenta + " euros");
        }

        /*Condicion if si nombreCarneTres no es igual a carneDeAve o carneDeVaca o carneDeCerdo imprime
         * un println que introduzca una de las carnes disponibles
         */
        if(nombreCarneTres != carneDeAve || nombreCarneTres != carneDeVaca || nombreCarneTres != carneDeCerdo) {
            System.out.println("Por favor introduce una de las carnes que tenemos disponibles");
        }

    }
}
