package DataStructure;

import java.util.Arrays;

public class Array {
    private int[] arr = new int[]{};
    private int count = 0;
    Array(int len){
        arr = new int[len];
    }

    public void insert(int item){
        if(count == arr.length){
            arr = Arrays.copyOf(arr, arr.length * 2);
        }
        arr[count++] = item;
    }

    public int length(){
        return arr.length;
    }

    public void removeAt(int index){
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();

        for(int i = index ; i < count ; i++){
            if(i+1 == arr.length)
                break;
            arr[i] = arr[i+1];
        }
        count--;
    }

    public int indexOf(int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number)
                return i;

        }

        return -1;
    }

    public void print(){
        for(int i = 0 ; i <count ; i++)
            System.out.println(arr[i]);
    }
}
