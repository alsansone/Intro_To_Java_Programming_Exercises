import java.util.ArrayList;

public class Exercise_13_02 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random() * 1000));
        }

        shuffle(list);

        for (Number number : list) {
            System.out.print(number + " ");
        }
    }

    public static void shuffle(ArrayList<Number> list) {
        for (int i = 0; i < list.size()-1; i++) {
            int randomIndex = (int)(Math.random() * list.size());
            Number temp = list.get(i);
            list.set(i, list.get(randomIndex));
            list.set(randomIndex, temp);
        }
    }
}
