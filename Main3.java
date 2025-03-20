public class Main3 {

        public static int[] rotateArray(int[] array, int positions) {
            if (array == null || array.length == 0 || positions == 0) {
                return array;
            }

            int n = array.length;
            positions = positions % n;

            if (positions < 0) {
                positions = n + positions;
            }

            int[] rotatedArray = new int[n];

            for (int i = 0; i < n; i++) {
                rotatedArray[(i + positions) % n] = array[i];
            }

            return rotatedArray;
        }

        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 4, 5};
            int[] result1 = rotateArray(arr1, 2);
            System.out.println(java.util.Arrays.toString(result1));

            int[] arr2 = {1, 2, 3};
            int[] result2 = rotateArray(arr2, 3);
            System.out.println(java.util.Arrays.toString(result2));
        }
    }

