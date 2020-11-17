/**
	Copyright 2020 Dark Dead Dragon (ak LeonardoDarkVinchi)
	License by GNU GPLv3
*/

package TeCu;

import java.awt.swing.*;
import java.io.*;

public class Task3 {
	
	Task3 (JFrame parent) {
		int tries = 0;
		try {
		  File conf = new File("Task3Conf.cfg");
		  FileWriter myWriter = new FileWriter(conf);
		  if (conf.createNewFile()) {
			System.out.println("File created: " + myObj.getName());
		  } else {
			System.out.println("File already exists.");
		  }
		} catch (IOException e) {}
		
		Toast.makeText(parent, "Time to feed your cat!", 2000).run();
	}
}

