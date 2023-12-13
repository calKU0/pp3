import java.util.List;
import java.util.ArrayList;
public class C2 {
    public static boolean m(int[] arr1)
    {
        List<Integer> positive = new ArrayList<Integer>();
        List<Integer> negaive = new ArrayList<Integer>();
        int positiveSum = 0;
        int negaiveSum = 0;
        for (int i : arr1) {
            if (i > 0) {
                positive.add(i);
            }
            else {negaive.add(i);}
        }
        for (Integer integer : negaive) {
            negaiveSum += integer;
        }
        for (Integer integer : positive) {
            positiveSum += integer;
        }
        
        return positiveSum > Math.abs(negaiveSum) ? true : false;
    }
    public static void main(String[] args) {
        int[] arr1 = {9,3,4,-2,-8};
        int[] arr2 = {9,0,2,-7,4,-9,1,-5};
        System.out.println(C2.m(arr1));
        System.out.println(C2.m(arr2));
        }
}
