package Programs;

public class ThisKeyword {
int a;
	void App(ThisKeyword tk) {
		System.out.println(tk.a);
	}

	void show() {
		App(this);
	
	}
	public static void main(String... args){
		
		ThisKeyword tt=new ThisKeyword();
		tt.a=6;
		tt.show();
		
	}
}
