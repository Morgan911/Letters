package com.letters.ui.controller;

import java.util.ArrayList;
import java.util.List;

public class WindowsController implements INextableListener {
	
	 
    private List<INextableFrame> wins = new ArrayList<INextableFrame>();
 
    public void addFrame(INextableFrame f) {
        wins.add(f);
        f.addNextableListener(this);
    }
 
    public void addFrame(int i, INextableFrame f) {
        wins.add(i, f);
        f.addNextableListener(this);
    }
 
    public void removeFrame(INextableFrame f) {
        int idx = wins.indexOf(f);
        if (idx >= 0) {
            wins.remove(idx).removeNextableListener(this);
        }
    }
 
    public void show(int idx) {
        for (int i = 0; i < wins.size(); i++) {
            wins.get(i).setVisible(i == idx);
        }
    }
 
    public void show(INextableFrame frame) {
        for (INextableFrame f : wins) {
            f.setVisible(f == frame);
        }
    }
 
    public void prevWin(INextableFrame f) {
        int idx = wins.indexOf(f);
        if (idx == 0) {
            show(wins.size() - 1);
        }
        else if (idx > 0) {
            show(--idx);
        }
    }
 
    public void nextWin(INextableFrame f) {
        int idx = wins.indexOf(f);
        if (idx == wins.size() - 1) {
            show(0);
        }
        else if (idx > -1) {
            show(++idx);
        }
    }
}