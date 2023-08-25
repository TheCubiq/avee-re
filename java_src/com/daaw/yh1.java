package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public abstract class yh1 extends av0 implements th1 {

    /* renamed from: s */
    public th1 f33678s;

    /* renamed from: t */
    public long f33679t;

    @Override // com.daaw.th1
    /* renamed from: a */
    public int mo3753a(long j) {
        return this.f33678s.mo3753a(j - this.f33679t);
    }

    @Override // com.daaw.th1
    /* renamed from: b */
    public long mo3752b(int i) {
        return this.f33678s.mo3752b(i) + this.f33679t;
    }

    @Override // com.daaw.th1
    /* renamed from: c */
    public List<C2099ln> mo3751c(long j) {
        return this.f33678s.mo3751c(j - this.f33679t);
    }

    @Override // com.daaw.th1
    /* renamed from: d */
    public int mo3750d() {
        return this.f33678s.mo3750d();
    }

    @Override // com.daaw.AbstractC2846rc
    /* renamed from: f */
    public void mo3749f() {
        super.mo3749f();
        this.f33678s = null;
    }

    /* renamed from: m */
    public abstract void mo3748m();

    /* renamed from: n */
    public void m3747n(long j, th1 th1Var, long j2) {
        this.f3671q = j;
        this.f33678s = th1Var;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f33679t = j;
    }
}
