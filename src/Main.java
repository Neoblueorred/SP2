class Main{
        public static void main(String[] args) {
            fleetOfCars fleet = new fleetOfCars();

            fleet.addCar(new GasolineCar("2562", "BMW", "Sedan", 2024, 25));
            fleet.addCar(new DieselCar("1278", "Volvo", "Wagon", 2024, 15, true));
            fleet.addCar(new ElectricCar("91411", "Tesla", "Model 3", 2023, 75, 350));

            System.out.println(fleet);
            System.out.println("Total registration fee for fleet: " + fleet.getTotalRegistrationFeeForFleet());
        }
    }
