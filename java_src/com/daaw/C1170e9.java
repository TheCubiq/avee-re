package com.daaw;

import java.util.List;
import java.util.Objects;
/* renamed from: com.daaw.e9 */
/* loaded from: classes2.dex */
public final class C1170e9 extends ya0 {

    /* renamed from: a */
    public final String f8260a;

    /* renamed from: b */
    public final List<String> f8261b;

    public C1170e9(String str, List<String> list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.f8260a = str;
        Objects.requireNonNull(list, "Null usedDates");
        this.f8261b = list;
    }

    @Override // com.daaw.ya0
    /* renamed from: b */
    public List<String> mo3961b() {
        return this.f8261b;
    }

    @Override // com.daaw.ya0
    /* renamed from: c */
    public String mo3960c() {
        return this.f8260a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ya0) {
            ya0 ya0Var = (ya0) obj;
            return this.f8260a.equals(ya0Var.mo3960c()) && this.f8261b.equals(ya0Var.mo3961b());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f8260a.hashCode() ^ 1000003) * 1000003) ^ this.f8261b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f8260a + ", usedDates=" + this.f8261b + "}";
    }
}
