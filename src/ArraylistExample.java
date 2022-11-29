import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
public class ArraylistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList cars=new ArrayList<>();
		cars.add("mazda");
		cars.add("hyundai");
		cars.add("honda");
		cars.remove("honda");
		Integer a=new Integer(11);
		//cars.add(a);
		//cars.add(new Integer(10));
		Collections.sort(cars);
		System.out.println(cars);
		//System.out.println(cars.getLast());
		
		
		/*LinkedList cars=new LinkedList();
		cars.add("mazda");
		cars.add("hyundai");
		cars.add("honda");
		cars.remove("honda");
		//Integer a=new Integer(11);
		//cars.add(a);
		//cars.add(new Integer(10));
		System.out.println(cars);
		System.out.println(cars.getLast());
		cars.addFirst("tesla");
		System.out.println(cars);
		cars.removeLast();
		cars.removeFirst();
		System.out.println(cars);
		cars.add("ford");
		Collections.sort(cars);
		System.out.println(cars);*/
				
		

	}

}
