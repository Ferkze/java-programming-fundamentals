package vehicleinheritance;

import java.util.Calendar;

public class Car extends Vehicle {

    public Car(int renavam, String plate, String fuel, int year, double venalValue) {
        super(renavam, plate, fuel, year, venalValue);
    }
    
    public double calculateIPVA() {
        double value = 0;
        if (Calendar.YEAR-this.year<20) {
            if(this.fuel.equals("alcool")) {
                value = this.venalValue*0.03;
            } else {
                value = this.venalValue*0.04;
            }
        }
        return value;
    }
}
