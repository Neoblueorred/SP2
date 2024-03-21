public abstract class AFuelCar extends Acar {
    private int getkmPerLitre;



    public AFuelCar (String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre){

        super( registrationNumber,  make,  model,  numberOfDoors);
        this.getkmPerLitre = kmPerLitre;

    }

    public int getKmPerLitre() {
        return getkmPerLitre;
    }

    public abstract String getFuelType();

}



