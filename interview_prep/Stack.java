public class Stack{
	
	int maxSize;
	int top;
	String[] stackArray;
	
	public Stack(int size){
		maxSize = size;
		top = 0;
		stackArray = new String[maxSize];	
	}
	public void printStack() {
		for (int i = 0; i < top; i++) {
			System.out.println(stackArray[i]);
		}
	}
	
	public boolean isEmpty() {
		if (top == 0)
		{
			return true;
		}
		else {
			return false;	
		}	
	}
	
	public void push(String str) {
		if (top < maxSize) {
			stackArray[top] = str;	
			top++;
		}
		else {
			System.out.println("Stack overflow!");
		}
	}
	
	public String pop() {
		if (!this.isEmpty()) {
			String temp = this.peek();
			stackArray[top-1] = null;
			top--;
			return temp;
		}		
		else {
			return null;
		}
	}
	
	
	public String peek() {
		if (!this.isEmpty()) {
			return stackArray[top-1];	
		}
		else {
			return null;
		}
	}
}