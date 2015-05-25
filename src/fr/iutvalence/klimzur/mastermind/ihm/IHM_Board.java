package fr.iutvalence.klimzur.mastermind.ihm;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class IHM_Board extends JPanel {

	public IHM_Board(){
		JLabel nomDuTitre = new JLabel("                  Welcome on");
		this.add(nomDuTitre);
		JLabel suiteDuTitre = new JLabel("the MasterMind");
		this.add(suiteDuTitre);
		JLabel textNamePlayer = new JLabel("       Name of Player 1:");
		this.add(textNamePlayer);
		JTextPane namePlayer = new JTextPane();
		this.add(namePlayer);
		JButton buttonOK = new JButton("OK");
		this.add(buttonOK);
		JLabel round = new JLabel("Round :");
		this.add(round);
		this.setLayout(new GridLayout(9, 6));
		for (int i = 2; i < 9; i++){
			JLabel label = new JLabel(" " + String.valueOf(i-1)+"  ");
			for (int j = 0; j < 4; j++){
				JButton button = new JButton();
				button.setBackground(Color.WHITE);
				this.add(button);				
			}
			this.add(label);
			JPanel verification = new JPanel();
			JPanel test1 = new JPanel();
			test1.setBackground(Color.RED);
			verification.add(test1);
			JPanel test2 = new JPanel();
			test2.setBackground(Color.RED);
			verification.add(test2);
			JPanel test3 = new JPanel();
			test3.setBackground(Color.RED);
			verification.add(test3);
			JPanel test4 = new JPanel();
			test4.setBackground(Color.RED);
			verification.add(test4);
			this.add(verification);
			
		}
		for(int i=0; i<4; i++){
			JLabel nothing = new JLabel();
			this.add(nothing);
		}
		JButton validation = new JButton("OK");
		this.add(validation);
	}
	
}
