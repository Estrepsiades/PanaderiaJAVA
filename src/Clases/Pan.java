package Clases;
public class Pan {
    private String nombre;
    private int unidades;
    private double precio;
    public Pan( String nombre, double precio, int unidades ){
        this.nombre = nombre;
        this.precio = precio;
        this.unidades = unidades;
    }
    public double getPrecio() {
     return precio;
    }
    public String getNombre() {
        return nombre;
    }
    public int getUnidades() {
        return unidades;
    }
    public void quitarUnidad(){
        this.unidades = this.unidades - 1;
    }
}
