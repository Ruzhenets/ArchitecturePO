package SRP;

public class MainSRP {
    public static void main(String[] args) {
        Employee employee = new Employee("Vasily");
        ClalucateSalary clalucateSalary = new ClalucateSalary(115, 168);
        System.out.println(employee);
        System.out.println(clalucateSalary.calculateSalary());
    }
}