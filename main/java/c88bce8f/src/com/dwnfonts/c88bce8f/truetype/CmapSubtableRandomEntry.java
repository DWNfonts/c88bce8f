package com.dwnfonts.c88bce8f.truetype;

public class CmapSubtableRandomEntry extends CmapSubtableEntry {
	public int[] glyphIndex = new int[0];
	
	@Override
	public int getGlyphIndex(int charCode) {
		return glyphIndex[charCode - startCharCode];
	}
}
