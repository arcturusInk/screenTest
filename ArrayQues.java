package com.company;

/*Given this array [2,4,1,3], reverse the array and echo out a string that has each element
separated by a colon in any language of your choice (expected output: “3:1:4:2”).*/

//Time Complexity: O(n)
public class ArrayQues {

    public static String reverseArr (int[] arr){
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < arr.length; ++i){
            if(arr[arr.length-i-1] == arr[0]){
                str.append(arr[arr.length-i-1]);
            }else{
                str.append(arr[arr.length-i-1]);
                str.append(":");
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        int[] arr = {2,4,1,3};

        System.out.print(reverseArr(arr));
    }
}
