public class Square {
    public static void drawSquare() {
        int hight =4;
        for (int i = 1; i <= hight; ++i) {
            for (int j = 1; j <= hight; ++j)    {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
