package com.letters.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ConfigWindow extends AbstractWindow {
	private static ConfigWindow instance = new ConfigWindow();

	public static ConfigWindow getInstance() {
		return instance;
	}

	@Override
	public void initComponents() {
		JButton btn = new JButton("config");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.prevWin(MainWindow.getInstance());
			}
		});
		add(btn);
	}

}
