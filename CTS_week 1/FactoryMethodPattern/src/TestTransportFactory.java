public class TestTransportFactory {
    public static void main(String[] args) {
        TransportFactory carFactory = new CarFactory();
        Transport car = carFactory.createTransport();
        car.deliver();

        TransportFactory bikeFactory = new BikeFactory();
        Transport bike = bikeFactory.createTransport();
        bike.deliver();

        TransportFactory truckFactory = new TruckFactory();
        Transport truck = truckFactory.createTransport();
        truck.deliver();
    }
}
