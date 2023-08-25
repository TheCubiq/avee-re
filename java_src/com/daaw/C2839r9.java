package com.daaw;

import com.daaw.of1;
import java.util.Objects;
/* renamed from: com.daaw.r9 */
/* loaded from: classes2.dex */
public final class C2839r9 extends of1 {

    /* renamed from: a */
    public final of1.AbstractC2435a f24980a;

    /* renamed from: b */
    public final of1.AbstractC2437c f24981b;

    /* renamed from: c */
    public final of1.AbstractC2436b f24982c;

    public C2839r9(of1.AbstractC2435a abstractC2435a, of1.AbstractC2437c abstractC2437c, of1.AbstractC2436b abstractC2436b) {
        Objects.requireNonNull(abstractC2435a, "Null appData");
        this.f24980a = abstractC2435a;
        Objects.requireNonNull(abstractC2437c, "Null osData");
        this.f24981b = abstractC2437c;
        Objects.requireNonNull(abstractC2436b, "Null deviceData");
        this.f24982c = abstractC2436b;
    }

    @Override // com.daaw.of1
    /* renamed from: a */
    public of1.AbstractC2435a mo11573a() {
        return this.f24980a;
    }

    @Override // com.daaw.of1
    /* renamed from: c */
    public of1.AbstractC2436b mo11572c() {
        return this.f24982c;
    }

    @Override // com.daaw.of1
    /* renamed from: d */
    public of1.AbstractC2437c mo11571d() {
        return this.f24981b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof of1) {
            of1 of1Var = (of1) obj;
            return this.f24980a.equals(of1Var.mo11573a()) && this.f24981b.equals(of1Var.mo11571d()) && this.f24982c.equals(of1Var.mo11572c());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f24980a.hashCode() ^ 1000003) * 1000003) ^ this.f24981b.hashCode()) * 1000003) ^ this.f24982c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f24980a + ", osData=" + this.f24981b + ", deviceData=" + this.f24982c + "}";
    }
}
