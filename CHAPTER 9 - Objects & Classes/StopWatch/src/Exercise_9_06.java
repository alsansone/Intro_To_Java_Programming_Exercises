public class Exercise_9_06 {
    public static void main(String[] args) {
        int size = 10000;

        double[] list = new double[size];

        for (int i = 0; i < list.length; i++) {
            list[i] = Math.random() * list.length;
        }

        StopWatch stopWatch = new StopWatch();
        selectionSort(list);
        stopWatch.stop();

        System.out.println("The sort time is " + stopWatch.getElapsedTime());
    }

    /* selection sort */
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {

            double currentMin = list[i];
            int currentMinIndex = 0;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
