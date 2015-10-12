package FitnessModel;

import BAModel.BA_Node;

public class Fitness_Node extends BA_Node {

	protected double fit;
	
	public Fitness_Node(double[] xy) { 
		super(xy);
	}
	public Fitness_Node(double x, double y) { 
		super(x, y);
	}
	
	@Override
	public int getWireNum() { return (int)(fit * wired.size()); }
	
	public void setFitness(double fit) { this.fit = fit; }
	public double getFitness() { return fit; }

}
