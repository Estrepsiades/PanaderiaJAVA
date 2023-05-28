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
    public void addBread(Pan pan ){
        this.breads.add( pan );
    }
    public void shownBreads(){
        int index = 0;
        for ( Pan pan : breads ){
            System.out.println("*****\n" + (index+1) + ".Nombre: " + pan.getNombre() + "\nPrecio: " + pan.getPrecio() + "\nUnidades: " + pan.getUnidades() + "\n*****\n");
            index++;
        }
    }

}
