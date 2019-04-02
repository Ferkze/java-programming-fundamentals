package vehicleinheritance;

public class Vehicle {
    protected int renavam;
    protected String plate;
    protected String fuel;
    protected int year;
    protected double venalValue;

    public int getRenavam() {
        return renavam;
    }

    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getVenalValue() {
        return venalValue;
    }

    public void setVenalValue(double venalValue) {
        this.venalValue = venalValue;
    }

    public Vehicle(int renavam, String plate, String fuel, int year, double venalValue) {
        this.renavam = renavam;
        this.plate = plate;
        this.fuel = fuel;
        this.year = year;
        this.venalValue = venalValue;
    }
    
}
