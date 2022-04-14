package week09;

import java.util.Arrays;

public class R01_ArraysBinarySearchExample {
    public static void main(String[] args) {

        int[] nums={-5,23,123,654,2344,12345,14421};

        int indexone= Arrays.binarySearch(nums,23);//this statement returns of 23

        System.out.println("indexone = " + indexone);//1

        System.out.println(Arrays.binarySearch(nums,2344));//4

        System.out.println(Arrays.binarySearch(nums,25));//-3

        if (Arrays.binarySearch(nums,12346)>=0){
            System.out.println("12346 is present in Array");
        }else{
            System.out.println("12346 is not on the list");
        }

        int[]numstwo={56,3,-67,100,1000,75};

        Arrays.sort(numstwo);
        System.out.println(Arrays.binarySearch(nums,100));

        System.out.println(Arrays.binarySearch(numstwo,60));
    }
}
