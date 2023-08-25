package com.daaw;

import java.security.MessageDigest;
import java.util.Objects;
/* loaded from: classes.dex */
public class bh1 implements hi0 {

    /* renamed from: a */
    public final String f4794a;

    public bh1(String str) {
        Objects.requireNonNull(str, "Signature cannot be null!");
        this.f4794a = str;
    }

    @Override // com.daaw.hi0
    /* renamed from: a */
    public void mo3222a(MessageDigest messageDigest) {
        messageDigest.update(this.f4794a.getBytes("UTF-8"));
    }

    @Override // com.daaw.hi0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f4794a.equals(((bh1) obj).f4794a);
    }

    @Override // com.daaw.hi0
    public int hashCode() {
        return this.f4794a.hashCode();
    }

    public String toString() {
        return "StringSignature{signature='" + this.f4794a + "'}";
    }
}
