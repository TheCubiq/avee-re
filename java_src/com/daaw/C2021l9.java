package com.daaw;

import java.util.Objects;
/* renamed from: com.daaw.l9 */
/* loaded from: classes.dex */
public final class C2021l9 extends iw0 {

    /* renamed from: a */
    public final long f17145a;

    /* renamed from: b */
    public final sn1 f17146b;

    /* renamed from: c */
    public final AbstractC0896by f17147c;

    public C2021l9(long j, sn1 sn1Var, AbstractC0896by abstractC0896by) {
        this.f17145a = j;
        Objects.requireNonNull(sn1Var, "Null transportContext");
        this.f17146b = sn1Var;
        Objects.requireNonNull(abstractC0896by, "Null event");
        this.f17147c = abstractC0896by;
    }

    @Override // com.daaw.iw0
    /* renamed from: b */
    public AbstractC0896by mo17097b() {
        return this.f17147c;
    }

    @Override // com.daaw.iw0
    /* renamed from: c */
    public long mo17096c() {
        return this.f17145a;
    }

    @Override // com.daaw.iw0
    /* renamed from: d */
    public sn1 mo17095d() {
        return this.f17146b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iw0) {
            iw0 iw0Var = (iw0) obj;
            return this.f17145a == iw0Var.mo17096c() && this.f17146b.equals(iw0Var.mo17095d()) && this.f17147c.equals(iw0Var.mo17097b());
        }
        return false;
    }

    public int hashCode() {
        long j = this.f17145a;
        return this.f17147c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f17146b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f17145a + ", transportContext=" + this.f17146b + ", event=" + this.f17147c + "}";
    }
}
