package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 3, 0, 4, 5, 0};
        int arr_len = arr.length;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == 0) {
                for (int p = arr.length - 2; p >= index; --p) {
                    arr[p + 1] = arr[p];
                }
                index++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
//public class Main {
//    public static void main(String[] args) {
//        int arr[] = {1, 0, 2, 3, 0, 4, 5, 0};
//        int arr_len = arr.length - 1;
//        int zeroes = 0;
//        for (int x = 0; x <= arr_len; x++) {
//            if (arr[x] == 0) {
//                zeroes++;
//            } else continue;
//        }
//        int i = 0;
//        while (i < arr.length) {
//            if (arr[i] == 0) {
//                for (int p = arr_len; p >= i; p--) {
//                    arr[p + 1] = arr[p];
//                    i++;
//                    i++;
//                }
//            } else {
//                i++;
//            }
//
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}