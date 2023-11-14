import java.util.Arrays;
public class MyArrayMain {
    public static void main(String[] args) {
        int[] array1 = {-1,-3,1,2,6,4,6,6,6,8};
        int[] array2 = {-5,-1,3,7,2,8,6};

        System.out.println("Even numbers in array: " + MyArray.even(array1));
        System.out.println("Positive Odd numbers in array: " + MyArray.positiveOdd(array1));

        int[] reversedArray = MyArray.reverse(array1);
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
        
        System.out.println("Are these arrays the same?: " + MyArray.compare(array1, array2));

        int[] differentArray = MyArray.different(array1, array2);
        System.out.println("Different numbers in array: " + Arrays.toString(differentArray));

        System.out.println("Does the number exists in array?: " + MyArray.exists(array1, 2));
        System.out.println("The second max value in array: " + MyArray.secondMax(array1));


    }
}
