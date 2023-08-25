package com.daaw;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzatd;
import com.google.android.gms.internal.ads.zzavc;
import com.google.android.gms.internal.ads.zzbbe;
import java.nio.ByteBuffer;
@TargetApi(16)
/* loaded from: classes.dex */
public final class a03 extends qu2 {
    public final Context Q;
    public final c03 R;
    public final k03 S;
    public final boolean T;
    public final long[] U;
    public zzatd[] V;
    public zz2 W;
    public Surface X;
    public Surface Y;
    public boolean Z;
    public long a0;
    public long b0;
    public int c0;
    public int d0;
    public int e0;
    public float f0;
    public int g0;
    public int h0;
    public int i0;
    public float j0;
    public int k0;
    public int l0;
    public int m0;
    public float n0;
    public long o0;
    public int p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a03(Context context, su2 su2Var, long j, Handler handler, l03 l03Var, int i) {
        super(2, su2Var, null, false);
        boolean z = false;
        this.Q = context.getApplicationContext();
        this.R = new c03(context);
        this.S = new k03(handler, l03Var);
        if (pz2.a <= 22 && "foster".equals(pz2.b) && "NVIDIA".equals(pz2.c)) {
            z = true;
        }
        this.T = z;
        this.U = new long[10];
        this.o0 = -9223372036854775807L;
        this.a0 = -9223372036854775807L;
        this.g0 = -1;
        this.h0 = -1;
        this.j0 = -1.0f;
        this.f0 = -1.0f;
        S();
    }

