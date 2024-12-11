import java.util.Scanner;
public class GestionServicioDomicilio {
    public static void main(String[] args) {
        /*Llamamos al scanner */
        Scanner sc = new Scanner(System.in);

        /*Instanciamos un objeto servicioDomicilio de la clase ServicioDomicilio */
        ServicioDomicilio servicioDomicilio = new ServicioDomicilio("Salchichas de Frankfurt disponible en el local", "Servicio a domicilio disponible");
        
        /*Variable opcion de tipo entero */
        int opcion;

        /*Do while con un switch dentro que muestra las diferentes opciones que ofrece el menu */
        do {
            System.out.println("Menu Servicio a Domicilio");
            System.out.println("1. Opciones de pedir el producto: ");
            System.out.println("2. Pedir en carniceria.");
            System.out.println("3. Pedir desde casa.");
            System.out.println("4. Salir del menu.");
            System.out.println("Introduzca una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    /*Muestra los menus disponibles al pedirlo desde su domicilio */
                    servicioDomicilio.mostrarPedirEnServicioDomicilio();
                    break;
                case 2:
                    /*Muestra la opcion de pedir en la carniceria y cuanto cuesta su menu */
                    System.out.println("Pedir en carniceria");
                    String pedirEnCarniceria = sc.nextLine();
                    servicioDomicilio.setPedirEnCarniceria(pedirEnCarniceria);
                    System.out.println("Ha seleccionado el menu de servicio a domicilio");
                    System.out.println("Este menu esta compuesto de 3 salchichas y 2 pechugas de pollo");
                    System.out.println("El menu cuesta 10 euros");
                    System.out.println("Gracias por su compra!!!");
                    System.out.println();

                    break;
                case 3:
                    /*Muestra la opcion de pedir desde casa y cuanto cuesta su menu */
                    System.out.println("Pedir desde casa");
                    String pedirDesdeCasa = sc.nextLine();
                    servicioDomicilio.setPedirDesdeCasa(pedirDesdeCasa);
                    System.out.println("Ha seleccionado el menu de pedir en casa");
                    System.out.println("Este menu esta compuesto de 4 hamburguesas clasicas salchichas y 2 chorizos");
                    System.out.println("El menu cuesta 15 euros");
                    System.out.println("Gracias por su compra!!!");
                    System.out.println();

                    break;
                case 4:
                    /*Sale del programa */
                    System.out.println("Saliendo del menu de pedir a domicilio. Muchisimas gracias por su uso");
                    break;
                default:
                    System.out.println("Opcion equivocada. Por favor introduzca una de las opciones disponibles.");
            }
        } while(opcion >= 1 && opcion <= 3);

        /*Cerramos el escaner */
        sc.close();
    }
}