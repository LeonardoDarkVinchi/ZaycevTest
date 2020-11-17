/**
	Copyright 2020 Dark Dead Dragon (ak LeonardoDarkVinchi)
	License by GNU GPLv3
*/

package TeCu;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import TeCu.*;

public class AppWindow extends JFrame {
	
	AppWindow thisFrame = this;
	
	public AppWindow() {
		super("Задачи от зайцев");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); 
		setBounds(100, 150, 200, 296);
		
		FrameMove menuPanel = new FrameMove(this);
		
		JLabel localLabel1 = new JLabel("Запуск: ");
		JButton taskButton1 = new JButton("Задача 1");
		JButton taskButton2 = new JButton("Задача 2");
		JButton taskButton3 = new JButton("Задача 3");
		taskButton3.setEnabled(false);
	
		menuPanel.setLayout(new java.awt.GridLayout(0, 1, 0, 0));
		menuPanel.add(localLabel1);
		menuPanel.add(taskButton1);
		menuPanel.add(taskButton2);
		menuPanel.add(taskButton3);
		
		add(menuPanel);
		
		taskButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramAnonymousActionEvent) {
				Task1.main(null);
			}
		});
		
		taskButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramAnonymousActionEvent) {
				Task2.main(null);
			}
		});
		
		taskButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramAnonymousActionEvent) {
				
			}
		});
		
		setVisible(true);
		Task3 onStartTask = new Task3(this);
	}
}