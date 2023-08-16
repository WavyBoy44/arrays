import java.util.*;
public class Arrays {
    public static void main(String[] args){
        int[] sums = {1, 2, 3, 4, 5};

        int[] arr = toPower(5, 2);
        System.out.println("Output from toPower method");
        for(int num : arr){
            System.out.print(num + " ");
        }

        System.out.println("\n\nOutput from sums array");
        System.out.print(sum(sums));
    }

    //1.
    public static int sum(int[] nums){
        int total = 0;
        for(int num : nums){
            total += num;
        }
        return total;

    }

    //2. the program finds the maximum number in the array.
    //   Also, the program prints out the index in which the max number was found.


    //3.
    public static int[] toPower(int size, int power){
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = (int)Math.pow(i, power);
        }
        return arr;
    }


}
