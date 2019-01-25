public class Exercise_6_11 {
    public static void main(String[] args) {

        // Print Header
        System.out.println("Sales Amount       Commission");
        System.out.println("------------------------------");
        for (int salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
            System.out.printf("%-10d%16.1f\n", salesAmount, computeCommission(salesAmount));
        }
    }
    public static double computeCommission(double salesAmount) {
        double commission = 0;
        if (salesAmount <= 5000)
            commission = salesAmount * .08;
        else if (salesAmount <= 10000)
            commission = 5000 * .08 + (salesAmount - 5000) * .10;
        else if (salesAmount > 10000)
            commission = 5000 * .08 + 5000 * .10 + (salesAmount - 10000) * .12;

        return commission;
    }
}
