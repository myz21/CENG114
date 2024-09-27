
public class Node {
	final double value; 
	final Node[] child; //child array objesi ve node türünde değişken tutuyor

	Node(double value) {
		this.value = value;
		this.child = null;
	}
	
	Node(Node[] child) {
		this.value = 0;
		this.child = child;
	}
	
	double getSum() 
	{
		double sum = 0;
		
		if (child == null) 
			sum += value; 
		else
		{		
			for (Node node : child) {
				sum += node.getSum();
			}
		}
		
		
		return sum;
	}
	
	// students will add:  getMax(),   getMin(),  getProduct()
	public double getMax()
	{
		double max = Double.NEGATIVE_INFINITY;
		
		if(child == null)
			max = Math.max(value, max);

		else
			for (Node node : child) {
			max = Math.max(node.getMax(), max);
			}	
				
		
		return max;
	}
	
	public double getMin()	
	{
		double min = Double.POSITIVE_INFINITY;
		
		if(child == null)
			min = Math.min(value,min);

		else
			for	(Node node : child){
				min = Math.min(min,node.getMin());
			}
		return min;	
	}
	 
	public double getProduct()
	{
		double product = 1;

		if(child == null)
			product*=value;
		else
			for(Node node : child){
				product*=node.getProduct();
			}
		return product;	
	}
	
	// students will add:  toString()
	
	//override yazmak önemli
	@Override
	public String toString()
	{
		String empty = "";

		if(child == null)
			empty = empty + "{" + value + "}" + " ";

		else 
			for(Node node: child){
				empty = empty + node.toString();
			}	
		return empty;
	}
/*
	*/
}
