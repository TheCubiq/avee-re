package com.daaw;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzxk;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class sx8 extends hp8 {
    public static final int[] v1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean w1;
    public static boolean x1;
    public final Context Q0;
    public final cy8 R0;
    public final vy8 S0;
    public final boolean T0;
    public rx8 U0;
    public boolean V0;
    public boolean W0;
    public Surface X0;
    public zzxk Y0;
    public boolean Z0;
    public int a1;
    public boolean b1;
    public boolean c1;
    public boolean d1;
    public long e1;
    public long f1;
    public long g1;
    public int h1;
    public int i1;
    public int j1;
    public long k1;
    public long l1;
    public long m1;
    public int n1;
    public int o1;
    public int p1;
    public int q1;
    public float r1;
    public ll4 s1;
    public int t1;
    public vx8 u1;

    public sx8(Context context, ap8 ap8Var, jp8 jp8Var, long j, boolean z, Handler handler, wy8 wy8Var, int i, float f) {
        super(2, ap8Var, jp8Var, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.Q0 = applicationContext;
        this.R0 = new cy8(applicationContext);
        this.S0 = new vy8(handler, wy8Var);
        this.T0 = "NVIDIA".equals(it5.c);
        this.f1 = -9223372036854775807L;
        this.o1 = -1;
        this.p1 = -1;
        this.r1 = -1.0f;
        this.a1 = 1;
        this.t1 = 0;
        this.s1 = null;
    }

    public static List A0(Context context, jp8 jp8Var, f92 f92Var, boolean z, boolean z2) {
        String str = f92Var.l;
        if (str == null) {
            return y17.u();
        }
        List f = hq8.f(str, z, z2);
        String e = hq8.e(f92Var);
        if (e == null) {
            return y17.s(f);
        }
        List f2 = hq8.f(e, z, z2);
        if (it5.a < 26 || !"video/dolby-vision".equals(f92Var.l) || f2.isEmpty() || qx8.a(context)) {
            v17 o = y17.o();
            o.g(f);
            o.g(f2);
            return o.h();
        }
        return y17.s(f2);
    }

    public static boolean E0(long j) {
        return j < -30000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
        if (r3.equals("video/av01") != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int w0(com.daaw.ep8 r10, com.daaw.f92 r11) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.sx8.w0(com.daaw.ep8, com.daaw.f92):int");
    }

    public static int x0(ep8 ep8Var, f92 f92Var) {
        if (f92Var.m != -1) {
            int size = f92Var.n.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += ((byte[]) f92Var.n.get(i2)).length;
            }
            return f92Var.m + i;
        }
        return w0(ep8Var, f92Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x04c0, code lost:
        if (r0.equals("deb") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x07a0, code lost:
        if (r10 != 0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean z0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 2928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.sx8.z0(java.lang.String):boolean");
    }

    @Override // com.daaw.hp8, com.daaw.nk7
    @TargetApi(17)
    public final void A() {
        try {
            super.A();
            if (this.Y0 != null) {
                D0();
            }
        } catch (Throwable th) {
            if (this.Y0 != null) {
                D0();
            }
            throw th;
        }
    }

    @Override // com.daaw.nk7
    public final void B() {
        this.h1 = 0;
        this.g1 = SystemClock.elapsedRealtime();
        this.l1 = SystemClock.elapsedRealtime() * 1000;
        this.m1 = 0L;
        this.n1 = 0;
        this.R0.g();
    }

    public final void B0() {
        int i = this.o1;
        if (i == -1) {
            if (this.p1 == -1) {
                return;
            }
            i = -1;
        }
        ll4 ll4Var = this.s1;
        if (ll4Var != null && ll4Var.a == i && ll4Var.b == this.p1 && ll4Var.c == this.q1 && ll4Var.d == this.r1) {
            return;
        }
        ll4 ll4Var2 = new ll4(i, this.p1, this.q1, this.r1);
        this.s1 = ll4Var2;
        this.S0.t(ll4Var2);
    }

    @Override // com.daaw.nk7
    public final void C() {
        this.f1 = -9223372036854775807L;
        if (this.h1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.S0.d(this.h1, elapsedRealtime - this.g1);
            this.h1 = 0;
            this.g1 = elapsedRealtime;
        }
        int i = this.n1;
        if (i != 0) {
            this.S0.r(this.m1, i);
            this.m1 = 0L;
            this.n1 = 0;
        }
        this.R0.h();
    }

    public final void C0() {
        ll4 ll4Var = this.s1;
        if (ll4Var != null) {
            this.S0.t(ll4Var);
        }
    }

    public final void D0() {
        Surface surface = this.X0;
        zzxk zzxkVar = this.Y0;
        if (surface == zzxkVar) {
            this.X0 = null;
        }
        zzxkVar.release();
        this.Y0 = null;
    }

    @Override // com.daaw.hp8
    public final float E(float f, f92 f92Var, f92[] f92VarArr) {
        float f2 = -1.0f;
        for (f92 f92Var2 : f92VarArr) {
            float f3 = f92Var2.s;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // com.daaw.hp8
    public final int F(jp8 jp8Var, f92 f92Var) {
        boolean z;
        if (ak3.h(f92Var.l)) {
            int i = 0;
            boolean z2 = f92Var.o != null;
            List A0 = A0(this.Q0, jp8Var, f92Var, z2, false);
            if (z2 && A0.isEmpty()) {
                A0 = A0(this.Q0, jp8Var, f92Var, false, false);
            }
            if (A0.isEmpty()) {
                return 129;
            }
            if (hp8.r0(f92Var)) {
                ep8 ep8Var = (ep8) A0.get(0);
                boolean d = ep8Var.d(f92Var);
                if (!d) {
                    for (int i2 = 1; i2 < A0.size(); i2++) {
                        ep8 ep8Var2 = (ep8) A0.get(i2);
                        if (ep8Var2.d(f92Var)) {
                            ep8Var = ep8Var2;
                            z = false;
                            d = true;
                            break;
                        }
                    }
                }
                z = true;
                int i3 = true != d ? 3 : 4;
                int i4 = true != ep8Var.e(f92Var) ? 8 : 16;
                int i5 = true != ep8Var.g ? 0 : 64;
                int i6 = true != z ? 0 : 128;
                if (it5.a >= 26 && "video/dolby-vision".equals(f92Var.l) && !qx8.a(this.Q0)) {
                    i6 = 256;
                }
                if (d) {
                    List A02 = A0(this.Q0, jp8Var, f92Var, z2, true);
                    if (!A02.isEmpty()) {
                        ep8 ep8Var3 = (ep8) hq8.g(A02, f92Var).get(0);
                        if (ep8Var3.d(f92Var) && ep8Var3.e(f92Var)) {
                            i = 32;
                        }
                    }
                }
                return i3 | i4 | i | i5 | i6;
            }
            return 130;
        }
        return 128;
    }

    public final boolean F0(ep8 ep8Var) {
        return it5.a >= 23 && !z0(ep8Var.a) && (!ep8Var.f || zzxk.b(this.Q0));
    }

    @Override // com.daaw.hp8
    public final tm7 G(ep8 ep8Var, f92 f92Var, f92 f92Var2) {
        int i;
        int i2;
        tm7 b = ep8Var.b(f92Var, f92Var2);
        int i3 = b.e;
        int i4 = f92Var2.q;
        rx8 rx8Var = this.U0;
        if (i4 > rx8Var.a || f92Var2.r > rx8Var.b) {
            i3 |= 256;
        }
        if (x0(ep8Var, f92Var2) > this.U0.c) {
            i3 |= 64;
        }
        String str = ep8Var.a;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = b.d;
            i2 = 0;
        }
        return new tm7(str, f92Var, f92Var2, i, i2);
    }

    public final void G0(bp8 bp8Var, int i, long j) {
        B0();
        int i2 = it5.a;
        Trace.beginSection("releaseOutputBuffer");
        bp8Var.g(i, true);
        Trace.endSection();
        this.l1 = SystemClock.elapsedRealtime() * 1000;
        this.J0.e++;
        this.i1 = 0;
        X();
    }

    @Override // com.daaw.hp8
    public final tm7 H(a78 a78Var) {
        tm7 H = super.H(a78Var);
        this.S0.f(a78Var.a, H);
        return H;
    }

    public final void H0(bp8 bp8Var, int i, long j, long j2) {
        B0();
        int i2 = it5.a;
        Trace.beginSection("releaseOutputBuffer");
        bp8Var.a(i, j2);
        Trace.endSection();
        this.l1 = SystemClock.elapsedRealtime() * 1000;
        this.J0.e++;
        this.i1 = 0;
        X();
    }

    public final void I0(bp8 bp8Var, int i, long j) {
        int i2 = it5.a;
        Trace.beginSection("skipVideoBuffer");
        bp8Var.g(i, false);
        Trace.endSection();
        this.J0.f++;
    }

    public final void J0(int i, int i2) {
        ql7 ql7Var = this.J0;
        ql7Var.h += i;
        int i3 = i + i2;
        ql7Var.g += i3;
        this.h1 += i3;
        int i4 = this.i1 + i3;
        this.i1 = i4;
        ql7Var.i = Math.max(i4, ql7Var.i);
    }

    @Override // com.daaw.hp8
    @TargetApi(17)
    public final zo8 K(ep8 ep8Var, f92 f92Var, MediaCrypto mediaCrypto, float f) {
        rx8 rx8Var;
        Point point;
        Pair b;
        int w0;
        f92 f92Var2 = f92Var;
        zzxk zzxkVar = this.Y0;
        if (zzxkVar != null && zzxkVar.p != ep8Var.f) {
            D0();
        }
        String str = ep8Var.c;
        f92[] p = p();
        int i = f92Var2.q;
        int i2 = f92Var2.r;
        int x0 = x0(ep8Var, f92Var);
        int length = p.length;
        if (length == 1) {
            if (x0 != -1 && (w0 = w0(ep8Var, f92Var)) != -1) {
                x0 = Math.min((int) (x0 * 1.5f), w0);
            }
            rx8Var = new rx8(i, i2, x0);
        } else {
            boolean z = false;
            for (int i3 = 0; i3 < length; i3++) {
                f92 f92Var3 = p[i3];
                if (f92Var2.x != null && f92Var3.x == null) {
                    b72 b2 = f92Var3.b();
                    b2.g0(f92Var2.x);
                    f92Var3 = b2.y();
                }
                if (ep8Var.b(f92Var2, f92Var3).d != 0) {
                    int i4 = f92Var3.q;
                    z |= i4 == -1 || f92Var3.r == -1;
                    i = Math.max(i, i4);
                    i2 = Math.max(i2, f92Var3.r);
                    x0 = Math.max(x0, x0(ep8Var, f92Var3));
                }
            }
            if (z) {
                s95.e("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i + "x" + i2);
                int i5 = f92Var2.r;
                int i6 = f92Var2.q;
                boolean z2 = i5 > i6;
                int i7 = z2 ? i5 : i6;
                if (true == z2) {
                    i5 = i6;
                }
                float f2 = i5 / i7;
                int[] iArr = v1;
                int i8 = 0;
                while (i8 < 9) {
                    int i9 = iArr[i8];
                    int[] iArr2 = iArr;
                    int i10 = (int) (i9 * f2);
                    if (i9 <= i7 || i10 <= i5) {
                        break;
                    }
                    int i11 = i5;
                    float f3 = f2;
                    if (it5.a >= 21) {
                        int i12 = true != z2 ? i9 : i10;
                        if (true != z2) {
                            i9 = i10;
                        }
                        Point a = ep8Var.a(i12, i9);
                        if (ep8Var.f(a.x, a.y, f92Var2.s)) {
                            point = a;
                            break;
                        }
                        i8++;
                        f92Var2 = f92Var;
                        iArr = iArr2;
                        i5 = i11;
                        f2 = f3;
                    } else {
                        try {
                            int O = it5.O(i9, 16) * 16;
                            int O2 = it5.O(i10, 16) * 16;
                            if (O * O2 <= hq8.a()) {
                                int i13 = true != z2 ? O : O2;
                                if (true != z2) {
                                    O = O2;
                                }
                                point = new Point(i13, O);
                            } else {
                                i8++;
                                f92Var2 = f92Var;
                                iArr = iArr2;
                                i5 = i11;
                                f2 = f3;
                            }
                        } catch (qp8 unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i = Math.max(i, point.x);
                    i2 = Math.max(i2, point.y);
                    b72 b3 = f92Var.b();
                    b3.x(i);
                    b3.f(i2);
                    x0 = Math.max(x0, w0(ep8Var, b3.y()));
                    s95.e("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i + "x" + i2);
                }
            }
            rx8Var = new rx8(i, i2, x0);
        }
        this.U0 = rx8Var;
        boolean z3 = this.T0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", f92Var.q);
        mediaFormat.setInteger("height", f92Var.r);
        yb5.b(mediaFormat, f92Var.n);
        float f4 = f92Var.s;
        if (f4 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f4);
        }
        yb5.a(mediaFormat, "rotation-degrees", f92Var.t);
        mo8 mo8Var = f92Var.x;
        if (mo8Var != null) {
            yb5.a(mediaFormat, "color-transfer", mo8Var.c);
            yb5.a(mediaFormat, "color-standard", mo8Var.a);
            yb5.a(mediaFormat, "color-range", mo8Var.b);
            byte[] bArr = mo8Var.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(f92Var.l) && (b = hq8.b(f92Var)) != null) {
            yb5.a(mediaFormat, "profile", ((Integer) b.first).intValue());
        }
        mediaFormat.setInteger("max-width", rx8Var.a);
        mediaFormat.setInteger("max-height", rx8Var.b);
        yb5.a(mediaFormat, "max-input-size", rx8Var.c);
        if (it5.a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z3) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (this.X0 == null) {
            if (!F0(ep8Var)) {
                throw new IllegalStateException();
            }
            if (this.Y0 == null) {
                this.Y0 = zzxk.a(this.Q0, ep8Var.f);
            }
            this.X0 = this.Y0;
        }
        return zo8.b(ep8Var, mediaFormat, f92Var, this.X0, null);
    }

    @Override // com.daaw.hp8
    public final List L(jp8 jp8Var, f92 f92Var, boolean z) {
        return hq8.g(A0(this.Q0, jp8Var, f92Var, false, false), f92Var);
    }

    @Override // com.daaw.hp8
    public final void M(Exception exc) {
        s95.c("MediaCodecVideoRenderer", "Video codec error", exc);
        this.S0.s(exc);
    }

    @Override // com.daaw.hp8
    public final void N(String str, zo8 zo8Var, long j, long j2) {
        this.S0.a(str, j, j2);
        this.V0 = z0(str);
        ep8 h0 = h0();
        Objects.requireNonNull(h0);
        boolean z = false;
        if (it5.a >= 29 && "video/x-vnd.on2.vp9".equals(h0.b)) {
            MediaCodecInfo.CodecProfileLevel[] g = h0.g();
            int length = g.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (g[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.W0 = z;
    }

    @Override // com.daaw.hp8
    public final void O(String str) {
        this.S0.b(str);
    }

    @Override // com.daaw.hp8
    public final void W(f92 f92Var, MediaFormat mediaFormat) {
        bp8 f0 = f0();
        if (f0 != null) {
            f0.f(this.a1);
        }
        Objects.requireNonNull(mediaFormat);
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        this.o1 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.p1 = integer;
        float f = f92Var.u;
        this.r1 = f;
        if (it5.a >= 21) {
            int i = f92Var.t;
            if (i == 90 || i == 270) {
                int i2 = this.o1;
                this.o1 = integer;
                this.p1 = i2;
                this.r1 = 1.0f / f;
            }
        } else {
            this.q1 = f92Var.t;
        }
        this.R0.c(f92Var.s);
    }

    public final void X() {
        this.d1 = true;
        if (this.b1) {
            return;
        }
        this.b1 = true;
        this.S0.q(this.X0);
        this.Z0 = true;
    }

    @Override // com.daaw.hp8
    public final void Y() {
        this.b1 = false;
        int i = it5.a;
    }

    @Override // com.daaw.hp8
    public final void Z(ma7 ma7Var) {
        this.j1++;
        int i = it5.a;
    }

    @Override // com.daaw.i98, com.daaw.l98
    public final String a() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.daaw.hp8
    public final boolean b0(long j, long j2, bp8 bp8Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, f92 f92Var) {
        boolean z3;
        int t;
        Objects.requireNonNull(bp8Var);
        if (this.e1 == -9223372036854775807L) {
            this.e1 = j;
        }
        if (j3 != this.k1) {
            this.R0.d(j3);
            this.k1 = j3;
        }
        long e0 = e0();
        long j4 = j3 - e0;
        if (z && !z2) {
            I0(bp8Var, i, j4);
            return true;
        }
        double d0 = d0();
        boolean z4 = m() == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        double d = j3 - j;
        Double.isNaN(d);
        Double.isNaN(d0);
        long j5 = (long) (d / d0);
        if (z4) {
            j5 -= elapsedRealtime - j2;
        }
        if (this.X0 == this.Y0) {
            if (E0(j5)) {
                I0(bp8Var, i, j4);
                y0(j5);
                return true;
            }
            return false;
        }
        long j6 = elapsedRealtime - this.l1;
        boolean z5 = this.d1 ? !this.b1 : z4 || this.c1;
        if (this.f1 == -9223372036854775807L && j >= e0 && (z5 || (z4 && E0(j5) && j6 > 100000))) {
            long nanoTime = System.nanoTime();
            if (it5.a >= 21) {
                H0(bp8Var, i, j4, nanoTime);
            } else {
                G0(bp8Var, i, j4);
            }
            y0(j5);
            return true;
        } else if (!z4 || j == this.e1) {
            return false;
        } else {
            long nanoTime2 = System.nanoTime();
            long a = this.R0.a((j5 * 1000) + nanoTime2);
            long j7 = (a - nanoTime2) / 1000;
            long j8 = this.f1;
            if (j7 < -500000 && !z2 && (t = t(j)) != 0) {
                if (j8 != -9223372036854775807L) {
                    ql7 ql7Var = this.J0;
                    ql7Var.d += t;
                    ql7Var.f += this.j1;
                } else {
                    this.J0.j++;
                    J0(t, this.j1);
                }
                o0();
                return false;
            } else if (E0(j7) && !z2) {
                if (j8 != -9223372036854775807L) {
                    I0(bp8Var, i, j4);
                    z3 = true;
                } else {
                    int i4 = it5.a;
                    Trace.beginSection("dropVideoBuffer");
                    bp8Var.g(i, false);
                    Trace.endSection();
                    z3 = true;
                    J0(0, 1);
                }
                y0(j7);
                return z3;
            } else if (it5.a >= 21) {
                if (j7 < 50000) {
                    H0(bp8Var, i, j4, a);
                    y0(j7);
                    return true;
                }
                return false;
            } else if (j7 < 30000) {
                if (j7 > 11000) {
                    try {
                        Thread.sleep(((-10000) + j7) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                G0(bp8Var, i, j4);
                y0(j7);
                return true;
            } else {
                return false;
            }
        }
    }

    @Override // com.daaw.hp8, com.daaw.nk7, com.daaw.i98
    public final void e(float f, float f2) {
        super.e(f, f2);
        this.R0.e(f);
    }

    @Override // com.daaw.hp8
    public final cp8 g0(Throwable th, ep8 ep8Var) {
        return new px8(th, ep8Var, this.X0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.view.Surface] */
    @Override // com.daaw.nk7, com.daaw.w88
    public final void h(int i, Object obj) {
        if (i != 1) {
            if (i == 7) {
                this.u1 = (vx8) obj;
                return;
            } else if (i == 10) {
                int intValue = ((Integer) obj).intValue();
                if (this.t1 != intValue) {
                    this.t1 = intValue;
                    return;
                }
                return;
            } else if (i != 4) {
                if (i != 5) {
                    return;
                }
                this.R0.j(((Integer) obj).intValue());
                return;
            } else {
                int intValue2 = ((Integer) obj).intValue();
                this.a1 = intValue2;
                bp8 f0 = f0();
                if (f0 != null) {
                    f0.f(intValue2);
                    return;
                }
                return;
            }
        }
        zzxk zzxkVar = obj instanceof Surface ? (Surface) obj : null;
        if (zzxkVar == null) {
            zzxk zzxkVar2 = this.Y0;
            if (zzxkVar2 != null) {
                zzxkVar = zzxkVar2;
            } else {
                ep8 h0 = h0();
                if (h0 != null && F0(h0)) {
                    zzxkVar = zzxk.a(this.Q0, h0.f);
                    this.Y0 = zzxkVar;
                }
            }
        }
        if (this.X0 == zzxkVar) {
            if (zzxkVar == null || zzxkVar == this.Y0) {
                return;
            }
            C0();
            if (this.Z0) {
                this.S0.q(this.X0);
                return;
            }
            return;
        }
        this.X0 = zzxkVar;
        this.R0.i(zzxkVar);
        this.Z0 = false;
        int m = m();
        bp8 f02 = f0();
        if (f02 != null) {
            if (it5.a < 23 || zzxkVar == null || this.V0) {
                l0();
                j0();
            } else {
                f02.e(zzxkVar);
            }
        }
        if (zzxkVar == null || zzxkVar == this.Y0) {
            this.s1 = null;
            this.b1 = false;
            int i2 = it5.a;
            return;
        }
        C0();
        this.b1 = false;
        int i3 = it5.a;
        if (m == 2) {
            this.f1 = -9223372036854775807L;
        }
    }

    @Override // com.daaw.hp8
    @TargetApi(29)
    public final void i0(ma7 ma7Var) {
        if (this.W0) {
            ByteBuffer byteBuffer = ma7Var.f;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        bp8 f0 = f0();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        f0.o(bundle);
                    }
                }
            }
        }
    }

    @Override // com.daaw.hp8
    public final void k0(long j) {
        super.k0(j);
        this.j1--;
    }

    @Override // com.daaw.hp8
    public final void m0() {
        super.m0();
        this.j1 = 0;
    }

    @Override // com.daaw.hp8
    public final boolean q0(ep8 ep8Var) {
        return this.X0 != null || F0(ep8Var);
    }

    @Override // com.daaw.hp8, com.daaw.nk7
    public final void x() {
        this.s1 = null;
        this.b1 = false;
        int i = it5.a;
        this.Z0 = false;
        try {
            super.x();
        } finally {
            this.S0.c(this.J0);
        }
    }

    @Override // com.daaw.hp8, com.daaw.nk7
    public final void y(boolean z, boolean z2) {
        super.y(z, z2);
        v();
        this.S0.e(this.J0);
        this.c1 = z2;
        this.d1 = false;
    }

    public final void y0(long j) {
        ql7 ql7Var = this.J0;
        ql7Var.k += j;
        ql7Var.l++;
        this.m1 += j;
        this.n1++;
    }

    @Override // com.daaw.hp8, com.daaw.nk7
    public final void z(long j, boolean z) {
        super.z(j, z);
        this.b1 = false;
        int i = it5.a;
        this.R0.f();
        this.k1 = -9223372036854775807L;
        this.e1 = -9223372036854775807L;
        this.i1 = 0;
        this.f1 = -9223372036854775807L;
    }

    @Override // com.daaw.hp8, com.daaw.i98
    public final boolean zzN() {
        zzxk zzxkVar;
        if (super.zzN() && (this.b1 || (((zzxkVar = this.Y0) != null && this.X0 == zzxkVar) || f0() == null))) {
            this.f1 = -9223372036854775807L;
            return true;
        } else if (this.f1 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f1) {
                return true;
            }
            this.f1 = -9223372036854775807L;
            return false;
        }
    }
}
