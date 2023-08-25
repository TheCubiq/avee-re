package com.daaw;

import com.google.android.gms.internal.ads.zzbq;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* loaded from: classes.dex */
public final class cb2 extends gb2 {

    /* renamed from: o */
    public static final byte[] f5690o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p */
    public static final byte[] f5691p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n */
    public boolean f5692n;

    /* renamed from: j */
    public static boolean m25454j(ik5 ik5Var) {
        return m25453k(ik5Var, f5690o);
    }

    /* renamed from: k */
    public static boolean m25453k(ik5 ik5Var, byte[] bArr) {
        if (ik5Var.m19713i() < 8) {
            return false;
        }
        int m19711k = ik5Var.m19711k();
        byte[] bArr2 = new byte[8];
        ik5Var.m19720b(bArr2, 0, 8);
        ik5Var.m19716f(m19711k);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.daaw.gb2
    /* renamed from: a */
    public final long mo6277a(ik5 ik5Var) {
        byte[] m19714h = ik5Var.m19714h();
        int i = m19714h[0] & 255;
        int i2 = i & 3;
        int i3 = 2;
        if (i2 == 0) {
            i3 = 1;
        } else if (i2 != 1 && i2 != 2) {
            i3 = m19714h[1] & 63;
        }
        int i4 = i >> 3;
        int i5 = i4 & 3;
        return m21824f(i3 * (i4 >= 16 ? 2500 << i5 : i4 >= 12 ? 10000 << (i5 & 1) : i5 == 3 ? 60000 : 10000 << i5));
    }

    @Override // com.daaw.gb2
    /* renamed from: b */
    public final void mo6276b(boolean z) {
        super.mo6276b(z);
        if (z) {
            this.f5692n = false;
        }
    }

    @Override // com.daaw.gb2
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: c */
    public final boolean mo6275c(ik5 ik5Var, long j, db2 db2Var) {
        f92 m26366y;
        if (m25453k(ik5Var, f5690o)) {
            byte[] copyOf = Arrays.copyOf(ik5Var.m19714h(), ik5Var.m19710l());
            int i = copyOf[9] & 255;
            List m24647a = d42.m24647a(copyOf);
            if (db2Var.f6733a != null) {
                return true;
            }
            b72 b72Var = new b72();
            b72Var.m26372s("audio/opus");
            b72Var.m26389e0(i);
            b72Var.m26371t(48000);
            b72Var.m26382i(m24647a);
            m26366y = b72Var.m26366y();
        } else if (!m25453k(ik5Var, f5691p)) {
            uo4.m7876b(db2Var.f6733a);
            return false;
        } else {
            uo4.m7876b(db2Var.f6733a);
            if (this.f5692n) {
                return true;
            }
            this.f5692n = true;
            ik5Var.m19715g(8);
            zzbq m10718b = s42.m10718b(y17.m4261t(s42.m10717c(ik5Var, false, false).f22586b));
            if (m10718b == null) {
                return true;
            }
            b72 m22830b = db2Var.f6733a.m22830b();
            m22830b.m26378m(m10718b.m1100g(db2Var.f6733a.f9273j));
            m26366y = m22830b.m26366y();
        }
        db2Var.f6733a = m26366y;
        return true;
    }
}
