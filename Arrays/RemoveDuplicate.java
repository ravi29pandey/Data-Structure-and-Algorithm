package com.DSA.Arrays;

import java.util.Arrays;

public class RemoveDuplicate {

    public static int[] removeDuplicatesInPlace(int[] data){
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (data[i] == data[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                data[index++] = data[i];
            }
        }

        return Arrays.copyOf(data, index);
    }


    public static void main(String[]args){
        int data[]={1,2,2,3,5};
        removeDuplicatesInPlace(data);

    }
}
