package containers;
import java.util.*;

public abstract class Container {

	
//		ID of container
		protected int id; 

		
//		Total weight of the container 		
		public static int totalWeight;


public Container(int id2) {
	super();
	this.id = id2;
//	this.totalWeight = totalWeight;
}


public static int getTotalWeight() {
	return totalWeight;
}


public static void setTotalWeight(int totalWeight) {
	Container.totalWeight = totalWeight;
}

		
}
