package com.dwnfonts.c88bce8f.edit.importer;

import com.dwnfonts.c88bce8f.FontImporter;
import com.kreative.unicode.data.GlyphList;

public interface PSFEncodingSelectionImporter {
	public FontImporter<?> createImporter(GlyphList low, GlyphList high, int puaBase);
}
