public class Workshop {
    Vehicle[] vehicles;

    public int getVehiclesAmount(){
        return vehicles.length;
    }

    public void repairAll() {
        for(Vehicle vehicle: vehicles){
            vehicle.repair();
        }
    }

    public void vehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }
}
