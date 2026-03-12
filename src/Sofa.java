public class Sofa implements Furniture {
    private double weightInLbs;
    private double volumeInCubicFeet;

    public Sofa(double weightInLbs, double volumeInCubicFeet) {
        this.weightInLbs = weightInLbs;
        this.volumeInCubicFeet = volumeInCubicFeet;
    }

    public double getWeight() {
        return weightInLbs;
    }

    public double getVolume() {
        return volumeInCubicFeet;
    }

    @Override
    public double accept(ShippingVisitor visitor, double distanceMiles) {
        return visitor.calculateShipping(this, distanceMiles);
    }
}
