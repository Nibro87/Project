public class Main {

    public static void main(String[] args) {
        Garage g1 = new Garage("myGarage");
        fuelVehicle b1 = new fuelVehicle("AU23222","Mercedes","E63",2020,4);
        dieselVehicle d1 = new dieselVehicle("PQ32312","Mercedes","Sprinter",2020,4,true,18);
        electricVehicle e1 = new electricVehicle("SY91212","Tesla","model S",2020,3,100,647,220);
        g1.addCar(b1);
        g1.addCar(d1);
        g1.addCar(e1);

        System.out.println(g1);
        System.out.println("\nTotal beregnet grøn afgift =");
        System.out.println(g1.beregnGrønAfgiftForBilpark());

    }




}
