/**
 * 
 */
package dcll.sbar.MySimpleStack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author user
 *
 */
public class SimpleStackImpl implements SimpleStack {

	Stack<Object> wrappedStack = new Stack<Object>();
	
	@Override
	public boolean isEmpty() {
		return wrappedStack.isEmpty();
	}

	@Override
	public int getSize() {
		return wrappedStack.size();
	}

	@Override
	public void push(Item item) {
		wrappedStack.push(item);		
	}

	@Override
	public Item peek() throws EmptyStackException {
		return (Item)wrappedStack.peek();
	}

	@Override
	public Item pop() throws EmptyStackException {
		return (Item)wrappedStack.pop();
	}

}
