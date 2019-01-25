public class Exercise_5_06 {
    public static void main(String[] args) {
        System.out.println("Miles      Kilometers   |   Kilometers     Miles");
        System.out.println("-------------------------------------------------");
        for (int i=1, j=20; i<=10 && j<=65; i++, j+=5) {
            System.out.printf("%-10d %-10.3f   |   %-10d %10.3f\n", i, (i*1.609), j, (j/1.609));
        }
    }
}
