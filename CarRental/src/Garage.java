
import java.util.ArrayList;
import java.util.List;

public class Garage {

    List<Car> myGarage;
    String name;

    public Garage(String name){
      this.myGarage = new ArrayList<>();
      this.name = name;
    }

    public void addCar(Car a){
        myGarage.add(a);

    }

    @Override
    public String toString() {
        return "My Garage:\n\n" + myGarage;
    }
    public double beregnGrønAfgiftForBilpark() {
        double totalAfgift = 0;
        for (Car b : myGarage) {
            totalAfgift += b.beregnGrønEjerafgift();
        }
        return totalAfgift;

    }
}
