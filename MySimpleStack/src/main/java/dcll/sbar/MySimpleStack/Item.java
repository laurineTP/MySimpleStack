/**
 * 
 */
package dcll.sbar.MySimpleStack;

/**
 * @author user
 *
 */
public class Item {

	private Object value;
	/**
	 * 
	 */
	public Item(Object value) {
		setValue(value);
	}
	
	private void setValue(Object value2) {
		this.value = value2;		
	}

	public Object getValue() {
		return value;
	}

}
