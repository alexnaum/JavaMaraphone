package sprint3;
import java.util.Arrays;
import java.util.Comparator;

public class Sprint3_1 {
    public static void main(String[] args){
        int[][] mas = {{6,2,8,7},
                {2,4},
                {9,3},
                {1,2,5},
                {6,1,5},
                {5}};
         int[] mas1 = {2,5,6,1,9,4,5};
        MyUtils m = new MyUtils();
        for(int i=0; i<mas.length;i++) {
            System.out.println(Arrays.toString(m.arrSort(mas)[i]));
        }
    }
}

class MyUtils {
    // Code
    public int[][] arrSort(int[][] arr) {
        // Code
       Arrays.sort(arr, new Comparator<int[]>() {
           @Override
           public int compare(int[] o1, int[] o2) {
               if(o2[0]==o1[0]) return o1[1]-o2[1];
               else
               return o2[0]-o1[0];
           }
       });
        return arr;
    }
    public int[] arrOneSort(int[] arr){
        //for(int i=0; i<arr.length; i++){
            Arrays.sort(arr);
            /*for(int j=arr.length-1; j>i; j--){
                if(arr[j-1]>arr[j]){
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }*/
          //  }
        return arr;
    }
}