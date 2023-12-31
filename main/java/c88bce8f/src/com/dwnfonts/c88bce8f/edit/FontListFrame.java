package com.dwnfonts.c88bce8f.edit;

import java.io.File;
import javax.swing.JFrame;
import com.dwnfonts.c88bce8f.Font;
import com.dwnfonts.c88bce8f.FontExporter;

public class FontListFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private final FontListPanel panel;
	
	public FontListFrame(File fontFile, FontExporter<?> format, Font<?>[] fonts) {
		this.panel = new FontListPanel(fontFile, format, fonts);
		setTitle("Open");
		setContentPane(panel);
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
