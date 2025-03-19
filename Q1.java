// 01 -->
// HASHSET | ADD INT | ITERATE & PRINT


import java.util.HashSet;
import java.util.Iterator;

public class Q1 {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<Integer> nos = new HashSet<>();
        // Add integer elements to the HashSet
        nos.add(10) ;
        nos.add(20) ;
        nos.add(30) ;
        nos.add(40) ;
        nos.add(50) ;
        // Using Iterator to print all elements
        Iterator<Integer> itr = nos.iterator();
        System.out.println("HashSet elements:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
