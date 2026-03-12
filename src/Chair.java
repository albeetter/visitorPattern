public class Chair implements Furniture {
    private String material;

    public Chair(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public double accept(ShippingVisitor visitor, double distanceMiles) {
        return visitor.calculateShipping(this, distanceMiles);
    }
}