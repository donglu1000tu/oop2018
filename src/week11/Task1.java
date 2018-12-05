package week11;

public class Task1 {
    public static <T extends Comparable<T>> void sort(T[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {

        Byte[] bytes = {1, 4, 3, 2};

        Short[] shorts = {12, 21, 46, 35};

        Integer[] integers = {2, 25, 41, 63};

        Long[] longs = {21L, 32L, 14L, 53L};

        Float[] floats = {1.5f, 12.1f, 42.5f, 31.6f};

        Double[] doubles = {12.6, 21.1, 41.2, 33.1};

        Character[] characters = {'a', 'g', 'c', 'd'};

        System.out.println("Mảng ban đầu: ");

        for (int i = 0; i < bytes.length ; i++) {
            System.out.print(bytes[i]+" ");
        }
        System.out.println();
        sort(bytes);
        System.out.println("Sau khi sắp xếp:");
        for (int i = 0; i < bytes.length ; i++) {
            System.out.print(bytes[i]+" ");
        }
    }
}
