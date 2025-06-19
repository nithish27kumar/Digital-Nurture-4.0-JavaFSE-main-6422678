public class TruckFactory extends TransportFactory {
    public Transport createTransport() {
        return new Truck();
    }
}
