class Solution {
public int findLength(int[] nums1, int[] nums2) {
 
    List<List<Integer>> subarrays1 = new ArrayList<>();

    for (int i = 0; i < nums1.length; i++) {
        List<Integer> subarray = new ArrayList<>();
        for (int j = i; j < nums1.length; j++) {
            subarray.add(nums1[j]);
            subarrays1.add(new ArrayList<>(subarray));
        }
    }

    int max = Integer.MIN_VALUE;


    for (int i = 0; i < nums2.length; i++) {
        List<Integer> subarray = new ArrayList<>();
        for (int j = i; j < nums2.length; j++) {
            subarray.add(nums2[j]);
            if (subarrays1.contains(subarray)) {
                max = Integer.max(max, subarray.size());
            }
        }
    }


    if (max == Integer.MIN_VALUE) {
        return 0;
    } else {
        return max;
    }
}
}
