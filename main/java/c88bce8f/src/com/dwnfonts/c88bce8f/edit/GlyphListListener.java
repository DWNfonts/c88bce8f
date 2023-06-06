package com.dwnfonts.c88bce8f.edit;

import com.dwnfonts.c88bce8f.Font;
import com.dwnfonts.c88bce8f.FontGlyph;

public interface GlyphListListener<G extends FontGlyph> {
	public void selectionChanged(GlyphList<G> gl, Font<G> font);
	public void selectionOpened(GlyphList<G> gl, Font<G> font);
	public void metricsChanged(GlyphList<G> gl, Font<G> font);
	public void glyphsChanged(GlyphList<G> gl, Font<G> font);
}
