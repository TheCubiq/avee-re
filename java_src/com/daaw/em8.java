package com.daaw;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class em8 extends hp8 implements g78 {
    public final Context Q0;
    public final dj8 R0;
    public final rj8 S0;
    public int T0;
    public boolean U0;
    public f92 V0;
    public long W0;
    public boolean X0;
    public boolean Y0;
    public boolean Z0;
    public f98 a1;

    public em8(Context context, ap8 ap8Var, jp8 jp8Var, boolean z, Handler handler, fj8 fj8Var, rj8 rj8Var) {
        super(1, ap8Var, jp8Var, false, 44100.0f);
        this.Q0 = context.getApplicationContext();
        this.S0 = rj8Var;
        this.R0 = new dj8(handler, fj8Var);
        rj8Var.m(new cm8(this, null));
    }

    private final void u0() {
        long e = this.S0.e(zzM());
        if (e != Long.MIN_VALUE) {
            if (!this.Y0) {
                e = Math.max(this.W0, e);
            }
            this.W0 = e;
            this.Y0 = false;
        }
    }

    public static List z0(jp8 jp8Var, f92 f92Var, boolean z, rj8 rj8Var) {
        ep8 d;
        String str = f92Var.l;
        if (str == null) {
            return y17.u();
        }
        if (!rj8Var.h(f92Var) || (d = hq8.d()) == null) {
            List f = hq8.f(str, false, false);
            String e = hq8.e(f92Var);
            if (e == null) {
                return y17.s(f);
            }
            List f2 = hq8.f(e, false, false);
            v17 o = y17.o();
            o.g(f);
            o.g(f2);
            return o.h();
        }
        return y17.v(d);
    }

    @Override // com.daaw.hp8, com.daaw.nk7
    public final void A() {
        try {
            super.A();
            if (this.Z0) {
                this.Z0 = false;
                this.S0.zzj();
            }
        } catch (Throwable th) {
            if (this.Z0) {
                this.Z0 = false;
                this.S0.zzj();
            }
            throw th;
        }
    }

    @Override // com.daaw.nk7
    public final void B() {
        this.S0.zzh();
    }

    @Override // com.daaw.nk7
    public final void C() {
        u0();
        this.S0.zzg();
    }

    @Override // com.daaw.hp8
    public final float E(float f, f92 f92Var, f92[] f92VarArr) {
        int i = -1;
        for (f92 f92Var2 : f92VarArr) {
            int i2 = f92Var2.z;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // com.daaw.hp8
    public final int F(jp8 jp8Var, f92 f92Var) {
        boolean z;
        if (ak3.g(f92Var.l)) {
            int i = it5.a >= 21 ? 32 : 0;
            int i2 = f92Var.E;
            boolean r0 = hp8.r0(f92Var);
            if (r0 && this.S0.h(f92Var) && (i2 == 0 || hq8.d() != null)) {
                return i | 140;
            }
            if ((!"audio/raw".equals(f92Var.l) || this.S0.h(f92Var)) && this.S0.h(it5.f(2, f92Var.y, f92Var.z))) {
                List z0 = z0(jp8Var, f92Var, false, this.S0);
                if (z0.isEmpty()) {
                    return 129;
                }
                if (r0) {
                    ep8 ep8Var = (ep8) z0.get(0);
                    boolean d = ep8Var.d(f92Var);
                    if (!d) {
                        for (int i3 = 1; i3 < z0.size(); i3++) {
                            ep8 ep8Var2 = (ep8) z0.get(i3);
                            if (ep8Var2.d(f92Var)) {
                                ep8Var = ep8Var2;
                                z = false;
                                d = true;
                                break;
                            }
                        }
                    }
                    z = true;
                    int i4 = true != d ? 3 : 4;
                    int i5 = 8;
                    if (d && ep8Var.e(f92Var)) {
                        i5 = 16;
                    }
                    return i4 | i5 | i | (true != ep8Var.g ? 0 : 64) | (true != z ? 0 : 128);
                }
                return 130;
            }
            return 129;
        }
        return 128;
    }

    @Override // com.daaw.hp8
    public final tm7 G(ep8 ep8Var, f92 f92Var, f92 f92Var2) {
        int i;
        int i2;
        tm7 b = ep8Var.b(f92Var, f92Var2);
        int i3 = b.e;
        if (y0(ep8Var, f92Var2) > this.T0) {
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

    @Override // com.daaw.hp8
    public final tm7 H(a78 a78Var) {
        tm7 H = super.H(a78Var);
        this.R0.g(a78Var.a, H);
        return H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x00a8, code lost:
        if ("AXON 7 mini".equals(r10) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008b  */
    @Override // com.daaw.hp8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.daaw.zo8 K(com.daaw.ep8 r8, com.daaw.f92 r9, android.media.MediaCrypto r10, float r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.em8.K(com.daaw.ep8, com.daaw.f92, android.media.MediaCrypto, float):com.daaw.zo8");
    }

    @Override // com.daaw.hp8
    public final List L(jp8 jp8Var, f92 f92Var, boolean z) {
        return hq8.g(z0(jp8Var, f92Var, false, this.S0), f92Var);
    }

    @Override // com.daaw.hp8
    public final void M(Exception exc) {
        s95.c("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.R0.a(exc);
    }

    @Override // com.daaw.hp8
    public final void N(String str, zo8 zo8Var, long j, long j2) {
        this.R0.c(str, j, j2);
    }

    @Override // com.daaw.hp8
    public final void O(String str) {
        this.R0.d(str);
    }

    @Override // com.daaw.hp8
    public final void W(f92 f92Var, MediaFormat mediaFormat) {
        int i;
        f92 f92Var2 = this.V0;
        int[] iArr = null;
        if (f92Var2 != null) {
            f92Var = f92Var2;
        } else if (f0() != null) {
            int X = "audio/raw".equals(f92Var.l) ? f92Var.A : (it5.a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? it5.X(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            b72 b72Var = new b72();
            b72Var.s("audio/raw");
            b72Var.n(X);
            b72Var.c(f92Var.B);
            b72Var.d(f92Var.C);
            b72Var.e0(mediaFormat.getInteger("channel-count"));
            b72Var.t(mediaFormat.getInteger("sample-rate"));
            f92 y = b72Var.y();
            if (this.U0 && y.y == 6 && (i = f92Var.y) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < f92Var.y; i2++) {
                    iArr[i2] = i2;
                }
            }
            f92Var = y;
        }
        try {
            this.S0.f(f92Var, 0, iArr);
        } catch (hj8 e) {
            throw s(e, e.p, false, 5001);
        }
    }

    public final void X() {
        this.Y0 = true;
    }

    @Override // com.daaw.hp8
    public final void Y() {
        this.S0.zzf();
    }

    @Override // com.daaw.hp8
    public final void Z(ma7 ma7Var) {
        if (!this.X0 || ma7Var.f()) {
            return;
        }
        if (Math.abs(ma7Var.e - this.W0) > 500000) {
            this.W0 = ma7Var.e;
        }
        this.X0 = false;
    }

    @Override // com.daaw.i98, com.daaw.l98
    public final String a() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.daaw.hp8
    public final void a0() {
        try {
            this.S0.zzi();
        } catch (pj8 e) {
            throw s(e, e.r, e.q, 5002);
        }
    }

    @Override // com.daaw.hp8
    public final boolean b0(long j, long j2, bp8 bp8Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, f92 f92Var) {
        Objects.requireNonNull(byteBuffer);
        if (this.V0 != null && (i2 & 2) != 0) {
            Objects.requireNonNull(bp8Var);
            bp8Var.g(i, false);
            return true;
        } else if (z) {
            if (bp8Var != null) {
                bp8Var.g(i, false);
            }
            this.J0.f += i3;
            this.S0.zzf();
            return true;
        } else {
            try {
                if (this.S0.c(byteBuffer, j3, i3)) {
                    if (bp8Var != null) {
                        bp8Var.g(i, false);
                    }
                    this.J0.e += i3;
                    return true;
                }
                return false;
            } catch (jj8 e) {
                throw s(e, e.r, e.q, 5001);
            } catch (pj8 e2) {
                throw s(e2, f92Var, e2.q, 5002);
            }
        }
    }

    @Override // com.daaw.hp8
    public final boolean c0(f92 f92Var) {
        return this.S0.h(f92Var);
    }

    @Override // com.daaw.nk7, com.daaw.w88
    public final void h(int i, Object obj) {
        if (i == 2) {
            this.S0.j(((Float) obj).floatValue());
        } else if (i == 3) {
            this.S0.l((o98) obj);
        } else if (i == 6) {
            this.S0.i((sc8) obj);
        } else {
            switch (i) {
                case 9:
                    this.S0.k(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.S0.g(((Integer) obj).intValue());
                    return;
                case 11:
                    this.a1 = (f98) obj;
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.daaw.g78
    public final void l(pp3 pp3Var) {
        this.S0.n(pp3Var);
    }

    @Override // com.daaw.hp8, com.daaw.nk7
    public final void x() {
        this.Z0 = true;
        try {
            this.S0.zze();
            try {
                super.x();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.x();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.daaw.hp8, com.daaw.nk7
    public final void y(boolean z, boolean z2) {
        super.y(z, z2);
        this.R0.f(this.J0);
        v();
        this.S0.d(w());
    }

    public final int y0(ep8 ep8Var, f92 f92Var) {
        int i;
        if (!"OMX.google.raw.decoder".equals(ep8Var.a) || (i = it5.a) >= 24 || (i == 23 && it5.x(this.Q0))) {
            return f92Var.m;
        }
        return -1;
    }

    @Override // com.daaw.hp8, com.daaw.nk7
    public final void z(long j, boolean z) {
        super.z(j, z);
        this.S0.zze();
        this.W0 = j;
        this.X0 = true;
        this.Y0 = true;
    }

    @Override // com.daaw.hp8, com.daaw.i98
    public final boolean zzM() {
        return super.zzM() && this.S0.b();
    }

    @Override // com.daaw.hp8, com.daaw.i98
    public final boolean zzN() {
        return this.S0.zzt() || super.zzN();
    }

    @Override // com.daaw.g78
    public final long zza() {
        if (m() == 2) {
            u0();
        }
        return this.W0;
    }

    @Override // com.daaw.g78
    public final pp3 zzc() {
        return this.S0.zzc();
    }

    @Override // com.daaw.nk7, com.daaw.i98
    public final g78 zzi() {
        return this;
    }
}
