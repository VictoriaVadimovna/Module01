package com.alevel.module01;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 5, 0, 5};
        System.out.println(findNumber(arr));


    }

    public static int findNumber(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                count++;
            }

        }
        return count;
    }
}