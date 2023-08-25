package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class dx2 {
    public int a;
    public final vw2[] b;

    public dx2(vw2[] vw2VarArr, byte... bArr) {
        this.b = vw2VarArr;
    }

    public final vw2 a(int i) {
        return this.b[i];
    }

    public final vw2[] b() {
        return (vw2[]) this.b.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dx2.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.b, ((dx2) obj).b);
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.b) + 527;
            this.a = hashCode;
            return hashCode;
        }
        return i;
    }
}
