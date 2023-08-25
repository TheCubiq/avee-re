package com.daaw;

import java.security.MessageDigest;
/* loaded from: classes.dex */
public class yu0 implements hi0 {
    public final String a;
    public final hi0 b;

    public yu0(String str, hi0 hi0Var) {
        this.a = str;
        this.b = hi0Var;
    }

    @Override // com.daaw.hi0
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.a.getBytes("UTF-8"));
        this.b.a(messageDigest);
    }

    @Override // com.daaw.hi0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        yu0 yu0Var = (yu0) obj;
        return this.a.equals(yu0Var.a) && this.b.equals(yu0Var.b);
    }

    @Override // com.daaw.hi0
    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
