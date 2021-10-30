public class Triangle {
    public static void drawTriangle(){
        int hight = 4;
        for (int i = 1; i <= hight; ++i) {
            for (int j = 1; j <= i; ++j)    {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
