public class Main {

    public static void main(String[] args) {
        String s = "You only live once, but if you do it right, once is enough";
        char kyTu = 'o';
        int count = 0;
        String index = "";
        for (int i = 0; i < s.length(); i++) {
            if (kyTu == s.charAt(i)) {
                index = index + " " + i;
                count++;
            }
        }
        System.out.println("Chuỗi " + "\""+ s + "\"" + " có số ký tự là: " + s.length());
        System.out.println("Số lần xuất hiện ký tự e trong chuỗi " + "\"" + s + "\"" + " là : " + count);
        System.out.println("Ký tự e xuất hiện ở các vị trí index là : " + index);
    }
}
