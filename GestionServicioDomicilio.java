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
            System.out.println("6. Salir del menu.");
            System.out.println("Introduzca una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    /*Muestra los menus disponibles al pedirlo desde su domicilio */
                    servicioDomicilio.mostrarPedirEnServicioDomicilio();
                    break;
                case 2:
                    /*Llama al metodo mostrarEmbutidos*/
                    mostrarEmbutidos(sc);
                    break;
                case 3:
                    /*Llama al metodo mostrarHamburguesas */
                    mostrarHamburguesas(sc);
                    break;
                case 4:
                    /*Muestra la opcion de pedir carnes */
                    mostrarCarnes(sc);
                    break;
                case 5:
                    mostrarCuentaTotal();
                    break;
                case 6:
                    /*Sale del programa */
                    System.out.println("Saliendo del menu de pedir a domicilio. Muchisimas gracias por su uso");
                    break;
                default:
                    System.out.println("Opcion equivocada. Por favor introduzca una de las opciones disponibles.");
            }
        } while(opcion != 6);

        /*Cerramos el escaner */
        sc.close();
    }

    /*Metodo mostrarEmbutidos con parametro de Scanner que muestra la opcion de pedir embutidos*/
    public static void mostrarEmbutidos(Scanner sc) {
        String salchicha = "Salchicha";
        String salchichon = "Salchichon";
        String chorizo = "Chorizo";

        double costeSalchicha = 2.50;
        double costeSalchichon = 3.50;
        double costeChorizo = 1.50;

        System.out.println("Salchicha  2,50 euros");
        System.out.println("Salchichon  3,50 euros");
        System.out.println("Chorizo  1,50 euros");
        
        System.out.println("Introduzca el nombre del embutido que desea pedir entre los disponibles: ");
        String nombreEmbutido = sc.nextLine();

        System.out.println("Introduzca el nombre del embutido que desea pedir por segunda vez: ");
        String nombreEmbutidoDos = sc.nextLine();

        System.out.println("Introduzca el nombre del embutido que desea pedir entre los disponibles: ");
        String nombreEmbutidoTres = sc.nextLine();

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

        if(nombreEmbutido != salchicha || nombreEmbutido != salchichon || nombreEmbutido != chorizo) {
            System.out.println("Por favor introduce uno de los embutidos que tenemos disponibles");
        }

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

        if(nombreEmbutidoDos != salchicha || nombreEmbutidoDos != salchichon || nombreEmbutidoDos != chorizo) {
            System.out.println("Por favor introduce uno de los embutidos que tenemos disponibles");
        }

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

        if(nombreEmbutidoTres != salchicha || nombreEmbutidoTres != salchichon || nombreEmbutidoTres != chorizo) {
            System.out.println("Por favor introduce uno de los embutidos que tenemos disponibles");
        }
    }

    /*Metodo mostrarHamburguesas con parametro de Scanner que muestra la opcion de pedir hamburguesas */
    public static void mostrarHamburguesas(Scanner sc) {
        String hamburguesaPollo = "Hamburguesa de pollo";
        String hamburguesaVegana = "Hamburguesa vegana";
        String hamburguesaIberica = "Hamburguesa iberica";

        double costeHamburguesaPollo = 3.50;
        double costeHamburguesaVegana = 1.50;
        double costeHamburguesaIberica = 4.0;

        System.out.println("Hamburguesa de pollo 3,50 euros");
        System.out.println("Hamburguesa vegana  1,50 euros");
        System.out.println("Hamburguesa iberica  4.0 euros");

        System.out.println("Introduzca el tipo de hamburguesa que desee pedir entre los disponibles: ");
        String nombreHamburguesa = sc.nextLine();

        System.out.println("Introduzca el tipo de hamburguesa que desee pedir por segunda vez: ");
        String nombreHamburguesaDos = sc.nextLine();

        System.out.println("Introduzca el tipo de hamburguesa que desee pedir por tercera vez");
        String nombreHamburguesaTres = sc.nextLine();

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

        if(nombreHamburguesa != hamburguesaPollo || nombreHamburguesa != hamburguesaVegana || nombreHamburguesa != hamburguesaIberica) {
            System.out.println("Por favor introduce una de las hamburguesas que tenemos disponibles");
        }

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

        if(nombreHamburguesaDos != hamburguesaPollo || nombreHamburguesaDos != hamburguesaVegana || nombreHamburguesaDos != hamburguesaIberica) {
            System.out.println("Por favor introduce una de las hamburguesas que tenemos disponibles");
        }

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

        if(nombreHamburguesaTres != hamburguesaPollo || nombreHamburguesaTres != hamburguesaVegana || nombreHamburguesaTres != hamburguesaIberica) {
            System.out.println("Por favor introduce una de las hamburguesas que tenemos disponibles");
        }
        
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

        if(nombreHamburguesa != hamburguesaPollo || nombreHamburguesa != hamburguesaVegana || nombreHamburguesa != hamburguesaIberica) {
            System.out.println("Por favor introduce una de las hamburguesas que tenemos disponibles");
        }

    }

    /*Metodo mostrarCarnes con un parametro de Scanner que muestra la opcion de pedir carnes */
    public static void mostrarCarnes(Scanner sc) {
        String carneDeAve = "Carne de Ave";
        String carneDeVaca = "Carne de Vaca";
        String carneDeCerdo = "Carne de Cerdo";

        double costeCarneAve = 3.50;
        double costeCarneVaca = 5.0;
        double costeCarneCerdo = 4.0;

        System.out.println("Carne de Ave 3,50 euros");
        System.out.println("Carne de Vaca 5.0 euros");
        System.out.println("Carne de Cerdo 4.0 euros");
        
        System.out.println("Introduzca el tipo de carne que desee pedir: ");
        String nombreCarne = sc.nextLine();

        System.out.println("Introduzca el tipo de carne que desee pedir por segunda vez: ");
        String nombreCarneDos = sc.nextLine();

        System.out.println("Introduzca el tipo de carne que desee pedir por tercera vez: ");
        String nombreCarneTres = sc.nextLine();
        
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

        if(nombreCarne != carneDeAve || nombreCarne != carneDeVaca || nombreCarne != carneDeCerdo) {
            System.out.println("Por favor introduce una de las hamburguesas que tenemos disponibles");
        }

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

        if(nombreCarneDos != carneDeAve || nombreCarneDos != carneDeVaca || nombreCarneDos != carneDeCerdo) {
            System.out.println("Por favor introduce una de las hamburguesas que tenemos disponibles");
        }

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

        if(nombreCarneTres != carneDeAve || nombreCarneTres != carneDeVaca || nombreCarneTres != carneDeCerdo) {
            System.out.println("Por favor introduce una de las hamburguesas que tenemos disponibles");
        }

    }

    /*Metodo que muestra la cuenta total del cliente a pedir los productos */
    public static void mostrarCuentaTotal() {
        System.out.println("El total de la cuenta es de: " + cuenta "euros");
    }
}