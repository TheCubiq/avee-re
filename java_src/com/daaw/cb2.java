package com.daaw;

import com.google.android.gms.internal.ads.zzbq;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* loaded from: classes.dex */
public final class cb2 extends gb2 {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean j(ik5 ik5Var) {
        return k(ik5Var, o);
    }

    public static boolean k(ik5 ik5Var, byte[] bArr) {
        if (ik5Var.i() < 8) {
            return false;
        }
        int k = ik5Var.k();
        byte[] bArr2 = new byte[8];
        ik5Var.b(bArr2, 0, 8);
        ik5Var.f(k);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.daaw.gb2
    public final long a(ik5 ik5Var) {
        byte[] h = ik5Var.h();
        int i = h[0] & 255;
        int i2 = i & 3;
        int i3 = 2;
        if (i2 == 0) {
            i3 = 1;
        } else if (i2 != 1 && i2 != 2) {
            i3 = h[1] & 63;
        }
        int i4 = i >> 3;
        int i5 = i4 & 3;
        return f(i3 * (i4 >= 16 ? 2500 << i5 : i4 >= 12 ? 10000 << (i5 & 1) : i5 == 3 ? 60000 : 10000 << i5));
    }

    @Override // com.daaw.gb2
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.n = false;
        }
    }

    @Override // com.daaw.gb2
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean c(ik5 ik5Var, long j, db2 db2Var) {
        f92 y;
        if (k(ik5Var, o)) {
            byte[] copyOf = Arrays.copyOf(ik5Var.h(), ik5Var.l());
            int i = copyOf[9] & 255;
            List a = d42.a(copyOf);
            if (db2Var.a != null) {
                return true;
            }
            b72 b72Var = new b72();
            b72Var.s("audio/opus");
            b72Var.e0(i);
            b72Var.t(48000);
            b72Var.i(a);
            y = b72Var.y();
        } else if (!k(ik5Var, p)) {
            uo4.b(db2Var.a);
            return false;
        } else {
            uo4.b(db2Var.a);
            if (this.n) {
                return true;
            }
            this.n = true;
            ik5Var.g(8);
            zzbq b = s42.b(y17.t(s42.c(ik5Var, false, false).b));
            if (b == null) {
                return true;
            }
            b72 b2 = db2Var.a.b();
            b2.m(b.g(db2Var.a.j));
            y = b2.y();
        }
        db2Var.a = y;
        return true;
    }
}
