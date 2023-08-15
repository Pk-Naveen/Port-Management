package containers;

public class BasicContainer extends Container {
	
	protected int weight;
	
	public BasicContainer(int id, int weight) {
		// TODO Auto-generated constructor stub
		super(id);
		this.weight=weight;
		this.setTotalWeight(this.getTotalWeight() + weight);
		System.out.println("Basic");
	}

}
