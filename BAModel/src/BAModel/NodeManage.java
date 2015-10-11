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
		y = 0;
		distance = 10;
		len = 1;
		init();
	}
	
	public void createNode() {
		
		x += distance;
		y += distance;
		allNode.add(new Node(x, y));
		
		for(int i = 1; i < len; i++) {
			allNode.add(new Node(x, y - i*distance));
			allNode.add(new Node(x - i*distance, y));
		}
		len++;
	}
	
	private void init() {
		int loop = 3;
		for(int i = 0; i < loop; i++) {
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
