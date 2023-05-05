package Clases;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Pan> breads;
    public Inventario(){
        this.breads = new ArrayList<Pan>();
    }

    public ArrayList<Pan> getBreads() {
        return breads;
    }
    public void addBread( Pan pan ){
        this.breads.add( pan );
    }

    public void shownBreads(){
        int index = 0;
        String msg;
        for ( Pan pan : breads ){
            if ( pan.getTypeOfBread() == 1 ){
                msg = String.format("*****\n%d.Pan Dulce \nNombre: %s\nPrecio: %.2f \n*****", index+1, pan.getNameOfBread(), pan.getPrice() );
                System.out.println( msg );
            }else {
                msg = String.format("*****\n%d.Pan Normal \nNombre: %s\nPrecio: %.2f \n*****", index+1, pan.getNameOfBread(), pan.getPrice() );
                System.out.println( msg );
            }
            index++;
        }
    }

}
