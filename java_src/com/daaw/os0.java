package com.daaw;
/* loaded from: classes.dex */
public class os0 {

    /* renamed from: a */
    public boolean f21912a;

    /* renamed from: b */
    public boolean f21913b;

    /* renamed from: c */
    public boolean f21914c;

    /* renamed from: d */
    public boolean f21915d;

    public os0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f21912a = z;
        this.f21913b = z2;
        this.f21914c = z3;
        this.f21915d = z4;
    }

    /* renamed from: a */
    public boolean m14021a() {
        return this.f21912a;
    }

    /* renamed from: b */
    public boolean m14020b() {
        return this.f21914c;
    }

    /* renamed from: c */
    public boolean m14019c() {
        return this.f21915d;
    }

    /* renamed from: d */
    public boolean m14018d() {
        return this.f21913b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof os0) {
            os0 os0Var = (os0) obj;
            return this.f21912a == os0Var.f21912a && this.f21913b == os0Var.f21913b && this.f21914c == os0Var.f21914c && this.f21915d == os0Var.f21915d;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r0 = this.f21912a;
        int i = r0;
        if (this.f21913b) {
            i = r0 + 16;
        }
        int i2 = i;
        if (this.f21914c) {
            i2 = i + 256;
        }
        return this.f21915d ? i2 + 4096 : i2;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f21912a), Boolean.valueOf(this.f21913b), Boolean.valueOf(this.f21914c), Boolean.valueOf(this.f21915d));
    }
}
