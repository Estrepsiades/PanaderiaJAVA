package Clases;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pan {
    private String nameOfBread;
    private String id;
    private double price;
    private int typeOfBread;
    public Pan( String nameOfBread ,double price, int typeOfBread ){
        this.nameOfBread = nameOfBread;
        this.price = price;
        this.typeOfBread = typeOfBread;
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mmssSSS");
        this.id = now.format( formatter );
    }
    public double getPrice(){
        return this.price;
    }
    public String getNameOfBread() {
        return nameOfBread;
    }
    public String getId() {
        return id;
    }
    public int getTypeOfBread() {
        return typeOfBread;
    }
}
