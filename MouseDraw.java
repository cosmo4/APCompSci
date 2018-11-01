package mousedraw;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class MouseDraw extends JFrame {

	
	JMenuBar mainMenuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("File");
	JMenu boardMenu = new JMenu("BoardColor");
	JMenu penSizeMenu = new JMenu("PenSize");
	JMenuItem newMenuItem = new JMenuItem("New");
	JMenuItem exitMenuItem = new JMenuItem("Exit");
	JMenuItem blkMI = new JMenuItem("Black");
	JMenuItem whtMI = new JMenuItem("White");
	JMenuItem bluMI = new JMenuItem("Blue");
	JMenuItem fineMI = new JMenuItem("Fine");
	JMenuItem smallMI = new JMenuItem("Small");
	JMenuItem medMI = new JMenuItem("Medium");
	JMenuItem lrgMI = new JMenuItem("Large");
	JPanel drawPanel = new JPanel();
	JLabel leftColorLabel = new JLabel();
	JLabel rightColorLabel = new JLabel();
	JPanel colorPanel = new JPanel();
	JLabel[] colorLabel = new JLabel[18];
	Color drawColor, leftColor, rightColor;
	double xPrevious, yPrevious;

	Graphics2D g2D;

	public MouseDraw() {
		setTitle("Artistic Creations by Mr. Warner! October 2018");
		setResizable(false);
		//setSize(1000, 700);// MAKE SURE TO MAKE IT BIGGER THAN COMPONENTS!!!
		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				exitForm(e);
			}
		});
		getContentPane().setLayout(new GridBagLayout());
		
		
		
		setJMenuBar(mainMenuBar);
		fileMenu.setMnemonic('F');
		mainMenuBar.add(fileMenu);
		fileMenu.add(newMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);

		boardMenu.setMnemonic('B');
		mainMenuBar.add(boardMenu);
		boardMenu.add(blkMI);
		boardMenu.add(whtMI);
		boardMenu.add(bluMI);

		penSizeMenu.setMnemonic('P');
		mainMenuBar.add(penSizeMenu);
		penSizeMenu.add(fineMI);
		penSizeMenu.add(smallMI);
		penSizeMenu.add(medMI);
		penSizeMenu.add(lrgMI);

		drawPanel.setPreferredSize(new Dimension(500, 400));
		drawPanel.setBackground(new Color(40, 220, 255));

		GridBagConstraints gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 0;
		gridConstraints.gridheight = 2;
		gridConstraints.insets = new Insets(10, 10, 10, 10);
		getContentPane().add(drawPanel, gridConstraints);

		drawPanel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				drawPanelMousePressed(e);
			}

			private void drawPanelMousePressed(MouseEvent e) {

				if (e.getButton() == MouseEvent.BUTTON1 || e.getButton() == MouseEvent.BUTTON3) {
					xPrevious = e.getX();
					yPrevious = e.getY();
					if (e.getButton() == MouseEvent.BUTTON1) {
						drawColor = leftColor;
					} else {
						drawColor = rightColor;
					}
				}
				//System.out.println("wow yay" + xPrevious + "," + yPrevious);
			}
		});
		
		
		drawPanel.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				drawPanelMouseDragged(e);
			}

			private void drawPanelMouseDragged(MouseEvent e) {
				
				Line2D.Double myLine = new Line2D.Double(xPrevious, yPrevious, e.getX(), e.getY());
				g2D.setPaint(drawColor);
				g2D.draw(myLine);
				xPrevious = e.getX();
				yPrevious = e.getY();
				System.out.println("mouse x, y: " + xPrevious + ',' + yPrevious);
				
			}
		});

		drawPanel.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				drawPanelMouseReleased(e);
			}

			private void drawPanelMouseReleased(MouseEvent e) {
				
				

			}
		});

		leftColorLabel.setPreferredSize(new Dimension(40, 40));
		leftColorLabel.setOpaque(true);
		leftColorLabel.setBackground(Color.black);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 0;
		gridConstraints.anchor = GridBagConstraints.NORTH;
		gridConstraints.insets = new Insets(10, 5, 10, 10);
		getContentPane().add(leftColorLabel, gridConstraints);

		rightColorLabel.setPreferredSize(new Dimension(40, 40));
		rightColorLabel.setOpaque(true);
		rightColorLabel.setBackground(Color.WHITE);
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 0;
		gridConstraints.anchor = GridBagConstraints.NORTH;
		gridConstraints.insets = new Insets(10, 5, 10, 10);
		getContentPane().add(rightColorLabel, gridConstraints);

		colorPanel.setPreferredSize(new Dimension(80, 350));
		colorPanel.setBorder(BorderFactory.createTitledBorder("Colors"));
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 1;
		gridConstraints.gridwidth = 2;
		gridConstraints.anchor = GridBagConstraints.NORTH;
		gridConstraints.insets = new Insets(50, 10, 10, 10);
		getContentPane().add(colorPanel, gridConstraints);
		
		pack();
		setLocationRelativeTo(null);
		
		g2D = (Graphics2D) drawPanel.getGraphics();

		colorPanel.setLayout(new GridBagLayout());
		int j = 0;
		for (int i = 0; i < 18; i++) {
			colorLabel[i] = new JLabel();
			colorLabel[i].setPreferredSize(new Dimension(30, 30));
			colorLabel[i].setOpaque(true);
			gridConstraints = new GridBagConstraints();
			gridConstraints.gridx = j;
			gridConstraints.gridy = i - j * 9;
			colorPanel.add(colorLabel[i], gridConstraints);
			if (i == 8) {
				j++;
			}

			colorLabel[i].addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					colorMousePressed(e);
				}

			});

		} // end of for loop
		//Need 3: red, green,blue, cyan, magenta, yellow
		colorLabel[0].setBackground(new Color(255, 102, 102));//lightred
		colorLabel[1].setBackground(new Color(255, 0, 0));//red
		colorLabel[2].setBackground(new Color(153, 0, 0));//darkred
		colorLabel[3].setBackground(new Color(102, 102, 255));//lightblue
		colorLabel[4].setBackground(new Color(0, 0, 255));//blue
		colorLabel[5].setBackground(new Color(0, 0, 153));//darkblue
		colorLabel[6].setBackground(new Color(153, 255, 153));//lightgreen
		colorLabel[7].setBackground(new Color(0, 255, 0));//green
		colorLabel[8].setBackground(new Color(0, 153, 0));//darkgreen
		colorLabel[9].setBackground(new Color(102, 255, 255));//lightcyan
		colorLabel[10].setBackground(new Color(0,255,255));//cyan
		colorLabel[11].setBackground(new Color(0, 153, 153));//darkcyan
		colorLabel[12].setBackground(new Color(255, 102, 255));//lightmagenta
		colorLabel[13].setBackground(new Color(255, 0, 255));//magenta
		colorLabel[14].setBackground(new Color(153, 0, 153));//darkmagenta
		colorLabel[15].setBackground(new Color(255, 255, 128));//lightyellow
		colorLabel[16].setBackground(new Color(255, 255, 0));//yellow
		colorLabel[17].setBackground(new Color(153, 153, 0));//darkyellow
		
		

		leftColor = colorLabel[0].getBackground();
		leftColorLabel.setBackground(leftColor);
		rightColor = colorLabel[10].getBackground();
		rightColorLabel.setBackground(rightColor);

	}// end of mousedraw();

	private void bkgrdColor(MouseEvent e) {
		public void actionPeformed(ActionEvent e)
	}
	
	private void exitForm(WindowEvent e) {

		g2D.dispose();
		System.exit(0);
		;

		newMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newMenuItemActionPerformed(e);
				
			}

			private void newMenuItemActionPerformed(ActionEvent e) {
				int response;
				response = JOptionPane.showConfirmDialog(
					null, "Are you sure you want to start a new Drawing?",
					"New Drawing",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
				if(response == JOptionPane.YES_OPTION)
				{
					g2D.setPaint(drawPanel.getBackground());
					g2D.fill(new Rectangle2D.Double(0, 0, drawPanel.getWidth(),
							drawPanel.getHeight()));
				}

			}

		});
		
		
		exitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exitMenuItemActionPerformed(e);

			}

			private void exitMenuItemActionPerformed(ActionEvent e) {
				int response;
				response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit the program?",
						"Exit Program", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (response == JOptionPane.NO_OPTION) {
					return;
				} else {
					exitForm(null);
				}

			}

		});

	}
	
	

	private void colorMousePressed(MouseEvent e) {

		Component clickedColor = e.getComponent();
		// Toolkit.getDefaultToolkit().beep();
		if (e.getButton() == MouseEvent.BUTTON1) {
			leftColor = clickedColor.getBackground();
			leftColorLabel.setBackground(leftColor);
		} else if (e.getButton() == MouseEvent.BUTTON3) {
			rightColor = clickedColor.getBackground();
			rightColorLabel.setBackground(rightColor);
		}
	}// end of colorMousePressed

}// end of class
