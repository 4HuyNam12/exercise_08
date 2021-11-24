import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    int id;
    String ten;
    float diemLyThuyet;
    float diemThucHanh;
    ArrayList<Student> listStudent;
    Scanner sc = new Scanner(System.in);
    public Student() {
    }

    public Student(int id, String ten, float diemLyThuyet, float diemThucHanh) {
        this.id = id;
        this.ten = ten;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }
    public Student input() {
        System.out.println("Nhập id của học viên: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên của học viên: ");
        ten = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết của học viên: ");
        diemLyThuyet = sc.nextFloat();
        System.out.println("Nhập điểm thực hành của học viên: ");
        diemThucHanh = sc.nextFloat();
        sc.nextLine();
        return new Student(id,ten,diemThucHanh,diemLyThuyet);
    }
    public void addStudent() {
        System.out.println("Nhập vào số lượng học viên: ");
        int n = sc.nextInt();
        sc.nextLine();
        listStudent= new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            listStudent.add(i,input());
        }
    }
    public void printList(){
        for (Student student : listStudent) {
            System.out.println(student);
        }
    }

    public Float tinhDiemTrungBinh() {
        return (diemLyThuyet + diemThucHanh) / 2;
    }

    @Override
    public String toString() {
        return id + " - " + ten + " - " + " LT: " + diemLyThuyet + " - " + " TH: " + diemThucHanh + " - " + " TB: " + tinhDiemTrungBinh();
    }

}
