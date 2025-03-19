// Q5 -->
// ArrayList Operations
// Remove Spevific Index | Sort | Sum

import java.util.ArrayList;
import java.util.Collections;

public class Q5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.remove(2); // Remove element at index 2

        Collections.sort(list); // Sort the list

        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        System.out.println("Sorted List: " + list);
        System.out.println("Sum of elements: " + sum);
    }
}
