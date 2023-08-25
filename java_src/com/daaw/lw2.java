package com.daaw;
/* loaded from: classes.dex */
public final class lw2 extends mq2 {
    public static final Object d = new Object();
    public final long b;
    public final long c;

    public lw2(long j, boolean z) {
        this.b = j;
        this.c = j;
    }

    @Override // com.daaw.mq2
    public final int a(Object obj) {
        return d.equals(obj) ? 0 : -1;
    }

    @Override // com.daaw.mq2
    public final int b() {
        return 1;
    }

    @Override // com.daaw.mq2
    public final int c() {
        return 1;
    }

    @Override // com.daaw.mq2
    public final kq2 d(int i, kq2 kq2Var, boolean z) {
        az2.a(i, 0, 1);
        Object obj = z ? d : null;
        long j = this.b;
        kq2Var.a = obj;
        kq2Var.b = obj;
        kq2Var.c = j;
        return kq2Var;
    }

    @Override // com.daaw.mq2
    public final lq2 e(int i, lq2 lq2Var, boolean z, long j) {
        az2.a(i, 0, 1);
        lq2Var.a = this.c;
        return lq2Var;
    }
}
