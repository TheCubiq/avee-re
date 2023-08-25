package com.daaw;
/* loaded from: classes2.dex */
public abstract class k {
    public boolean a;

    public k(boolean z) {
        this.a = z;
    }

    public final void a(byte[] bArr) {
        if (!this.a || wc.i(bArr) <= 0) {
            b(bArr);
        } else {
            b(wc.j(bArr));
        }
    }

    public abstract void b(byte[] bArr);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((k) obj).a;
    }

    public int hashCode() {
        return 31 + (this.a ? 1231 : 1237);
    }
}
