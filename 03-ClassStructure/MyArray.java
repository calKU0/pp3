import java.util.ArrayList;
import java.util.List;

public class MyArray {
    static int even(int[] array)
    {
        int evenSum = 0;
        for (int i = 0; i <= array.length - 1; i++)
        {
            if (array[i] % 2 == 0)
            {
                evenSum++;
            }
        }
        
        return evenSum;
    }

    static int positiveOdd(int[] array)
    {
        int positiveOddSum = 0;
        for (int i = 0; i <= array.length - 1; i++)
        {
            if (array[i] % 2 == 1 & array[i] > 0)
            {
                positiveOddSum++;
            }
        }
        
        return positiveOddSum;
    }
    
    static int[] reverse(int[] array)
    {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {

            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }

        return array;
    }

    static boolean compare(int[] array1, int[] array2)
    {
        if (array1.length != array2.length)
        {
            return false;
        }

        for (int i = 0; i <= array1.length - 1; i++)
        {
            if (array1[i] != array2[i])
            {
                return false;
            }
        }
        return true;
    }

    static int[] different(int[] array1, int[] array2)
    {
        List<Integer> differenceList = new ArrayList<>();

        List<Integer> array2List = new ArrayList<>();
        for (int num : array2) {
            array2List.add(num);
        }

        for (int num : array1) {
            if (!array2List.contains(num)) {
                differenceList.add(num);
            }
        }

        int[] differenceArray = new int[differenceList.size()];
        for (int i = 0; i < differenceList.size(); i++) {
            differenceArray[i] = differenceList.get(i);
        }

        return differenceArray;
    }

    static boolean exists(int [] array, int number)
    {
        List<Integer> arrayList = new ArrayList<>();
        if (arrayList.contains(number))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static int secondMax(int[] array)
    { 
        int[] newArray = new int[array.length-1];
        List<Integer> arrayList = new ArrayList<>();
        arrayList.remove(Integer.valueOf(maxValue(array)));
        for (int i = 0; i < arrayList.size(); i++) {
            newArray[i] = arrayList.get(i);
        }

        return maxValue(newArray);
    }

    static int maxValue(int[] array)
    { 
        int maxValue = array[0];
        for (int i = 0; i <= array.length - 1; i++)
        {
            for (int z = 1; z <= array.length - 1; z++)
            {
                if (array[i] > array[z] & array[i] > maxValue)
                {
                    maxValue = array[i];
                }
            }
        }
        return maxValue;
    }
}


