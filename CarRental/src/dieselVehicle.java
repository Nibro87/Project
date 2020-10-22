public class dieselVehicle extends Car {
    float kmPrl;
    boolean harPartikelFilter;


    public dieselVehicle(String regNr, String brand, String model, String year, int numDoors, boolean harPartikelFilter, float kmPrl) {
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
        this.kmPrl = kmPrl;
    }


    @Override
    void beregnGrønEjerafgift() {

    }
}