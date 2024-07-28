package arraylist;

public class ArrayList<T> {

	private final int DEFAULT_SIZE = 10;
	private int currentItem = 0;
	private T arList[];

	@SuppressWarnings("unchecked")
	public ArrayList() {
		
		arList = (T[]) new Object[DEFAULT_SIZE];
	}// end empty-argument constructor

	@SuppressWarnings("unchecked")
	public ArrayList(int length) {
		arList = (T[]) new Object[length];

	}// end preferred constructor

	public boolean addItem(T item) {

		if (currentItem >= arList.length) {
			return false;
		}
		arList[currentItem] = item;
		currentItem++;
		return true;

	} // end addItem

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < currentItem; i++) {
			sb.append(arList[i].toString());
			if (i < currentItem -1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	} //end toString


}// end class
