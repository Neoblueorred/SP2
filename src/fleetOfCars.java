import java.util.ArrayList;

public class fleetOfCars {

        private ArrayList<Acar> fleet;

        public fleetOfCars() {
            fleet = new ArrayList<>();
        }

        public void addCar(Acar car) {
            fleet.add(car);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("Fleet of Cars:\n");
            for (Acar car : fleet) {
                sb.append(car.toString()).append("\n");
            }
            return sb.toString();
        }

        public int getTotalRegistrationFeeForFleet() {
            int totalFee = 0;
            for (Acar car : fleet) {
                if (car instanceof AFuelCar) {
                    totalFee += ((AFuelCar) car).getRegistrationFee();
                }
                else if (car instanceof ElectricCar) {
                    totalFee += ((ElectricCar) car).getRegistrationFee();
                }
            }
            return totalFee;
        }
    }
