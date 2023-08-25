package com.daaw;
/* renamed from: com.daaw.q9 */
/* loaded from: classes2.dex */
public final class C2699q9 extends jf1 {

    /* renamed from: a */
    public final long f23777a;

    /* renamed from: b */
    public final long f23778b;

    /* renamed from: c */
    public final long f23779c;

    public C2699q9(long j, long j2, long j3) {
        this.f23777a = j;
        this.f23778b = j2;
        this.f23779c = j3;
    }

    @Override // com.daaw.jf1
    /* renamed from: b */
    public long mo12699b() {
        return this.f23778b;
    }

    @Override // com.daaw.jf1
    /* renamed from: c */
    public long mo12698c() {
        return this.f23777a;
    }

    @Override // com.daaw.jf1
    /* renamed from: d */
    public long mo12697d() {
        return this.f23779c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jf1) {
            jf1 jf1Var = (jf1) obj;
            return this.f23777a == jf1Var.mo12698c() && this.f23778b == jf1Var.mo12699b() && this.f23779c == jf1Var.mo12697d();
        }
        return false;
    }

    public int hashCode() {
        long j = this.f23777a;
        long j2 = this.f23778b;
        long j3 = this.f23779c;
        return ((int) (j3 ^ (j3 >>> 32))) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f23777a + ", elapsedRealtime=" + this.f23778b + ", uptimeMillis=" + this.f23779c + "}";
    }
}
