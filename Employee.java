public class Employee {

  public String name;
  public double salary;

  public Employee(String employeeName, double currentSalary) {
    name = employeeName;
    salary = currentSalary;
  }

  public String getName() {
    return name;
  }
  
  public double getSalary() {
    return salary;
  }

  public void raiseSalary(double byPercent) {
    salary *= (1 + byPercent / 100);
  }

}