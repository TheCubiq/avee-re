package com.daaw;
/* loaded from: classes.dex */
public final class nj8 extends Exception {
    public nj8(long j, long j2) {
        super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
    }
}
