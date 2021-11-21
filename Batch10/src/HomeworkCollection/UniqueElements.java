package HomeworkCollection;

import com.sun.source.tree.Tree;
import com.sun.source.util.Trees;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class UniqueElements {

    /* Create one method takes one int array. This methods need to print
   all unique elements from array ascending order.
           Input: [2,3,4,4,7,2,1]
   Output: 1, 2, 3, 4, 7 */

    public static void uniqueElements(int[] array) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();//unique element
        for (int i = 0; i < array.length; i++) {
            treeSet.add(array[i]);
        }
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {

            System.out.print(iterator.next()+",");
        }
    }

    public static void main(String[] args) {
int [] array= {2,3,4,4,7,2,1};
uniqueElements(array);

    }
}