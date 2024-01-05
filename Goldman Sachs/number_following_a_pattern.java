class Solution{
    static String printMinNumberForPattern(String S){
        int n = S.length() + 1;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        int index = 0;

        for (int i = 0; i < n; i++) {
            stack.push(i + 1);

            if (i == n - 1 || S.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    result[index++] = stack.pop();
                }
            }
        }

        // Convert the result array to a string
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            sb.append(num);
        }

        return sb.toString();
    }
}
