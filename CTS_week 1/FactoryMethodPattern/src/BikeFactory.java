public class BikeFactory extends TransportFactory {
    public Transport createTransport() {
        return new Bike();
    }
}
