package Ex2;

public class BubbleSort implements Sort{

    private int[] vector;

    public BubbleSort(int[] vector) {
        this.vector = vector;
    }

    @Override
    public int[] sortArray() {
        int temp;
        int nbrePermutation = -1;
        int nbreIteration   = 0;

        while (nbrePermutation != 0) {
            nbrePermutation = 0;

            for (int i=0; i<vector.length - nbreIteration - 1; i++) {

                if (vector[i] > vector[i + 1]) {
                    nbrePermutation++;
                    temp = vector[i + 1];
                    vector[i+1] = vector[i];
                    vector[i]   = temp;
                }
            }
        }
        return vector;
    }
}
