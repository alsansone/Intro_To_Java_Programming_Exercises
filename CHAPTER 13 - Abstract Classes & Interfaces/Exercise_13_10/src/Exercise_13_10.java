public class Exercise_13_10 {
    public static void main(String[] args) {

        Rectangle obj1 = new Rectangle();
        Rectangle obj2 = new Rectangle();
        Rectangle obj3 = new Rectangle(2.5, 3.5);
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.compareTo(obj2));

        System.out.println(obj1.equals(obj3));
        System.out.println(obj1.compareTo(obj3));

    }
}


