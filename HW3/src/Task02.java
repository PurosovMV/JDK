public class Task02 {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[]{1, 2, 3};
        Integer[] arr2 = new Integer[]{1, 2, 3};

        System.out.println(compareArrays(arr1, arr2));

    }

    public static <T> boolean compareArrays(T[] arr1, T[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!(arr1[i].equals(arr2[i]))) {
                return false;
            }
        }
        return true;
    }
}
