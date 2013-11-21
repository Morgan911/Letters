package com.letters.ui.controller;

public interface INextableFrame {
	void addNextableListener(INextableListener l);
	void removeNextableListener(INextableListener l);
	INextableListener[] getNextableListeners();
	void setVisible(boolean val);
}
