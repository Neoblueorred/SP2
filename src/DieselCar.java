public class DieselCar extends AFuelCar { // nedarver fra AFuelCar

    boolean particleFilter;
    public boolean hasParticleFilter(){
        return particleFilter;
    }

    public DieselCar(String licensePlate, String make, String model, int year, int kmPerLitre, boolean particleFilter) {
        super(licensePlate, make, model, year, kmPerLitre);
        this.particleFilter = particleFilter;

    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public String toString() {
        return "DieselCar{" + getFuelType() +
                "particleFilter=" + particleFilter +
                "} " + super.toString();
    }

    @Override
    public int getRegistrationFee() {
        int price;
        int kmPerLitre = getKmPerLitre();

        // Basisregistreringsafgift
        if (kmPerLitre >= 20 && kmPerLitre <= 50) {
            price = 330;
        } else if (kmPerLitre >= 15) {
            price = 1050;
        } else if (kmPerLitre >= 10) {
            price = 2340;
        } else if (kmPerLitre >= 5) {
            price = 5500;
        } else {
            price = 10470;
        }

        // Udligningsafgift
        if (kmPerLitre >= 20 && kmPerLitre <= 50) {
            price += 130;
        } else if (kmPerLitre >= 15) {
            price += 1390;
        } else if (kmPerLitre >= 10) {
            price += 1850;
        } else if (kmPerLitre >= 5) {
            price += 2770;
        } else {
            price += 15260;
        }

        int partikeludledningsafgift = hasParticleFilter() ? 0 : 1000;

        return(0);





    }
}

