package com.daaw;
/* loaded from: classes2.dex */
public final class ax7 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ String f4093p;

    /* renamed from: q */
    public final /* synthetic */ String f4094q;

    /* renamed from: r */
    public final /* synthetic */ Object f4095r;

    /* renamed from: s */
    public final /* synthetic */ long f4096s;

    /* renamed from: t */
    public final /* synthetic */ p28 f4097t;

    public ax7(p28 p28Var, String str, String str2, Object obj, long j) {
        this.f4097t = p28Var;
        this.f4093p = str;
        this.f4094q = str2;
        this.f4095r = obj;
        this.f4096s = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4097t.m13709M(this.f4093p, this.f4094q, this.f4095r, this.f4096s);
    }
}
