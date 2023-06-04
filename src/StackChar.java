
public class StackChar {
	char s[] = new char[10];
	char tos;

	StackChar() {
		tos = (char) -1;
	}

	void push(char value) {
		if (tos == 9) {
			System.out.println("Stack full/Overflow");

		} else {
			s[++tos] = value;
		}
	}

	int pop() {
		if (tos >= 0) {
			System.out.println("Stack Underflow/empty");
			return s[tos--];
		}
		return -1;
	}
	
	public static void main(String a[]) {
		StackChar stkchar = new StackChar();
		//stkchar.push((Character)a);
		
	}

}
