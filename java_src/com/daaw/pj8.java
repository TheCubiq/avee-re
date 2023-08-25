package com.daaw;
/* loaded from: classes.dex */
public final class pj8 extends Exception {
    public final int p;
    public final boolean q;
    public final f92 r;

    public pj8(int i, f92 f92Var, boolean z) {
        super("AudioTrack write failed: " + i);
        this.q = z;
        this.p = i;
        this.r = f92Var;
    }
}
