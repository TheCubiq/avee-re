package com.daaw;

import com.daaw.s81;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class n9 extends s81 {
    public final cg a;
    public final Map<cz0, s81.b> b;

    public n9(cg cgVar, Map<cz0, s81.b> map) {
        Objects.requireNonNull(cgVar, "Null clock");
        this.a = cgVar;
        Objects.requireNonNull(map, "Null values");
        this.b = map;
    }

    @Override // com.daaw.s81
    public cg e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s81) {
            s81 s81Var = (s81) obj;
            return this.a.equals(s81Var.e()) && this.b.equals(s81Var.h());
        }
        return false;
    }

    @Override // com.daaw.s81
    public Map<cz0, s81.b> h() {
        return this.b;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
