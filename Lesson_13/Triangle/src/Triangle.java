public class Triangle {
    public void checkTriangle(double a, double b, double c) throws MyExceptions {
        if (a < 0) throw new MyExceptions("Độ dài của cạnh thứ nhất được nhỏ hơn 0");
        if (b < 0) throw new MyExceptions("Độ dài của cạnh thứ hai được nhỏ hơn 0");
        if (c < 0) throw new MyExceptions("Độ dài của cạnh thứ ba không được nhỏ hơn 0");

        if (a + b > c && a + c > b && c + b > a) {
            if (a * a == (b * b + c * c) || b * b == (a * a + c * c) || c * c == (a * a + b * b)) {
                if (a == b || b == c || c == a) {
                    System.out.println("Ba cạnh bạn vừa nhập hợp thành một tam giác vuông cân.");
                } else {
                    System.out.println("Ba cạnh bạn vừa nhập hợp thành một tam giác cân.");
                }
            } else if (a == b && a == c) {
                System.out.println("Ba cạnh bạn vừa nhập hợp thành một tam giác đều.");
            } else if (a == b || b == c || c == a) {
                System.out.println("Ba cạnh bạn vừa nhập hợp thành một tam giác cân.");
            } else if (a * a > (b * b + c * c) || b * b > (a * a + c * c) || c * c > (a * a + b * b)) {
                System.out.println("Ba cạnh bạn vừa nhập hợp thành một tam giác tù.");
            } else
                System.out.println("Ba cạnh bạn vừa nhập hợp thành một tam giác nhọn.");
        } else {
            System.out.println("Ba cạnh bạn vừa nhập không hợp thành một tam giác.");
        }
    }
}
//
//



