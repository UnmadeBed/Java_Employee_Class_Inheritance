package Staff;

public abstract class Employee {
    private String name;
    private int NInumber;
    private double salary;


    public Employee(String name, int NInumber, double salary) {
        this.name = name;
        this.NInumber = NInumber;
        this.salary = salary;
    }

        public String getName() {
            return name;
        }

        public int getNInumber() {
            return NInumber;
        }

        public double getSalary() {
            return salary;
        }


        public double raiseSalary(double salaryIncrease){
            salary = this.salary + salaryIncrease;
            return salary;
        }

        public double payBonus() {
            double bonus = this.salary * 0.01;
            return bonus;
        }







}
