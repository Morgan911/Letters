package com.letters.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class MainWindow extends AbstractWindow{

	private static MainWindow instance = new MainWindow();
	
	public static MainWindow getInstance(){
		return instance;
	}
	
	@Override
	public void initComponents() {
		JButton btn = new JButton("main");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.nextWin(ConfigWindow.getInstance());
			}
		});
		add(btn);
	}
	
	public static void main(String args[]){
		
	}

}
