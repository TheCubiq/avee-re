package com.daaw;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public final class sl8 implements rj8 {
    public static final Object W = new Object();
    public static ExecutorService X;
    public static int Y;
    public boolean A;
    public boolean B;
    public long C;
    public float D;
    public hi8[] E;
    public ByteBuffer[] F;
    public ByteBuffer G;
    public int H;
    public ByteBuffer I;
    public byte[] J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public sc8 R;
    public long S;
    public boolean T;
    public boolean U;
    public final yk8 V;
    public final bi8 a;
    public final mk8 b;
    public final an8 c;
    public final hi8[] d;
    public final hi8[] e;
    public final ds4 f;
    public final ik8 g;
    public final ArrayDeque h;
    public ol8 i;
    public final el8 j;
    public final el8 k;
    public final sk8 l;
    public lh8 m;
    public lj8 n;
    public wk8 o;
    public wk8 p;
    public AudioTrack q;
    public o98 r;
    public cl8 s;
    public cl8 t;
    public final pp3 u;
    public long v;
    public long w;
    public long x;
    public long y;
    public int z;

    public /* synthetic */ sl8(uk8 uk8Var, ql8 ql8Var) {
        bi8 bi8Var;
        yk8 yk8Var;
        bi8Var = uk8Var.a;
        this.a = bi8Var;
        yk8Var = uk8Var.c;
        this.V = yk8Var;
        int i = it5.a;
        this.l = uk8Var.b;
        ds4 ds4Var = new ds4(xp4.a);
        this.f = ds4Var;
        ds4Var.e();
        this.g = new ik8(new il8(this, null));
        mk8 mk8Var = new mk8();
        this.b = mk8Var;
        an8 an8Var = new an8();
        this.c = an8Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new gm8(), mk8Var, an8Var);
        Collections.addAll(arrayList, yk8Var.e());
        this.d = (hi8[]) arrayList.toArray(new hi8[0]);
        this.e = new hi8[]{new yl8()};
        this.D = 1.0f;
        this.r = o98.c;
        this.Q = 0;
        this.R = new sc8(0, 0.0f);
        pp3 pp3Var = pp3.d;
        this.t = new cl8(pp3Var, false, 0L, 0L, null);
        this.u = pp3Var;
        this.L = -1;
        this.E = new hi8[0];
        this.F = new ByteBuffer[0];
        this.h = new ArrayDeque();
        this.j = new el8(100L);
        this.k = new el8(100L);
    }

    public static boolean F(AudioTrack audioTrack) {
        return it5.a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public static /* synthetic */ void q(AudioTrack audioTrack, ds4 ds4Var) {
        try {
            audioTrack.flush();
            audioTrack.release();
            ds4Var.e();
            synchronized (W) {
                int i = Y - 1;
                Y = i;
                if (i == 0) {
                    X.shutdown();
                    X = null;
                }
            }
        } catch (Throwable th) {
            ds4Var.e();
            synchronized (W) {
                int i2 = Y - 1;
                Y = i2;
                if (i2 == 0) {
                    X.shutdown();
                    X = null;
                }
                throw th;
            }
        }
    }

    public final void A(pp3 pp3Var, boolean z) {
        cl8 v = v();
        if (pp3Var.equals(v.a) && z == v.b) {
            return;
        }
        cl8 cl8Var = new cl8(pp3Var, z, -9223372036854775807L, -9223372036854775807L, null);
        if (E()) {
            this.s = cl8Var;
        } else {
            this.t = cl8Var;
        }
    }

    public final void B() {
        if (E()) {
            if (it5.a >= 21) {
                this.q.setVolume(this.D);
                return;
            }
            AudioTrack audioTrack = this.q;
            float f = this.D;
            audioTrack.setStereoVolume(f, f);
        }
    }

    public final void C(ByteBuffer byteBuffer, long j) {
        int write;
        lj8 lj8Var;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.I;
            if (byteBuffer2 != null) {
                uo4.d(byteBuffer2 == byteBuffer);
            } else {
                this.I = byteBuffer;
                if (it5.a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.J;
                    if (bArr == null || bArr.length < remaining) {
                        this.J = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.J, 0, remaining);
                    byteBuffer.position(position);
                    this.K = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            int i = it5.a;
            if (i < 21) {
                int a = this.g.a(this.x);
                if (a > 0) {
                    write = this.q.write(this.J, this.K, Math.min(remaining2, a));
                    if (write > 0) {
                        this.K += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
            } else {
                write = this.q.write(byteBuffer, remaining2, 1);
            }
            this.S = SystemClock.elapsedRealtime();
            if (write < 0) {
                pj8 pj8Var = new pj8(write, this.p.a, (((i < 24 || write != -6) && write != -32) || this.y <= 0) ? false : false);
                lj8 lj8Var2 = this.n;
                if (lj8Var2 != null) {
                    lj8Var2.a(pj8Var);
                }
                if (pj8Var.q) {
                    throw pj8Var;
                }
                this.k.b(pj8Var);
                return;
            }
            this.k.a();
            if (F(this.q)) {
                if (this.y > 0) {
                    this.U = false;
                }
                if (this.O && (lj8Var = this.n) != null && write < remaining2 && !this.U) {
                    em8 em8Var = ((cm8) lj8Var).a;
                    if (em8.w0(em8Var) != null) {
                        em8.w0(em8Var).zza();
                    }
                }
            }
            int i2 = this.p.c;
            if (i2 == 0) {
                this.x += write;
            }
            if (write == remaining2) {
                if (i2 != 0) {
                    uo4.f(byteBuffer == this.G);
                    this.y += this.z * this.H;
                }
                this.I = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D() {
        /*
            r9 = this;
            int r0 = r9.L
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.L = r3
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.L
            com.daaw.hi8[] r5 = r9.E
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.zzd()
        L1f:
            r9.z(r7)
            boolean r0 = r4.zzh()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.L
            int r0 = r0 + r2
            r9.L = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.I
            if (r0 == 0) goto L3b
            r9.C(r0, r7)
            java.nio.ByteBuffer r0 = r9.I
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.L = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.sl8.D():boolean");
    }

    public final boolean E() {
        return this.q != null;
    }

    public final boolean G() {
        if ("audio/raw".equals(this.p.a.l)) {
            int i = this.p.a.A;
            return true;
        }
        return false;
    }

    @Override // com.daaw.rj8
    public final int a(f92 f92Var) {
        if (!"audio/raw".equals(f92Var.l)) {
            if (!this.T) {
                int i = it5.a;
            }
            return this.a.a(f92Var) != null ? 2 : 0;
        }
        boolean v = it5.v(f92Var.A);
        int i2 = f92Var.A;
        if (v) {
            return i2 != 2 ? 1 : 2;
        }
        s95.e("DefaultAudioSink", "Invalid PCM encoding: " + i2);
        return 0;
    }

    @Override // com.daaw.rj8
    public final boolean b() {
        return !E() || (this.M && !zzt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0152 A[Catch: jj8 -> 0x0156, TryCatch #2 {jj8 -> 0x0156, blocks: (B:36:0x0087, B:49:0x00d2, B:51:0x00da, B:53:0x00e0, B:54:0x00e7, B:55:0x00f9, B:57:0x00fd, B:59:0x0101, B:60:0x0106, B:64:0x011c, B:45:0x009c, B:47:0x00a5, B:69:0x014a, B:71:0x0152, B:72:0x0155, B:39:0x0090, B:41:0x0095), top: B:186:0x0087, inners: #3 }] */
    @Override // com.daaw.rj8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.nio.ByteBuffer r25, long r26, int r28) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.sl8.c(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.daaw.rj8
    public final void d(lh8 lh8Var) {
        this.m = lh8Var;
    }

    @Override // com.daaw.rj8
    public final long e(boolean z) {
        long c0;
        if (!E() || this.B) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.g.b(z), this.p.a(t()));
        while (!this.h.isEmpty() && min >= ((cl8) this.h.getFirst()).d) {
            this.t = (cl8) this.h.remove();
        }
        cl8 cl8Var = this.t;
        long j = min - cl8Var.d;
        if (cl8Var.a.equals(pp3.d)) {
            c0 = this.t.c + j;
        } else if (this.h.isEmpty()) {
            c0 = this.V.a(j) + this.t.c;
        } else {
            cl8 cl8Var2 = (cl8) this.h.getFirst();
            c0 = cl8Var2.c - it5.c0(cl8Var2.d - min, this.t.a.a);
        }
        return c0 + this.p.a(this.V.b());
    }

    @Override // com.daaw.rj8
    public final void f(f92 f92Var, int i, int[] iArr) {
        int i2;
        hi8[] hi8VarArr;
        int intValue;
        int i3;
        int intValue2;
        int i4;
        int i5;
        int P;
        int[] iArr2;
        if ("audio/raw".equals(f92Var.l)) {
            uo4.d(it5.v(f92Var.A));
            i3 = it5.Y(f92Var.A, f92Var.y);
            hi8[] hi8VarArr2 = this.d;
            this.c.k(f92Var.B, f92Var.C);
            if (it5.a < 21 && f92Var.y == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i6 = 0; i6 < 6; i6++) {
                    iArr2[i6] = i6;
                }
            } else {
                iArr2 = iArr;
            }
            this.b.i(iArr2);
            di8 di8Var = new di8(f92Var.z, f92Var.y, f92Var.A);
            for (hi8 hi8Var : hi8VarArr2) {
                try {
                    di8 a = hi8Var.a(di8Var);
                    if (true == hi8Var.zzg()) {
                        di8Var = a;
                    }
                } catch (fi8 e) {
                    throw new hj8(e, f92Var);
                }
            }
            int i7 = di8Var.c;
            int i8 = di8Var.a;
            int i9 = di8Var.b;
            int T = it5.T(i9);
            hi8VarArr = hi8VarArr2;
            i5 = it5.Y(i7, i9);
            i4 = i8;
            i2 = 0;
            intValue = i7;
            intValue2 = T;
        } else {
            hi8[] hi8VarArr3 = new hi8[0];
            int i10 = f92Var.z;
            int i11 = it5.a;
            Pair a2 = this.a.a(f92Var);
            if (a2 == null) {
                throw new hj8("Unable to configure passthrough for: ".concat(String.valueOf(f92Var)), f92Var);
            }
            i2 = 2;
            hi8VarArr = hi8VarArr3;
            intValue = ((Integer) a2.first).intValue();
            i3 = -1;
            intValue2 = ((Integer) a2.second).intValue();
            i4 = i10;
            i5 = -1;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i4, intValue2, intValue);
        uo4.f(minBufferSize != -2);
        int i12 = 250000;
        if (i2 == 0) {
            P = it5.P(minBufferSize * 4, wl8.a(250000, i4, i5), wl8.a(750000, i4, i5));
        } else if (i2 != 1) {
            int i13 = 5;
            if (intValue == 5) {
                i12 = 500000;
                intValue = 5;
            } else {
                i13 = intValue;
            }
            P = i47.a((i12 * wl8.b(intValue)) / 1000000);
            i5 = i5;
            intValue = i13;
        } else {
            P = i47.a((wl8.b(intValue) * 50000000) / 1000000);
        }
        int max = (((Math.max(minBufferSize, P) + i5) - 1) / i5) * i5;
        if (intValue == 0) {
            throw new hj8("Invalid output encoding (mode=" + i2 + ") for: " + String.valueOf(f92Var), f92Var);
        } else if (intValue2 == 0) {
            throw new hj8("Invalid output channel config (mode=" + i2 + ") for: " + String.valueOf(f92Var), f92Var);
        } else {
            this.T = false;
            wk8 wk8Var = new wk8(f92Var, i3, i2, i5, i4, intValue2, intValue, max, hi8VarArr);
            if (E()) {
                this.o = wk8Var;
            } else {
                this.p = wk8Var;
            }
        }
    }

    @Override // com.daaw.rj8
    public final void g(int i) {
        if (this.Q != i) {
            this.Q = i;
            this.P = i != 0;
            zze();
        }
    }

    @Override // com.daaw.rj8
    public final boolean h(f92 f92Var) {
        return a(f92Var) != 0;
    }

    @Override // com.daaw.rj8
    public final void i(sc8 sc8Var) {
        if (this.R.equals(sc8Var)) {
            return;
        }
        int i = sc8Var.a;
        if (this.q != null) {
            int i2 = this.R.a;
        }
        this.R = sc8Var;
    }

    @Override // com.daaw.rj8
    public final void j(float f) {
        if (this.D != f) {
            this.D = f;
            B();
        }
    }

    @Override // com.daaw.rj8
    public final void k(boolean z) {
        A(v().a, z);
    }

    @Override // com.daaw.rj8
    public final void l(o98 o98Var) {
        if (this.r.equals(o98Var)) {
            return;
        }
        this.r = o98Var;
        zze();
    }

    @Override // com.daaw.rj8
    public final void m(lj8 lj8Var) {
        this.n = lj8Var;
    }

    @Override // com.daaw.rj8
    public final void n(pp3 pp3Var) {
        A(new pp3(it5.A(pp3Var.a, 0.1f, 8.0f), it5.A(pp3Var.b, 0.1f, 8.0f)), v().b);
    }

    public final long s() {
        wk8 wk8Var = this.p;
        return wk8Var.c == 0 ? this.v / wk8Var.b : this.w;
    }

    public final long t() {
        wk8 wk8Var = this.p;
        return wk8Var.c == 0 ? this.x / wk8Var.d : this.y;
    }

    public final AudioTrack u(wk8 wk8Var) {
        try {
            return wk8Var.b(false, this.r, this.Q);
        } catch (jj8 e) {
            lj8 lj8Var = this.n;
            if (lj8Var != null) {
                lj8Var.a(e);
            }
            throw e;
        }
    }

    public final cl8 v() {
        cl8 cl8Var = this.s;
        return cl8Var != null ? cl8Var : !this.h.isEmpty() ? (cl8) this.h.getLast() : this.t;
    }

    public final void w(long j) {
        pp3 pp3Var;
        boolean z;
        if (G()) {
            yk8 yk8Var = this.V;
            pp3Var = v().a;
            yk8Var.c(pp3Var);
        } else {
            pp3Var = pp3.d;
        }
        pp3 pp3Var2 = pp3Var;
        if (G()) {
            yk8 yk8Var2 = this.V;
            boolean z2 = v().b;
            yk8Var2.d(z2);
            z = z2;
        } else {
            z = false;
        }
        this.h.add(new cl8(pp3Var2, z, Math.max(0L, j), this.p.a(t()), null));
        hi8[] hi8VarArr = this.p.i;
        ArrayList arrayList = new ArrayList();
        for (hi8 hi8Var : hi8VarArr) {
            if (hi8Var.zzg()) {
                arrayList.add(hi8Var);
            } else {
                hi8Var.zzc();
            }
        }
        int size = arrayList.size();
        this.E = (hi8[]) arrayList.toArray(new hi8[size]);
        this.F = new ByteBuffer[size];
        x();
        lj8 lj8Var = this.n;
        if (lj8Var != null) {
            em8.x0(((cm8) lj8Var).a).s(z);
        }
    }

    public final void x() {
        int i = 0;
        while (true) {
            hi8[] hi8VarArr = this.E;
            if (i >= hi8VarArr.length) {
                return;
            }
            hi8 hi8Var = hi8VarArr[i];
            hi8Var.zzc();
            this.F[i] = hi8Var.zzb();
            i++;
        }
    }

    public final void y() {
        if (this.N) {
            return;
        }
        this.N = true;
        this.g.c(t());
        this.q.stop();
    }

    public final void z(long j) {
        ByteBuffer byteBuffer;
        int length = this.E.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.F[i - 1];
            } else {
                byteBuffer = this.G;
                if (byteBuffer == null) {
                    byteBuffer = hi8.a;
                }
            }
            if (i == length) {
                C(byteBuffer, j);
            } else {
                hi8 hi8Var = this.E[i];
                if (i > this.L) {
                    hi8Var.b(byteBuffer);
                }
                ByteBuffer zzb = hi8Var.zzb();
                this.F[i] = zzb;
                if (zzb.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i--;
        }
    }

    @Override // com.daaw.rj8
    public final pp3 zzc() {
        return v().a;
    }

    @Override // com.daaw.rj8
    public final void zze() {
        if (E()) {
            this.v = 0L;
            this.w = 0L;
            this.x = 0L;
            this.y = 0L;
            this.U = false;
            this.z = 0;
            this.t = new cl8(v().a, v().b, 0L, 0L, null);
            this.C = 0L;
            this.s = null;
            this.h.clear();
            this.G = null;
            this.H = 0;
            this.I = null;
            this.N = false;
            this.M = false;
            this.L = -1;
            this.c.j();
            x();
            if (this.g.h()) {
                this.q.pause();
            }
            if (F(this.q)) {
                ol8 ol8Var = this.i;
                Objects.requireNonNull(ol8Var);
                ol8Var.b(this.q);
            }
            if (it5.a < 21 && !this.P) {
                this.Q = 0;
            }
            wk8 wk8Var = this.o;
            if (wk8Var != null) {
                this.p = wk8Var;
                this.o = null;
            }
            this.g.d();
            final AudioTrack audioTrack = this.q;
            final ds4 ds4Var = this.f;
            ds4Var.c();
            synchronized (W) {
                if (X == null) {
                    X = it5.q("ExoPlayer:AudioTrackReleaseThread");
                }
                Y++;
                X.execute(new Runnable() { // from class: com.daaw.ok8
                    @Override // java.lang.Runnable
                    public final void run() {
                        sl8.q(audioTrack, ds4Var);
                    }
                });
            }
            this.q = null;
        }
        this.k.a();
        this.j.a();
    }

    @Override // com.daaw.rj8
    public final void zzf() {
        this.A = true;
    }

    @Override // com.daaw.rj8
    public final void zzg() {
        this.O = false;
        if (E() && this.g.k()) {
            this.q.pause();
        }
    }

    @Override // com.daaw.rj8
    public final void zzh() {
        this.O = true;
        if (E()) {
            this.g.f();
            this.q.play();
        }
    }

    @Override // com.daaw.rj8
    public final void zzi() {
        if (!this.M && E() && D()) {
            y();
            this.M = true;
        }
    }

    @Override // com.daaw.rj8
    public final void zzj() {
        zze();
        for (hi8 hi8Var : this.d) {
            hi8Var.zzf();
        }
        hi8[] hi8VarArr = this.e;
        int length = hi8VarArr.length;
        for (int i = 0; i <= 0; i++) {
            hi8VarArr[i].zzf();
        }
        this.O = false;
        this.T = false;
    }

    @Override // com.daaw.rj8
    public final boolean zzt() {
        return E() && this.g.g(t());
    }
}
