package com.daaw;
/* loaded from: classes.dex */
public final class pj8 extends Exception {

    /* renamed from: p */
    public final int f22995p;

    /* renamed from: q */
    public final boolean f22996q;

    /* renamed from: r */
    public final f92 f22997r;

    public pj8(int i, f92 f92Var, boolean z) {
        super("AudioTrack write failed: " + i);
        this.f22996q = z;
        this.f22995p = i;
        this.f22997r = f92Var;
    }
}
