package SortingProject;

public class QuickSort {
    public static <T extends Comparable<T>> void sort(T[] a){
        sort(a, 0, a.length-1);
    }
    
    private static <T extends Comparable<T>> void sort(T[] a, int start, int end){
        int i=start-1;
        int j=start;

        int pivot = end;

        while(j < pivot){
            if(a[j].compareTo(a[pivot]) < 0){
                swap(a, ++i, j++);
            }
            else{
                j++;
            }
        }
        swap(a, ++i, pivot);

        if((i-1)-start > 0){
            sort(a, start, i-1);
        }

        if(end-(i+1) > 0){
            sort(a, i+1, end);
        }
    }

    private static <T> void swap(T[] a, int b, int c){
        T temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }
}
