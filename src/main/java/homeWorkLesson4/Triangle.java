package homeWorkLesson4;

public class Triangle {
    public static void main(String[] args) {

        int rows = 5;
        int maxL = rows * 2 - 1;

        for (int i = 1; i <= rows; i++) {

            int countOfPoint = i * 2 - 1;
            int countOfSpace = (maxL - countOfPoint) / 2;

            for (int j = 1; j <= countOfSpace; j++) {
                System.out.print(" ");
            }

            int q = 1;
            while (q <= countOfPoint) {
                System.out.print("*");
                q++;
            }
            System.out.println();
        }
    }
}

