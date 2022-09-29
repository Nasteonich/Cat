package Healing;

public class Medication {

    private Disease desript;

    private String name;

    private double price;



    public Disease getDesript() {
        return desript;
    }

    public void setDesript(Disease desript) {
        this.desript = desript;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
