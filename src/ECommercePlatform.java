public class ECommercePlatform {
    public static void main(String[] args) {
        // Instantiate the concrete visitable objects
        Furniture diningChair = new Chair("Wood");
        Furniture livingRoomSofa = new Sofa(150.0, 45.0);
        Furniture kitchenTable = new Table(30.0);

        // Instantiate the concrete visitor
        ShippingVisitor standardShipping = new StandardShippingCalculator();

        double deliveryDistance = 120.0; // 120 miles away

        System.out.println("--- E-Commerce Shipping Cost Breakdown ---");

        // Simulating double dispatch by passing the visitor to the object's accept method[cite: 22].
        double chairCost = diningChair.accept(standardShipping, deliveryDistance);
        System.out.println("Chair Shipping Cost: $" + String.format("%.2f", chairCost) + "\n");

        double sofaCost = livingRoomSofa.accept(standardShipping, deliveryDistance);
        System.out.println("Sofa Shipping Cost: $" + String.format("%.2f", sofaCost) + "\n");

        double tableCost = kitchenTable.accept(standardShipping, deliveryDistance);
        System.out.println("Table Shipping Cost: $" + String.format("%.2f", tableCost) + "\n");
    }
}