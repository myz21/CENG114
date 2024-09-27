
public class Lab02Test {

	public static void main(String[] args) {

		// create tree
		Node subChildArray1[] = {new Node(-1.0), new Node(5.0), new Node(2.0)};		
		Node subChildArray2[] = {new Node(1.0), new Node(2.0)};
		
		Node child[] = {new Node(-1.0),
						new Node(subChildArray1),
						new Node(7.0),
						new Node(12.0),
						new Node(subChildArray2),
						new Node(5.0)};
		Node root = new Node(child);

		

		System.out.println("Sum = " + root.getSum());
		System.out.println("Product = " + root.getProduct());
		System.out.println("Max = " + root.getMax());
		System.out.println("Min = " + root.getMin());

		System.out.println(root);
	}

}
