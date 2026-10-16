public class Task4 {
    public static void main(String[] args) {

        double productCost = 9.99;
        double vatRate = 0.05;

        double singleUnitVat = productCost * vatRate;

        double totalNet = 0;
        double totalVat = 0;
        double totalGross = 0;

        for (int i = 0; i < 10000; i++) {
            totalNet += productCost;
            totalVat += singleUnitVat;
            totalGross += productCost + singleUnitVat;
        }

        System.out.println("VAT for one product: " + singleUnitVat);
        System.out.println("Total net sales: " + totalNet);
        System.out.println("Total VAT: " + totalVat);
        System.out.println("Total gross sales: " + totalGross);
    }
}