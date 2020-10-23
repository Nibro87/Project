public class electricVehicle extends Car {

float batterikapacitetKWh;
float maxKm;
float whPrKM;

public electricVehicle(String regNr, String brand, String model, int year, float numDoors, float batterikapacitetKWh, float maxKm, float whPrKm ){
    super(regNr, brand, model, year,numDoors);
    this.batterikapacitetKWh = batterikapacitetKWh;
    this.maxKm = maxKm;
    this.whPrKM= whPrKm;
}

    public float getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(float batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public float getWhPrKM(){
    return whPrKM;
    }

    public void setWhPrKM(float whPrKM) {
        this.whPrKM = whPrKM;
    }

    @Override
    public String toString() {
        return "\n\nelectricVehicle" +
                "\nBatterikapacitet KWh = " + batterikapacitetKWh +
                "\nMaxKm = " + maxKm +
                "\nWhPrKm = " + whPrKM +
                "\nRegNr = " + regNr +
                "\nbrand='" + brand +
                "\nModel='" + model +
                "\nyear=" + year +
                "\nnumDoors=" + numDoors;
    }





    @Override
  public double beregnGrønEjerafgift() {

    double x;
        x = 100/(whPrKM/91.25);
        if ( x < 5)
        {
            return 10470;
        }
        if (5 <= x && x < 10)
        {
            return 5500;
        }
        if (10 <= x && x < 15)
        {
            return 2340;
        }
        if (15 <= x && x < 20)
        {
            return 1050;
        }
        if (20 <= x && x < 50)
        {
            return 330;
        }
        return 0;



    }
}
