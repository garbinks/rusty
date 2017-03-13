public class MyStackProgram {

	public static void main(String[] args) {
		
		Stack myStack = new Stack(25);
		
		for (int i = 0; i < 50; i++) {
			myStack.push(Integer.toString(i));
		}
		
		myStack.printStack();
	}
}