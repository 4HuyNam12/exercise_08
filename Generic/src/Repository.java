import java.util.ArrayList;

public class Repository {
    ArrayList<Waiter> listWaiters;
    ArrayList<Kitchen> listKitchens;

    public ArrayList<Waiter> getAllWaiter() {
        listWaiters = new ArrayList<>();
        listWaiters.add(new Waiter(1, "Nguyễn Thị A", 28, 6000000, 2000000));
        listWaiters.add(new Waiter(2, "Nguyễn Thị B", 20, 6200000, 1000000));
        listWaiters.add(new Waiter(4, "Nguyễn Văn C", 40, 9000000, 5000000));
        return listWaiters;
    }

    public ArrayList<Kitchen> getAllKitchen() {
        listKitchens = new ArrayList<>();
        listKitchens.add(new Kitchen(1, "Nguyễn Văn A ", 35, 10000000, 1500000));
        listKitchens.add(new Kitchen(2, "Nguyễn Văn B", 30, 15000000, 6000000));
        listKitchens.add(new Kitchen(3, "Nguyễn Thị C", 19, 5000000, 1200000));
        return listKitchens;
    }

    public void printList(ArrayList<? extends Employee> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
