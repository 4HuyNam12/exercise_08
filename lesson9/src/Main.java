public class Main {

    public static void main(String[] args) {
        Student Hân = new Student();
        Hân.input();
//        System.out.println(Hân.toString());

        Student Yến = new Student();
        Yến.id = 2;
        Yến.ten = "Nguyễn Hoàng Yến";
        Yến.diemLyThuyet = 9.9F;
        Yến.diemThucHanh = 8.8F;
//        System.out.println(Yến.toString());

        Student Nam = new Student(3,"Nguyễn Huy Nam", 9.5F,10);
//        System.out.println(Nam.toString());

        Student[] array = new Student[3];
        array[0]=Hân;
        array[1]=Yến;
        array[2]=Nam;
        for (Student st : array) {
            System.out.println(st);
        }




    }
}
