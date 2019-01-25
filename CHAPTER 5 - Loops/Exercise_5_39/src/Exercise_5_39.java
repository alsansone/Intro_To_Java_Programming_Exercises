/** Financial application: find the sales amount */
public class Exercise_5_39 {
    public static void main(String[] args) {

        final int COMMISSION_SOUGHT = 25_000;
        double commission = 0.0;
        double salesAmount = 1.0;

        do {
            if (salesAmount <= 5000) {
                commission = salesAmount * .08;
            } else if (salesAmount <= 10_000) {
                commission = 400 + (salesAmount - 5000) * .1;
            } else {
                commission = 900 + (salesAmount - 10_000) * .12;
            }
            salesAmount++;
        }
        while (commission < COMMISSION_SOUGHT);

        System.out.println("The sales needed to make $30,000 a year is " + salesAmount);
    }
}
