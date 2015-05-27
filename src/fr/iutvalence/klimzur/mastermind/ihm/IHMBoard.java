package fr.iutvalence.klimzur.mastermind.ihm;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class IHMBoard extends JPanel implements ActionListener {

	private int i = 0;
	JButton[][] table = new JButton[9][4];
	public IHMBoard(){
		this.setLayout(new GridLayout(9, 6));
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
		
		for (int i = 2; i < 9; i++){
			JLabel label = new JLabel(" " + String.valueOf(i-1)+"  ");
			for (int j = 0; j < 4; j++){
				JButton button = new ColoredButton();
				if (i>2) {
					button.setEnabled(false);
				}
				table[i][j] = button;
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
		validation.addActionListener(this);
		
	}
	
	private List<Color> getLine(int line) {
		int realLine = line + 1;
		List<Color> colors = new LinkedList<Color>();
		/*for (int i = 0; i < 9*6; i++) {
			System.out.printf("%d: %s%n", i, getComponent(i));
		}*/
		for (int col = 0; col < 4; col++) {
			colors.add(this.getComponent(realLine*6+col).getBackground());
		}
		return colors;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println(Arrays.toString(getLine(0).toArray()));
	}





	
}
