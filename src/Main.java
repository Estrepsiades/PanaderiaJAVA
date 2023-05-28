import Clases.Inventario;
import Menus.MainMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        Inventario inventario = new Inventario();
        System.out.println("Universidad Nacional Autonoma De Mexico");
        System.out.println("Facultad De Estudios Superiores Aragon");
        System.out.println("Ingenieria Electrica Electronica");
        System.out.println("TU NOMBRE ");
        System.out.println("Programacion Aplicada");
        MainMenu.mainMenu( input, inventario );
    }

}