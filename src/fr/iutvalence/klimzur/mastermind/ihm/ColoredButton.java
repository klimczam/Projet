package fr.iutvalence.klimzur.mastermind.ihm;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ColoredButton extends JButton implements ActionListener {
	private Color[] color = { Color.WHITE, Color.RED, Color.BLUE, Color.GREEN, Color.CYAN, Color.ORANGE, Color.YELLOW, Color.GRAY, Color.PINK};
	private int idx;

	public ColoredButton() {
		idx = 0;
		this.setBackground(color[idx]);
		this.addActionListener(this);
	}

	public int getIdx() {
		return idx;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(idx==8)  idx++;
		idx = (idx + 1) % color.length;
		this.setBackground(color[idx]);

	}
	
	@Override
	public String toString() {
		return this.color[idx].toString();
	}
}
