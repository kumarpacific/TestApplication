package threadExamples;

import java.util.ArrayList;
import java.util.List;

public class UserThread implements Runnable {
	EmpData emp;

	List<EmpData> li = new ArrayList<>();
	int e = 1000;

	@Override
	public void run() {
		emp.addtTime(emp.getTime(), e);
		e=e+100;
		System.out.println(emp.getEmpNo()+" : "+emp.getName()+" : " +emp.getTime().get(0));
		}

	public UserThread(EmpData emp) {
		super();
		this.emp = emp;
	}
	

}

class EmpData {
	int empNo;
	String name;
	List time = new ArrayList();

	public EmpData(int empNo, String name, List time) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.time = time;
	}

	public int getEmpNo() {
		return empNo;
	}

	public String getName() {
		return name;
	}

	public List getTime() {
		return time;
	}

	public void addtTime(List time, int e) {
		time.add(e);
	}
	

}