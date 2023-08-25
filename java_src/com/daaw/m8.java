package com.daaw;

import com.daaw.lm;
/* loaded from: classes2.dex */
public final class m8 extends lm.e.a.b {
    public final String a;

    @Override // com.daaw.lm.e.a.b
    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lm.e.a.b) {
            return this.a.equals(((lm.e.a.b) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.a + "}";
    }
}
