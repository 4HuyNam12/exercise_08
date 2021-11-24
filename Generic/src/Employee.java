import java.text.DecimalFormat;

public abstract class Employee {
    int id;
    String name;
    int age;
    long basicSalary;

    public Employee() {
    }

    public Employee(int id, String name, int age, long basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public abstract long calculatorSalary();

    public String formatMoney(long money) {
        DecimalFormat myformat = new DecimalFormat("###,###,###");
        return myformat.format(money);
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + age + " - " + formatMoney(basicSalary);
    }

}

