package com.daaw;
/* renamed from: com.daaw.rc */
/* loaded from: classes.dex */
public abstract class AbstractC2846rc {

    /* renamed from: p */
    public int f25115p;

    /* renamed from: e */
    public final void m11441e(int i) {
        this.f25115p = i | this.f25115p;
    }

    /* renamed from: f */
    public void mo3749f() {
        this.f25115p = 0;
    }

    /* renamed from: g */
    public final void m11440g(int i) {
        this.f25115p = (i ^ (-1)) & this.f25115p;
    }

    /* renamed from: h */
    public final boolean m11439h(int i) {
        return (this.f25115p & i) == i;
    }

    /* renamed from: i */
    public final boolean m11438i() {
        return m11439h(Integer.MIN_VALUE);
    }

    /* renamed from: j */
    public final boolean m11437j() {
        return m11439h(4);
    }

    /* renamed from: k */
    public final boolean m11436k() {
        return m11439h(1);
    }

    /* renamed from: l */
    public final void m11435l(int i) {
        this.f25115p = i;
    }
}
