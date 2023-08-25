package com.daaw;

import com.google.android.gms.internal.ads.zzatd;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class mw2 {

    /* renamed from: a */
    public final int f19186a = 1;

    /* renamed from: b */
    public final zzatd[] f19187b;

    /* renamed from: c */
    public int f19188c;

    public mw2(zzatd... zzatdVarArr) {
        this.f19187b = zzatdVarArr;
    }

    /* renamed from: a */
    public final int m15742a(zzatd zzatdVar) {
        for (int i = 0; i <= 0; i++) {
            if (zzatdVar == this.f19187b[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final zzatd m15741b(int i) {
        return this.f19187b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && mw2.class == obj.getClass() && Arrays.equals(this.f19187b, ((mw2) obj).f19187b);
    }

    public final int hashCode() {
        int i = this.f19188c;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.f19187b) + 527;
            this.f19188c = hashCode;
            return hashCode;
        }
        return i;
    }
}
