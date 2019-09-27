class BubbleSort {
    static void bubble(int arr[], int i, int n) {
        boolean isSwapping = false;
        do {
            isSwapping = false;
            for (i = 0; i < arr.length-1; i++) {

                if (arr[i] > arr[i + 1]) {

                    int temp = arr[i];

                    arr[i] = arr[i + 1];

                    arr[i + 1] = temp;

                    isSwapping = true;
                }
            }
        } while (isSwapping);
    }

    // O(n^2)
/*    static void bubble(int arr[], int i, int n) {
        for (i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;
                }
            }
        }
    }*/
}