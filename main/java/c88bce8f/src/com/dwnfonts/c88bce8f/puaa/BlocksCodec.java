package com.dwnfonts.c88bce8f.puaa;

import java.io.PrintWriter;
import java.util.Scanner;
import com.dwnfonts.c88bce8f.truetype.PuaaSubtable;
import com.dwnfonts.c88bce8f.truetype.PuaaSubtableEntry;
import com.dwnfonts.c88bce8f.truetype.PuaaTable;

public class BlocksCodec extends PuaaCodec {
	@Override
	public String getFileName() {
		return "Blocks.txt";
	}
	
	@Override
	public String[] getPropertyNames() {
		return new String[]{"Block"};
	}
	
	@Override
	public void compile(PuaaTable puaa, Scanner in) {
		PuaaSubtable blocks = puaa.getOrCreateSubtable("Block");
		while (in.hasNextLine()) {
			String[] fields = PuaaUtility.splitLine(in.nextLine());
			if (fields == null || fields.length < 2) continue;
			try {
				int[] r = PuaaUtility.splitRange(fields[0]);
				String v = fields[1].trim();
				PuaaSubtableEntry.Single e = new PuaaSubtableEntry.Single();
				e.firstCodePoint = r[0];
				e.lastCodePoint = r[1];
				e.value = v;
				blocks.add(e);
			} catch (NumberFormatException nfe) {}
		}
	}
	
	@Override
	public void decompile(PuaaTable puaa, PrintWriter out) {
		PuaaSubtable blocks = puaa.getSubtable("Block");
		if (blocks == null || blocks.isEmpty()) return;
		for (PuaaSubtableEntry e : blocks) {
			String r = PuaaUtility.joinRange(e);
			String v = e.getPropertyValue(e.firstCodePoint);
			out.println(r + "; " + v);
		}
	}
}
