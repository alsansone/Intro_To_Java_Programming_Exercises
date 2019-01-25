/** Count single digits */
public class Exercise_7_07 {
    public static void main(String[] args) {

        int[] count = new int[10];

        for (int i = 0; i < 100; i++) {
            int randomNumber = (int)(Math.random() * 10);
            count[randomNumber]++;
        }

        for (int j = 0; j < count.length; j++) {
            System.out.println(j + " appears " + count[j] + " times");
        }
    }
}
