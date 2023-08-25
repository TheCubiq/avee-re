package com.daaw;

import com.google.android.gms.internal.ads.zzatd;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public class vw2 {
    public final mw2 a;
    public final int[] b;
    public final zzatd[] c;
    public int d;

    public vw2(mw2 mw2Var, int... iArr) {
        Objects.requireNonNull(mw2Var);
        this.a = mw2Var;
        this.c = new zzatd[1];
        for (int i = 0; i <= 0; i++) {
            this.c[i] = mw2Var.b(iArr[i]);
        }
        Arrays.sort(this.c, new uw2(null));
        this.b = new int[1];
        for (int i2 = 0; i2 <= 0; i2++) {
            this.b[i2] = mw2Var.a(this.c[i2]);
        }
    }

    public final int a(int i) {
        return this.b[0];
    }

    public final int b() {
        int length = this.b.length;
        return 1;
    }

    public final zzatd c(int i) {
        return this.c[i];
    }

    public final mw2 d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            vw2 vw2Var = (vw2) obj;
            if (this.a == vw2Var.a && Arrays.equals(this.b, vw2Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        if (i == 0) {
            int identityHashCode = (System.identityHashCode(this.a) * 31) + Arrays.hashCode(this.b);
            this.d = identityHashCode;
            return identityHashCode;
        }
        return i;
    }
}
