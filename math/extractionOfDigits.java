import java.util.*;

public class extractionOfDigits {

    public static void main(String[] args) {
        extractDigits(1445);
        extractDigitsUsingStack(1445);
        extractDigitsUsingArrayList(1445);
        extractDigitsUsingRecursion(1445);
        extractDigitsUsingStringConversion(1445);
    }

    static void extractDigits(final int startValue) {
        int remainingValue = startValue;
        while (remainingValue > 0) {
            final int digit = remainingValue % 10;
            System.out.print(digit + " ");
            remainingValue = remainingValue / 10;
        }
        System.out.println();
    }

    static void extractDigitsUsingStack(final int startValue) {
        Stack<Integer> stackList = new Stack<>();
        int remainingValue = startValue;
        while (remainingValue > 0) {
            stackList.push(remainingValue % 10);
            remainingValue = remainingValue / 10;
        }
        Iterator<Integer> iter = stackList.iterator();
        while (iter.hasNext())
            System.out.print(stackList.pop());

        System.out.println();
    }

    static void extractDigitsUsingArrayList(final int startValue) {
        ArrayList arrayList = new ArrayList<>();
        int remainingValue = startValue;
        while (remainingValue > 0) {
            arrayList.add(remainingValue % 10);
            remainingValue = remainingValue / 10;
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