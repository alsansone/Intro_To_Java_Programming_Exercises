public class Exercise_3_24 {
    public static void main(String[] args) {

        int rank = 1 + (int)(Math.random() * 14);
        int suit = (int)(Math.random() * 4);

        System.out.print("The card you picked is ");
        switch (rank) {
            case 1:
                System.out.print("Ace");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 3:
                System.out.print("Three");
                break;
            case 4:
                System.out.print("Four");
                break;
            case 5:
                System.out.print("Five");
                break;
            case 6:
                System.out.print("Six");
                break;
            case 7:
                System.out.print("Seven");
                break;
            case 8:
                System.out.print("Eight");
                break;
            case 9:
                System.out.print("Nine");
                break;
            case 10:
                System.out.print("Ten");
                break;
            case 11:
                System.out.print("Jack");
                break;
            case 12:
                System.out.print("Queen");
                break;
            case 13:
                System.out.print("King");
        }

        System.out.print(" of ");

        switch (suit) {
            case 0:
                System.out.print("Clubs");
                break;
            case 1:
                System.out.print("Diamonds");
                break;
            case 2:
                System.out.print("Hearts");
                break;
            case 3:
                System.out.print("Spades");
        }

    }
}
