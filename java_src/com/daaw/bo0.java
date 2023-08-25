package com.daaw;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import com.daaw.n7;
import com.daaw.o7;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.nio.ByteBuffer;
@TargetApi(16)
/* loaded from: classes.dex */
public class bo0 extends do0 implements ao0 {
    public final Context m0;
    public final n7.a n0;
    public final o7 o0;
    public int p0;
    public boolean q0;
    public boolean r0;
    public MediaFormat s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public long x0;
    public boolean y0;
    public boolean z0;

    /* loaded from: classes.dex */
    public final class b implements o7.c {
        public b() {
        }

        @Override // com.daaw.o7.c
        public void a(int i) {
            bo0.this.n0.b(i);
            bo0.this.F0(i);
        }

        @Override // com.daaw.o7.c
        public void b(int i, long j, long j2) {
            bo0.this.n0.c(i, j, j2);
            bo0.this.H0(i, j, j2);
        }

        @Override // com.daaw.o7.c
        public void c() {
            bo0.this.G0();
            bo0.this.z0 = true;
        }
    }

    public bo0(Context context, eo0 eo0Var, yu<i40> yuVar, boolean z, Handler handler, n7 n7Var, g7 g7Var, m7... m7VarArr) {
        this(context, eo0Var, yuVar, z, handler, n7Var, new kq(g7Var, m7VarArr));
    }

    public bo0(Context context, eo0 eo0Var, yu<i40> yuVar, boolean z, Handler handler, n7 n7Var, o7 o7Var) {
        super(1, eo0Var, yuVar, z);
        this.m0 = context.getApplicationContext();
        this.o0 = o7Var;
        this.n0 = new n7.a(handler, n7Var);
        o7Var.u(new b());
    }

