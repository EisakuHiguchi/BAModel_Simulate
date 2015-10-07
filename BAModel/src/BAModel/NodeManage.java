package BAModel;

import java.util.ArrayList;

public class NodeManage {

	double x,y;
	double distance;
	int len;
	ArrayList<Node> allNode;
	
	public NodeManage() {
		allNode = new ArrayList<>();
		x = 0;
		y = 10;
		distance = 10;
		len = 0;
		init();
	}
	
	public void createNode() {
		if(x < len * distance) {
			x = x + distance;
		} else {
			len++;
			y = y + distance;
			x = 0;
		}
		allNode.add(new Node(x, y));
	}
	
	private void init() {
		for(int i = 0; i < 4; i++) {
			createNode();
		}
		for(int i = 0; i < 4; i++) {
			Node n1 = allNode.get(i);
			for(int j = 0; j < 4; j++) {
				Node n2 = allNode.get(j);
				if(i != j) n1.setNode(n2);
			}
		}
	}
	
	public ArrayList<Node> getAllNode() { return allNode; }
	
}
