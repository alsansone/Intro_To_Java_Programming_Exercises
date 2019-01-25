/** Generate random characters */
public class Exercise_6_38 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println(getRandomUpperCaseLetters());
            } else {
                System.out.print(getRandomUpperCaseLetters());
            }
        }
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println(getRandomSingleDigits());
            } else {
                System.out.print(getRandomSingleDigits());
            }
        }
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomUpperCaseLetters() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomSingleDigits() {
        return getRandomCharacter('0', '9');
    }
}