    public static boolean B0(String str) {
        if (sq1.a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(sq1.c)) {
            String str2 = sq1.b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.do0, com.daaw.xa
    public void A() {
        try {
            this.o0.a();
            try {
                super.A();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.A();
                throw th;
            } finally {
            }
        }
    }

    public boolean A0(String str) {
        int c = hq0.c(str);
        return c != 0 && this.o0.t(c);
    }

    @Override // com.daaw.do0, com.daaw.xa
    public void B(boolean z) {
        super.B(z);
        this.n0.f(this.k0);
        int i = w().a;
        if (i != 0) {
            this.o0.r(i);
        } else {
            this.o0.m();
        }
    }

    @Override // com.daaw.do0, com.daaw.xa
    public void C(long j, boolean z) {
        super.C(j, z);
        this.o0.e();
        this.x0 = j;
        this.y0 = true;
        this.z0 = true;
    }

    public final int C0(co0 co0Var, Format format) {
        PackageManager packageManager;
        int i = sq1.a;
        if (i < 24 && "OMX.google.raw.decoder".equals(co0Var.a)) {
            boolean z = true;
            if (i == 23 && (packageManager = this.m0.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback")) {
                z = false;
            }
            if (z) {
                return -1;
            }
        }
        return format.v;
    }

    @Override // com.daaw.do0, com.daaw.xa
    public void D() {
        super.D();
        this.o0.s();
    }

    public int D0(co0 co0Var, Format format, Format[] formatArr) {
        return C0(co0Var, format);
    }

    @Override // com.daaw.do0, com.daaw.xa
    public void E() {
        I0();
        this.o0.b();
        super.E();
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat E0(Format format, String str, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", format.G);
        mediaFormat.setInteger("sample-rate", format.H);
        no0.e(mediaFormat, format.w);
        no0.d(mediaFormat, "max-input-size", i);
        if (sq1.a >= 23) {
            mediaFormat.setInteger("priority", 0);
        }
        return mediaFormat;
    }

    public void F0(int i) {
    }

    public void G0() {
    }

    public void H0(int i, long j, long j2) {
    }

    public final void I0() {
        long l = this.o0.l(c());
        if (l != Long.MIN_VALUE) {
            if (!this.z0) {
                l = Math.max(this.x0, l);
            }
            this.x0 = l;
            this.z0 = false;
        }
    }

    @Override // com.daaw.do0
    public int J(MediaCodec mediaCodec, co0 co0Var, Format format, Format format2) {
        return 0;
    }

    @Override // com.daaw.do0
    public void R(co0 co0Var, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        this.p0 = D0(co0Var, format, y());
        this.r0 = B0(co0Var.a);
        this.q0 = co0Var.g;
        String str = co0Var.b;
        if (str == null) {
            str = "audio/raw";
        }
        MediaFormat E0 = E0(format, str, this.p0);
        mediaCodec.configure(E0, (Surface) null, mediaCrypto, 0);
        if (!this.q0) {
            this.s0 = null;
            return;
        }
        this.s0 = E0;
        E0.setString("mime", format.u);
    }

    @Override // com.daaw.do0
    public co0 Y(eo0 eo0Var, Format format, boolean z) {
        co0 a2;
        return (!A0(format.u) || (a2 = eo0Var.a()) == null) ? super.Y(eo0Var, format, z) : a2;
    }

    @Override // com.daaw.do0, com.daaw.a41
    public boolean c() {
        return super.c() && this.o0.c();
    }

    @Override // com.daaw.do0, com.daaw.a41
    public boolean d() {
        return this.o0.k() || super.d();
    }

    @Override // com.daaw.ao0
    public zw0 f(zw0 zw0Var) {
        return this.o0.f(zw0Var);
    }

    @Override // com.daaw.do0
    public void f0(String str, long j, long j2) {
        this.n0.d(str, j, j2);
    }

    @Override // com.daaw.do0
    public void g0(Format format) {
        super.g0(format);
        this.n0.g(format);
        this.t0 = "audio/raw".equals(format.u) ? format.I : 2;
        this.u0 = format.G;
        this.v0 = format.J;
        this.w0 = format.K;
    }

    @Override // com.daaw.ao0
    public zw0 h() {
        return this.o0.h();
    }

    @Override // com.daaw.do0
    public void h0(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int[] iArr;
        int i2;
        MediaFormat mediaFormat2 = this.s0;
        if (mediaFormat2 != null) {
            i = hq0.c(mediaFormat2.getString("mime"));
            mediaFormat = this.s0;
        } else {
            i = this.t0;
        }
        int i3 = i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.r0 && integer == 6 && (i2 = this.u0) < 6) {
            iArr = new int[i2];
            for (int i4 = 0; i4 < this.u0; i4++) {
                iArr[i4] = i4;
            }
        } else {
            iArr = null;
        }
        try {
            this.o0.i(i3, integer, integer2, 0, iArr, this.v0, this.w0);
        } catch (o7.a e) {
            throw qz.a(e, x());
        }
    }

    @Override // com.daaw.do0
    public void j0(gq gqVar) {
        if (!this.y0 || gqVar.i()) {
            return;
        }
        if (Math.abs(gqVar.s - this.x0) > 500000) {
            this.x0 = gqVar.s;
        }
        this.y0 = false;
    }

    @Override // com.daaw.do0
    public boolean l0(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        if (this.q0 && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.k0.f++;
            this.o0.o();
            return true;
        } else {
            try {
                if (this.o0.q(byteBuffer, j3)) {
                    mediaCodec.releaseOutputBuffer(i, false);
                    this.k0.e++;
                    return true;
                }
                return false;
            } catch (o7.b | o7.d e) {
                throw qz.a(e, x());
            }
        }
    }

    @Override // com.daaw.ao0
    public long o() {
        if (getState() == 2) {
            I0();
        }
        return this.x0;
    }

    @Override // com.daaw.do0
    public void p0() {
        try {
            this.o0.j();
        } catch (o7.d e) {
            throw qz.a(e, x());
        }
    }

    @Override // com.daaw.xa, com.daaw.fx0.b
    public void r(int i, Object obj) {
        if (i == 2) {
            this.o0.p(((Float) obj).floatValue());
        } else if (i != 3) {
            super.r(i, obj);
        } else {
            this.o0.n((f7) obj);
        }
    }

    @Override // com.daaw.xa, com.daaw.a41
    public ao0 v() {
        return this;
    }

    @Override // com.daaw.do0
    public int w0(eo0 eo0Var, yu<i40> yuVar, Format format) {
        boolean z;
        int i;
        int i2;
        String str = format.u;
        boolean z2 = false;
        if (hq0.k(str)) {
            int i3 = sq1.a >= 21 ? 32 : 0;
            boolean I = xa.I(yuVar, format.x);
            if (I && A0(str) && eo0Var.a() != null) {
                return i3 | 8 | 4;
            }
            if ((!"audio/raw".equals(str) || this.o0.t(format.I)) && this.o0.t(2)) {
                DrmInitData drmInitData = format.x;
                if (drmInitData != null) {
                    z = false;
                    for (int i4 = 0; i4 < drmInitData.s; i4++) {
                        z |= drmInitData.h(i4).t;
                    }
                } else {
                    z = false;
                }
                co0 b2 = eo0Var.b(str, z);
                if (b2 == null) {
                    return (!z || eo0Var.b(str, false) == null) ? 1 : 2;
                } else if (I) {
                    if (sq1.a < 21 || (((i = format.H) == -1 || b2.h(i)) && ((i2 = format.G) == -1 || b2.g(i2)))) {
                        z2 = true;
                    }
                    return i3 | 8 | (z2 ? 4 : 3);
                } else {
                    return 2;
                }
            }
            return 1;
        }
        return 0;
    }
}
