package JavaAdvance;

public class EmplyeeTest {

	public static void main(String[] args) {

		Employee employee = new Employee(); // for method

		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e2.setFirstName("Yar Zar");
		e2.setLastName("Htun");
		e2.setSalary(6000.0);

		employee.display(e1);
		employee.display(e2);
		e2.raiseSalary(0.10);
		e1.raiseSalary(0.10);
		System.out.println("\n----After  10% raise-----");
		employee.display(e1);
		employee.display(e2);

	}

}

class Employee {

	String firstName, lastName;
	double m_salary;

	public Employee() {
		this.firstName = "Ye";
		this.lastName = "Maung";
		this.m_salary = 1000;

	}

	public void display(Employee e) {
		System.out.println("First Name -" + e.getFirstName() + "\nLast Name -" + e.getLastName() + "\nMonthly Salary -"
				+ e.getMonthlySalary() + "\nYearly Salary -" + e.getYearlySalary());
	}

	public void setFirstName(String name) {
		this.firstName = name;
	}

	public void setLastName(String name) {
		this.lastName = name;
	}

	public void raiseSalary(double percent) {

		this.m_salary = this.m_salary + (this.m_salary * percent);

	}

	public void setSalary(double salary) {
		if (salary > 0)
			this.m_salary = salary;
		else
			this.m_salary = 0.0;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public double getMonthlySalary() {
		return this.m_salary;
	}

	public double getYearlySalary() {
		return this.m_salary * 12;
	}

}
