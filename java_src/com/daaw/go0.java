package com.daaw;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.daaw.rs1;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.video.DummySurface;
import java.nio.ByteBuffer;
@TargetApi(16)
/* loaded from: classes.dex */
public class go0 extends do0 {
    public static final int[] X0 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public long A0;
    public long B0;
    public long C0;
    public int D0;
    public int E0;
    public int F0;
    public long G0;
    public int H0;
    public float I0;
    public int J0;
    public int K0;
    public int L0;
    public float M0;
    public int N0;
    public int O0;
    public int P0;
    public float Q0;
    public boolean R0;
    public int S0;
    public c T0;
    public long U0;
    public long V0;
    public int W0;
    public final Context m0;
    public final ps1 n0;
    public final rs1.a o0;
    public final long p0;
    public final int q0;
    public final boolean r0;
    public final long[] s0;
    public final long[] t0;
    public b u0;
    public boolean v0;
    public Surface w0;
    public Surface x0;
    public int y0;
    public boolean z0;

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;

        public b(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    @TargetApi(23)
    /* loaded from: classes.dex */
    public final class c implements MediaCodec.OnFrameRenderedListener {
        public c(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }

        @Override // android.media.MediaCodec.OnFrameRenderedListener
        public void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
            go0 go0Var = go0.this;
            if (this != go0Var.T0) {
                return;
            }
            go0Var.O0();
        }
    }

    public go0(Context context, eo0 eo0Var, long j, yu<i40> yuVar, boolean z, Handler handler, rs1 rs1Var, int i) {
        super(2, eo0Var, yuVar, z);
        this.p0 = j;
        this.q0 = i;
        Context applicationContext = context.getApplicationContext();
        this.m0 = applicationContext;
        this.n0 = new ps1(applicationContext);
        this.o0 = new rs1.a(handler, rs1Var);
        this.r0 = D0();
        this.s0 = new long[10];
        this.t0 = new long[10];
        this.V0 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
        this.B0 = -9223372036854775807L;
        this.J0 = -1;
        this.K0 = -1;
        this.M0 = -1.0f;
        this.I0 = -1.0f;
        this.y0 = 1;
        A0();
    }

    public static boolean B0(String str) {
        String str2 = sq1.b;
        if (((!"deb".equals(str2) && !"flo".equals(str2) && !"mido".equals(str2) && !"santoni".equals(str2)) || !"OMX.qcom.video.decoder.avc".equals(str)) && ((!"tcl_eu".equals(str2) && !"SVP-DTV15".equals(str2) && !"BRAVIA_ATV2".equals(str2) && !str2.startsWith("panell_") && !"F3311".equals(str2) && !"M5c".equals(str2) && !"QM16XE_U".equals(str2) && !"A7010a48".equals(str2) && !"woods_f".equals(sq1.d) && !"watson".equals(str2)) || !"OMX.MTK.VIDEO.DECODER.AVC".equals(str))) {
            String str3 = sq1.d;
            if (((!"ALE-L21".equals(str3) && !"CAM-L21".equals(str3)) || !"OMX.k3.video.decoder.avc".equals(str)) && (!"HUAWEI VNS-L21".equals(str3) || !"OMX.IMG.MSVDX.Decoder.AVC".equals(str))) {
                return false;
            }
        }
        return true;
    }

