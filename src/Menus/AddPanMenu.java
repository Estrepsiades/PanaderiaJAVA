package Menus;

import Clases.Inventario;
import Clases.Pan;

import java.util.Scanner;

public class AddPanMenu {
    public static void addPan(Scanner input, Inventario inventario ){
        newPan( input, inventario );
        MainMenu.mainMenu( input, inventario );
    }
    private static void newPan( Scanner input, Inventario inventario){
        String nombrePan;
        double precioPan;
        int unidadesPan;
        System.out.println("Introduce nombre del pan");
        nombrePan = input.next();
        System.out.println("Introduce precio del pan");
        precioPan = input.nextDouble();
        System.out.println("Introduce unidades del pan");
        unidadesPan = input.nextInt();
        inventario.addBread( new Pan( nombrePan, precioPan, unidadesPan));
    }
    /*
    private static void objectPan( Scanner input, Inventario inventario , int numberOfBread ){
        int option;
        double price;
        String nameOfBread;
        System.out.println("PAN NUMERO: " + numberOfBread);
        System.out.println("Introduce precio del pan");
        price = input.nextDouble();
        input.nextLine();
        System.out.println("Introduce nombre del pan");
        nameOfBread = input.nextLine();
        System.out.println("Tipo de pan");
        System.out.println("01.Dulce\n02.Normal\n03.Cancelar");
        option = input.nextInt();
        optionAddPan( input, inventario, option, price, nameOfBread ,numberOfBread);
    }
    private static void optionAddPan( Scanner input, Inventario inventario, int option, double price, String nameOfBread ,int numberOfBread ){
        int otherOption;
        if (option == 1 || option == 2) {
            System.out.println("La opcion elegida fue: " + option );
            Pan pan = new Pan( nameOfBread, price, option);
            inventario.addBread( pan );
            return;
        }
        if ( option == 3 ){
            System.out.println("01.Cancelar SOLO este pan\n02.Cancelar TODOS los panes\n03.Volver a escribir pan");
            otherOption = input.nextInt();
            if ( otherOption == 1 ){
                return;
            }
            if ( otherOption == 2 ){
                addPan( input, inventario);
                return;
            }
            if ( otherOption == 3 ){
                objectPan( input, inventario,numberOfBread);
                return;
            }
            System.out.println("Opcion Invalida");
            optionAddPan( input, inventario,option, price, nameOfBread, numberOfBread);
        }
    }
     */
}
