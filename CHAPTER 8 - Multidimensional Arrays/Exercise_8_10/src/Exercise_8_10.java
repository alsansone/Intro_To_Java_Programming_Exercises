public class Exercise_8_10 {
    public static void main(String[] args) {

        double[][] array = randomArray();

    }
    public static double[][] randomArray() {
        double[][] randomm = new double[4][4];

        for (int r = 0; r < randomm.length; r++) {
            for (int c = 0; c < randomm[r].length; c++) {
                randomm[r][c] = (int)(Math.random() * 2);
            }
        }
        return randomm;
    }
    public static
}
