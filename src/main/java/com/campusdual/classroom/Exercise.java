package com.campusdual.classroom;

import com.campusdual.Utils;

import java.util.Arrays;

public class Exercise {

    public static void main(String[] args) {
        int num = Utils.integer("Type the length of your array: ");
        int[] initializeArray = createAndInitializeArray(num);
        System.out.println(Arrays.toString(initializeArray));
        System.out.println(initializeArray.length);

        showInlineArray(createAndInitializeArray(num));

    }

    public static int[] createAndInitializeArray(int num) {
        int[] myArray = new int[num];
        //int x;

        for (int i = 0; i < num; i++) {
            // x = Utils.integer("Write a an integer greater than zero: ");
            myArray[i] = i + 1;
        }
        return myArray;
    }

    public static void showInlineArray(int[] toShow) {
        for (int i = 0; i < toShow.length; i++) {
            System.out.print(toShow[i]);
            if (i < toShow.length -1) {
                System.out.print(" ");
            }
        }
    }
}
