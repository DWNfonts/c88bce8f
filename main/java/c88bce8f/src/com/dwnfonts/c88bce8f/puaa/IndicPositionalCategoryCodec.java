package com.dwnfonts.c88bce8f.puaa;

import java.util.Arrays;

public class IndicPositionalCategoryCodec extends AbstractCategoryCodec {
	public IndicPositionalCategoryCodec() {
		super(
			"IndicPositionalCategory.txt",
			"Indic_Positional_Category",
			Arrays.asList(
				"Right",
				"Left",
				"Visual_Order_Left",
				"Left_And_Right",
				"Top",
				"Bottom",
				"Top_And_Bottom",
				"Top_And_Right",
				"Top_And_Left",
				"Top_And_Left_And_Right",
				"Bottom_And_Right",
				"Bottom_And_Left",
				"Top_And_Bottom_And_Right",
				"Top_And_Bottom_And_Left",
				"Overstruck"
			)
		);
	}
}
