package com.daaw;

import com.daaw.of1;
import java.util.Objects;
/* renamed from: com.daaw.t9 */
/* loaded from: classes2.dex */
public final class C3028t9 extends of1.AbstractC2436b {

    /* renamed from: a */
    public final int f27126a;

    /* renamed from: b */
    public final String f27127b;

    /* renamed from: c */
    public final int f27128c;

    /* renamed from: d */
    public final long f27129d;

    /* renamed from: e */
    public final long f27130e;

    /* renamed from: f */
    public final boolean f27131f;

    /* renamed from: g */
    public final int f27132g;

    /* renamed from: h */
    public final String f27133h;

    /* renamed from: i */
    public final String f27134i;

    public C3028t9(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f27126a = i;
        Objects.requireNonNull(str, "Null model");
        this.f27127b = str;
        this.f27128c = i2;
        this.f27129d = j;
        this.f27130e = j2;
        this.f27131f = z;
        this.f27132g = i3;
        Objects.requireNonNull(str2, "Null manufacturer");
        this.f27133h = str2;
        Objects.requireNonNull(str3, "Null modelClass");
        this.f27134i = str3;
    }

    @Override // com.daaw.of1.AbstractC2436b
    /* renamed from: a */
    public int mo9436a() {
        return this.f27126a;
    }

    @Override // com.daaw.of1.AbstractC2436b
    /* renamed from: b */
    public int mo9435b() {
        return this.f27128c;
    }

    @Override // com.daaw.of1.AbstractC2436b
    /* renamed from: d */
    public long mo9434d() {
        return this.f27130e;
    }

    @Override // com.daaw.of1.AbstractC2436b
    /* renamed from: e */
    public boolean mo9433e() {
        return this.f27131f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof of1.AbstractC2436b) {
            of1.AbstractC2436b abstractC2436b = (of1.AbstractC2436b) obj;
            return this.f27126a == abstractC2436b.mo9436a() && this.f27127b.equals(abstractC2436b.mo9431g()) && this.f27128c == abstractC2436b.mo9435b() && this.f27129d == abstractC2436b.mo9428j() && this.f27130e == abstractC2436b.mo9434d() && this.f27131f == abstractC2436b.mo9433e() && this.f27132g == abstractC2436b.mo9429i() && this.f27133h.equals(abstractC2436b.mo9432f()) && this.f27134i.equals(abstractC2436b.mo9430h());
        }
        return false;
    }

    @Override // com.daaw.of1.AbstractC2436b
    /* renamed from: f */
    public String mo9432f() {
        return this.f27133h;
    }

    @Override // com.daaw.of1.AbstractC2436b
    /* renamed from: g */
    public String mo9431g() {
        return this.f27127b;
    }

    @Override // com.daaw.of1.AbstractC2436b
    /* renamed from: h */
    public String mo9430h() {
        return this.f27134i;
    }

    public int hashCode() {
        long j = this.f27129d;
        long j2 = this.f27130e;
        return ((((((((((((((((this.f27126a ^ 1000003) * 1000003) ^ this.f27127b.hashCode()) * 1000003) ^ this.f27128c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f27131f ? 1231 : 1237)) * 1000003) ^ this.f27132g) * 1000003) ^ this.f27133h.hashCode()) * 1000003) ^ this.f27134i.hashCode();
    }

    @Override // com.daaw.of1.AbstractC2436b
    /* renamed from: i */
    public int mo9429i() {
        return this.f27132g;
    }

    @Override // com.daaw.of1.AbstractC2436b
    /* renamed from: j */
    public long mo9428j() {
        return this.f27129d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f27126a + ", model=" + this.f27127b + ", availableProcessors=" + this.f27128c + ", totalRam=" + this.f27129d + ", diskSpace=" + this.f27130e + ", isEmulator=" + this.f27131f + ", state=" + this.f27132g + ", manufacturer=" + this.f27133h + ", modelClass=" + this.f27134i + "}";
    }
}
