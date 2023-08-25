package com.daaw;
/* loaded from: classes.dex */
public final class jj8 extends Exception {

    /* renamed from: p */
    public final int f15139p;

    /* renamed from: q */
    public final boolean f15140q;

    /* renamed from: r */
    public final f92 f15141r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jj8(int i, int i2, int i3, int i4, f92 f92Var, boolean z, Exception exc) {
        super("AudioTrack init failed " + i + " Config(" + i2 + ", " + i3 + ", " + i4 + ")" + r0, exc);
        String str = true != z ? "" : " (recoverable)";
        this.f15139p = i;
        this.f15140q = z;
        this.f15141r = f92Var;
    }
}
