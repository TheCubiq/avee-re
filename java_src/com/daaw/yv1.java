package com.daaw;

import com.daaw.rg1;
import com.daaw.zv1;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class yv1 extends rg1 {
    public a n;
    public int o;
    public boolean p;
    public zv1.d q;
    public zv1.b r;

    /* loaded from: classes.dex */
    public static final class a {
        public final zv1.d a;
        public final zv1.b b;
        public final byte[] c;
        public final zv1.c[] d;
        public final int e;

        public a(zv1.d dVar, zv1.b bVar, byte[] bArr, zv1.c[] cVarArr, int i) {
            this.a = dVar;
            this.b = bVar;
            this.c = bArr;
            this.d = cVarArr;
            this.e = i;
        }
    }

    public static void l(rv0 rv0Var, long j) {
        rv0Var.I(rv0Var.d() + 4);
        rv0Var.a[rv0Var.d() - 4] = (byte) (j & 255);
        rv0Var.a[rv0Var.d() - 3] = (byte) ((j >>> 8) & 255);
        rv0Var.a[rv0Var.d() - 2] = (byte) ((j >>> 16) & 255);
        rv0Var.a[rv0Var.d() - 1] = (byte) ((j >>> 24) & 255);
    }

    public static int m(byte b, a aVar) {
        return !aVar.d[n(b, aVar.e, 1)].a ? aVar.a.g : aVar.a.h;
    }

    public static int n(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static boolean p(rv0 rv0Var) {
        try {
            return zv1.k(1, rv0Var, true);
        } catch (tv0 unused) {
            return false;
        }
    }

    @Override // com.daaw.rg1
    public void d(long j) {
        super.d(j);
        this.p = j != 0;
        zv1.d dVar = this.q;
        this.o = dVar != null ? dVar.g : 0;
    }

    @Override // com.daaw.rg1
    public long e(rv0 rv0Var) {
        byte[] bArr = rv0Var.a;
        if ((bArr[0] & 1) == 1) {
            return -1L;
        }
        int m = m(bArr[0], this.n);
        long j = this.p ? (this.o + m) / 4 : 0;
        l(rv0Var, j);
        this.p = true;
        this.o = m;
        return j;
    }

    @Override // com.daaw.rg1
    public boolean h(rv0 rv0Var, long j, rg1.b bVar) {
        if (this.n != null) {
            return false;
        }
        a o = o(rv0Var);
        this.n = o;
        if (o == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.n.a.j);
        arrayList.add(this.n.c);
        zv1.d dVar = this.n.a;
        bVar.a = Format.u(null, "audio/vorbis", null, dVar.e, -1, dVar.b, (int) dVar.c, arrayList, null, 0, null);
        return true;
    }

    @Override // com.daaw.rg1
    public void j(boolean z) {
        super.j(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    public a o(rv0 rv0Var) {
        if (this.q == null) {
            this.q = zv1.i(rv0Var);
            return null;
        } else if (this.r == null) {
            this.r = zv1.h(rv0Var);
            return null;
        } else {
            byte[] bArr = new byte[rv0Var.d()];
            System.arraycopy(rv0Var.a, 0, bArr, 0, rv0Var.d());
            zv1.c[] j = zv1.j(rv0Var, this.q.b);
            return new a(this.q, this.r, bArr, j, zv1.a(j.length - 1));
        }
    }
}
