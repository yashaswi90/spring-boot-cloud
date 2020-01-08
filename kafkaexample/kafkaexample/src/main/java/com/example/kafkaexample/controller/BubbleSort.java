package com.example.kafkaexample.controller;

public class BubbleSort {
    private static int[] inputData = {5, 4, 11, 18, 1, 9};

    public static void main(String[] args) {
        getSortedArray(inputData);
    }
    private static int[] getSortedArray(int[] inputData) {
        for(int i=0;i<inputData.length-1;i++){
            for(int j=i+1;j<inputData.length-1;j++){
                if(inputData[i]>inputData[j]){
                    int temp=inputData[i];
                    inputData[i]=inputData[j];
                    inputData[j]=temp;
                }
            }

        }

        return inputData;
    }

}
