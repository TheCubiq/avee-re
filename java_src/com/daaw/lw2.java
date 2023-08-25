package com.daaw;
/* loaded from: classes.dex */
public final class lw2 extends mq2 {

    /* renamed from: d */
    public static final Object f17850d = new Object();

    /* renamed from: b */
    public final long f17851b;

    /* renamed from: c */
    public final long f17852c;

    public lw2(long j, boolean z) {
        this.f17851b = j;
        this.f17852c = j;
    }

    @Override // com.daaw.mq2
    /* renamed from: a */
    public final int mo15854a(Object obj) {
        return f17850d.equals(obj) ? 0 : -1;
    }

    @Override // com.daaw.mq2
    /* renamed from: b */
    public final int mo15853b() {
        return 1;
    }

    @Override // com.daaw.mq2
    /* renamed from: c */
    public final int mo15852c() {
        return 1;
    }

    @Override // com.daaw.mq2
    /* renamed from: d */
    public final kq2 mo15851d(int i, kq2 kq2Var, boolean z) {
        az2.m26587a(i, 0, 1);
        Object obj = z ? f17850d : null;
        long j = this.f17851b;
        kq2Var.f16694a = obj;
        kq2Var.f16695b = obj;
        kq2Var.f16696c = j;
        return kq2Var;
    }

    @Override // com.daaw.mq2
    /* renamed from: e */
    public final lq2 mo15850e(int i, lq2 lq2Var, boolean z, long j) {
        az2.m26587a(i, 0, 1);
        lq2Var.f17631a = this.f17852c;
        return lq2Var;
    }
}
