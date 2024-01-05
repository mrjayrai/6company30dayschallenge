class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
         int num = arr.length;

        int[] result = new int[2];

        // Find the duplicate number
        for (int i = 0; i < num; i++) {
            if (arr[Math.abs(arr[i]) - 1] > 0) {
                arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
            } else {
                result[0] = Math.abs(arr[i]);
            }
        }

        // Find the missing number
        for (int i = 0; i < num; i++) {
            if (arr[i] > 0) {
                result[1] = i + 1;
                break;
            }
        }

        return result;
    }
    
    
}
