public interface Furniture {
    double accept(ShippingVisitor visitor, double distanceMiles);
}