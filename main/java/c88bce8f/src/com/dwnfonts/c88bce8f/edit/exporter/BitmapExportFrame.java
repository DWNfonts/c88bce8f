package com.dwnfonts.c88bce8f.edit.exporter;

import javax.swing.JFrame;
import com.dwnfonts.c88bce8f.BitmapFont;

public class BitmapExportFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private final BitmapExportPanel panel;
	
	public BitmapExportFrame(BitmapFont font) {
		this.panel = new BitmapExportPanel(font);
		setTitle("Export");
		setContentPane(panel);
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
