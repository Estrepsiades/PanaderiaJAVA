package Menus;

import Clases.Inventario;

import java.util.Scanner;

public class MainMenu {
    public static void mainMenu(Scanner input, Inventario inventario){
        System.out.println("Selecciona Opcion:");
        System.out.println("01.Inventario\n02.Agregar Panes");
        switch ( input.nextInt() ){
            case 1:
                InventarioMenu.inventarioMenu( input, inventario );
                break;
            case 2:{
                AddPanMenu.addPan( input, inventario);
                break;
            }
            case 10:{
                System.out.println("Adios...");
                break;
            }
            default: {
                System.out.println("Seleccione opcion valida o escriba 10 para salir ");
                mainMenu( input, inventario );
            }
        }
    }
}
