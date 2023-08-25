package com.daaw;

import android.net.Uri;
import com.daaw.InterfaceC2200mp;
import com.daaw.we1;
import com.daaw.xe1;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.trackselection.InterfaceC3970c;
import java.io.IOException;
import java.util.List;
/* renamed from: com.daaw.yr */
/* loaded from: classes.dex */
public class C3738yr implements we1 {

    /* renamed from: a */
    public final lk0 f33970a;

    /* renamed from: b */
    public final int f33971b;

    /* renamed from: c */
    public final InterfaceC3970c f33972c;

    /* renamed from: d */
    public final C1275ff[] f33973d;

    /* renamed from: e */
    public final InterfaceC2200mp f33974e;

    /* renamed from: f */
    public xe1 f33975f;

    /* renamed from: g */
    public int f33976g;

    /* renamed from: h */
    public IOException f33977h;

    /* renamed from: com.daaw.yr$a */
    /* loaded from: classes.dex */
    public static final class C3739a implements we1.InterfaceC3434a {

        /* renamed from: a */
        public final InterfaceC2200mp.InterfaceC2201a f33978a;

        public C3739a(InterfaceC2200mp.InterfaceC2201a interfaceC2201a) {
            this.f33978a = interfaceC2201a;
        }

        @Override // com.daaw.we1.InterfaceC3434a
        /* renamed from: a */
        public we1 mo3389a(lk0 lk0Var, xe1 xe1Var, int i, InterfaceC3970c interfaceC3970c, pm1[] pm1VarArr) {
            return new C3738yr(lk0Var, xe1Var, i, interfaceC3970c, this.f33978a.mo9376a(), pm1VarArr);
        }
    }

    public C3738yr(lk0 lk0Var, xe1 xe1Var, int i, InterfaceC3970c interfaceC3970c, InterfaceC2200mp interfaceC2200mp, pm1[] pm1VarArr) {
        this.f33970a = lk0Var;
        this.f33975f = xe1Var;
        this.f33971b = i;
        this.f33972c = interfaceC3970c;
        this.f33974e = interfaceC2200mp;
        xe1.C3535b c3535b = xe1Var.f32611f[i];
        this.f33973d = new C1275ff[interfaceC3970c.length()];
        int i2 = 0;
        while (i2 < this.f33973d.length) {
            int mo1529f = interfaceC3970c.mo1529f(i2);
            Format format = c3535b.f32625j[mo1529f];
            int i3 = c3535b.f32616a;
            int i4 = i2;
            this.f33973d[i4] = new C1275ff(new d40(3, null, new nm1(mo1529f, i3, c3535b.f32618c, -9223372036854775807L, xe1Var.f32612g, format, 0, pm1VarArr, i3 == 2 ? 4 : 0, null, null), null), c3535b.f32616a, format);
            i2 = i4 + 1;
        }
    }

    /* renamed from: d */
    public static zn0 m3396d(Format format, InterfaceC2200mp interfaceC2200mp, Uri uri, String str, int i, long j, long j2, long j3, int i2, Object obj, C1275ff c1275ff) {
        return new C1292fk(interfaceC2200mp, new C2570pp(uri, 0L, -1L, str), format, i2, obj, j, j2, j3, i, 1, j, c1275ff);
    }

    @Override // com.daaw.InterfaceC1826jf
    /* renamed from: a */
    public void mo3398a() {
        IOException iOException = this.f33977h;
        if (iOException != null) {
            throw iOException;
        }
        this.f33970a.mo16893a();
    }

