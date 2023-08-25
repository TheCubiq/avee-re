package com.daaw;

import com.daaw.s81;
import java.util.Map;
import java.util.Objects;
/* renamed from: com.daaw.n9 */
/* loaded from: classes.dex */
public final class C2267n9 extends s81 {

    /* renamed from: a */
    public final InterfaceC0951cg f19727a;

    /* renamed from: b */
    public final Map<cz0, s81.AbstractC2921b> f19728b;

    public C2267n9(InterfaceC0951cg interfaceC0951cg, Map<cz0, s81.AbstractC2921b> map) {
        Objects.requireNonNull(interfaceC0951cg, "Null clock");
        this.f19727a = interfaceC0951cg;
        Objects.requireNonNull(map, "Null values");
        this.f19728b = map;
    }

    @Override // com.daaw.s81
    /* renamed from: e */
    public InterfaceC0951cg mo10545e() {
        return this.f19727a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s81) {
            s81 s81Var = (s81) obj;
            return this.f19727a.equals(s81Var.mo10545e()) && this.f19728b.equals(s81Var.mo10542h());
        }
        return false;
    }

    @Override // com.daaw.s81
    /* renamed from: h */
    public Map<cz0, s81.AbstractC2921b> mo10542h() {
        return this.f19728b;
    }

    public int hashCode() {
        return ((this.f19727a.hashCode() ^ 1000003) * 1000003) ^ this.f19728b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f19727a + ", values=" + this.f19728b + "}";
    }
}
