import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        ArrayList<Waiter> listWaiters = new ArrayList<>();
        listWaiters.add(new Waiter(1,"Nguyễn Thị A",28,6000000,2000000));
        listWaiters.add(new Waiter(2,"Nguyễn Thị B",20,6200000,1000000));
        listWaiters.add(new Waiter(3,"Nguyễn Thị C",24,7200000,3000000));
        listWaiters.add(new Waiter(4,"Nguyễn Văn D",40,9000000,5000000));
        Kitchen kitchen = new Kitchen();
        ArrayList<Kitchen> listKitchens = new ArrayList<>();
        listKitchens.add(new Kitchen(1,"Nguyễn Văn A ",35,10000000,1500000));
        listKitchens.add(new Kitchen(2,"Nguyễn Văn B",30,15000000,6000000));
        listKitchens.add(new Kitchen(3,"Nguyễn Thị C",19,5000000,1200000));
        listKitchens.add(new Kitchen(4,"Nguyễn Thị D",22,70000000,3000000));
        System.out.println("Quản lý danh sách waiters: ");
        waiter.printList(listWaiters);
        System.out.println("\nQuản lý danh sách kichen: ");
        kitchen.printList(listKitchens);



    }
}






