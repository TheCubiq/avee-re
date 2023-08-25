package com.daaw;
/* loaded from: classes2.dex */
public final class ci8 extends IllegalArgumentException {
    public ci8(int i, int i2) {
        super("Unpaired surrogate at index " + i + " of " + i2);
    }
}
