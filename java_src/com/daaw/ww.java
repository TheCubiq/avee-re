package com.daaw;

import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public final class ww {
    public final bx a;
    public final byte[] b;

    public ww(bx bxVar, byte[] bArr) {
        Objects.requireNonNull(bxVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.a = bxVar;
        this.b = bArr;
    }

    public byte[] a() {
        return this.b;
    }

    public bx b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ww) {
            ww wwVar = (ww) obj;
            if (this.a.equals(wwVar.a)) {
                return Arrays.equals(this.b, wwVar.b);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
