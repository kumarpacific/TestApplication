package threadExamples;

import java.util.ArrayList;
import java.util.List;

public class Machine {

	public static void main(String[] args) {

		List<EmpData> li = new ArrayList<>();

		EmpData emp1 = new EmpData(1, "EMP1", li);

		UserThread ut = new UserThread(emp1);

		Thread d1 = new Thread(ut);

		d1.setName("EMP1");

		d1.start();
		
		EmpData emp2 = new EmpData(2, "EMP2", li);

		UserThread ut2 = new UserThread(emp2);

		Thread d2 = new Thread(ut2);

		d2.setName("EMP2");

		d2.start();

	}

}
