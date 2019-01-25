/** Random number chooser */
public class Exercise_7_13 {
    public static void main(String[] args) {

        System.out.println(getRandom(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31,
                33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53));

    }

    public static int getRandom(int... numbers) {
        int randomNumber;
        boolean isExcluded;

        do {
            isExcluded = false;
            randomNumber = (int)(1 + Math.random() * 54);
            for (int number : numbers) {
                if (number == randomNumber) {
                    isExcluded = true;
                }
            }
        } while (isExcluded);

        return randomNumber;
    }
}
