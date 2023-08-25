package com.daaw;

import java.util.Arrays;
import java.util.Objects;
/* renamed from: com.daaw.ww */
/* loaded from: classes.dex */
public final class C3475ww {

    /* renamed from: a */
    public final C0892bx f31593a;

    /* renamed from: b */
    public final byte[] f31594b;

    public C3475ww(C0892bx c0892bx, byte[] bArr) {
        Objects.requireNonNull(c0892bx, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f31593a = c0892bx;
        this.f31594b = bArr;
    }

    /* renamed from: a */
    public byte[] m5756a() {
        return this.f31594b;
    }

    /* renamed from: b */
    public C0892bx m5755b() {
        return this.f31593a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3475ww) {
            C3475ww c3475ww = (C3475ww) obj;
            if (this.f31593a.equals(c3475ww.f31593a)) {
                return Arrays.equals(this.f31594b, c3475ww.f31594b);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f31593a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f31594b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f31593a + ", bytes=[...]}";
    }
}
