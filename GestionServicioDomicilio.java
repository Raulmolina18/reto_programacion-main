import java.util.Scanner;
public class GestionServicioDomicilio {
    static double cuenta = 0.0;
    public static void main(String[] args) {
        /*Llamamos al scanner */
        Scanner sc = new Scanner(System.in);

        /*Instanciamos un objeto servicioDomicilio de la clase ServicioDomicilio */
        ServicioDomicilio servicioDomicilio = new ServicioDomicilio("Salchicha, Salchichon, Chorizo", "Hamburguesa de pollo, Hamburguesa vegana, Hamburguesa iberica", "Carne de ave, Carne de vaca, Carne de cerdo");
        
        /*Variable opcion de tipo entero */
        int opcion;

        /*Do while con un switch dentro que muestra las diferentes opciones que ofrece el menu */
        do {
            System.out.println("Menu Servicio a Domicilio");
            System.out.println("1. Opciones de pedir el producto: ");
            System.out.println("2. Pedir embutidos.");
            System.out.println("3. Pedir hamburguesas.");
            System.out.println("4. Pedir carnes ");
            System.out.println("5. Mostrar cuenta total");
            System.out.println("6. Mostrar datos de los productos");
            System.out.println("7. Salir del menu.");
            System.out.println("Introduzca una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    /*Muestra los menus disponibles al pedirlo desde su domicilio */
                    servicioDomicilio.mostrarPedirEnServicioDomicilio();
                    break;
                case 2:
                    /*Llama al metodo mostrarEmbutidos de la clase Embutidos*/
                    Embutidos.mostrarEmbutidos(sc);
                    break;
                case 3:
                    /*Llama al metodo mostrarHamburguesas de la clase Hamburguesas */
                    Hamburguesas.mostrarHamburguesas(sc);
                    break;
                case 4:
                    /*Llama al metodo mostrarCarnes de la clase Carnes*/
                    Carnes.mostrarCarnes(sc);
                    break;
                case 5:
                    /*Muestra la cuenta total que tiene que pagar el cliente */
                    mostrarCuentaTotal();
                    break;
                case 6:
                    /*Muestra los elementos del array Producto con sus datos*/
                    mostrarDatosProductos(sc);
                    break;
                case 7:
                    /*Sale del programa */
                    System.out.println("Saliendo del menu de pedir a domicilio. Muchisimas gracias por su uso");
                    break;
                default:
                    System.out.println("Opcion equivocada. Por favor introduzca una de las opciones disponibles.");
            }
        } while(opcion != 7);

        /*Cerramos el escaner */
        sc.close();
    }

    /*Metodo estatico mostrarCuentaTotal que no devuelve nada y 
    * que muestra la cuenta total del cliente a pedir los productos 
    */
    public static void mostrarCuentaTotal() {
        System.out.println("El total de la cuenta es de: " + cuenta);
    }    

    /*Metodo estatico mostrarDatosProductos con un parametro de tipo Scanner con dos bucles for dentro */
    public static void mostrarDatosProductos(Scanner sc) {
        /*Ponemos un array de tipo Producto llamado arrayProductos 
        * y sea igual a un nuevo array de Producto de 3 elementos 
        */
        Producto [] arrayProductos = new Producto[3];

        /*Hacemos un bucle for que recorra todos los elementos del array arrayProductos, pide el
         * nombre del producto y la categoria en dos println diferentes y despues arrayProductos[i]
         * sea un nuevo producto.
         */
        for(int i=0; i <arrayProductos.length; i++) {
            System.out.println("Dame el nombre del producto");
            String nombreProducto = sc.nextLine();

            System.out.println("Dame la categoria del producto");
            String categoriaProducto = sc.nextLine();

            arrayProductos[i] = new Producto(nombreProducto, categoriaProducto, 20);
        }

        /*Hacemos un bucle for que recorra todos los elementos del array arrayProductos 
         * y que arrayProductos[i] llame al toStringProducto que muestra los datos que contiene ese metodo
         * de la clase Producto
        */
        for(int i=0; i < arrayProductos.length; i++) {
            arrayProductos[i].toStringProducto();
            System.out.println();
        }
    }
}