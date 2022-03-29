package Ex2;

public class InsertSort implements Sort{

    private int[] vector;

    public InsertSort(int[] vector) {
        this.vector = vector;
    }

    @Override
    public int[] sortArray() {
        int temp;

        for (int i=1; i<vector.length; i++) {

            temp = vector[i];

            for (int j=i-1; j>=0; j--) {
                if (vector[j] > temp) {
                    vector[j+1] = vector[j];
                    vector[j]   = temp;
                } else {
                    vector[j+1] = temp;
                    break;
                }
            }
        }
        return vector;
    }
}