    @TargetApi(21)
    public static void C0(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    public static boolean D0() {
        return sq1.a <= 22 && "foster".equals(sq1.b) && "NVIDIA".equals(sq1.c);
    }

    public static Point F0(co0 co0Var, Format format) {
        int[] iArr;
        int i = format.z;
        int i2 = format.y;
        boolean z = i > i2;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        float f = i / i3;
        for (int i4 : X0) {
            int i5 = (int) (i4 * f);
            if (i4 <= i3 || i5 <= i) {
                break;
            }
            if (sq1.a >= 21) {
                int i6 = z ? i5 : i4;
                if (!z) {
                    i4 = i5;
                }
                Point b2 = co0Var.b(i6, i4);
                if (co0Var.n(b2.x, b2.y, format.A)) {
                    return b2;
                }
            } else {
                int f2 = sq1.f(i4, 16) * 16;
                int f3 = sq1.f(i5, 16) * 16;
                if (f2 * f3 <= fo0.l()) {
                    int i7 = z ? f3 : f2;
                    if (!z) {
                        f2 = f3;
                    }
                    return new Point(i7, f2);
                }
            }
        }
        return null;
    }

    public static int H0(Format format) {
        if (format.v != -1) {
            int size = format.w.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += format.w.get(i2).length;
            }
            return format.v + i;
        }
        return I0(format.u, format.y, format.z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int I0(String str, int i, int i2) {
        char c2;
        int i3;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        str.hashCode();
        int i4 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 2:
            case 4:
                i3 = i * i2;
                i4 = 2;
                break;
            case 1:
            case 5:
                i3 = i * i2;
                break;
            case 3:
                if (!"BRAVIA 4K 2015".equals(sq1.d)) {
                    i3 = sq1.f(i, 16) * sq1.f(i2, 16) * 16 * 16;
                    i4 = 2;
                    break;
                } else {
                    return -1;
                }
            default:
                return -1;
        }
        return (i3 * 3) / (i4 * 2);
    }

    public static boolean K0(long j) {
        return j < -30000;
    }

    public static boolean L0(long j) {
        return j < -500000;
    }

    @TargetApi(23)
    public static void V0(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    public static boolean y0(boolean z, Format format, Format format2) {
        return format.u.equals(format2.u) && format.B == format2.B && (z || (format.y == format2.y && format.z == format2.z)) && sq1.b(format.F, format2.F);
    }

    @Override // com.daaw.do0, com.daaw.xa
    public void A() {
        this.J0 = -1;
        this.K0 = -1;
        this.M0 = -1.0f;
        this.I0 = -1.0f;
        this.V0 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
        this.W0 = 0;
        A0();
        z0();
        this.n0.d();
        this.T0 = null;
        this.R0 = false;
        try {
            super.A();
        } finally {
            this.k0.a();
            this.o0.c(this.k0);
        }
    }

    public final void A0() {
        this.N0 = -1;
        this.O0 = -1;
        this.Q0 = -1.0f;
        this.P0 = -1;
    }

    @Override // com.daaw.do0, com.daaw.xa
    public void B(boolean z) {
        super.B(z);
        int i = w().a;
        this.S0 = i;
        this.R0 = i != 0;
        this.o0.e(this.k0);
        this.n0.e();
    }

    @Override // com.daaw.do0, com.daaw.xa
    public void C(long j, boolean z) {
        super.C(j, z);
        z0();
        this.A0 = -9223372036854775807L;
        this.E0 = 0;
        this.U0 = -9223372036854775807L;
        int i = this.W0;
        if (i != 0) {
            this.V0 = this.s0[i - 1];
            this.W0 = 0;
        }
        if (z) {
            U0();
        } else {
            this.B0 = -9223372036854775807L;
        }
    }

    @Override // com.daaw.do0, com.daaw.xa
    public void D() {
        super.D();
        this.D0 = 0;
        this.C0 = SystemClock.elapsedRealtime();
        this.G0 = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // com.daaw.do0, com.daaw.xa
    public void E() {
        this.B0 = -9223372036854775807L;
        N0();
        super.E();
    }

    public void E0(MediaCodec mediaCodec, int i, long j) {
        mm1.a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        mm1.c();
        c1(1);
    }

    @Override // com.daaw.xa
    public void F(Format[] formatArr, long j) {
        if (this.V0 == -9223372036854775807L) {
            this.V0 = j;
        } else {
            int i = this.W0;
            if (i == this.s0.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("Too many stream changes, so dropping offset: ");
                sb.append(this.s0[this.W0 - 1]);
            } else {
                this.W0 = i + 1;
            }
            long[] jArr = this.s0;
            int i2 = this.W0;
            jArr[i2 - 1] = j;
            this.t0[i2 - 1] = this.U0;
        }
        super.F(formatArr, j);
    }

    public b G0(co0 co0Var, Format format, Format[] formatArr) {
        int i = format.y;
        int i2 = format.z;
        int H0 = H0(format);
        if (formatArr.length == 1) {
            return new b(i, i2, H0);
        }
        boolean z = false;
        for (Format format2 : formatArr) {
            if (y0(co0Var.d, format, format2)) {
                int i3 = format2.y;
                z |= i3 == -1 || format2.z == -1;
                i = Math.max(i, i3);
                i2 = Math.max(i2, format2.z);
                H0 = Math.max(H0, H0(format2));
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Resolutions unknown. Codec max resolution: ");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            Point F0 = F0(co0Var, format);
            if (F0 != null) {
                i = Math.max(i, F0.x);
                i2 = Math.max(i2, F0.y);
                H0 = Math.max(H0, I0(format.u, i, i2));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Codec max resolution adjusted to: ");
                sb2.append(i);
                sb2.append("x");
                sb2.append(i2);
            }
        }
        return new b(i, i2, H0);
    }

    @Override // com.daaw.do0
    public int J(MediaCodec mediaCodec, co0 co0Var, Format format, Format format2) {
        if (y0(co0Var.d, format, format2)) {
            int i = format2.y;
            b bVar = this.u0;
            if (i > bVar.a || format2.z > bVar.b || H0(format2) > this.u0.c) {
                return 0;
            }
            return format.L(format2) ? 1 : 3;
        }
        return 0;
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat J0(Format format, b bVar, boolean z, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", format.u);
        mediaFormat.setInteger("width", format.y);
        mediaFormat.setInteger("height", format.z);
        no0.e(mediaFormat, format.w);
        no0.c(mediaFormat, "frame-rate", format.A);
        no0.d(mediaFormat, "rotation-degrees", format.B);
        no0.b(mediaFormat, format.F);
        mediaFormat.setInteger("max-width", bVar.a);
        mediaFormat.setInteger("max-height", bVar.b);
        no0.d(mediaFormat, "max-input-size", bVar.c);
        if (sq1.a >= 23) {
            mediaFormat.setInteger("priority", 0);
        }
        if (z) {
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            C0(mediaFormat, i);
        }
        return mediaFormat;
    }

    public boolean M0(MediaCodec mediaCodec, int i, long j, long j2) {
        int H = H(j2);
        if (H == 0) {
            return false;
        }
        this.k0.i++;
        c1(this.F0 + H);
        U();
        return true;
    }

    public final void N0() {
        if (this.D0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.o0.d(this.D0, elapsedRealtime - this.C0);
            this.D0 = 0;
            this.C0 = elapsedRealtime;
        }
    }

    public void O0() {
        if (this.z0) {
            return;
        }
        this.z0 = true;
        this.o0.g(this.w0);
    }

    public final void P0() {
        int i = this.J0;
        if (i == -1 && this.K0 == -1) {
            return;
        }
        if (this.N0 == i && this.O0 == this.K0 && this.P0 == this.L0 && this.Q0 == this.M0) {
            return;
        }
        this.o0.h(i, this.K0, this.L0, this.M0);
        this.N0 = this.J0;
        this.O0 = this.K0;
        this.P0 = this.L0;
        this.Q0 = this.M0;
    }

    public final void Q0() {
        if (this.z0) {
            this.o0.g(this.w0);
        }
    }

    @Override // com.daaw.do0
    public void R(co0 co0Var, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        b G0 = G0(co0Var, format, y());
        this.u0 = G0;
        MediaFormat J0 = J0(format, G0, this.r0, this.S0);
        if (this.w0 == null) {
            s6.f(a1(co0Var));
            if (this.x0 == null) {
                this.x0 = DummySurface.g(this.m0, co0Var.f);
            }
            this.w0 = this.x0;
        }
        mediaCodec.configure(J0, this.w0, mediaCrypto, 0);
        if (sq1.a < 23 || !this.R0) {
            return;
        }
        this.T0 = new c(mediaCodec);
    }

    public final void R0() {
        int i = this.N0;
        if (i == -1 && this.O0 == -1) {
            return;
        }
        this.o0.h(i, this.O0, this.P0, this.Q0);
    }

    public void S0(MediaCodec mediaCodec, int i, long j) {
        P0();
        mm1.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        mm1.c();
        this.G0 = SystemClock.elapsedRealtime() * 1000;
        this.k0.e++;
        this.E0 = 0;
        O0();
    }

    @TargetApi(21)
    public void T0(MediaCodec mediaCodec, int i, long j, long j2) {
        P0();
        mm1.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        mm1.c();
        this.G0 = SystemClock.elapsedRealtime() * 1000;
        this.k0.e++;
        this.E0 = 0;
        O0();
    }

    @Override // com.daaw.do0
    public void U() {
        super.U();
        this.F0 = 0;
    }

    public final void U0() {
        this.B0 = this.p0 > 0 ? SystemClock.elapsedRealtime() + this.p0 : -9223372036854775807L;
    }

    public final void W0(Surface surface) {
        if (surface == null) {
            Surface surface2 = this.x0;
            if (surface2 != null) {
                surface = surface2;
            } else {
                co0 X = X();
                if (X != null && a1(X)) {
                    surface = DummySurface.g(this.m0, X.f);
                    this.x0 = surface;
                }
            }
        }
        if (this.w0 == surface) {
            if (surface == null || surface == this.x0) {
                return;
            }
            R0();
            Q0();
            return;
        }
        this.w0 = surface;
        int state = getState();
        if (state == 1 || state == 2) {
            MediaCodec V = V();
            if (sq1.a < 23 || V == null || surface == null || this.v0) {
                o0();
                e0();
            } else {
                V0(V, surface);
            }
        }
        if (surface == null || surface == this.x0) {
            A0();
            z0();
            return;
        }
        R0();
        z0();
        if (state == 2) {
            U0();
        }
    }

    public boolean X0(long j, long j2) {
        return L0(j);
    }

    public boolean Y0(long j, long j2) {
        return K0(j);
    }

    public boolean Z0(long j, long j2) {
        return K0(j) && j2 > 100000;
    }

    public final boolean a1(co0 co0Var) {
        return sq1.a >= 23 && !this.R0 && !B0(co0Var.a) && (!co0Var.f || DummySurface.c(this.m0));
    }

    public void b1(MediaCodec mediaCodec, int i, long j) {
        mm1.a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        mm1.c();
        this.k0.f++;
    }

    public void c1(int i) {
        fq fqVar = this.k0;
        fqVar.g += i;
        this.D0 += i;
        int i2 = this.E0 + i;
        this.E0 = i2;
        fqVar.h = Math.max(i2, fqVar.h);
        if (this.D0 >= this.q0) {
            N0();
        }
    }

    @Override // com.daaw.do0, com.daaw.a41
    public boolean d() {
        Surface surface;
        if (super.d() && (this.z0 || (((surface = this.x0) != null && this.w0 == surface) || V() == null || this.R0))) {
            this.B0 = -9223372036854775807L;
            return true;
        } else if (this.B0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.B0) {
                return true;
            }
            this.B0 = -9223372036854775807L;
            return false;
        }
    }

    @Override // com.daaw.do0
    public void f0(String str, long j, long j2) {
        this.o0.b(str, j, j2);
        this.v0 = B0(str);
    }

    @Override // com.daaw.do0
    public void g0(Format format) {
        super.g0(format);
        this.o0.f(format);
        this.I0 = format.C;
        this.H0 = format.B;
    }

    @Override // com.daaw.do0
    public void h0(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        this.J0 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.K0 = integer;
        float f = this.I0;
        this.M0 = f;
        if (sq1.a >= 21) {
            int i = this.H0;
            if (i == 90 || i == 270) {
                int i2 = this.J0;
                this.J0 = integer;
                this.K0 = i2;
                this.M0 = 1.0f / f;
            }
        } else {
            this.L0 = this.H0;
        }
        mediaCodec.setVideoScalingMode(this.y0);
    }

    @Override // com.daaw.do0
    public void i0(long j) {
        this.F0--;
        while (true) {
            int i = this.W0;
            if (i == 0 || j < this.t0[0]) {
                return;
            }
            long[] jArr = this.s0;
            this.V0 = jArr[0];
            int i2 = i - 1;
            this.W0 = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.t0;
            System.arraycopy(jArr2, 1, jArr2, 0, this.W0);
        }
    }

    @Override // com.daaw.do0
    public void j0(gq gqVar) {
        this.F0++;
        this.U0 = Math.max(gqVar.s, this.U0);
        if (sq1.a >= 23 || !this.R0) {
            return;
        }
        O0();
    }

    @Override // com.daaw.do0
    public boolean l0(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        if (this.A0 == -9223372036854775807L) {
            this.A0 = j;
        }
        long j4 = j3 - this.V0;
        if (z) {
            b1(mediaCodec, i, j4);
            return true;
        }
        long j5 = j3 - j;
        if (this.w0 == this.x0) {
            if (K0(j5)) {
                b1(mediaCodec, i, j4);
                return true;
            }
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        boolean z2 = getState() == 2;
        if (!this.z0 || (z2 && Z0(j5, elapsedRealtime - this.G0))) {
            if (sq1.a >= 21) {
                T0(mediaCodec, i, j4, System.nanoTime());
                return true;
            }
            S0(mediaCodec, i, j4);
            return true;
        }
        if (z2 && j != this.A0) {
            long nanoTime = System.nanoTime();
            long b2 = this.n0.b(j3, ((j5 - (elapsedRealtime - j2)) * 1000) + nanoTime);
            long j6 = (b2 - nanoTime) / 1000;
            if (X0(j6, j2) && M0(mediaCodec, i, j4, j)) {
                return false;
            }
            if (Y0(j6, j2)) {
                E0(mediaCodec, i, j4);
                return true;
            } else if (sq1.a >= 21) {
                if (j6 < 50000) {
                    T0(mediaCodec, i, j4, b2);
                    return true;
                }
            } else if (j6 < 30000) {
                if (j6 > 11000) {
                    try {
                        Thread.sleep((j6 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                S0(mediaCodec, i, j4);
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.do0
    public void o0() {
        try {
            super.o0();
            this.F0 = 0;
            Surface surface = this.x0;
            if (surface != null) {
                if (this.w0 == surface) {
                    this.w0 = null;
                }
                surface.release();
                this.x0 = null;
            }
        } catch (Throwable th) {
            this.F0 = 0;
            if (this.x0 != null) {
                Surface surface2 = this.w0;
                Surface surface3 = this.x0;
                if (surface2 == surface3) {
                    this.w0 = null;
                }
                surface3.release();
                this.x0 = null;
            }
            throw th;
        }
    }

    @Override // com.daaw.xa, com.daaw.fx0.b
    public void r(int i, Object obj) {
        if (i == 1) {
            W0((Surface) obj);
        } else if (i != 4) {
            super.r(i, obj);
        } else {
            this.y0 = ((Integer) obj).intValue();
            MediaCodec V = V();
            if (V != null) {
                V.setVideoScalingMode(this.y0);
            }
        }
    }

    @Override // com.daaw.do0
    public boolean t0(co0 co0Var) {
        return this.w0 != null || a1(co0Var);
    }

    @Override // com.daaw.do0
    public int w0(eo0 eo0Var, yu<i40> yuVar, Format format) {
        boolean z;
        int i;
        int i2;
        String str = format.u;
        if (hq0.m(str)) {
            DrmInitData drmInitData = format.x;
            if (drmInitData != null) {
                z = false;
                for (int i3 = 0; i3 < drmInitData.s; i3++) {
                    z |= drmInitData.h(i3).t;
                }
            } else {
                z = false;
            }
            co0 b2 = eo0Var.b(str, z);
            if (b2 == null) {
                return (!z || eo0Var.b(str, false) == null) ? 1 : 2;
            } else if (xa.I(yuVar, drmInitData)) {
                boolean i4 = b2.i(format.r);
                if (i4 && (i = format.y) > 0 && (i2 = format.z) > 0) {
                    if (sq1.a >= 21) {
                        i4 = b2.n(i, i2, format.A);
                    } else {
                        boolean z2 = i * i2 <= fo0.l();
                        if (!z2) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("FalseCheck [legacyFrameSize, ");
                            sb.append(format.y);
                            sb.append("x");
                            sb.append(format.z);
                            sb.append("] [");
                            sb.append(sq1.e);
                            sb.append("]");
                        }
                        i4 = z2;
                    }
                }
                return (i4 ? 4 : 3) | (b2.d ? 16 : 8) | (b2.e ? 32 : 0);
            } else {
                return 2;
            }
        }
        return 0;
    }

    public final void z0() {
        MediaCodec V;
        this.z0 = false;
        if (sq1.a < 23 || !this.R0 || (V = V()) == null) {
            return;
        }
        this.T0 = new c(V);
    }
}
