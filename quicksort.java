import java.lang.String;

public class quicksort {
     
    private String array[];
    private int length;
 
    public void sort(String[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        qsort(0, length - 1);
    }
 
    private void qsort(int lo, int hi) {
      if (lo < hi){
         int p = partition(lo, hi);
         qsort(lo, p-1);
         qsort(p+1,hi);
      }
    }

    private int partition(int lo, int hi){
      String pivot = array[hi];
      int i = lo;
      for (int j=lo; j<=(hi-1); j++){
         if (array[j].compareTo(pivot) <= 0){
            swap(i,j);
            i++;
         }

      }
      swap(i,hi);
      return i;
    }
 
    private void swap(int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     
    public static void main(String a[]){
         
        quicksort sorter = new quicksort();
        String[] input = {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog."};
        for (String i:input){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        sorter.sort(input);
        for(String i:input){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
}