public class EmployeeTester {

  public static void main(String[] args) {
    
    Employee employee1 = new Employee("Elif Oktay", 50000);

    System.out.println("Employee Name: " + employee1.getName());
    System.out.println("Employee Salary: " + employee1.getSalary());

    employee1.raiseSalary(20);

    System.out.println("Employee Salary After Raise: " + employee1.getSalary());

  }
}