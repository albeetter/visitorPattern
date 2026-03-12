public class Table implements Furniture {
    private double surfaceArea;

    public Table(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    @Override
    public double accept(ShippingVisitor visitor, double distanceMiles) {
        return visitor.calculateShipping(this, distanceMiles);
    }
}