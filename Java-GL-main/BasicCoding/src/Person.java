class Person {
    String empName;
    double annualSalary;
    int year;
    String nationalInsuranceNumber;

    public Person(String empName, double annualSalary, int year, String nationalInsuranceNumber) {
        this.empName = empName;
        this.annualSalary = annualSalary;
        this.year = year;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }


}

class Employee extends Person {

    public Employee(String empName, double annualSalary, int year, String nationalInsuranceNumber) {
        super(empName, annualSalary, year, nationalInsuranceNumber);
    }

    public static void main(String[] args) {

        Person emp = new Person("Reema", 550000.0, 2022, "386346324");
        System.out.println("---------------------------");
        System.out.println("Employee name is: " + emp.empName);
        System.out.println("Annual Salary is: " + emp.annualSalary);
        System.out.println("Starting year is: " + emp.year);
        System.out.println("National insurance number is: " + emp.nationalInsuranceNumber);
    }

}