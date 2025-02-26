package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayTest {
    public static void main(String[] args) {


//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        System.out.println(list);
//        list.remove(0);
//        System.out.println(list);
//        list.set(1,8);
//        System.out.println(list);
//
//        System.out.println(list.get(3));
//        list.clear();
//        System.out.println(list);


        int nums[] = {1, 2,4,6,10};
        int target = 1;
        int low = 0;
        int high = nums.length-1;

        for (int i = 1; low <=high; i++) {
            int mid = low+ (high - low)/2;

            if (nums[mid] == target){
                System.out.println(mid);
                break;
            }
            else if(nums[mid]>target){
                high= mid - 1;
            }else if (nums[mid]<target){
                low = mid+1;
            }
        }

        // Print only the unique elements
//        System.out.println("Array after removing duplicates:");
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

    }
}
