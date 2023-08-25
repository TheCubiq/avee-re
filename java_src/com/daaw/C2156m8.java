package com.daaw;

import com.daaw.AbstractC2057lm;
/* renamed from: com.daaw.m8 */
/* loaded from: classes2.dex */
public final class C2156m8 extends AbstractC2057lm.AbstractC2067e.AbstractC2068a.AbstractC2070b {

    /* renamed from: a */
    public final String f18582a;

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2068a.AbstractC2070b
    /* renamed from: a */
    public String mo16183a() {
        return this.f18582a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2057lm.AbstractC2067e.AbstractC2068a.AbstractC2070b) {
            return this.f18582a.equals(((AbstractC2057lm.AbstractC2067e.AbstractC2068a.AbstractC2070b) obj).mo16183a());
        }
        return false;
    }

    public int hashCode() {
        return this.f18582a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f18582a + "}";
    }
}
