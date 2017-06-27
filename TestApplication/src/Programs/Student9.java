package Programs;

import Programs.Student8.Student7.Student6;

class Student9 {
	public static void main(String args[]) {
		Student6 st = new Student6();
		// Student8.Student7.Student6 st=new Student8().new Student7().new Student6();
		st.run1();

	}
}

class Student8 {

	static class Student7 {

		static class Student6 {

			void run1() {
				int a = 1, b = 2;
				System.out.println("Student8.Student7.Student6.run1()");
				if (a > b && a == b) {

				}
			}
		}

	}

}
