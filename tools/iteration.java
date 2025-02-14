// Method references in the code:

// --------------- Iterator Methods ---------------

// 1. ArrayList constructor: new ArrayList<>(Arrays.asList(...)) 
//    - Creates an ArrayList with the given elements.

// 2. iterator(): Returns an Iterator for the list (iter1 = arr1.iterator())
//    - Obtains an iterator that can be used to traverse the list in a forward direction.

// 3. hasNext(): Checks if there is a next element in the forward iteration (iter1.hasNext())
//    - Returns true if the iterator has more elements to iterate over.

// 4. next(): Returns the next element in the iteration (iter1.next())
//    - Retrieves and advances to the next element in the iteration.

// 5. remove(): Removes the last element returned by next() (not used in your code)
//    - Removes the element that was last accessed by next().

// --------------- ListIterator Methods ---------------

// 6. listIterator(): Returns a ListIterator for the list (iter2 = arr2.listIterator(arr2.size()))
//    - Obtains a ListIterator for the list, optionally starting at a specific position (here, the end of the list).

// 7. hasPrevious(): Checks if there is a previous element in the backward iteration (iter2.hasPrevious())
//    - Returns true if the iterator has previous elements when iterating backward.

// 8. previous(): Returns the previous element in the iteration (iter2.previous())
//    - Retrieves and moves the iterator to the previous element in the iteration.

// 9. add(E e): Adds an element before the next element (not used in your code)
//    - Inserts the specified element into the list at the position of the iterator.

// 10. set(E e): Replaces the last element returned by next() or previous() (not used in your code)
//     - Replaces the last element returned by the iterator with the specified element.

// 11. remove(): Removes the last element returned by next() or previous() (not used in your code)
//     - Removes the last element that was returned by the next() or previous() methods.

import java.util.*;

public class iteration {

    public static void main(String[] args) {

        // to print in forward
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Iterator iter1 = arr1.iterator();
        while (iter1.hasNext()) {
            System.out.print(iter1.next() + " ");
        }
        System.out.println();

        // to print in reverse/backward
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ListIterator<Integer> iter2 = arr2.listIterator(arr2.size());
        while (iter2.hasPrevious()) {
            System.out.print(iter2.previous() + " ");
        }
    }
}