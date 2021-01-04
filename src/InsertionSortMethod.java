public class InsertionSortMethod {
    public static void insertionSort(double[] list) {
        for (int i = 1; i < list.length; i++) {
            double temp = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > temp; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        insertionSort(list);
        System.out.println("list after % sorting");
        for (double v : list) {
            System.out.print(v+"\t");
        }

    }
}
