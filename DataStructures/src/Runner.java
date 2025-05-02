
public class Runner {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		// TODO Auto-generated method stub
        list.insert(25);
        list.insert(50);
        list.insert(75);
        list.insertAtStart(100);
        list.insertAt(2, 125);
        list.delete(2);
        list.show();
	}

}
