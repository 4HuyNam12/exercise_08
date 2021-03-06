import java.util.ArrayList;

public class Waiter extends Employee {
    long compensate;

    public Waiter() {
    }

    public Waiter(int id, String name, int age, long basicSalary, long compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    public long getCompensate() {
        return compensate;
    }

    public void setCompensate(long compensate) {
        this.compensate = compensate;
    }

    @Override
    public long calculatorSalary() {
        return (basicSalary + compensate);
    }


    public void printList(ArrayList<Waiter> list) {
        for (Waiter w:list) {
            System.out.println(w);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " - " + formatMoney(compensate) + " - " + formatMoney(calculatorSalary());
    }
}





