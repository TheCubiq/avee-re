package com.daaw;

import java.util.Map;
/* loaded from: classes2.dex */
public final class br5 implements Runnable {

    /* renamed from: p */
    public final vo5 f5072p;

    /* renamed from: q */
    public final int f5073q;

    /* renamed from: r */
    public final Throwable f5074r;

    /* renamed from: s */
    public final byte[] f5075s;

    /* renamed from: t */
    public final String f5076t;

    /* renamed from: u */
    public final Map f5077u;

    public /* synthetic */ br5(String str, vo5 vo5Var, int i, Throwable th, byte[] bArr, Map map, yp5 yp5Var) {
        ry0.m10830j(vo5Var);
        this.f5072p = vo5Var;
        this.f5073q = i;
        this.f5074r = th;
        this.f5075s = bArr;
        this.f5076t = str;
        this.f5077u = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5072p.mo3947a(this.f5076t, this.f5073q, this.f5074r, this.f5075s, this.f5077u);
    }
}
