package com.daaw;

import java.security.MessageDigest;
import java.util.Objects;
/* loaded from: classes.dex */
public class bh1 implements hi0 {
    public final String a;

    public bh1(String str) {
        Objects.requireNonNull(str, "Signature cannot be null!");
        this.a = str;
    }

    @Override // com.daaw.hi0
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.a.getBytes("UTF-8"));
    }

    @Override // com.daaw.hi0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((bh1) obj).a);
    }

    @Override // com.daaw.hi0
    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "StringSignature{signature='" + this.a + "'}";
    }
}
