package com.dwnfonts.c88bce8f.edit;

import javax.swing.JFrame;
import com.dwnfonts.c88bce8f.Font;
import com.dwnfonts.c88bce8f.FontGlyph;

public class GlyphEditFrame<G extends FontGlyph> extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private final GlyphEditPanel<G> panel;
	private final GlyphEditMenuBar<G> mb;
	
	public GlyphEditFrame(Class<G> glyphClass, Font<G> font, GlyphLocator<G> locator, GlyphList<G> gl, SaveManager sm) {
		this.panel = new GlyphEditPanel<G>(locator, gl);
		this.mb = new GlyphEditMenuBar<G>(this, sm, font, panel, glyphClass);
		setTitle(locator.toString());
		setJMenuBar(mb);
		setContentPane(panel);
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