    @Override // com.daaw.we1
    /* renamed from: b */
    public void mo3397b(xe1 xe1Var) {
        xe1.C3535b[] c3535bArr = this.f33975f.f32611f;
        int i = this.f33971b;
        xe1.C3535b c3535b = c3535bArr[i];
        int i2 = c3535b.f32626k;
        xe1.C3535b c3535b2 = xe1Var.f32611f[i];
        if (i2 != 0 && c3535b2.f32626k != 0) {
            int i3 = i2 - 1;
            long m5183e = c3535b.m5183e(i3) + c3535b.m5185c(i3);
            long m5183e2 = c3535b2.m5183e(0);
            if (m5183e > m5183e2) {
                this.f33976g += c3535b.m5184d(m5183e2);
                this.f33975f = xe1Var;
            }
        }
        this.f33976g += i2;
        this.f33975f = xe1Var;
    }

    @Override // com.daaw.InterfaceC1826jf
    /* renamed from: e */
    public long mo3395e(long j, ea1 ea1Var) {
        xe1.C3535b c3535b = this.f33975f.f32611f[this.f33971b];
        int m5184d = c3535b.m5184d(j);
        long m5183e = c3535b.m5183e(m5184d);
        return sq1.m10026S(j, ea1Var, m5183e, (m5183e >= j || m5184d >= c3535b.f32626k + (-1)) ? m5183e : c3535b.m5183e(m5184d + 1));
    }

    @Override // com.daaw.InterfaceC1826jf
    /* renamed from: f */
    public void mo3394f(AbstractC1180ef abstractC1180ef) {
    }

    @Override // com.daaw.InterfaceC1826jf
    /* renamed from: g */
    public boolean mo3393g(AbstractC1180ef abstractC1180ef, boolean z, Exception exc) {
        if (z) {
            InterfaceC3970c interfaceC3970c = this.f33972c;
            if (C1943kf.m17771a(interfaceC3970c, interfaceC3970c.mo1526i(abstractC1180ef.f8430c), exc)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.InterfaceC1826jf
    /* renamed from: h */
    public int mo3392h(long j, List<? extends zn0> list) {
        return (this.f33977h != null || this.f33972c.length() < 2) ? list.size() : this.f33972c.mo1527h(j, list);
    }

    @Override // com.daaw.InterfaceC1826jf
    /* renamed from: i */
    public final void mo3391i(zn0 zn0Var, long j, long j2, C1397gf c1397gf) {
        int mo2104e;
        if (this.f33977h != null) {
            return;
        }
        xe1 xe1Var = this.f33975f;
        xe1.C3535b c3535b = xe1Var.f32611f[this.f33971b];
        if (c3535b.f32626k == 0) {
            c1397gf.f11132b = !xe1Var.f32609d;
            return;
        }
        if (zn0Var == null) {
            mo2104e = c3535b.m5184d(j2);
        } else {
            mo2104e = (int) (zn0Var.mo2104e() - this.f33976g);
            if (mo2104e < 0) {
                this.f33977h = new C2428ob();
                return;
            }
        }
        int i = mo2104e;
        if (i >= c3535b.f32626k) {
            c1397gf.f11132b = !this.f33975f.f32609d;
            return;
        }
        this.f33972c.mo1521n(j, j2 - j, m3390j(j));
        long m5183e = c3535b.m5183e(i);
        long m5185c = m5183e + c3535b.m5185c(i);
        long j3 = zn0Var == null ? j2 : -9223372036854775807L;
        int i2 = i + this.f33976g;
        int mo1533b = this.f33972c.mo1533b();
        c1397gf.f11131a = m3396d(this.f33972c.mo1524k(), this.f33974e, c3535b.m5187a(this.f33972c.mo1529f(mo1533b), i), null, i2, m5183e, m5185c, j3, this.f33972c.mo1523l(), this.f33972c.mo1520o(), this.f33973d[mo1533b]);
    }

    /* renamed from: j */
    public final long m3390j(long j) {
        xe1 xe1Var = this.f33975f;
        if (xe1Var.f32609d) {
            xe1.C3535b c3535b = xe1Var.f32611f[this.f33971b];
            int i = c3535b.f32626k - 1;
            return (c3535b.m5183e(i) + c3535b.m5185c(i)) - j;
        }
        return -9223372036854775807L;
    }
}
