import java.util.Scanner;
public class GestionServicioDomicilio {
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
            System.out.println("5. Salir del menu.");
            System.out.println("Introduzca una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    /*Muestra los menus disponibles al pedirlo desde su domicilio */
                    servicioDomicilio.mostrarPedirEnServicioDomicilio();
                    break;
                case 2:
                    /*Muestra la opcion de pedir embutidos*/
                    String salchicha = "Salchicha";
                    String salchichon = "Salchichon";
                    String chorizo = "Chorizo";

                    double costeSalchicha = 2.50;
                    double costeSalchichon = 3.50;
                    double costeChorizo = 1.50;

                    double cuenta = 0.0;

                    System.out.println("Salchicha");
                    System.out.println("Salchichon");
                    System.out.println("Chorizo");

                    System.out.println("Introduzca el nombre del embutido que desea pedir entre los disponibles: ");
                    String nombreEmbutido = sc.nextLine();
            
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

                    break;
                case 3:
                    /*Muestra la opcion de pedir hamburguesas */
                    String hamburguesaPollo = "Hamburguesa de pollo";
                    String hamburguesaVegana = "Hamburguesa vegana";
                    String hamburguesaIberica = "Hamburguesa iberica";

                    double costeHamburguesaPollo = 3.50;
                    double costeHamburguesaVegana = 1.50;
                    double costeHamburguesaIberica = 4.0;

                    cuenta = 0.0;

                    System.out.println("Hamburguesa de pollo");
                    System.out.println("Hamburguesa vegana");
                    System.out.println("Hamburguesa iberica");

                    System.out.println("Introduzca el tipo de hamburguesa que desee pedir entre los disponibles: ");
                    String nombreHamburguesa = sc.nextLine();

                    if(nombreHamburguesa.equals(hamburguesaPollo)) {
                        System.out.println("Ha seleccionado la hamburguesa de pollo");
                        System.out.println("La hamburguesa de pollo vale 3.50 euros");
                        System.out.println("La hamburguesa de pollo es de origen portugues ");
                        cuenta = cuenta + costeHamburguesaPollo;
                        System.out.println("La cuenta total asciende a " + cuenta + "euros");
                    } else if(nombreHamburguesa.equals(hamburguesaVegana)) {
                        System.out.println("Ha seleccionado la hamburguesa vegana");
                        System.out.println("La hamburguesa vegana vale 1.50 euros");
                        System.out.println("La hamburguesa vegana es de origen finlandes ");
                        cuenta = cuenta + costeHamburguesaVegana;
                        System.out.println("La cuenta total asciende a " + cuenta + "euros");
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

                    break;
                case 4:
                    /*Muestra la opcion de pedir carnes */
                    String carneDeAve = "Carne de Ave";
                    String carneDeVaca = "Carne de Vaca";
                    String carneDeCerdo = "Carne de Cerdo";

                    double costeCarneAve = 3.50;
                    double costeCarneVaca = 5.0;
                    double costeCarneCerdo = 4.0;

                    cuenta = 0.0;

                    System.out.println("Carne de Ave");
                    System.out.println("Carne de Vaca");
                    System.out.println("Carne de Cerdo");
        
                    System.out.println("Introduzca el tipo de carne que desee pedir: ");
                    String nombreCarne = sc.nextLine();
        
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

                    break;
                case 5:
                    /*Sale del programa */
                    System.out.println("Saliendo del menu de pedir a domicilio. Muchisimas gracias por su uso");
                    break;
                default:
                    System.out.println("Opcion equivocada. Por favor introduzca una de las opciones disponibles.");
            }
        } while(opcion != 5);

        /*Cerramos el escaner */
        sc.close();
    }
}