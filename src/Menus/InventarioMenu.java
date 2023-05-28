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
        System.out.println("01.Vender\n03.Salir Al Menu");
        switch ( input.nextInt() ){
            case 1:{
                venderPan( input, inventario );
                break;
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
    private static void venderPan( Scanner input, Inventario inventario){
        int panSeleccionado;
        System.out.println("Selecciona numero de pan");
        panSeleccionado = input.nextInt();
        inventario.getBreads().get( panSeleccionado-1 ).quitarUnidad();
        inventarioMenu( input, inventario );
    }
}
