import java.util.Scanner;

public class Student {
    int id;
    String ten;
    float diemLyThuyet;
    float diemThucHanh;

    public Student() {
    }

    public Student(int id, String ten, float diemLyThuyet, float diemThucHanh) {
        this.id = id;
        this.ten = ten;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id của học viên: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên của học viên: ");
        ten = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết của học viên: ");
        diemLyThuyet = sc.nextFloat();
        System.out.println("Nhập điểm thực hành của học viên: ");
        diemThucHanh = sc.nextFloat();
    }

    public Float tinhDiemTrungBinh() {
        return (diemLyThuyet + diemThucHanh) / 2;
    }

    @Override
    public String toString() {
        return id + " - " + ten + " - " + " LT: " + diemLyThuyet + " - " + " TH: " + diemThucHanh + " - " + " TB: " + tinhDiemTrungBinh();
    }

}
