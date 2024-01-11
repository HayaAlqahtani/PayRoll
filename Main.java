public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(44, "Haya Alqahtani", "Manager", 3000);

        System.out.println("Employee ID: " + employee1.getEmployeeId());
        System.out.println("Name: " + employee1.getName());
        System.out.println("Position: " + employee1.getPosition());
        System.out.println("Basic Salary: KWD" + employee1.getBasicSalary());
    
    Employee employee = new Employee(44, "Haya Alqahtani", "Manager", 3000);
    SalaryCalc calculator = new SalaryCalc(employee);

    double overtimeHours = 5;
    double bonus = 2000;
    double deductions = 500;

    double totalSalary = calculator.calculateTotalSalary(overtimeHours, bonus, deductions);
       System.out.println("Total Salary for " + employee1.getName() + ": KWD" + totalSalary);
       Employee employee2 = new Employee(45, "Awdah Alazmi", "Assistant", 1500);
        PaymentHistoryTracker paymentTracker = new PaymentHistoryTracker(employee2);

        paymentTracker.recordPayment(5500, "Direct Deposit");
        paymentTracker.recordPayment(2000, "Check");

        paymentTracker.displayPaymentHistory();
    }

}


