package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = nums1.length;
        int n = nums2.length;
        int itt = n;
        for (int i = 0; i < n; i++) {
            nums1[itt] = nums2[i];
            itt++;
        }
        System.out.println(Arrays.toString(nums1));
    }
}
