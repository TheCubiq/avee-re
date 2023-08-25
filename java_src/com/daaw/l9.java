package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class l9 extends iw0 {
    public final long a;
    public final sn1 b;
    public final by c;

    public l9(long j, sn1 sn1Var, by byVar) {
        this.a = j;
        Objects.requireNonNull(sn1Var, "Null transportContext");
        this.b = sn1Var;
        Objects.requireNonNull(byVar, "Null event");
        this.c = byVar;
    }

    @Override // com.daaw.iw0
    public by b() {
        return this.c;
    }

    @Override // com.daaw.iw0
    public long c() {
        return this.a;
    }

    @Override // com.daaw.iw0
    public sn1 d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iw0) {
            iw0 iw0Var = (iw0) obj;
            return this.a == iw0Var.c() && this.b.equals(iw0Var.d()) && this.c.equals(iw0Var.b());
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
