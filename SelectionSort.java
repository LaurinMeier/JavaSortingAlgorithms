package SortingProject;

public class SelectionSort {
    public static <T extends Comparable<T>> void sort(T[] a){
        for(int i=0; i<a.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<a.length; j++){
                if(a[j].compareTo(a[smallest]) < 0){
                    smallest = j;
                }
            }
            swap(a, i, smallest);
        }
    }

    private static <T> void swap(T[] a, int b, int c){
        T temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }
}
