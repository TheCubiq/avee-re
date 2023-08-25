package com.daaw;

import com.google.android.gms.internal.ads.zzatd;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class mw2 {
    public final int a = 1;
    public final zzatd[] b;
    public int c;

    public mw2(zzatd... zzatdVarArr) {
        this.b = zzatdVarArr;
    }

    public final int a(zzatd zzatdVar) {
        for (int i = 0; i <= 0; i++) {
            if (zzatdVar == this.b[i]) {
                return i;
            }
        }
        return -1;
    }

    public final zzatd b(int i) {
        return this.b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && mw2.class == obj.getClass() && Arrays.equals(this.b, ((mw2) obj).b);
    }

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.b) + 527;
            this.c = hashCode;
            return hashCode;
        }
        return i;
    }
}
