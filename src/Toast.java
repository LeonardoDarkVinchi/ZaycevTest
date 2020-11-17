/**
	Copyright 2020 Dark Dead Dragon (ak LeonardoDarkVinchi)
	License by GNU GPLv3
*/

package TeCu;

import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import javax.swing.*;


public class Toast extends JFrame implements Runnable {
	int duration;
	
	Toast(Component context, String text, int duration) {
		setType(Type.UTILITY);
		setResizable(false);
		setUndecorated(true);
		setLocationRelativeTo(context);
		
		this.duration = duration;
		
		add(new JLabel(text));
		pack();
	}
	
	public static Toast makeText(Component context, String text, int duration) {
		return new Toast(context, text, duration);
	}
	
	public void _show() {
		
	}
	
	//@Override
	public void run() {
		setVisible(true);
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setVisible(false);
	}
}

