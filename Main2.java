public class Main2 {
    public static int findDominant(int[] array) {
            if (array == null || array.length == 0) {
                return -1;
            }

            int n = array.length;
            int candidate = array[0];
            int count = 1;

            for (int i = 1; i < n; i++) {
                if (array[i] == candidate) {
                    count++;
                } else {
                    count--;
                    if (count == 0) {
                        candidate = array[i];
                        count = 1;
                    }
                }
            }

            count = 0;
            for (int num : array) {
                if (num == candidate) {
                    count++;
                }
            }

            if (count > n / 2) {
                return candidate;
            } else {
                return -1;
            }
        }

        public static void main(String[] args) {
            int[] arr1 = {3, 3, 3, 2, 2};
            System.out.println(findDominant(arr1));

            int[] arr2 = {1, 2, 3, 4};
            System.out.println(findDominant(arr2));

            int[] arr3 = {5, 5, 5, 5, 1};
            System.out.println(findDominant(arr3));
        }
    }

