package org.example;

public class Task {

    public static int getSum(int[] arr, int n){
        int  tot =1;
        for(int i = 0; i<n;i++){
            tot = tot * arr[i];
        }
        System.out.println("SUM is :"+tot);
        return tot;

    }
    public  static void main(String[] args){
        int[] arr = {1,3};
        int n = arr.length;

        int sum = getSum(arr, n);
        if(sum % 2  == 0){
            System.out.println("sum is even");

        }else{
            System.out.println("sum is odd");
        }


    }



}
