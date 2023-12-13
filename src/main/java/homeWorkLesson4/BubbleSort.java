package homeWorkLesson4;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {31, 566, 89, 9, 90, -1};
        // сортування без while
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        for (int num : intArray) {
            System.out.print(num + " ");
        }
    }
}
