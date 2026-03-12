public interface ShippingVisitor {
    double calculateShipping(Chair chair, double distanceMiles);
    double calculateShipping(Sofa sofa, double distanceMiles);
    double calculateShipping(Table table, double distanceMiles);
}