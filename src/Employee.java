import java.util.Scanner;
public class Employee {
	Scanner sc=new Scanner(System.in);
	int employeeId=sc.nextInt();
	float salary=sc.nextFloat();
	public void salary()
	{
		System.out.println("Employee Id:"+" "+employeeId);
		System.out.println("Employee Salary:"+" "+salary);
	}
	public void bonus() {
		System.out.println("Employee Bonus and salary");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
