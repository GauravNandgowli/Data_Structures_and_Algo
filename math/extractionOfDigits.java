import java.util.*;

public class extractionOfDigits {

    public static void main(String[] args) {
        extractDigits(1445);
        extractDigitsUsingStack(1445);
        extractDigitsUsingArrayList(1445);
        extractDigitsUsingRecursion(1445);
        extractDigitsUsingStringConversion(1445);
    }

    static void extractDigits(int value) {

        while (value > 0) {
            int digit = value % 10;
            System.out.print(digit + " ");
            value = value / 10;
        }
        System.out.println();
    }

    static void extractDigitsUsingStack(int value) {
        Stack<Integer> stackList = new Stack<>();
        while (value > 0) {
            stackList.push(value % 10);
            value = value / 10;
        }
        // Iterator: Only forward iteration.
        // Methods:
        // hasNext() - checks if there’s another element.
        // next() - retrieves the next element.
        // remove() - removes the last element returned by the iterator.
        // Iterator<Integer> iterator = arrayList.iterator();
        // while (iterator.hasNext()) {
        // System.out.print(iterator.next() + " ");
        // }
        Iterator<Integer> iter = stackList.iterator();
        while (iter.hasNext())
            System.out.print(stackList.pop() + " ");
        System.out.println();
    }

    static void extractDigitsUsingArrayList(int value) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (value > 0) {
            arrayList.add(value % 10);
            value = value / 10;
        }

        // ListIterator: Forward and backward iteration, plus modification.
        // Methods:
        // hasNext() - checks if there’s another element to move forward.
        // next() - retrieves the next element.
        // hasPrevious() - checks if there’s a previous element.
        // previous() - retrieves the previous element.
        // set() - modifies the last element returned by the iterator.
        // add() - inserts an element into the list at the iterator's current position.
        ListIterator<Integer> iterator = arrayList.listIterator(arrayList.size());
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
        System.out.println();

        // ListIterator<Integer> iterator = arrayList.listIterator(); // Start at the
        // beginning
        // while (iterator.hasNext()) {
        // System.out.print(iterator.next() + " ");
        // }
    }

    static void extractDigitsUsingRecursion(final int startValue) {
        if (startValue == 0)
            return;
        int value = startValue / 10;
        int LastValue = startValue % 10;
        extractDigitsUsingRecursion(value);
        System.out.print(LastValue + " ");

    }

    static void extractDigitsUsingStringConversion(final int startValue) {
        String numberStr = String.valueOf(startValue);
        System.out.println();
        // Print each character of the string (each character is a digit)
        for (int i = 0; i < numberStr.length(); i++) {
            System.out.print(numberStr.charAt(i) + " ");
        }

    }
}