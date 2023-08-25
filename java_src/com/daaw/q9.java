package com.daaw;
/* loaded from: classes2.dex */
public final class q9 extends jf1 {
    public final long a;
    public final long b;
    public final long c;

    public q9(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // com.daaw.jf1
    public long b() {
        return this.b;
    }

    @Override // com.daaw.jf1
    public long c() {
        return this.a;
    }

    @Override // com.daaw.jf1
    public long d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jf1) {
            jf1 jf1Var = (jf1) obj;
            return this.a == jf1Var.c() && this.b == jf1Var.b() && this.c == jf1Var.d();
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        return ((int) (j3 ^ (j3 >>> 32))) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.a + ", elapsedRealtime=" + this.b + ", uptimeMillis=" + this.c + "}";
    }
}
