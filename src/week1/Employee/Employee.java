package week1.Employee;

public class Employee {

   private String fullName;
   private double salary;
   private int workHours;
   private int hireYear;


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public Employee(String fullName, double salary, int workHours, int hireYear) {
        setFullName(fullName);
        setSalary(salary);
        setWorkHours(workHours);
        setHireYear(hireYear);
    }

    public double tax(double salary){

        if(salary <= 1000){
            return 0;
        }
        return salary * 0.03;

    }

    public int bonus(int workHours){

        if(workHours <= 40) {
            return 0;
        }
        return (workHours - 40) * 30;

    }

    public double raiseSalary(int hireYear){

        int currentYear = 2021;

        if((currentYear - hireYear) < 10 && (currentYear - hireYear) >=0){

            return salary * 0.05;
        } else if ((currentYear - hireYear) <= 19 && (currentYear - hireYear) >=10){

            return salary * 0.1;
        }else {

            return salary * 0.15;
        }

    }




    public String toString() {
        return "week1.Employee.week1.Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                ", tax=" + tax(salary) +
                ", bonus=" + bonus(workHours) +
                ", raiseSalary=" + raiseSalary(hireYear) +
                ", salaryWithoutTaxWithBonus=" + (salary - tax(salary) + bonus(workHours)) +
                ", totalSalary=" + (salary - tax(salary) + bonus(workHours) + raiseSalary(hireYear)) +
                '}';
    }
}
