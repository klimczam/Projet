package fr.iutvalence.klimzur.mastermind.ihm;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;


public class IHM {
	
	public IHM(){
		JFrame frame = new JFrame();
		frame.setTitle("Mastermind");
		frame.setSize(800, 600);
//		frame.add(button());
		frame.getContentPane();
		GridLayout gl = new GridLayout(3, 2);
		frame.setLayout(gl);
		gl.setHgap(5); 
		gl.setVgap(5); 
		frame.getContentPane().add(new JButton("1"));
	    frame.getContentPane().add(new JButton("2"));
	    frame.getContentPane().add(new JButton("3"));
	    frame.getContentPane().add(new JButton("4"));
		frame.setVisible(true);
		
		
	}
	
//	private JPanel button(){
//		JPanel panel = new JPanel();
//		JButton bouton1 = new JButton("OK");
//		panel.add(bouton1);
//
//		
//		return panel;
//		
//	}


}

	