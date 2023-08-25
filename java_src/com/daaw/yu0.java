package com.daaw;

import java.security.MessageDigest;
/* loaded from: classes.dex */
public class yu0 implements hi0 {

    /* renamed from: a */
    public final String f34100a;

    /* renamed from: b */
    public final hi0 f34101b;

    public yu0(String str, hi0 hi0Var) {
        this.f34100a = str;
        this.f34101b = hi0Var;
    }

    @Override // com.daaw.hi0
    /* renamed from: a */
    public void mo3222a(MessageDigest messageDigest) {
        messageDigest.update(this.f34100a.getBytes("UTF-8"));
        this.f34101b.mo3222a(messageDigest);
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
        return this.f34100a.equals(yu0Var.f34100a) && this.f34101b.equals(yu0Var.f34101b);
    }

    @Override // com.daaw.hi0
    public int hashCode() {
        return (this.f34100a.hashCode() * 31) + this.f34101b.hashCode();
    }
}
