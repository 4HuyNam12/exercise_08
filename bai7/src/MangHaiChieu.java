
import java.util.Scanner;

public class MangHaiChieu {
    private static int[][] array;

    public static int[][] creatArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số dòng của mảng");
        int row = sc.nextInt();
        System.out.println("Mời bạn nhập vào số cột của mảng");
        int col = sc.nextInt();
        array = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("\nNhập vào phần tử ở vị trí [%d %d] :", i, j);
                array[i][j] = sc.nextInt();
            }
        }
        return array;
    }

    static void display() {
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void checkArray() {
        if (array.length == array[0].length) {
            System.out.println("Đường chéo chính là: ");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i == j) System.out.print(array[i][j] + " ");
                }
            }
        } else {
            System.out.println("Mảng bạn vừa nhập không có đường chéo chính");
        }
    }
}
