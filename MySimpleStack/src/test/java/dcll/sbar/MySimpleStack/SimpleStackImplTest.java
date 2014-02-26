package dcll.sbar.MySimpleStack;

import org.junit.Assert;

public class SimpleStackImplTest {

	SimpleStack simpleStack;
	
	public void setup() {
		simpleStack = new SimpleStackImpl();
	}
	
	public void test() {
		Assert.assertEquals(true,simpleStack.isEmpty());
		simpleStack.push(new Item(new String("laurine")));
		Assert.assertEquals(false,simpleStack.isEmpty());
		simpleStack.push(new Item(new Integer(42)));
		Assert.assertEquals(2,simpleStack.getSize());
		Assert.assertEquals(42,simpleStack.peek().getValue());
		Assert.assertEquals(2,simpleStack.getSize());
		Assert.assertEquals(42,simpleStack.pop().getValue());
		Assert.assertEquals(1,simpleStack.getSize());
	}
}
