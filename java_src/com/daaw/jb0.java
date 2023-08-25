package com.daaw;

import android.util.Pair;
import com.daaw.ib0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class jb0 extends zn0 {
    public static final AtomicInteger F = new AtomicInteger();
    public int A;
    public boolean B;
    public boolean C;
    public volatile boolean D;
    public volatile boolean E;
    public final int j;
    public final int k;
    public final ib0.a l;
    public final mp m;
    public final pp n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final ol1 r;
    public final boolean s;
    public final zz t;
    public final boolean u;
    public final boolean v;
    public final qe0 w;
    public final rv0 x;
    public rb0 y;
    public int z;

    public jb0(gb0 gb0Var, mp mpVar, pp ppVar, pp ppVar2, ib0.a aVar, List<Format> list, int i, Object obj, long j, long j2, long j3, int i2, boolean z, boolean z2, ol1 ol1Var, jb0 jb0Var, DrmInitData drmInitData, byte[] bArr, byte[] bArr2) {
        super(g(mpVar, bArr, bArr2), ppVar, aVar.b, i, obj, j, j2, j3);
        pp ppVar3;
        zz zzVar;
        rv0 rv0Var;
        this.k = i2;
        this.n = ppVar2;
        this.l = aVar;
        this.p = z2;
        this.r = ol1Var;
        this.o = this.h instanceof u1;
        this.q = z;
        boolean z3 = true;
        if (jb0Var != null) {
            boolean z4 = jb0Var.l != aVar;
            this.s = z4;
            zzVar = (jb0Var.k != i2 || z4) ? null : jb0Var.t;
            ppVar3 = ppVar;
        } else {
            this.s = false;
            ppVar3 = ppVar;
            zzVar = null;
        }
        Pair<zz, Boolean> a = gb0Var.a(zzVar, ppVar3.a, this.c, list, drmInitData, ol1Var);
        zz zzVar2 = (zz) a.first;
        this.t = zzVar2;
        boolean booleanValue = ((Boolean) a.second).booleanValue();
        this.u = booleanValue;
        boolean z5 = zzVar2 == zzVar;
        this.v = z5;
        this.C = (!z5 || ppVar2 == null) ? false : false;
        if (booleanValue) {
            if (jb0Var == null || (rv0Var = jb0Var.x) == null) {
                this.w = new qe0();
                rv0Var = new rv0(10);
            } else {
                this.w = jb0Var.w;
            }
            this.x = rv0Var;
        } else {
            this.w = null;
            this.x = null;
        }
        this.m = mpVar;
        this.j = F.getAndIncrement();
    }

    public static mp g(mp mpVar, byte[] bArr, byte[] bArr2) {
        return bArr != null ? new u1(mpVar, bArr, bArr2) : mpVar;
    }

    @Override // com.daaw.jk0.c
    public void a() {
        j();
        if (this.D) {
            return;
        }
        if (!this.q) {
            i();
        }
        this.E = true;
    }

    @Override // com.daaw.jk0.c
    public void b() {
        this.D = true;
    }

    @Override // com.daaw.ef
    public long c() {
        return this.A;
    }

    @Override // com.daaw.zn0
    public boolean f() {
        return this.E;
    }

    public void h(rb0 rb0Var) {
        this.y = rb0Var;
        rb0Var.E(this.j, this.s, this.v);
        if (this.v) {
            return;
        }
        this.t.i(rb0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f A[Catch: all -> 0x00a0, TryCatch #1 {all -> 0x00a0, blocks: (B:15:0x0038, B:17:0x004a, B:19:0x004e, B:21:0x005f, B:23:0x0068, B:22:0x0066, B:25:0x006d, B:34:0x008e, B:27:0x0074, B:29:0x0078), top: B:41:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[Catch: all -> 0x00a0, TryCatch #1 {all -> 0x00a0, blocks: (B:15:0x0038, B:17:0x004a, B:19:0x004e, B:21:0x005f, B:23:0x0068, B:22:0x0066, B:25:0x006d, B:34:0x008e, B:27:0x0074, B:29:0x0078), top: B:41:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #1 {all -> 0x00a0, blocks: (B:15:0x0038, B:17:0x004a, B:19:0x004e, B:21:0x005f, B:23:0x0068, B:22:0x0066, B:25:0x006d, B:34:0x008e, B:27:0x0074, B:29:0x0078), top: B:41:0x0038 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r13 = this;
            boolean r0 = r13.o
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Le
            com.daaw.pp r0 = r13.a
            int r3 = r13.A
            if (r3 == 0) goto L17
            r3 = 1
            goto L18
        Le:
            com.daaw.pp r0 = r13.a
            int r3 = r13.A
            long r3 = (long) r3
            com.daaw.pp r0 = r0.b(r3)
        L17:
            r3 = 0
        L18:
            boolean r4 = r13.p
            if (r4 != 0) goto L22
            com.daaw.ol1 r4 = r13.r
            r4.j()
            goto L38
        L22:
            com.daaw.ol1 r4 = r13.r
            long r4 = r4.c()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L38
            com.daaw.ol1 r4 = r13.r
            long r5 = r13.f
            r4.h(r5)
        L38:
            com.daaw.wq r4 = new com.daaw.wq     // Catch: java.lang.Throwable -> La0
            com.daaw.mp r8 = r13.h     // Catch: java.lang.Throwable -> La0
            long r9 = r0.c     // Catch: java.lang.Throwable -> La0
            long r11 = r8.c(r0)     // Catch: java.lang.Throwable -> La0
            r7 = r4
            r7.<init>(r8, r9, r11)     // Catch: java.lang.Throwable -> La0
            boolean r0 = r13.u     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L6b
            boolean r0 = r13.B     // Catch: java.lang.Throwable -> La0
            if (r0 != 0) goto L6b
            long r5 = r13.k(r4)     // Catch: java.lang.Throwable -> La0
            r13.B = r1     // Catch: java.lang.Throwable -> La0
            com.daaw.rb0 r0 = r13.y     // Catch: java.lang.Throwable -> La0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L66
            com.daaw.ol1 r1 = r13.r     // Catch: java.lang.Throwable -> La0
            long r5 = r1.b(r5)     // Catch: java.lang.Throwable -> La0
            goto L68
        L66:
            long r5 = r13.f     // Catch: java.lang.Throwable -> La0
        L68:
            r0.Y(r5)     // Catch: java.lang.Throwable -> La0
        L6b:
            if (r3 == 0) goto L72
            int r0 = r13.A     // Catch: java.lang.Throwable -> La0
            r4.j(r0)     // Catch: java.lang.Throwable -> La0
        L72:
            if (r2 != 0) goto L8e
            boolean r0 = r13.D     // Catch: java.lang.Throwable -> L80
            if (r0 != 0) goto L8e
            com.daaw.zz r0 = r13.t     // Catch: java.lang.Throwable -> L80
            r1 = 0
            int r2 = r0.d(r4, r1)     // Catch: java.lang.Throwable -> L80
            goto L72
        L80:
            r0 = move-exception
            long r1 = r4.getPosition()     // Catch: java.lang.Throwable -> La0
            com.daaw.pp r3 = r13.a     // Catch: java.lang.Throwable -> La0
            long r3 = r3.c     // Catch: java.lang.Throwable -> La0
            long r1 = r1 - r3
            int r2 = (int) r1     // Catch: java.lang.Throwable -> La0
            r13.A = r2     // Catch: java.lang.Throwable -> La0
            throw r0     // Catch: java.lang.Throwable -> La0
        L8e:
            long r0 = r4.getPosition()     // Catch: java.lang.Throwable -> La0
            com.daaw.pp r2 = r13.a     // Catch: java.lang.Throwable -> La0
            long r2 = r2.c     // Catch: java.lang.Throwable -> La0
            long r0 = r0 - r2
            int r1 = (int) r0     // Catch: java.lang.Throwable -> La0
            r13.A = r1     // Catch: java.lang.Throwable -> La0
            com.daaw.mp r0 = r13.h
            com.daaw.sq1.h(r0)
            return
        La0:
            r0 = move-exception
            com.daaw.mp r1 = r13.h
            com.daaw.sq1.h(r1)
            goto La8
        La7:
            throw r0
        La8:
            goto La7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.jb0.i():void");
    }

    public final void j() {
        pp ppVar;
        if (this.C || (ppVar = this.n) == null) {
            return;
        }
        pp b = ppVar.b(this.z);
        try {
            mp mpVar = this.m;
            wq wqVar = new wq(mpVar, b.c, mpVar.c(b));
            int i = 0;
            while (i == 0 && !this.D) {
                i = this.t.d(wqVar, null);
            }
            this.z = (int) (wqVar.getPosition() - this.n.c);
            sq1.h(this.m);
            this.C = true;
        } catch (Throwable th) {
            sq1.h(this.m);
            throw th;
        }
    }

    public final long k(a00 a00Var) {
        Metadata c;
        a00Var.i();
        if (a00Var.d(this.x.a, 0, 10, true)) {
            this.x.G(10);
            if (this.x.A() != qe0.c) {
                return -9223372036854775807L;
            }
            this.x.K(3);
            int w = this.x.w();
            int i = w + 10;
            if (i > this.x.b()) {
                rv0 rv0Var = this.x;
                byte[] bArr = rv0Var.a;
                rv0Var.G(i);
                System.arraycopy(bArr, 0, this.x.a, 0, 10);
            }
            if (a00Var.d(this.x.a, 10, w, true) && (c = this.w.c(this.x.a, w)) != null) {
                int b = c.b();
                for (int i2 = 0; i2 < b; i2++) {
                    Metadata.Entry a = c.a(i2);
                    if (a instanceof PrivFrame) {
                        PrivFrame privFrame = (PrivFrame) a;
                        if ("com.apple.streaming.transportStreamTimestamp".equals(privFrame.q)) {
                            System.arraycopy(privFrame.r, 0, this.x.a, 0, 8);
                            this.x.G(8);
                            return this.x.q() & 8589934591L;
                        }
                    }
                }
                return -9223372036854775807L;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }
}
