/**
	Copyright 2020 Dark Dead Dragon (ak LeonardoDarkVinchi)
	License by GNU GPLv3
*/

package TeCu;

import javax.swing.*;
import java.io.*;
import java.nio.file.*;
import java.util.*; 

public class Task3 {
	
	Task3 (JFrame parent) {
		int tries = 0;
		try {
			Path confFile = Paths.get("Task3Conf.cfg");
			if(!Files.exists(confFile)) { 
				Files.createFile(confFile);
				Files.write(confFile, "0".getBytes());
			}
			List<String> configLine = Files.readAllLines(confFile);
			if (configLine.size() > 0) tries = Integer.parseInt(configLine.iterator().next());
			tries++;
			Files.write(confFile, Integer.toString(tries).getBytes());
			
		} catch (IOException e) {}
		
		if (tries == 3) Toast.makeText(parent, "Time to feed your cat!", 2000).run();
	}
	
	public static void clearToastCount() {
		try {
			Files.delete(Paths.get("Task3Conf.cfg"));
		} catch (IOException e) {}
	}
}

