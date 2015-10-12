package FitnessModel;

import java.util.Random;

import BAModel.BA_Node;
import BAModel.NodeManage;

public class FitnessModelManage extends NodeManage {

	double fitDelta;
	int fitCount = 0;
	boolean fitBool = true;
	
	public FitnessModelManage(int distance) {
		super(distance);
		fitDelta = 8 / distance;
	}
	
	@Override
	public void addNewNode() {
		int allwire = 0;
		Random r = new Random();
		BA_Node n = createNode();
		
		for(BA_Node e: allNode) allwire += e.getWireNum();
		for(BA_Node e: allNode) {
			if(r.nextInt(allwire) > (allwire - e.getWireNum())) {
				n.setNode(e);
			}
		}
		
	}
	
	@Override
	public BA_Node createNode() {
		Fitness_Node n = new Fitness_Node(getNext());
		n.setFitness(10 *getNORMDIST(fitDelta * fitCount));
		allNode.add(n);
		fitCount++;
		return n;
	}
	
	private double getNORMDIST(double x) {
		if (fitBool) {
			x = -x;
			fitBool = false;
		} else {
			fitBool = true;
		}
		return (1/Math.sqrt(2*Math.PI))*Math.exp(-1*x*x/2);
	}
}
