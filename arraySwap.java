package com.Generic;
public class arraySwap {
    public static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Before swapping: " + java.util.Arrays.toString(intArray));
        swap(intArray, 0, 4);
        System.out.println("After swapping: " + java.util.Arrays.toString(intArray));

        String[] stringArray = {"hello", "world", "this", "is", "a", "test"};
        System.out.println("Before swapping: " + java.util.Arrays.toString(stringArray));
        swap(stringArray, 0, 5);
        System.out.println("After swapping: " + java.util.Arrays.toString(stringArray));
    }
}

