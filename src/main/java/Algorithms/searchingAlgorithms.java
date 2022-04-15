package Algorithms;

public class searchingAlgorithms {

    public int linearSearch(int[] arr , int target){
        int numberOfTry = 0;
        for(int i = 0 ; i<arr.length ;i++){
            if(arr[i] == target){
                return numberOfTry;
            }
            numberOfTry++;
        }

        return -1;
    }

    public int binarySearch(int[] arr , int target){
        int low = 0 ;
        int high = arr.length - 1;
        int numberOfTry = 0 ;
        while(low <= high){
            int middle = low +(high-low) /2;
            if(arr[middle] == target){
                System.out.println(arr[middle]);
                return numberOfTry;
            }
            if(arr[middle] >= target){
                high = middle -1;
            }
            if(arr[middle] <= target){
                low = middle + 1;
            }
            numberOfTry++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[100_000_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(new searchingAlgorithms().binarySearch(arr , 999_919));
    }
}
