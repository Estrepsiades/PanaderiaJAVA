import Clases.Inventario;
import Menus.MainMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        Inventario inventario = new Inventario();
        System.out.println("Bienvenido");
        MainMenu.mainMenu( input, inventario );
    }

}