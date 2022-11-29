import java.util.HashSet;
import java.util.Scanner;
public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet <String> hash=new HashSet<>();
		hash.add("biology");
		hash.add("ece");
		hash.add("ece");
		hash.add("exemple");
		System.out.println(hash);
		hash.clear();
		boolean isEmpty=hash.isEmpty();
		System.out.println(isEmpty);
		
		/*HashSet employee=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++) {	
		employee.add(sc);
		System.out.println(employee);*/
		
		}

	}


