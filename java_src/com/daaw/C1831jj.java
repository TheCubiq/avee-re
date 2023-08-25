package com.daaw;

import com.daaw.da1;
import com.daaw.tq0;
/* renamed from: com.daaw.jj */
/* loaded from: classes.dex */
public final class C1831jj implements tq0.InterfaceC3111b {

    /* renamed from: a */
    public final long f15124a;

    /* renamed from: b */
    public final int f15125b;

    /* renamed from: c */
    public final long f15126c;

    /* renamed from: d */
    public final int f15127d;

    /* renamed from: e */
    public final long f15128e;

    public C1831jj(long j, long j2, yq0 yq0Var) {
        long mo8871b;
        this.f15124a = j2;
        this.f15125b = yq0Var.f33947c;
        this.f15127d = yq0Var.f33950f;
        if (j == -1) {
            this.f15126c = -1L;
            mo8871b = -9223372036854775807L;
        } else {
            this.f15126c = j - j2;
            mo8871b = mo8871b(j);
        }
        this.f15128e = mo8871b;
    }

    @Override // com.daaw.tq0.InterfaceC3111b
    /* renamed from: b */
    public long mo8871b(long j) {
        return ((Math.max(0L, j - this.f15124a) * 1000000) * 8) / this.f15127d;
    }

    @Override // com.daaw.da1
    /* renamed from: e */
    public boolean mo6932e() {
        return this.f15126c != -1;
    }

    @Override // com.daaw.da1
    /* renamed from: g */
    public da1.C1068a mo6931g(long j) {
        long j2 = this.f15126c;
        if (j2 == -1) {
            return new da1.C1068a(new fa1(0L, this.f15124a));
        }
        int i = this.f15125b;
        long m10003m = sq1.m10003m((((this.f15127d * j) / 8000000) / i) * i, 0L, j2 - i);
        long j3 = this.f15124a + m10003m;
        long mo8871b = mo8871b(j3);
        fa1 fa1Var = new fa1(mo8871b, j3);
        if (mo8871b < j) {
            long j4 = this.f15126c;
            int i2 = this.f15125b;
            if (m10003m != j4 - i2) {
                long j5 = j3 + i2;
                return new da1.C1068a(fa1Var, new fa1(mo8871b(j5), j5));
            }
        }
        return new da1.C1068a(fa1Var);
    }

    @Override // com.daaw.da1
    /* renamed from: h */
    public long mo6930h() {
        return this.f15128e;
    }
}
