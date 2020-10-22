public class fuelVehicle extends Car  {

    public float oktantal;
    public float kmPrl;

public fuelVehicle(String regNr, String brand, String model, String year, float numDoors) {
super(regNr, brand, model, year, numDoors);
this.oktantal = oktantal;
this.kmPrl = kmPrl;
}

    public float getKmPrl() {
        return kmPrl;
    }

    public void setKmPrl(float kmPrl) {
        this.kmPrl = kmPrl;
    }

    public void setOktantal(float oktantal) {
        this.oktantal = oktantal;
    }

    public float getOktantal() {
        return oktantal;
    }

    @Override
    public String toString() {


        return "fuelVechicle{" +
                "regNr=" + regNr +
                ", brand=" + brand +
                ", model=" + model +
                ", year=" + year +
                ", numDoors=" + numDoors +
                ", oktantal=" + oktantal +
                ", kmPrL=" + kmPrl +
                '}';
    }


    @Override
    public double beregnGrønEjerafgift() {

        if ( kmPrl < 5)
        {
            return 10470;
        }
        if (5 <= kmPrl && kmPrl < 10)
        {
            return 5500;
        }
        if (10 <= kmPrl && kmPrl < 15)
        {
            return 2340;
        }
        if (15 <= kmPrl && kmPrl < 20)
        {
            return 1050;
        }
        if (20 <= kmPrl && kmPrl < 50)
        {
            return 330;
        }
        return 0;

    }


    }

