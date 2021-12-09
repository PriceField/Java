package sorting;

public class Basic {

    private void swap(int[] ary, int i, int j) {
        int temp = ary[i];
        ary[i] = ary[j];
        ary[j] = temp;
    }

    public void bubble(int[] ary) {
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary.length - i - 1; j++) {
                if (ary[j] > ary[j + 1]) {
                    swap(ary, j, j + 1);
                }
            }
        }
    }

    public void insertion(int[] ary) {
        for (int i = 0; i < ary.length; i++) {
            int temp = ary[i];
            for (int j = i - 1; j >= 0; j--) {
                if (ary[j] > temp) {
                    ary[j + 1] = ary[j];
                    ary[j] = temp;
                }
            }
        }
    }

    public void selection(int[] ary) {
        for (int i = 0; i < ary.length; i++) {
            int index = i;
            for (int j = i + 1; j < ary.length; j++) {
                if (ary[j] < ary[index]) {
                    index = j;
                }
            }
            swap(ary, i, index);
        }
    }
}
