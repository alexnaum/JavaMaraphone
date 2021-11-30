package sprint3;
import java.util.Arrays;
import java.util.Comparator;

public class Sprint3 {

    int[][] mas1 = {{1,2,3},{1,4},{3,2},{3,3,5}};
    public static int[] mas2 = {1,4,7,2,0,5,3};
    public int[][] arrSortMAs1(int[][] arr){
        for(int i=0; i<arr.length; i++)
            for(int j=0; j<arr[i].length;j++){

            }
        return arr;
    }
    public int[] arrSortMas2(int[] arr){
        for(int i=0; i<arr.length-1;i++)
            for(int j=arr.length-1; j>i; j--){
                if(arr[j-1]>arr[j]){
                    int tmp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=tmp;
                }
            }
        //System.out.println(arr);
        return arr;
    }
    public static void main(String[] args){
        Sprint3 sp3 = new Sprint3();
        for(int i=0; i<mas2.length; i++ ){
            System.out.println(sp3.arrSortMas2(mas2)[i]);
        }
    }
}
