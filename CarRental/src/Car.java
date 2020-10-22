public abstract class Car {
String regNr;
String brand;
String model;
String year;
float numDoors;

public Car(String regNr, String brand, String model, String year, float numDoors){
    this.regNr = regNr;
    this.brand = brand;
    this.model = model;
    this.year = year;
    this.numDoors = numDoors;

}

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public float getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(float numDoors) {
        this.numDoors = numDoors;
    }

    public abstract double beregnGrønEjerafgift();



}
