package com.daaw;

import com.daaw.rg1;
import com.daaw.zv1;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class yv1 extends rg1 {

    /* renamed from: n */
    public C3755a f34166n;

    /* renamed from: o */
    public int f34167o;

    /* renamed from: p */
    public boolean f34168p;

    /* renamed from: q */
    public zv1.C3910d f34169q;

    /* renamed from: r */
    public zv1.C3908b f34170r;

    /* renamed from: com.daaw.yv1$a */
    /* loaded from: classes.dex */
    public static final class C3755a {

        /* renamed from: a */
        public final zv1.C3910d f34171a;

        /* renamed from: b */
        public final zv1.C3908b f34172b;

        /* renamed from: c */
        public final byte[] f34173c;

        /* renamed from: d */
        public final zv1.C3909c[] f34174d;

        /* renamed from: e */
        public final int f34175e;

        public C3755a(zv1.C3910d c3910d, zv1.C3908b c3908b, byte[] bArr, zv1.C3909c[] c3909cArr, int i) {
            this.f34171a = c3910d;
            this.f34172b = c3908b;
            this.f34173c = bArr;
            this.f34174d = c3909cArr;
            this.f34175e = i;
        }
    }

    /* renamed from: l */
    public static void m3174l(rv0 rv0Var, long j) {
        rv0Var.m10922I(rv0Var.m10916d() + 4);
        rv0Var.f25637a[rv0Var.m10916d() - 4] = (byte) (j & 255);
        rv0Var.f25637a[rv0Var.m10916d() - 3] = (byte) ((j >>> 8) & 255);
        rv0Var.f25637a[rv0Var.m10916d() - 2] = (byte) ((j >>> 16) & 255);
        rv0Var.f25637a[rv0Var.m10916d() - 1] = (byte) ((j >>> 24) & 255);
    }

    /* renamed from: m */
    public static int m3173m(byte b, C3755a c3755a) {
        return !c3755a.f34174d[m3172n(b, c3755a.f34175e, 1)].f35571a ? c3755a.f34171a.f35581g : c3755a.f34171a.f35582h;
    }

    /* renamed from: n */
    public static int m3172n(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    /* renamed from: p */
    public static boolean m3170p(rv0 rv0Var) {
        try {
            return zv1.m1849k(1, rv0Var, true);
        } catch (tv0 unused) {
            return false;
        }
    }

    @Override // com.daaw.rg1
    /* renamed from: d */
    public void mo3178d(long j) {
        super.mo3178d(j);
        this.f34168p = j != 0;
        zv1.C3910d c3910d = this.f34169q;
        this.f34167o = c3910d != null ? c3910d.f35581g : 0;
    }

    @Override // com.daaw.rg1
    /* renamed from: e */
    public long mo3177e(rv0 rv0Var) {
        byte[] bArr = rv0Var.f25637a;
        if ((bArr[0] & 1) == 1) {
            return -1L;
        }
        int m3173m = m3173m(bArr[0], this.f34166n);
        long j = this.f34168p ? (this.f34167o + m3173m) / 4 : 0;
        m3174l(rv0Var, j);
        this.f34168p = true;
        this.f34167o = m3173m;
        return j;
    }

    @Override // com.daaw.rg1
    /* renamed from: h */
    public boolean mo3176h(rv0 rv0Var, long j, rg1.C2860b c2860b) {
        if (this.f34166n != null) {
            return false;
        }
        C3755a m3171o = m3171o(rv0Var);
        this.f34166n = m3171o;
        if (m3171o == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f34166n.f34171a.f35584j);
        arrayList.add(this.f34166n.f34173c);
        zv1.C3910d c3910d = this.f34166n.f34171a;
        c2860b.f25265a = Format.m1722u(null, "audio/vorbis", null, c3910d.f35579e, -1, c3910d.f35576b, (int) c3910d.f35577c, arrayList, null, 0, null);
        return true;
    }

    @Override // com.daaw.rg1
    /* renamed from: j */
    public void mo3175j(boolean z) {
        super.mo3175j(z);
        if (z) {
            this.f34166n = null;
            this.f34169q = null;
            this.f34170r = null;
        }
        this.f34167o = 0;
        this.f34168p = false;
    }

    /* renamed from: o */
    public C3755a m3171o(rv0 rv0Var) {
        if (this.f34169q == null) {
            this.f34169q = zv1.m1851i(rv0Var);
            return null;
        } else if (this.f34170r == null) {
            this.f34170r = zv1.m1852h(rv0Var);
            return null;
        } else {
            byte[] bArr = new byte[rv0Var.m10916d()];
            System.arraycopy(rv0Var.f25637a, 0, bArr, 0, rv0Var.m10916d());
            zv1.C3909c[] m1850j = zv1.m1850j(rv0Var, this.f34169q.f35576b);
            return new C3755a(this.f34169q, this.f34170r, bArr, m1850j, zv1.m1859a(m1850j.length - 1));
        }
    }
}
