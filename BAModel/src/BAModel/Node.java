package BAModel;

import java.util.ArrayList;

public class Node {
	
	ArrayList<Node> wired;
	double[] point;
	
	public Node(double x, double y) {
		wired = new ArrayList<>();
		point = new double[2];
		setPoint(x,y);
	}
	
	public void setPoint(double x, double y) { point[0] = x; point[1] = y; }
	public void setNode(Node n) { wired.add(n); }
	public double[] getPoint() { return point; }
	public ArrayList<Node> getNode() { return wired; }
	
}