package BAModel;

public class BAModel_Main {

	public static void main(String[] args) {
		String path = "C:\\\\work\\\\Data\\\\";
		NodeManage nm = new NodeManage();
		WriteWire ww = new WriteWire();
		
		int loop = 10;
		for(int i = 0; i < loop; i++) {
			nm.addNewNode();
		}
		ww.write(path, nm.getAllNode());
		
		System.out.println("fin");
	}
}
