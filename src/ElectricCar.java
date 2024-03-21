 public class ElectricCar extends Acar { // nedarver fra Acar
     private int batteryCapacityKWh;
     private int maxRangeKm;


     @Override
     public int getRegistrationFee() {
         return 0;
     }

     public ElectricCar(String licensePlate, String make, String model, int year, int batteryCapacityKWh, int maxRangeKm) {
         super(licensePlate, make, model, year);
         this.batteryCapacityKWh = batteryCapacityKWh;
         this.maxRangeKm = maxRangeKm;

     }


     public double getBatteryCapacityKWh() {
         return batteryCapacityKWh;
     }


     public int getMaxRangeKm() {
         return maxRangeKm;
     }



     // returner med 0 for at undgå division med nul.
     public int getWhPrKm() {
         if (maxRangeKm == 0) {
             return 0;
         }

         //Her udregner vi det med at tage BatteryCapacityKWh og gange med 1000 også bagefter devivdere det med maxRangeKm.
         return (batteryCapacityKWh * 1000) / maxRangeKm;

     }
         @Override
         public String toString() {
             return "ElectricCar{" +
                     "batteryCapacityKWh=" + batteryCapacityKWh +
                     ", maxRangeKm=" + maxRangeKm +
                     "} " + super.toString();
         }
     }
