import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task4 {
    public static void main(String[] args) {

        BigDecimal productCost = new BigDecimal("9.99");
        BigDecimal vatRate = new BigDecimal("0.05");

        BigDecimal singleUnitVat = productCost.multiply(vatRate)
                .setScale(2, RoundingMode.HALF_UP);

        BigDecimal totalNet = BigDecimal.ZERO;
        BigDecimal totalVat = BigDecimal.ZERO;

        for (int i = 0; i < 10000; i++) {
            totalNet = totalNet.add(productCost);
            totalVat = totalVat.add(singleUnitVat);
        }

        BigDecimal totalGross = totalNet.add(totalVat);

        System.out.println("VAT for one product: " + singleUnitVat);
        System.out.println("Total net sales: " + totalNet);
        System.out.println("Total VAT: " + totalVat);
        System.out.println("Total gross sales: " + totalGross);
    }
}