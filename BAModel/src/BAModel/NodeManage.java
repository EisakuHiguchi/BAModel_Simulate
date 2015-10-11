package BAModel;

import java.util.ArrayList;
import java.util.Random;

public class NodeManage {

	double x,y;
	double distance;
	int len;
	int count;
	ArrayList<double[]> next;
	ArrayList<Node> allNode;
	
	public NodeManage() {
		allNode = new ArrayList<>();
		x = 0;
		y = 0;
		distance = 10;
		len = 0;
		count = 1;
		init();
	}
	
	public void addNewNode() {
		int allwire = 0;
		Random r = new Random();
		Node n = createNode();
		
		for(Node e: allNode) allwire += e.getWireNum();
		for(Node e: allNode) {
			if(r.nextInt(allwire) > (allwire - e.getWireNum())) {
				n.setNode(e);
			}
		}
	}
	
	
	private void nextNodeLocations() {
		next = new ArrayList<>();
		count = 0;
		x += distance;
		y += distance;
		
		setNextLocation(x, y);
		for(int i = 1; i <= len; i++) {
			setNextLocation(x, y - i*distance);
			setNextLocation(x - i*distance, y);
		}
		len++;
	}
	
	private double[] getNext() {
		if(count >= len*2-1) {
			nextNodeLocations();
		}
		count++;
		return next.get(count - 1);
	}
	
	private void setNextLocation(double x, double y) {
		double[] loc = new double[2];
		loc[0] = x;
		loc[1] = y;
		next.add(loc);
	}
	
	public Node createNode() {
		Node n = new Node(getNext());
		allNode.add(n);
		return n;
	}
	
	private void init() {
		for(int i = 0; i < 4; i++) {
			createNode();
		}
		
		for(int i = 0; i < allNode.size(); i++) {
			Node n1 = allNode.get(i);
			for(int j = 0; j < allNode.size(); j++) {
				Node n2 = allNode.get(j);
				if(i != j) n1.setNode(n2);
			}
		}
	}
	public ArrayList<Node> getAllNode() { return allNode; }
	
}
