/**
	Copyright 2020 Dark Dead Dragon (ak LeonardoDarkVinchi)
	License by GNU GPLv3
*/

package TeCu;
import TeCu.*;

import java.io.*;
import java.awt.*;

public class ZaycevTest {
	
	public static void main(String[] args) {
		Console console = System.console();
        if(console == null && !GraphicsEnvironment.isHeadless()){
			try {
				Runtime.getRuntime().exec(new String[]{"cmd","/c","start","cmd","/k","java -jar \"TaskZaycev.jar\""});
			} catch (Exception ex) {}
			System.exit(0);
		}
		new AppWindow().show();
	}
}
