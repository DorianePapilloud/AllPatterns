package Ex2;

public class SelectionSort implements Sort{

    private int[] vector;

    public SelectionSort(int[] vector) {
        this.vector = vector;
    }

    @Override
    public int[] sortArray() {
        int temp, cursor = 0;

        for (int i=0; i<vector.length; i++) {
            temp   = vector[i];
            cursor = i;

            for (int j=i; j<vector.length; j++) {
                if (vector[j] < temp) {
                    temp   = vector[j];
                    cursor = j;
                }
            }

            vector[cursor] = vector[i];
            vector[i]      = temp;
        }
        return vector;
    }
}
