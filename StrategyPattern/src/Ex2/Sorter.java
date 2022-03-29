package Ex2;

/**
 * Design patterns Lab 2 - Strategy
 */
public class Sorter {

    private Sort sort;

    public Sorter(Sort sort) {
        this.sort = sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public void goSort(){
        int[] solution = sort.sortArray();
        showVectorData(solution);
    }

    public void showVectorData(int[] vector) {
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<vector.length; i++) {
            sb.append(vector[i] + "\t");
        }

        System.out.println(sb.toString());
    }
}
