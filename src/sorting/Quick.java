package sorting;

public class Quick {

    public void sorting(int[] ary, int left, int right) {

        int pivotIndex = getPivot(ary, left, right - 1);

        sorting(ary, 0, pivotIndex - 1);
        sorting(ary, pivotIndex + 1, right - 1);
    }

    public int getPivot(int[] ary, int left, int right) {
        int pivot = ary[right];
        int i = 0;
        int j = right - 1;
        while (i <= j) {
            while (ary[i] < pivot) {
                i++;
            }
            while (ary[j] > pivot) {
                j--;
            }
            if (i < j) {
                // swap i, j
            }
        }
        // swap i, right
        return i;
    }
}
