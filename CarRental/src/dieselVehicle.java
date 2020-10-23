public class dieselVehicle extends Car {
    float kmPrl;
   public boolean harPartikelFilter;


    public dieselVehicle(String regNr, String brand, String model, int year, float numDoors, boolean harPartikelFilter, float kmPrl) {
        super(regNr, brand, model, year, numDoors);
        this.harPartikelFilter = harPartikelFilter;
        this.kmPrl = kmPrl;
    }

    public boolean getHarPartikelFilter() {

        return harPartikelFilter;
    }

    public void setHarPartikelFilter(boolean harPartikelFilter) {

        this.harPartikelFilter = harPartikelFilter;
    }

    public float getKmPrl() {
        return kmPrl;
    }

    public void setKmPrl(float kmPrl) {

        this.kmPrl =  kmPrl;
    }


    @Override
    public String toString() {
        return "\n\nDieselVehicle" +
                "\nRegNr = " + regNr +
                "\nbrand = " + brand +
                "\nModel = " + model +
                "\nyear = " + year +
                "\nnumDoors = " + numDoors +
                "\nPartikelfilter? = " + harPartikelFilter +
                "\nKmPrL = " + kmPrl;

    }

    @Override
    public double beregnGrønEjerafgift() {

        if ( kmPrl < 5 && harPartikelFilter == true)
        {
            return 15260;
        }
        if (5 <= kmPrl && kmPrl < 10 && harPartikelFilter == true)
        {
            return 2770;
        }
        if (10 <= kmPrl && kmPrl < 15 && harPartikelFilter == true)
        {
            return 1850;
        }
        if (15 <= kmPrl && kmPrl < 20 && harPartikelFilter == true)
        {
            return 1390;
        }
        if (20 <= kmPrl && kmPrl < 50 && harPartikelFilter == true)
        {
            return 130;
        }
        if ( kmPrl < 5 && harPartikelFilter == false)
        {
            return 16260;
        }
        if (5 <= kmPrl && kmPrl < 10 && harPartikelFilter == false)
        {
            return 3770;
        }
        if (10 <= kmPrl && kmPrl < 15 && harPartikelFilter == false)
        {
            return 2850;
        }
        if (15 <= kmPrl && kmPrl < 20 && harPartikelFilter == false)
        {
            return 2390;
        }
        if (20 <= kmPrl && kmPrl < 50 && harPartikelFilter == false)
        {
            return 1130;
        }
        return 0;
    }



    }
