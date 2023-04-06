package Home_Work_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));

        SelectionSort(arr); 
        for (int i : arr)                      System.out.print(i + " ");
        System.out.println(" ");
        mergeSort(arr,0, arr.size() - 1);
        for (int i = 0; i < arr.size(); i++)   System.out.print(arr.get(i) + " ");
        
    }

    public static List<Integer> SelectionSort(List<Integer> arr){
        int length = arr.size();
        for (int i = 0; i < length - 1; i++) {
            int minNum = i;
            for (int j = i + 1; j < length; j++)   if(arr.get(j) < arr.get(minNum))    minNum = j;    
            int temp = arr.get(minNum);
            arr.set(minNum, arr.get(i));
            arr.set(i, temp);
        }
        return arr;
    }

    

    public static void mergeSort(ArrayList<Integer> arr, int left, int right) {
        if (left < right) { 
            int mid = (left + right) / 2; 
            mergeSort(arr, left, mid); 
            mergeSort(arr, mid + 1, right); 
            merge(arr, left, mid, right); 
        }
    }

    public static void merge(ArrayList<Integer> arr, int left, int mid, int right) {
        ArrayList<Integer> temp = new ArrayList<Integer>(arr);
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (temp.get(i) <= temp.get(j))    arr.set(k++, temp.get(i++));  
            else                               arr.set(k++, temp.get(j++)); 
        }
        while (i <= mid) arr.set(k++, temp.get(i++)); 
        while (j <= right) arr.set(k++, temp.get(j++)); 
    }
}
