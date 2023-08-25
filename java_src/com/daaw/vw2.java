package com.daaw;

import com.google.android.gms.internal.ads.zzatd;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public class vw2 {

    /* renamed from: a */
    public final mw2 f30672a;

    /* renamed from: b */
    public final int[] f30673b;

    /* renamed from: c */
    public final zzatd[] f30674c;

    /* renamed from: d */
    public int f30675d;

    public vw2(mw2 mw2Var, int... iArr) {
        Objects.requireNonNull(mw2Var);
        this.f30672a = mw2Var;
        this.f30674c = new zzatd[1];
        for (int i = 0; i <= 0; i++) {
            this.f30674c[i] = mw2Var.m15741b(iArr[i]);
        }
        Arrays.sort(this.f30674c, new uw2(null));
        this.f30673b = new int[1];
        for (int i2 = 0; i2 <= 0; i2++) {
            this.f30673b[i2] = mw2Var.m15742a(this.f30674c[i2]);
        }
    }

    /* renamed from: a */
    public final int m6690a(int i) {
        return this.f30673b[0];
    }

    /* renamed from: b */
    public final int m6689b() {
        int length = this.f30673b.length;
        return 1;
    }

    /* renamed from: c */
    public final zzatd m6688c(int i) {
        return this.f30674c[i];
    }

    /* renamed from: d */
    public final mw2 m6687d() {
        return this.f30672a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            vw2 vw2Var = (vw2) obj;
            if (this.f30672a == vw2Var.f30672a && Arrays.equals(this.f30673b, vw2Var.f30673b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f30675d;
        if (i == 0) {
            int identityHashCode = (System.identityHashCode(this.f30672a) * 31) + Arrays.hashCode(this.f30673b);
            this.f30675d = identityHashCode;
            return identityHashCode;
        }
        return i;
    }
}
