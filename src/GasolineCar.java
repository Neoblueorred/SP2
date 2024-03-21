public class GasolineCar extends AFuelCar { // nedarver fra AFuelCar


    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPerLitre);
    }


    @Override
    public String getFuelType() {
        return "Gasoline";
    }


    @Override
    public String toString() {
        return "GasolineCar{} " + super.toString();
    }

    @Override
    public int getRegistrationFee() {
        if (getKmPerLitre() >= 20 && getKmPerLitre() <= 50) {
            return 330;
        } else if (getKmPerLitre() >= 15 && getKmPerLitre() < 20) {
            return 1050;
        } else if (getKmPerLitre() >= 10 && getKmPerLitre() < 15) {
            return 2340;
        } else if (getKmPerLitre() >= 5 && getKmPerLitre() < 10) {
            return 5500;
        } else {
            return 10470;
        }

    }
}



