package javaPrograms;
import java.util.Stack;
public class ReverseStack {
	

	

		static Stack <Character> st = new Stack <>();
		
		public static void reverse(){
			if(st.size()>0){
				char x = st.peek();
						st.pop();
				reverse();
			
				bottom(x);
				
			}
		}
		private static void bottom(char x) {
			
			if(st.isEmpty()){
				st.push(x);
			}else {
				
				char a = st.peek();
				st.pop();
				 bottom(x);
				 st.push(a);
				
			}
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			st.push('a');
			st.push('b');
			st.push('c');
			st.push('d');
			st.push('e');
			st.push('f');
			System.out.println("Stack before revsersal: "+ st);
			reverse();
			System.out.println("Stack after revsersal: ");
			
			System.out.println(st);
		}

}
