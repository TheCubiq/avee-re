package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class dx2 {

    /* renamed from: a */
    public int f7963a;

    /* renamed from: b */
    public final vw2[] f7964b;

    public dx2(vw2[] vw2VarArr, byte... bArr) {
        this.f7964b = vw2VarArr;
    }

    /* renamed from: a */
    public final vw2 m23830a(int i) {
        return this.f7964b[i];
    }

    /* renamed from: b */
    public final vw2[] m23829b() {
        return (vw2[]) this.f7964b.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dx2.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f7964b, ((dx2) obj).f7964b);
    }

    public final int hashCode() {
        int i = this.f7963a;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.f7964b) + 527;
            this.f7963a = hashCode;
            return hashCode;
        }
        return i;
    }
}
