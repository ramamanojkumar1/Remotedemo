import java.util.Scanner;
public class Programmer extends Employee{
	Scanner sc=new Scanner(System.in);
	float bonus=sc.nextFloat();
	
	public void bonus() {
		salary=salary+bonus;
		System.out.println("Programmer Bonus:"+" "+bonus);
		System.out.println("Programmer Salary;"+" "+salary);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p=new Programmer();
		p.salary();
		p.bonus();
		int employeeId=p.employeeId;
		
		
	}

}
