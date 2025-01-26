package SortingProject;

public class BubbleSort {
    public static <T extends Comparable<T>> void sort(T[] a){
        for(int i=0; i<a.length-1; i++){
            for(int j=i; j<a.length-1; j++){
                if(a[j].compareTo(a[j+1]) > 0){
                    swap(a, j, j+1);
                }
            }
        }
    }

    private static <T> void swap(T[] a, int b, int c){
        T temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }
}
