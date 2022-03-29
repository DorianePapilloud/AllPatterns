package Ex2;

/**
 * Design patterns Lab 2 - Strategy
 */
public class StrategySortLauncher {

    public static void main(String[] args) {
        int[] tab1 = { 99, 11, 2, 33, 12, 1, 0, 99, 34, 35 } ;
        int[] tab2 = { 99, 11, 2, 33, 12, 1, 0, 99, 34, 35 } ;
        int[] tab3 = { 99, 11, 2, 33, 12, 1, 0, 99, 34, 35 } ;

        Sorter sorter = new Sorter(new BubbleSort(tab1));
        sorter.goSort();
        sorter.setSort(new InsertSort(tab2));
        sorter.goSort();
        sorter.setSort(new SelectionSort(tab3));
        sorter.goSort();

    }


}
