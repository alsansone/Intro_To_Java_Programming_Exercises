public class Exercise_5_07 {
    public static void main(String[] args) {
        double totalCost = 0;
        double tuition = 10000;
        double tuitionTenthYear = 0;

        for (int year=1; year<=14; year++) {
            tuition+= (tuition*0.05);

            if (year == 10)
                tuitionTenthYear = tuition;

            if (year > 10) {
                totalCost += tuition;
            }
        }

        System.out.printf("The tuition after ten years will be $%8.2f\n", tuitionTenthYear);
        System.out.printf("The tuition after ten years will be $%8.2f\n", totalCost);
    }
}
