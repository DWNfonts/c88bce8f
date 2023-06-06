package com.dwnfonts.c88bce8f.edit;

import javax.swing.JFrame;
import com.dwnfonts.c88bce8f.BitmapFont;
import com.dwnfonts.c88bce8f.BitmapFontGlyph;

public class BitmapEditFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private final BitmapEditPanel panel;
	private final BitmapEditMenuBar mb;
	
	public BitmapEditFrame(BitmapFont font, GlyphLocator<BitmapFontGlyph> locator, GlyphList<BitmapFontGlyph> gl, SaveManager sm) {
		this.panel = new BitmapEditPanel(locator, gl);
		this.mb = new BitmapEditMenuBar(this, sm, font, panel);
		setTitle(locator.toString());
		setJMenuBar(mb);
		setContentPane(panel);
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		panel.getGlyphComponent().requestFocusInWindow();
	}
}
