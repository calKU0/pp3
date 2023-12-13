import java.util.ArrayList;
import java.util.List;
/**
 * C1
 */
public class C1 {

    public static int m1(int[] arr1, int[] arr2)
    {
        int sum = 0;
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j)
                {
                    sum += 1;
                }
            
            }
        }
        return sum;
    }

    public static int m2(int[] arr1)
    {
        if (arr1.length == 1 ) return arr1[0];
        int max = arr1[0];
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i : arr1) {
            list.add(i);
        }

        int index = 0;
        int i = 0;
        for (Integer integer : list) {
            if (integer > max)
            {
                index = i;
                max = integer;
            }
            i++;
        }

        list.remove(index);
        int secoundMax = list.get(0);
        for (Integer integer : list) {
            if (integer > max)
            {
                secoundMax = integer;
            }
        }

        return secoundMax;
    }

    public static void main(String[] args) {
    int[] arr2 = {1,2,3,5,6};
    int[] arr1 = {1,7,4,5};
    System.out.println(C1.m1(arr1, arr2));
    System.out.println(C1.m2(arr1));
    }
}