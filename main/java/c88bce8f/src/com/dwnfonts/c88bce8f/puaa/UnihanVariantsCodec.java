package com.dwnfonts.c88bce8f.puaa;

import java.util.Arrays;

public class UnihanVariantsCodec extends AbstractUnihanCodec {
	public UnihanVariantsCodec() {
		super(
			"Unihan_Variants.txt",
			Arrays.asList(
				"kSemanticVariant",
				"kSimplifiedVariant",
				"kSpecializedSemanticVariant",
				"kSpoofingVariant",
				"kTraditionalVariant",
				"kZVariant"
			)
		);
	}
}
