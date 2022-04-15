package Algorithms;

import java.util.Random;

public class sortingAlgorithms {
    
    private void swap (int[] arr , int a , int b ){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;

    }

    public void bubbleSort(int[] arr){
        for (int i = arr.length-1 ; i>1 ; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]){
                    System.out.println("j:"+j);
                    System.out.println("i:"+i);
                    swap(arr,j,j+1);
                }
            }
        }
    }

    private int partition(int[] arr ,int low , int high){
        // Ex : [1,9,15,5,10,4] pivot --> 4 (the last) element
        int pivot = arr[high];
        //start at low which is the beginning of the arr (the first index == 0 )
        int leftPointer = low;
        // the last index of the arr
        int rightPointer = high;

        while (leftPointer < rightPointer){

            while (arr[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while (arr[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            swap(arr , leftPointer , rightPointer);

        }
        swap(arr , leftPointer , high);
        return leftPointer;
    }

    public void quickSort(int[] arr , int low , int high){
      if(low >= high){return;}
      int pivot = arr[high];

      int leftPointer = partition(arr, low ,high);

      quickSort(arr , low , leftPointer - 1);
      quickSort(arr , leftPointer + 1 , high);

    }

    public void mergeSort(){

    }




    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = {1,9,15,5,10,4};

        new sortingAlgorithms().quickSort(arr , 0 , arr.length-1);
        for (int number:arr) {
            System.out.print(number + " ");
        }


    }

}
