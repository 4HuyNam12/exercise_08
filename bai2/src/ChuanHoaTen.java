import java.util.Scanner;

public class ChuanHoaTen {
    public static String inputName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên của bạn");
        String name = sc.nextLine();
        System.out.println("Tên của bạn trước khi chuẩn hóa là:" + name);
        return name;
    }

    public static String chuanHoa(String name) {
        name = name.trim().toLowerCase();
        name = name.replaceAll("\\s+", " ");
        return name;
    }

    public static String chuanHoaTenRieng(String name) {
        name =chuanHoa(name);
        String temp[]=name.split(" ");
        name ="";
        for (int i = 0; i < temp.length; i++) {
            name += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i< temp.length-1) {
                name+=" ";
            }
        }
        return name;
    }
}
