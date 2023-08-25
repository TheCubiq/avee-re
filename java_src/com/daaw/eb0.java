package com.daaw;

import android.net.Uri;
import android.os.SystemClock;
import com.daaw.ib0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class eb0 {
    public final gb0 a;
    public final mp b;
    public final mp c;
    public final pl1 d;
    public final ib0.a[] e;
    public final pb0 f;
    public final TrackGroup g;
    public final List<Format> h;
    public boolean i;
    public byte[] j;
    public IOException k;
    public ib0.a l;
    public boolean m;
    public Uri n;
    public byte[] o;
    public String p;
    public byte[] q;
    public com.google.android.exoplayer2.trackselection.c r;
    public long s = -9223372036854775807L;
    public boolean t;

    /* loaded from: classes.dex */
    public static final class a extends dp {
        public final String l;
        public byte[] m;

        public a(mp mpVar, pp ppVar, Format format, int i, Object obj, byte[] bArr, String str) {
            super(mpVar, ppVar, 3, format, i, obj, bArr);
            this.l = str;
        }

        @Override // com.daaw.dp
        public void e(byte[] bArr, int i) {
            this.m = Arrays.copyOf(bArr, i);
        }

        public byte[] h() {
            return this.m;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public ef a;
        public boolean b;
        public ib0.a c;

        public b() {
            a();
        }

        public void a() {
            this.a = null;
            this.b = false;
            this.c = null;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends za {
        public int g;

        public c(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
            this.g = i(trackGroup.a(0));
        }

        @Override // com.google.android.exoplayer2.trackselection.c
        public int b() {
            return this.g;
        }

        @Override // com.google.android.exoplayer2.trackselection.c
        public int l() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.c
        public void n(long j, long j2, long j3) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (q(this.g, elapsedRealtime)) {
                for (int i = this.b - 1; i >= 0; i--) {
                    if (!q(i, elapsedRealtime)) {
                        this.g = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // com.google.android.exoplayer2.trackselection.c
        public Object o() {
            return null;
        }
    }

    public eb0(gb0 gb0Var, pb0 pb0Var, ib0.a[] aVarArr, fb0 fb0Var, pl1 pl1Var, List<Format> list) {
        this.a = gb0Var;
        this.f = pb0Var;
        this.e = aVarArr;
        this.d = pl1Var;
        this.h = list;
        Format[] formatArr = new Format[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            formatArr[i] = aVarArr[i].b;
            iArr[i] = i;
        }
        this.b = fb0Var.a(1);
        this.c = fb0Var.a(3);
        TrackGroup trackGroup = new TrackGroup(formatArr);
        this.g = trackGroup;
        this.r = new c(trackGroup, iArr);
    }

    public final void a() {
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(com.daaw.jb0 r34, long r35, long r37, com.daaw.eb0.b r39) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.eb0.b(com.daaw.jb0, long, long, com.daaw.eb0$b):void");
    }

    public TrackGroup c() {
        return this.g;
    }

    public com.google.android.exoplayer2.trackselection.c d() {
        return this.r;
    }

    public void e() {
        IOException iOException = this.k;
        if (iOException != null) {
            throw iOException;
        }
        ib0.a aVar = this.l;
        if (aVar == null || !this.t) {
            return;
        }
        this.f.h(aVar);
    }

    public final a f(Uri uri, String str, int i, int i2, Object obj) {
        return new a(this.c, new pp(uri, 0L, -1L, null, 1), this.e[i].b, i2, obj, this.j, str);
    }

    public void g(ef efVar) {
        if (efVar instanceof a) {
            a aVar = (a) efVar;
            this.j = aVar.f();
            m(aVar.a.a, aVar.l, aVar.h());
        }
    }

    public boolean h(ef efVar, boolean z, IOException iOException) {
        if (z) {
            com.google.android.exoplayer2.trackselection.c cVar = this.r;
            if (kf.a(cVar, cVar.p(this.g.b(efVar.c)), iOException)) {
                return true;
            }
        }
        return false;
    }

    public boolean i(ib0.a aVar, boolean z) {
        int p;
        int b2 = this.g.b(aVar.b);
        if (b2 == -1 || (p = this.r.p(b2)) == -1) {
            return true;
        }
        this.t = (this.l == aVar) | this.t;
        return !z || this.r.c(p, 60000L);
    }

    public void j() {
        this.k = null;
    }

    public final long k(long j) {
        long j2 = this.s;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    public void l(com.google.android.exoplayer2.trackselection.c cVar) {
        this.r = cVar;
    }

    public final void m(Uri uri, String str, byte[] bArr) {
        byte[] byteArray = new BigInteger(sq1.a0(str).startsWith("0x") ? str.substring(2) : str, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr2, (16 - byteArray.length) + length, byteArray.length - length);
        this.n = uri;
        this.o = bArr;
        this.p = str;
        this.q = bArr2;
    }

    public void n(boolean z) {
        this.i = z;
    }

    public final void o(lb0 lb0Var) {
        this.s = lb0Var.l ? -9223372036854775807L : lb0Var.e() - this.f.f();
    }
}
