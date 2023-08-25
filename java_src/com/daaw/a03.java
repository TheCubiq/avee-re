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

    /* renamed from: Q */
    public final Context f2657Q;

    /* renamed from: R */
    public final c03 f2658R;

    /* renamed from: S */
    public final k03 f2659S;

    /* renamed from: T */
    public final boolean f2660T;

    /* renamed from: U */
    public final long[] f2661U;

    /* renamed from: V */
    public zzatd[] f2662V;

    /* renamed from: W */
    public zz2 f2663W;

    /* renamed from: X */
    public Surface f2664X;

    /* renamed from: Y */
    public Surface f2665Y;

    /* renamed from: Z */
    public boolean f2666Z;

    /* renamed from: a0 */
    public long f2667a0;

    /* renamed from: b0 */
    public long f2668b0;

    /* renamed from: c0 */
    public int f2669c0;

    /* renamed from: d0 */
    public int f2670d0;

    /* renamed from: e0 */
    public int f2671e0;

    /* renamed from: f0 */
    public float f2672f0;

    /* renamed from: g0 */
    public int f2673g0;

    /* renamed from: h0 */
    public int f2674h0;

    /* renamed from: i0 */
    public int f2675i0;

    /* renamed from: j0 */
    public float f2676j0;

    /* renamed from: k0 */
    public int f2677k0;

    /* renamed from: l0 */
    public int f2678l0;

    /* renamed from: m0 */
    public int f2679m0;

    /* renamed from: n0 */
    public float f2680n0;

    /* renamed from: o0 */
    public long f2681o0;

    /* renamed from: p0 */
    public int f2682p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a03(Context context, su2 su2Var, long j, Handler handler, l03 l03Var, int i) {
        super(2, su2Var, null, false);
        boolean z = false;
        this.f2657Q = context.getApplicationContext();
        this.f2658R = new c03(context);
        this.f2659S = new k03(handler, l03Var);
        if (pz2.f23547a <= 22 && "foster".equals(pz2.f23548b) && "NVIDIA".equals(pz2.f23549c)) {
            z = true;
        }
        this.f2660T = z;
        this.f2661U = new long[10];
        this.f2681o0 = -9223372036854775807L;
        this.f2667a0 = -9223372036854775807L;
        this.f2673g0 = -1;
        this.f2674h0 = -1;
        this.f2676j0 = -1.0f;
        this.f2672f0 = -1.0f;
        m27772S();
    }

    /* renamed from: R */
    public static int m27773R(zzatd zzatdVar) {
        int i = zzatdVar.f36774B;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    /* renamed from: W */
    public static boolean m27768W(long j) {
        return j < -30000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.daaw.qu2
    /* renamed from: B */
    public final void mo9962B(ju2 ju2Var, MediaCodec mediaCodec, zzatd zzatdVar, MediaCrypto mediaCrypto) {
        char c;
        int i;
        zzatd[] zzatdVarArr = this.f2662V;
        int i2 = zzatdVar.f36798y;
        int i3 = zzatdVar.f36799z;
        int i4 = zzatdVar.f36795v;
        if (i4 == -1) {
            String str = zzatdVar.f36794u;
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
                    } else if (!"BRAVIA 4K 2015".equals(pz2.f23550d)) {
                        i = pz2.m12846d(i2, 16) * pz2.m12846d(i3, 16) * 256;
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
        this.f2663W = zz2Var;
        boolean z = this.f2660T;
        MediaFormat m1131b = zzatdVar.m1131b();
        m1131b.setInteger("max-width", zz2Var.f35689a);
        m1131b.setInteger("max-height", zz2Var.f35690b);
        int i6 = zz2Var.f35691c;
        if (i6 != -1) {
            m1131b.setInteger("max-input-size", i6);
        }
        if (z) {
            m1131b.setInteger("auto-frc", 0);
        }
        if (this.f2664X == null) {
            az2.m26583e(m27767X(ju2Var.f15418d));
            if (this.f2665Y == null) {
                this.f2665Y = zzbbe.m1115a(this.f2657Q, ju2Var.f15418d);
            }
            this.f2664X = this.f2665Y;
        }
        mediaCodec.configure(m1131b, this.f2664X, (MediaCrypto) null, 0);
        int i7 = pz2.f23547a;
    }

    @Override // com.daaw.qu2
    /* renamed from: C */
    public final void mo9961C(String str, long j, long j2) {
        this.f2659S.m18097b(str, j, j2);
    }

    @Override // com.daaw.qu2
    /* renamed from: D */
    public final void mo9960D(zzatd zzatdVar) {
        super.mo9960D(zzatdVar);
        this.f2659S.m18093f(zzatdVar);
        float f = zzatdVar.f36775C;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.f2672f0 = f;
        this.f2671e0 = m27773R(zzatdVar);
    }

    @Override // com.daaw.qu2
    /* renamed from: E */
    public final void mo9959E(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        this.f2673g0 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.f2674h0 = integer;
        float f = this.f2672f0;
        this.f2676j0 = f;
        if (pz2.f23547a >= 21) {
            int i = this.f2671e0;
            if (i == 90 || i == 270) {
                int i2 = this.f2673g0;
                this.f2673g0 = integer;
                this.f2674h0 = i2;
                this.f2676j0 = 1.0f / f;
            }
        } else {
            this.f2675i0 = this.f2671e0;
        }
        mediaCodec.setVideoScalingMode(1);
    }

    @Override // com.daaw.qu2
    /* renamed from: G */
    public final boolean mo9957G(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        while (true) {
            int i3 = this.f2682p0;
            if (i3 == 0) {
                break;
            }
            long[] jArr = this.f2661U;
            long j4 = jArr[0];
            if (j3 < j4) {
                break;
            }
            this.f2681o0 = j4;
            int i4 = i3 - 1;
            this.f2682p0 = i4;
            System.arraycopy(jArr, 1, jArr, 0, i4);
        }
        long j5 = j3 - this.f2681o0;
        if (z) {
            m27774Q(mediaCodec, i, j5);
            return true;
        }
        long j6 = j3 - j;
        if (this.f2664X == this.f2665Y) {
            if (m27768W(j6)) {
                m27774Q(mediaCodec, i, j5);
                return true;
            }
            return false;
        } else if (!this.f2666Z) {
            if (pz2.f23547a >= 21) {
                m27775P(mediaCodec, i, j5, System.nanoTime());
            } else {
                m27776O(mediaCodec, i, j5);
            }
            return true;
        } else if (zzb() != 2) {
            return false;
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long nanoTime = System.nanoTime();
            long m25697a = this.f2658R.m25697a(j3, ((j6 - ((elapsedRealtime * 1000) - j2)) * 1000) + nanoTime);
            long j7 = (m25697a - nanoTime) / 1000;
            if (!m27768W(j7)) {
                if (pz2.f23547a >= 21) {
                    if (j7 < 50000) {
                        m27775P(mediaCodec, i, j5, m25697a);
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
                    m27776O(mediaCodec, i, j5);
                    return true;
                }
                return false;
            }
            nz2.m14710a("dropVideoBuffer");
            mediaCodec.releaseOutputBuffer(i, false);
            nz2.m14709b();
            as2 as2Var = this.f24347O;
            as2Var.f3523f++;
            this.f2669c0++;
            int i5 = this.f2670d0 + 1;
            this.f2670d0 = i5;
            as2Var.f3524g = Math.max(i5, as2Var.f3524g);
            if (this.f2669c0 == -1) {
                m27771T();
            }
            return true;
        }
    }

    @Override // com.daaw.qu2
    /* renamed from: K */
    public final void mo12215K(bs2 bs2Var) {
        int i = pz2.f23547a;
    }

    @Override // com.daaw.qu2
    /* renamed from: L */
    public final void mo12214L() {
        try {
            super.mo12214L();
        } finally {
            Surface surface = this.f2665Y;
            if (surface != null) {
                if (this.f2664X == surface) {
                    this.f2664X = null;
                }
                surface.release();
                this.f2665Y = null;
            }
        }
    }

    @Override // com.daaw.qu2
    /* renamed from: M */
    public final boolean mo12213M(MediaCodec mediaCodec, boolean z, zzatd zzatdVar, zzatd zzatdVar2) {
        if (zzatdVar.f36794u.equals(zzatdVar2.f36794u) && m27773R(zzatdVar) == m27773R(zzatdVar2)) {
            if (z || (zzatdVar.f36798y == zzatdVar2.f36798y && zzatdVar.f36799z == zzatdVar2.f36799z)) {
                int i = zzatdVar2.f36798y;
                zz2 zz2Var = this.f2663W;
                return i <= zz2Var.f35689a && zzatdVar2.f36799z <= zz2Var.f35690b && zzatdVar2.f36795v <= zz2Var.f35691c;
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.qu2
    /* renamed from: N */
    public final boolean mo12212N(ju2 ju2Var) {
        return this.f2664X != null || m27767X(ju2Var.f15418d);
    }

    /* renamed from: O */
    public final void m27776O(MediaCodec mediaCodec, int i, long j) {
        m27770U();
        nz2.m14710a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        nz2.m14709b();
        this.f24347O.f3521d++;
        this.f2670d0 = 0;
        m27766y();
    }

    @TargetApi(21)
    /* renamed from: P */
    public final void m27775P(MediaCodec mediaCodec, int i, long j, long j2) {
        m27770U();
        nz2.m14710a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        nz2.m14709b();
        this.f24347O.f3521d++;
        this.f2670d0 = 0;
        m27766y();
    }

    /* renamed from: Q */
    public final void m27774Q(MediaCodec mediaCodec, int i, long j) {
        nz2.m14710a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        nz2.m14709b();
        this.f24347O.f3522e++;
    }

    /* renamed from: S */
    public final void m27772S() {
        this.f2677k0 = -1;
        this.f2678l0 = -1;
        this.f2680n0 = -1.0f;
        this.f2679m0 = -1;
    }

    /* renamed from: T */
    public final void m27771T() {
        if (this.f2669c0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f2659S.m18095d(this.f2669c0, elapsedRealtime - this.f2668b0);
            this.f2669c0 = 0;
            this.f2668b0 = elapsedRealtime;
        }
    }

    /* renamed from: U */
    public final void m27770U() {
        int i = this.f2677k0;
        int i2 = this.f2673g0;
        if (i == i2 && this.f2678l0 == this.f2674h0 && this.f2679m0 == this.f2675i0 && this.f2680n0 == this.f2676j0) {
            return;
        }
        this.f2659S.m18091h(i2, this.f2674h0, this.f2675i0, this.f2676j0);
        this.f2677k0 = this.f2673g0;
        this.f2678l0 = this.f2674h0;
        this.f2679m0 = this.f2675i0;
        this.f2680n0 = this.f2676j0;
    }

    /* renamed from: V */
    public final void m27769V() {
        if (this.f2677k0 == -1 && this.f2678l0 == -1) {
            return;
        }
        this.f2659S.m18091h(this.f2673g0, this.f2674h0, this.f2675i0, this.f2676j0);
    }

    /* renamed from: X */
    public final boolean m27767X(boolean z) {
        return pz2.f23547a >= 23 && (!z || zzbbe.m1114b(this.f2657Q));
    }

    @Override // com.daaw.mp2
    /* renamed from: b */
    public final void mo9954b(int i, Object obj) {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.f2665Y;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    ju2 m12217I = m12217I();
                    if (m12217I != null && m27767X(m12217I.f15418d)) {
                        surface = zzbbe.m1115a(this.f2657Q, m12217I.f15418d);
                        this.f2665Y = surface;
                    }
                }
            }
            if (this.f2664X == surface) {
                if (surface == null || surface == this.f2665Y) {
                    return;
                }
                m27769V();
                if (this.f2666Z) {
                    this.f2659S.m18092g(this.f2664X);
                    return;
                }
                return;
            }
            this.f2664X = surface;
            int zzb = zzb();
            if (zzb == 1 || zzb == 2) {
                MediaCodec m12218H = m12218H();
                if (pz2.f23547a < 23 || m12218H == null || surface == null) {
                    mo12214L();
                    m12216J();
                } else {
                    m12218H.setOutputSurface(surface);
                }
            }
            if (surface == null || surface == this.f2665Y) {
                m27772S();
                this.f2666Z = false;
                int i2 = pz2.f23547a;
                return;
            }
            m27769V();
            this.f2666Z = false;
            int i3 = pz2.f23547a;
            if (zzb == 2) {
                this.f2667a0 = -9223372036854775807L;
            }
        }
    }

    @Override // com.daaw.qu2, com.daaw.gq2
    /* renamed from: d */
    public final boolean mo9953d() {
        Surface surface;
        if (super.mo9953d() && (this.f2666Z || (((surface = this.f2665Y) != null && this.f2664X == surface) || m12218H() == null))) {
            this.f2667a0 = -9223372036854775807L;
            return true;
        } else if (this.f2667a0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f2667a0) {
                return true;
            }
            this.f2667a0 = -9223372036854775807L;
            return false;
        }
    }

    @Override // com.daaw.qu2, com.daaw.ip2
    /* renamed from: q */
    public final void mo9949q() {
        this.f2673g0 = -1;
        this.f2674h0 = -1;
        this.f2676j0 = -1.0f;
        this.f2672f0 = -1.0f;
        this.f2681o0 = -9223372036854775807L;
        this.f2682p0 = 0;
        m27772S();
        this.f2666Z = false;
        int i = pz2.f23547a;
        this.f2658R.m25696b();
        try {
            super.mo9949q();
        } finally {
            this.f24347O.m27100a();
            this.f2659S.m18096c(this.f24347O);
        }
    }

    @Override // com.daaw.qu2, com.daaw.ip2
    /* renamed from: r */
    public final void mo9948r(boolean z) {
        super.mo9948r(z);
        int i = m19534p().f13924a;
        this.f2659S.m18094e(this.f24347O);
        this.f2658R.m25695c();
    }

    @Override // com.daaw.qu2, com.daaw.ip2
    /* renamed from: s */
    public final void mo9947s(long j, boolean z) {
        super.mo9947s(j, z);
        this.f2666Z = false;
        int i = pz2.f23547a;
        this.f2670d0 = 0;
        int i2 = this.f2682p0;
        if (i2 != 0) {
            this.f2681o0 = this.f2661U[i2 - 1];
            this.f2682p0 = 0;
        }
        this.f2667a0 = -9223372036854775807L;
    }

    @Override // com.daaw.ip2
    /* renamed from: t */
    public final void mo9946t() {
        this.f2669c0 = 0;
        this.f2668b0 = SystemClock.elapsedRealtime();
        this.f2667a0 = -9223372036854775807L;
    }

    @Override // com.daaw.ip2
    /* renamed from: u */
    public final void mo9945u() {
        m27771T();
    }

    @Override // com.daaw.ip2
    /* renamed from: v */
    public final void mo19533v(zzatd[] zzatdVarArr, long j) {
        this.f2662V = zzatdVarArr;
        if (this.f2681o0 == -9223372036854775807L) {
            this.f2681o0 = j;
            return;
        }
        int i = this.f2682p0;
        if (i == 10) {
            long j2 = this.f2661U[9];
            StringBuilder sb = new StringBuilder();
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j2);
        } else {
            this.f2682p0 = i + 1;
        }
        this.f2661U[this.f2682p0 - 1] = j;
    }

    @Override // com.daaw.qu2
    /* renamed from: x */
    public final int mo9944x(su2 su2Var, zzatd zzatdVar) {
        boolean z;
        int i;
        int i2;
        String str = zzatdVar.f36794u;
        if (fz2.m22127b(str)) {
            zzavc zzavcVar = zzatdVar.f36797x;
            if (zzavcVar != null) {
                z = false;
                for (int i3 = 0; i3 < zzavcVar.f36807r; i3++) {
                    z |= zzavcVar.m1118a(i3).f36804t;
                }
            } else {
                z = false;
            }
            ju2 m26959c = av2.m26959c(str, z);
            if (m26959c == null) {
                return 1;
            }
            boolean m18244e = m26959c.m18244e(zzatdVar.f36791r);
            if (m18244e && (i = zzatdVar.f36798y) > 0 && (i2 = zzatdVar.f36799z) > 0) {
                if (pz2.f23547a >= 21) {
                    m18244e = m26959c.m18243f(i, i2, zzatdVar.f36773A);
                } else {
                    m18244e = i * i2 <= av2.m26961a();
                    if (!m18244e) {
                        int i4 = zzatdVar.f36798y;
                        int i5 = zzatdVar.f36799z;
                        String str2 = pz2.f23551e;
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
            return (true != m18244e ? 2 : 3) | (true != m26959c.f15416b ? 4 : 8) | (true == m26959c.f15417c ? 16 : 0);
        }
        return 0;
    }

    /* renamed from: y */
    public final void m27766y() {
        if (this.f2666Z) {
            return;
        }
        this.f2666Z = true;
        this.f2659S.m18092g(this.f2664X);
    }
}
