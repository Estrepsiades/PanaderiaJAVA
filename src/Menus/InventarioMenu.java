package Menus;

import Clases.Inventario;

import java.util.Scanner;

public class InventarioMenu {
    public static void inventarioMenu(Scanner input, Inventario inventario ){
        inventario.shownBreads();
        optionsMenu( input, inventario );
    }
    private static void optionsMenu( Scanner input, Inventario inventario ){
        System.out.println("Selecciona Opcion");
        System.out.println("01.Filtrar\n02.Vender/Eliminar Pan\n03.Salir Al Menu");
        switch ( input.nextInt() ){
            case 1:{
                filtMenu( input, inventario );
                break;
            }
            case 2:{

            }
            case 3:{
                MainMenu.mainMenu( input, inventario);
                break;
            }
            default:{
                System.out.println("Selecciona Opcion Valida");
                optionsMenu( input, inventario );
            }
        }
    }
    private static void filtMenu( Scanner input, Inventario inventario ){
        System.out.println("Filtrar por:");
        System.out.println("01.Tipo de pan\n02.Precio\n03.Alfabeticamente\n04.Agregado mas reciente\n05.Mas Antiguo\n06.Cancelar");
        switch ( input.nextInt() ){
            case 1:{
                System.out.println("Ordenando por tipo de pan...");
                inventarioMenu( input, inventario );
                break;
            }
            case 2:{
                System.out.println("Ordenando por precio...");
                inventarioMenu( input, inventario );
                break;
            }
            case 3:{
                System.out.println("Ordenando alfabeticamente...");
                inventarioMenu( input, inventario );
                break;
            }
            case 4:{
                System.out.println("Ordenando por mas reciente...");
                inventarioMenu( input, inventario );
                break;
            }
            case 5:{
                System.out.println("Ordenando por mas antiguo...");
                inventarioMenu( input, inventario );
                break;
            }
            case 6:{
                inventarioMenu( input, inventario);
                break;
            }
            default:{
                System.out.println("Selecciona Opcion Valida");
                filtMenu( input, inventario );
            }
        }
    }
}
