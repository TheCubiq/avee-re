package com.daaw;
/* loaded from: classes.dex */
public final class q52 extends nz8 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q52(final w09 w09Var, int i, long j, long j2) {
        super(r1, r2, r3, 0L, r7, j, j2, r13, Math.max(6, w09Var.f30774c));
        long j3;
        kz8 kz8Var = new kz8() { // from class: com.daaw.n52
            @Override // com.daaw.kz8
            /* renamed from: a */
            public final long mo15520a(long j4) {
                return w09.this.m6600b(j4);
            }
        };
        p52 p52Var = new p52(w09Var, i, null);
        long m6601a = w09Var.m6601a();
        long j4 = w09Var.f30781j;
        int i2 = w09Var.f30775d;
        if (i2 > 0) {
            j3 = ((i2 + w09Var.f30774c) / 2) + 1;
        } else {
            int i3 = w09Var.f30772a;
            long j5 = 4096;
            if (i3 == w09Var.f30773b && i3 > 0) {
                j5 = i3;
            }
            j3 = (((j5 * w09Var.f30778g) * w09Var.f30779h) / 8) + 64;
        }
    }
}
