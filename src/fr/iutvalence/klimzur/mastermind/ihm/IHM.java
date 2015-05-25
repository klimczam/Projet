package fr.iutvalence.klimzur.mastermind.ihm;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;


public class IHM extends JFrame{
	
	public IHM(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setTitle("Mastermind");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		IHM_Board board = new IHM_Board();
		frame.getContentPane().add(board);
		
		
		
		
		
		
//		frame.add(button());
		//frame.getContentPane();
//		GridLayout gl = new GridLayout(3, 2);
//		frame.setLayout(gl);
//		gl.setHgap(5); 
//		gl.setVgap(5); 
		//frame.getContentPane().add();
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

	