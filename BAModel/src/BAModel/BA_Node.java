package BAModel;

import java.util.ArrayList;

public class BA_Node {
	
	ArrayList<BA_Node> wired;
	double[] point;
	
	public BA_Node(double x, double y) {
		init();
		setPoint(x,y);
	}
	
	public BA_Node(double[] xy) {
		init();
		setPoint(xy[0], xy[1]);
	}
	
	private void init() {
		wired = new ArrayList<>();
		point = new double[2];
	}
	
	public void setPoint(double x, double y) { point[0] = x; point[1] = y; }
	public void setNode(BA_Node n) { wired.add(n); }
	public double[] getPoint() { return point; }
	public ArrayList<BA_Node> getNode() { return wired; }
	public int getWireNum() { return wired.size(); }
	
}
