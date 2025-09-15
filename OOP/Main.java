public class Main {
    public static void main(String[] args){
        Employee employeeOne = new Employee("John Doe","Kenya",1000,29);
        Employee employeeTwo = new Employee("Jane Doe","Rwanda",2000,28);

        employeeOne.raiseSalary();

        System.out.println(employeeOne.salary);
        System.out.println(employeeTwo.salary);
    }
}