    public static int R(zzatd zzatdVar) {
        int i = zzatdVar.B;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public static boolean W(long j) {
        return j < -30000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.daaw.qu2
    public final void B(ju2 ju2Var, MediaCodec mediaCodec, zzatd zzatdVar, MediaCrypto mediaCrypto) {
        char c;
        int i;
        zzatd[] zzatdVarArr = this.V;
        int i2 = zzatdVar.y;
        int i3 = zzatdVar.z;
        int i4 = zzatdVar.v;
        if (i4 == -1) {
            String str = zzatdVar.u;
            if (i2 != -1 && i3 != -1) {
                int i5 = 4;
                switch (str.hashCode()) {
                    case -1664118616:
                        if (str.equals("video/3gpp")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1662541442:
                        if (str.equals("video/hevc")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1187890754:
                        if (str.equals("video/mp4v-es")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1331836730:
                        if (str.equals("video/avc")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1599127256:
                        if (str.equals("video/x-vnd.on2.vp8")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1599127257:
                        if (str.equals("video/x-vnd.on2.vp9")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c != 0 && c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c == 4 || c == 5) {
                                i = i2 * i3;
                                i4 = (i * 3) / (i5 + i5);
                            }
                        }
                    } else if (!"BRAVIA 4K 2015".equals(pz2.d)) {
                        i = pz2.d(i2, 16) * pz2.d(i3, 16) * 256;
                        i5 = 2;
                        i4 = (i * 3) / (i5 + i5);
                    }
                }
                i = i2 * i3;
                i5 = 2;
                i4 = (i * 3) / (i5 + i5);
            }
            i4 = -1;
        }
        int length = zzatdVarArr.length;
        zz2 zz2Var = new zz2(i2, i3, i4);
        this.W = zz2Var;
        boolean z = this.T;
        MediaFormat b = zzatdVar.b();
        b.setInteger("max-width", zz2Var.a);
        b.setInteger("max-height", zz2Var.b);
        int i6 = zz2Var.c;
        if (i6 != -1) {
            b.setInteger("max-input-size", i6);
        }
        if (z) {
            b.setInteger("auto-frc", 0);
        }
        if (this.X == null) {
            az2.e(X(ju2Var.d));
            if (this.Y == null) {
                this.Y = zzbbe.a(this.Q, ju2Var.d);
            }
            this.X = this.Y;
        }
        mediaCodec.configure(b, this.X, (MediaCrypto) null, 0);
        int i7 = pz2.a;
    }

    @Override // com.daaw.qu2
    public final void C(String str, long j, long j2) {
        this.S.b(str, j, j2);
    }

    @Override // com.daaw.qu2
    public final void D(zzatd zzatdVar) {
        super.D(zzatdVar);
        this.S.f(zzatdVar);
        float f = zzatdVar.C;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.f0 = f;
        this.e0 = R(zzatdVar);
    }

    @Override // com.daaw.qu2
    public final void E(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        this.g0 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.h0 = integer;
        float f = this.f0;
        this.j0 = f;
        if (pz2.a >= 21) {
            int i = this.e0;
            if (i == 90 || i == 270) {
                int i2 = this.g0;
                this.g0 = integer;
                this.h0 = i2;
                this.j0 = 1.0f / f;
            }
        } else {
            this.i0 = this.e0;
        }
        mediaCodec.setVideoScalingMode(1);
    }

    @Override // com.daaw.qu2
    public final boolean G(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        while (true) {
            int i3 = this.p0;
            if (i3 == 0) {
                break;
            }
            long[] jArr = this.U;
            long j4 = jArr[0];
            if (j3 < j4) {
                break;
            }
            this.o0 = j4;
            int i4 = i3 - 1;
            this.p0 = i4;
            System.arraycopy(jArr, 1, jArr, 0, i4);
        }
        long j5 = j3 - this.o0;
        if (z) {
            Q(mediaCodec, i, j5);
            return true;
        }
        long j6 = j3 - j;
        if (this.X == this.Y) {
            if (W(j6)) {
                Q(mediaCodec, i, j5);
                return true;
            }
            return false;
        } else if (!this.Z) {
            if (pz2.a >= 21) {
                P(mediaCodec, i, j5, System.nanoTime());
            } else {
                O(mediaCodec, i, j5);
            }
            return true;
        } else if (zzb() != 2) {
            return false;
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long nanoTime = System.nanoTime();
            long a = this.R.a(j3, ((j6 - ((elapsedRealtime * 1000) - j2)) * 1000) + nanoTime);
            long j7 = (a - nanoTime) / 1000;
            if (!W(j7)) {
                if (pz2.a >= 21) {
                    if (j7 < 50000) {
                        P(mediaCodec, i, j5, a);
                        return true;
                    }
                } else if (j7 < 30000) {
                    if (j7 > 11000) {
                        try {
                            Thread.sleep((j7 - 10000) / 1000);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    O(mediaCodec, i, j5);
                    return true;
                }
                return false;
            }
            nz2.a("dropVideoBuffer");
            mediaCodec.releaseOutputBuffer(i, false);
            nz2.b();
            as2 as2Var = this.O;
            as2Var.f++;
            this.c0++;
            int i5 = this.d0 + 1;
            this.d0 = i5;
            as2Var.g = Math.max(i5, as2Var.g);
            if (this.c0 == -1) {
                T();
            }
            return true;
        }
    }

    @Override // com.daaw.qu2
    public final void K(bs2 bs2Var) {
        int i = pz2.a;
    }

    @Override // com.daaw.qu2
    public final void L() {
        try {
            super.L();
        } finally {
            Surface surface = this.Y;
            if (surface != null) {
                if (this.X == surface) {
                    this.X = null;
                }
                surface.release();
                this.Y = null;
            }
        }
    }

    @Override // com.daaw.qu2
    public final boolean M(MediaCodec mediaCodec, boolean z, zzatd zzatdVar, zzatd zzatdVar2) {
        if (zzatdVar.u.equals(zzatdVar2.u) && R(zzatdVar) == R(zzatdVar2)) {
            if (z || (zzatdVar.y == zzatdVar2.y && zzatdVar.z == zzatdVar2.z)) {
                int i = zzatdVar2.y;
                zz2 zz2Var = this.W;
                return i <= zz2Var.a && zzatdVar2.z <= zz2Var.b && zzatdVar2.v <= zz2Var.c;
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.qu2
    public final boolean N(ju2 ju2Var) {
        return this.X != null || X(ju2Var.d);
    }

    public final void O(MediaCodec mediaCodec, int i, long j) {
        U();
        nz2.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        nz2.b();
        this.O.d++;
        this.d0 = 0;
        y();
    }

    @TargetApi(21)
    public final void P(MediaCodec mediaCodec, int i, long j, long j2) {
        U();
        nz2.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        nz2.b();
        this.O.d++;
        this.d0 = 0;
        y();
    }

    public final void Q(MediaCodec mediaCodec, int i, long j) {
        nz2.a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        nz2.b();
        this.O.e++;
    }

    public final void S() {
        this.k0 = -1;
        this.l0 = -1;
        this.n0 = -1.0f;
        this.m0 = -1;
    }

    public final void T() {
        if (this.c0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.S.d(this.c0, elapsedRealtime - this.b0);
            this.c0 = 0;
            this.b0 = elapsedRealtime;
        }
    }

    public final void U() {
        int i = this.k0;
        int i2 = this.g0;
        if (i == i2 && this.l0 == this.h0 && this.m0 == this.i0 && this.n0 == this.j0) {
            return;
        }
        this.S.h(i2, this.h0, this.i0, this.j0);
        this.k0 = this.g0;
        this.l0 = this.h0;
        this.m0 = this.i0;
        this.n0 = this.j0;
    }

    public final void V() {
        if (this.k0 == -1 && this.l0 == -1) {
            return;
        }
        this.S.h(this.g0, this.h0, this.i0, this.j0);
    }

    public final boolean X(boolean z) {
        return pz2.a >= 23 && (!z || zzbbe.b(this.Q));
    }

    @Override // com.daaw.mp2
    public final void b(int i, Object obj) {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.Y;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    ju2 I = I();
                    if (I != null && X(I.d)) {
                        surface = zzbbe.a(this.Q, I.d);
                        this.Y = surface;
                    }
                }
            }
            if (this.X == surface) {
                if (surface == null || surface == this.Y) {
                    return;
                }
                V();
                if (this.Z) {
                    this.S.g(this.X);
                    return;
                }
                return;
            }
            this.X = surface;
            int zzb = zzb();
            if (zzb == 1 || zzb == 2) {
                MediaCodec H = H();
                if (pz2.a < 23 || H == null || surface == null) {
                    L();
                    J();
                } else {
                    H.setOutputSurface(surface);
                }
            }
            if (surface == null || surface == this.Y) {
                S();
                this.Z = false;
                int i2 = pz2.a;
                return;
            }
            V();
            this.Z = false;
            int i3 = pz2.a;
            if (zzb == 2) {
                this.a0 = -9223372036854775807L;
            }
        }
    }

    @Override // com.daaw.qu2, com.daaw.gq2
    public final boolean d() {
        Surface surface;
        if (super.d() && (this.Z || (((surface = this.Y) != null && this.X == surface) || H() == null))) {
            this.a0 = -9223372036854775807L;
            return true;
        } else if (this.a0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.a0) {
                return true;
            }
            this.a0 = -9223372036854775807L;
            return false;
        }
    }

    @Override // com.daaw.qu2, com.daaw.ip2
    public final void q() {
        this.g0 = -1;
        this.h0 = -1;
        this.j0 = -1.0f;
        this.f0 = -1.0f;
        this.o0 = -9223372036854775807L;
        this.p0 = 0;
        S();
        this.Z = false;
        int i = pz2.a;
        this.R.b();
        try {
            super.q();
        } finally {
            this.O.a();
            this.S.c(this.O);
        }
    }

    @Override // com.daaw.qu2, com.daaw.ip2
    public final void r(boolean z) {
        super.r(z);
        int i = p().a;
        this.S.e(this.O);
        this.R.c();
    }

    @Override // com.daaw.qu2, com.daaw.ip2
    public final void s(long j, boolean z) {
        super.s(j, z);
        this.Z = false;
        int i = pz2.a;
        this.d0 = 0;
        int i2 = this.p0;
        if (i2 != 0) {
            this.o0 = this.U[i2 - 1];
            this.p0 = 0;
        }
        this.a0 = -9223372036854775807L;
    }

    @Override // com.daaw.ip2
    public final void t() {
        this.c0 = 0;
        this.b0 = SystemClock.elapsedRealtime();
        this.a0 = -9223372036854775807L;
    }

    @Override // com.daaw.ip2
    public final void u() {
        T();
    }

    @Override // com.daaw.ip2
    public final void v(zzatd[] zzatdVarArr, long j) {
        this.V = zzatdVarArr;
        if (this.o0 == -9223372036854775807L) {
            this.o0 = j;
            return;
        }
        int i = this.p0;
        if (i == 10) {
            long j2 = this.U[9];
            StringBuilder sb = new StringBuilder();
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j2);
        } else {
            this.p0 = i + 1;
        }
        this.U[this.p0 - 1] = j;
    }

    @Override // com.daaw.qu2
    public final int x(su2 su2Var, zzatd zzatdVar) {
        boolean z;
        int i;
        int i2;
        String str = zzatdVar.u;
        if (fz2.b(str)) {
            zzavc zzavcVar = zzatdVar.x;
            if (zzavcVar != null) {
                z = false;
                for (int i3 = 0; i3 < zzavcVar.r; i3++) {
                    z |= zzavcVar.a(i3).t;
                }
            } else {
                z = false;
            }
            ju2 c = av2.c(str, z);
            if (c == null) {
                return 1;
            }
            boolean e = c.e(zzatdVar.r);
            if (e && (i = zzatdVar.y) > 0 && (i2 = zzatdVar.z) > 0) {
                if (pz2.a >= 21) {
                    e = c.f(i, i2, zzatdVar.A);
                } else {
                    e = i * i2 <= av2.a();
                    if (!e) {
                        int i4 = zzatdVar.y;
                        int i5 = zzatdVar.z;
                        String str2 = pz2.e;
                        StringBuilder sb = new StringBuilder();
                        sb.append("FalseCheck [legacyFrameSize, ");
                        sb.append(i4);
                        sb.append("x");
                        sb.append(i5);
                        sb.append("] [");
                        sb.append(str2);
                        sb.append("]");
                    }
                }
            }
            return (true != e ? 2 : 3) | (true != c.b ? 4 : 8) | (true == c.c ? 16 : 0);
        }
        return 0;
    }

    public final void y() {
        if (this.Z) {
            return;
        }
        this.Z = true;
        this.S.g(this.X);
    }
}
