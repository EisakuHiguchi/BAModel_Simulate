package BAModel;

import javax.swing.JFrame;

import DataPlot.DataPlot;

public class BAModel_Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static int sizeW = 800;
	public static int sizeH = 800;
	
	public static void main(String[] args) {
		String path = "C:\\\\work\\\\Data\\\\";
		int loop = 2000;
		
		NodeManage nm = new NodeManage(loop);
		WriteWire ww = new WriteWire();
		
		for(int i = 0; i < loop; i++) {
			nm.addNewNode();
		}
		ww.write(path, nm.getAllNode());
		
		JFrame frame = new JFrame();
		frame.setTitle("DataPlot");
		frame.setSize(sizeW, sizeH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		DataPlot dp = new DataPlot();
		dp.drawBANode(nm.getAllNode());
		
		dp.setVisible(true);
		dp.repaint();
		
		frame.getContentPane().add(dp);
		frame.setVisible(true);
		
		System.out.println("fin");
	}
}
