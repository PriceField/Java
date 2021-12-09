package sorting;

public class Heap {

    public void sorting(int[] ary) {
        int l = ary.length;
        for (int i = l / 2 - 1; i >= 0; i--) {
            heapify(ary, l, i);
        }

        for (int i = l - 1; i > 0; i--) {
            int temp = ary[0];
            ary[0] = ary[i];
            ary[i] = temp;

            heapify(ary, i, 0);
        }
    }

    private void heapify(int[] ary, int length, int current) {
        // max heap
        int left = 2 * current + 1;
        int right = 2 * current + 2;
        if (left < length - 1 && left > current) {
            int temp = ary[current];
            ary[current] = ary[left];
            ary[left] = temp;
            heapify(ary, length, left);
        }
        if (right < length - 1 && right > current) {
            int temp = ary[current];
            ary[current] = ary[right];
            ary[right] = temp;
            heapify(ary, length, right);
        }
    }
}
