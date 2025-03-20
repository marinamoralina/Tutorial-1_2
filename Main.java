public class  Main {

    public static int[] filterEvenIndexOddValue(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }
        int[] result = new int[array.length];
        int resultIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] % 2 != 0) {
                result[resultIndex] = array[i];
                resultIndex++;
            }
        }
        return java.util.Arrays.copyOf(result, resultIndex);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] result1 = filterEvenIndexOddValue(arr1);
        System.out.println("Result 1: " + java.util.Arrays.toString(result1));

        int[] arr2 = {2, 3, 4, 5, 6, 7};
        int[] result2 = filterEvenIndexOddValue(arr2);
        System.out.println("Result 2: " + java.util.Arrays.toString(result2));

        int[] arr3 = {7, 8, 9, 10, 11};
        int[] result3 = filterEvenIndexOddValue(arr3);
        System.out.println("Result 3: " + java.util.Arrays.toString(result3));
    }
}

