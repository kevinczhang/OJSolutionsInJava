package P81_100.P88_Merg_Ssorted_Array;

/**
 * Created by czhang on 1/4/2017.
 */
public class Solution {
    public void merge(int nums1[], int m, int nums2[], int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i > -1 && j > -1){
            nums1[k--] = (nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        }
        while (j > -1){
            nums1[k--] = nums2[j--];
        }
    }
}
