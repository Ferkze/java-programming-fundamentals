package vehicleinheritance;

import java.util.Calendar;

public class Motorcycle extends Vehicle {

    public Motorcycle(int renavam, String plate, String fuel, int year, double venalValue) {
        super(renavam, plate, fuel, year, venalValue);
    }

    public double calculateIPVA() {
        double value = 0;
        if (Calendar.YEAR-this.year<10) {
            value = this.venalValue*0.015;
        }
        return value;
    }
}
