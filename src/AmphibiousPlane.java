public class AmphibiousPlane implements Amphibious, AirVehicle {

    @Override
    public void dock() {
        System.out.println("Amphibious Plane docking on water.");
    }

    @Override
    public void launch() {
        System.out.println("Amphibious Plane launching from water.");
    }

    @Override
    public void fly() {
        System.out.println("Amphibious Plane flying in the air.");
    }

}
