package com.dwnfonts.c88bce8f.puaa;

import java.io.PrintWriter;
import java.util.Scanner;
import com.dwnfonts.c88bce8f.truetype.PuaaTable;

public abstract class PuaaCodec implements Comparable<PuaaCodec> {
	public abstract String getFileName();
	public abstract String[] getPropertyNames();
	public abstract void compile(PuaaTable puaa, Scanner in);
	public abstract void decompile(PuaaTable puaa, PrintWriter out);
	
	@Override
	public final int compareTo(PuaaCodec that) {
		return this.getFileName().compareTo(that.getFileName());
	}
}
