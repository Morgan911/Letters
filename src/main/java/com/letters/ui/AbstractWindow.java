package com.letters.ui;

import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import com.letters.ui.controller.INextableFrame;
import com.letters.ui.controller.INextableListener;
import com.letters.ui.controller.WindowsController;

public abstract class AbstractWindow extends JFrame implements INextableFrame{
	static WindowsController controller = new WindowsController();
	List<INextableListener> listeners = new ArrayList<>();
	
	public AbstractWindow(){	
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 initComponents();
	     pack();
	     setLocationRelativeTo(null);
	     if (!(getContentPane().getLayout() instanceof GridBagLayout))
             getContentPane().setLayout(new GridBagLayout());
	     setVisible(false);
	}
	public abstract void initComponents();

	public void addNextableListener(INextableListener l) {
		listeners.add(l);
	}

	public void removeNextableListener(INextableListener l) {
		listeners.remove(l);
	}

	public INextableListener[] getNextableListeners() {
		return (INextableListener[]) listeners.toArray();
	}
}
