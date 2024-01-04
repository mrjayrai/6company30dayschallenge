class Solution {
    public static int[] smallestTrimmedNumbers(String[] nums, int[][] q) {
        if(nums == null) {
            return new int[]{};
        }
        int[] res = new int[q.length];
        int strLen = nums[0].length();
        for(int i = 0; i < q.length; i++) {
            String[] copyNum = Arrays.copyOf(nums, nums.length);
            for(int j = 0; j < copyNum.length; j++) {
               copyNum[j] =  copyNum[j].substring(copyNum[j].length() - q[i][1]);
            }
            Node[] nodes = new Node[copyNum.length];
            for(int index = 0; index < nodes.length; index++) {
                nodes[index] = new Node(index, copyNum[index]);
            }
            Arrays.sort(nodes, (a,b) -> a.val.equals(b.val) ? a.index - b.index : a.val.compareTo(b.val));
            res[i] = nodes[q[i][0] - 1].index;


        }
        return res;
    }
    static class Node {
        int index;
        String val;
        Node(int index, String val) {
            this.index = index;
            this.val = val;
        }
    }

}
