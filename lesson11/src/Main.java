public class Main {

    public static void main(String[] args) {
        Waiter waiter = new Waiter(1, "nam", 20, 15000000, 2000000);
        Kitchen kitchener = new Kitchen(2, "Na", 20, 5000000, 2000000);
        System.out.println("Thông tin waiter:");
        System.out.println(waiter.toString());
        System.out.println("\nThông tin kitchen:");
        System.out.println(kitchener.toString());
    }
}






