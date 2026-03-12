public class StandardShippingCalculator implements ShippingVisitor {

    @Override
    public double calculateShipping(Chair chair, double distanceMiles) {
        // Chairs are lightweight and have a flat shipping rate regardless of distance.
        System.out.println("Calculating flat rate shipping for Chair...");
        return 15.00;
    }

    @Override
    public double calculateShipping(Sofa sofa, double distanceMiles) {
        // Sofas are bulky and require a distance-based and volume-based shipping cost calculation.
        System.out.println("Calculating distance and volume-based shipping for Sofa...");
        double baseRate = 50.00;
        double volumeSurcharge = sofa.getVolume() * 2.50;
        double distanceFee = distanceMiles * 0.75;
        return baseRate + volumeSurcharge + distanceFee;
    }

    @Override
    public double calculateShipping(Table table, double distanceMiles) {
        // Tables are charged based on surface area and a minor distance fee.
        System.out.println("Calculating area-based shipping for Table...");
        return (table.getSurfaceArea() * 1.20) + (distanceMiles * 0.25);
    }
}