package oy.tol.tra;

public class Algorithms {
    public static <T extends Comparable<T>> void sort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    swap(array, i, j);
                }
            }
        }
    }

    public static <T> void reverse(T[] array) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            swap(array, i, j);
            i++;
            j--;
        }
    }

    private static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <T extends Comparable<T>> int binarySearch(T aValue, T [] fromArray, int fromIndex, int toIndex) {
        // TODO: you will implement this in step 2 below.
        if (toIndex >= fromIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;

            if (fromArray[mid].compareTo(aValue) == 0) {
                return mid; // Element found
            } else if (fromArray[mid].compareTo(aValue) > 0) {
                return binarySearch(aValue, fromArray, fromIndex, mid - 1); // Search in left half
            } else {
                return binarySearch(aValue, fromArray, mid + 1, toIndex); // Search in right half
            }
        }


        return -1;
     }
}


