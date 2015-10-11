package DataPlot;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import BAModel.BA_Node;


public class DataPlot extends JPanel {	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<BA_Node> n;
	
	public DataPlot(){
		super();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		if(n != null) {
			this.setLayout(null);
			Graphics2D g2 = (Graphics2D)g.create();
			g2.setStroke(new BasicStroke(3f));
			g2.setPaint(Color.black);			

			for(BA_Node e: n) {
				ArrayList<BA_Node> wire = e.getNode();
				JLabel p = new JLabel();
				double[] np = e.getPoint();

				p.setForeground(Color.BLACK);
				p.setText("Åú");
				p.setBounds((int)np[0] - 7,
						(int)np[1] - 10, 20, 20);
				this.add(p);

				for(BA_Node u: wire) {
					double[] loc = u.getPoint();
					g2.drawLine((int)np[0], (int)np[1], (int)loc[0], (int)loc[1]);
				}
			}
			g2.dispose();
		}
	}
	
	public void drawBANode(ArrayList<BA_Node> n) {
		this.n = n;
		repaint();
	}
	

}
