package com.dwnfonts.c88bce8f;

public interface FontGlyphTransformer<T extends FontGlyph> {
	public T transformGlyph(T glyph);
}
