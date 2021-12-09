package sorting;

public class Merge {

    public void sorting(int ary[], int left, int right) {

        int middle = left + (right - left) / 2;
        sorting(ary, left, middle);
        sorting(ary, middle + 1, right);
        merge(ary, left, middle + 1, right);
    }

    private void merge(int ary[], int left, int middle, int right) {
        int[] ls = new int[left];
        int[] rs = new int[right];
        for (int i : ary) {
            ls[i] = ary[i];
        }
        for (int i : ary) {
            rs[i] = ary[i + left];
        }
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < middle && j < right) {
            {
                if (ls[i] < rs[j]) {
                    ary[index] = ls[i];
                    i++;
                } else {
                    ary[index] = rs[j];
                    j++;
                }
                index++;
            }
        }
        while (i < middle) {
            ary[index] = ls[i];
            i++;
            index++;
        }
        while (j < right) {
            ary[index] = rs[j];
            j++;
            index++;
        }
    }
}
