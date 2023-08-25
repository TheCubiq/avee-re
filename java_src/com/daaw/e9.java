package com.daaw;

import java.util.List;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class e9 extends ya0 {
    public final String a;
    public final List<String> b;

    public e9(String str, List<String> list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.a = str;
        Objects.requireNonNull(list, "Null usedDates");
        this.b = list;
    }

    @Override // com.daaw.ya0
    public List<String> b() {
        return this.b;
    }

    @Override // com.daaw.ya0
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ya0) {
            ya0 ya0Var = (ya0) obj;
            return this.a.equals(ya0Var.c()) && this.b.equals(ya0Var.b());
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
