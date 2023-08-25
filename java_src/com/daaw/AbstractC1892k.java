package com.daaw;
/* renamed from: com.daaw.k */
/* loaded from: classes2.dex */
public abstract class AbstractC1892k {

    /* renamed from: a */
    public boolean f15568a;

    public AbstractC1892k(boolean z) {
        this.f15568a = z;
    }

    /* renamed from: a */
    public final void m18114a(byte[] bArr) {
        if (!this.f15568a || C3419wc.m6195i(bArr) <= 0) {
            mo16087b(bArr);
        } else {
            mo16087b(C3419wc.m6194j(bArr));
        }
    }

    /* renamed from: b */
    public abstract void mo16087b(byte[] bArr);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f15568a == ((AbstractC1892k) obj).f15568a;
    }

    public int hashCode() {
        return 31 + (this.f15568a ? 1231 : 1237);
    }
}
