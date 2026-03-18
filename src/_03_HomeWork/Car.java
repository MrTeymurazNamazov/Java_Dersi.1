package _03_HomeWork;

public class Car {
    private String marka;
   private String model;
    private String color;
    private Double motorsize;
    private int doors;
     Car(String marka, String model, String color, Double motorsize, int doors) {
        this.marka = marka;
        this.model = model;
        this.color = color;
        this.motorsize = motorsize;
        this.doors = doors;

    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getMotorsize() {
        return motorsize;
    }

    public void setMotorsize(Double motorsize) {
        this.motorsize = motorsize;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car {" +
                " Marka = '" + marka + '\'' +
                ", Model = '" + model + '\'' +
                ", Color = '" + color + '\'' +
                ", Motorsize = " + motorsize +
                ", Doors = " + doors +
                '}';
    }



}




