package com.daaw;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class em8 extends hp8 implements g78 {

    /* renamed from: Q0 */
    public final Context f8577Q0;

    /* renamed from: R0 */
    public final dj8 f8578R0;

    /* renamed from: S0 */
    public final rj8 f8579S0;

    /* renamed from: T0 */
    public int f8580T0;

    /* renamed from: U0 */
    public boolean f8581U0;

    /* renamed from: V0 */
    public f92 f8582V0;

    /* renamed from: W0 */
    public long f8583W0;

    /* renamed from: X0 */
    public boolean f8584X0;

    /* renamed from: Y0 */
    public boolean f8585Y0;

    /* renamed from: Z0 */
    public boolean f8586Z0;

    /* renamed from: a1 */
    public f98 f8587a1;

    public em8(Context context, ap8 ap8Var, jp8 jp8Var, boolean z, Handler handler, fj8 fj8Var, rj8 rj8Var) {
        super(1, ap8Var, jp8Var, false, 44100.0f);
        this.f8577Q0 = context.getApplicationContext();
        this.f8579S0 = rj8Var;
        this.f8578R0 = new dj8(handler, fj8Var);
        rj8Var.mo10173m(new cm8(this, null));
    }

    /* renamed from: u0 */
    private final void m23368u0() {
        long mo10181e = this.f8579S0.mo10181e(zzM());
        if (mo10181e != Long.MIN_VALUE) {
            if (!this.f8585Y0) {
                mo10181e = Math.max(this.f8583W0, mo10181e);
            }
            this.f8583W0 = mo10181e;
            this.f8585Y0 = false;
        }
    }

    /* renamed from: z0 */
    public static List m23364z0(jp8 jp8Var, f92 f92Var, boolean z, rj8 rj8Var) {
        ep8 m20478d;
        String str = f92Var.f9275l;
        if (str == null) {
            return y17.m4260u();
        }
        if (!rj8Var.mo10178h(f92Var) || (m20478d = hq8.m20478d()) == null) {
            List m20476f = hq8.m20476f(str, false, false);
            String m20477e = hq8.m20477e(f92Var);
            if (m20477e == null) {
                return y17.m4262s(m20476f);
            }
            List m20476f2 = hq8.m20476f(m20477e, false, false);
            v17 m4266o = y17.m4266o();
            m4266o.m7547g(m20476f);
            m4266o.m7547g(m20476f2);
            return m4266o.m7546h();
        }
        return y17.m4259v(m20478d);
    }

    @Override // com.daaw.hp8, com.daaw.nk7
    /* renamed from: A */
    public final void mo9777A() {
        try {
            super.mo9777A();
            if (this.f8586Z0) {
                this.f8586Z0 = false;
                this.f8579S0.zzj();
            }
        } catch (Throwable th) {
            if (this.f8586Z0) {
                this.f8586Z0 = false;
                this.f8579S0.zzj();
            }
            throw th;
        }
    }

    @Override // com.daaw.nk7
    /* renamed from: B */
    public final void mo9775B() {
        this.f8579S0.zzh();
    }

    @Override // com.daaw.nk7
    /* renamed from: C */
    public final void mo9773C() {
        m23368u0();
        this.f8579S0.zzg();
    }

    @Override // com.daaw.hp8
    /* renamed from: E */
    public final float mo9770E(float f, f92 f92Var, f92[] f92VarArr) {
        int i = -1;
        for (f92 f92Var2 : f92VarArr) {
            int i2 = f92Var2.f9289z;
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
    /* renamed from: F */
    public final int mo9768F(jp8 jp8Var, f92 f92Var) {
        boolean z;
        if (ak3.m27383g(f92Var.f9275l)) {
            int i = it5.f13991a >= 21 ? 32 : 0;
            int i2 = f92Var.f9262E;
            boolean m20518r0 = hp8.m20518r0(f92Var);
            if (m20518r0 && this.f8579S0.mo10178h(f92Var) && (i2 == 0 || hq8.m20478d() != null)) {
                return i | 140;
            }
            if ((!"audio/raw".equals(f92Var.f9275l) || this.f8579S0.mo10178h(f92Var)) && this.f8579S0.mo10178h(it5.m19395f(2, f92Var.f9288y, f92Var.f9289z))) {
                List m23364z0 = m23364z0(jp8Var, f92Var, false, this.f8579S0);
                if (m23364z0.isEmpty()) {
                    return 129;
                }
                if (m20518r0) {
                    ep8 ep8Var = (ep8) m23364z0.get(0);
                    boolean m23309d = ep8Var.m23309d(f92Var);
                    if (!m23309d) {
                        for (int i3 = 1; i3 < m23364z0.size(); i3++) {
                            ep8 ep8Var2 = (ep8) m23364z0.get(i3);
                            if (ep8Var2.m23309d(f92Var)) {
                                ep8Var = ep8Var2;
                                z = false;
                                m23309d = true;
                                break;
                            }
                        }
                    }
                    z = true;
                    int i4 = true != m23309d ? 3 : 4;
                    int i5 = 8;
                    if (m23309d && ep8Var.m23308e(f92Var)) {
                        i5 = 16;
                    }
                    return i4 | i5 | i | (true != ep8Var.f8672g ? 0 : 64) | (true != z ? 0 : 128);
                }
                return 130;
            }
            return 129;
        }
        return 128;
    }

    @Override // com.daaw.hp8
    /* renamed from: G */
    public final tm7 mo9766G(ep8 ep8Var, f92 f92Var, f92 f92Var2) {
        int i;
        int i2;
        tm7 m23311b = ep8Var.m23311b(f92Var, f92Var2);
        int i3 = m23311b.f27879e;
        if (m23365y0(ep8Var, f92Var2) > this.f8580T0) {
            i3 |= 64;
        }
        String str = ep8Var.f8666a;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = m23311b.f27878d;
            i2 = 0;
        }
        return new tm7(str, f92Var, f92Var2, i, i2);
    }

    @Override // com.daaw.hp8
    /* renamed from: H */
    public final tm7 mo9764H(a78 a78Var) {
        tm7 mo9764H = super.mo9764H(a78Var);
        this.f8578R0.m24326g(a78Var.f2960a, mo9764H);
        return mo9764H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x00a8, code lost:
        if ("AXON 7 mini".equals(r10) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008b  */
    @Override // com.daaw.hp8
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zo8 mo9760K(ep8 ep8Var, f92 f92Var, MediaCrypto mediaCrypto, float f) {
        boolean z;
        MediaFormat mediaFormat;
        f92[] m15104p = m15104p();
        int m23365y0 = m23365y0(ep8Var, f92Var);
        if (m15104p.length != 1) {
            for (f92 f92Var2 : m15104p) {
                if (ep8Var.m23311b(f92Var, f92Var2).f27878d != 0) {
                    m23365y0 = Math.max(m23365y0, m23365y0(ep8Var, f92Var2));
                }
            }
        }
        this.f8580T0 = m23365y0;
        String str = ep8Var.f8666a;
        int i = it5.f13991a;
        if (i < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(it5.f13993c)) {
            String str2 = it5.f13992b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z = true;
                this.f8581U0 = z;
                String str3 = ep8Var.f8668c;
                int i2 = this.f8580T0;
                mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str3);
                mediaFormat.setInteger("channel-count", f92Var.f9288y);
                mediaFormat.setInteger("sample-rate", f92Var.f9289z);
                yb5.m3940b(mediaFormat, f92Var.f9277n);
                yb5.m3941a(mediaFormat, "max-input-size", i2);
                if (i >= 23) {
                    mediaFormat.setInteger("priority", 0);
                    if (f != -1.0f) {
                        if (i == 23) {
                            String str4 = it5.f13994d;
                            if (!"ZTE B2017G".equals(str4)) {
                            }
                        }
                        mediaFormat.setFloat("operating-rate", f);
                    }
                }
                if (i <= 28 && "audio/ac4".equals(f92Var.f9275l)) {
                    mediaFormat.setInteger("ac4-is-sync", 1);
                }
                if (i >= 24 && this.f8579S0.mo10185a(it5.m19395f(4, f92Var.f9288y, f92Var.f9289z)) == 2) {
                    mediaFormat.setInteger("pcm-encoding", 4);
                }
                if (i >= 32) {
                    mediaFormat.setInteger("max-output-channel-count", 99);
                }
                this.f8582V0 = ("audio/raw".equals(ep8Var.f8667b) || "audio/raw".equals(f92Var.f9275l)) ? null : f92Var;
                return zo8.m2022a(ep8Var, mediaFormat, f92Var, null);
            }
        }
        z = false;
        this.f8581U0 = z;
        String str32 = ep8Var.f8668c;
        int i22 = this.f8580T0;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str32);
        mediaFormat.setInteger("channel-count", f92Var.f9288y);
        mediaFormat.setInteger("sample-rate", f92Var.f9289z);
        yb5.m3940b(mediaFormat, f92Var.f9277n);
        yb5.m3941a(mediaFormat, "max-input-size", i22);
        if (i >= 23) {
        }
        if (i <= 28) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i >= 24) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i >= 32) {
        }
        this.f8582V0 = ("audio/raw".equals(ep8Var.f8667b) || "audio/raw".equals(f92Var.f9275l)) ? null : f92Var;
        return zo8.m2022a(ep8Var, mediaFormat, f92Var, null);
    }

    @Override // com.daaw.hp8
    /* renamed from: L */
    public final List mo9759L(jp8 jp8Var, f92 f92Var, boolean z) {
        return hq8.m20475g(m23364z0(jp8Var, f92Var, false, this.f8579S0), f92Var);
    }

    @Override // com.daaw.hp8
    /* renamed from: M */
    public final void mo9758M(Exception exc) {
        s95.m10495c("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f8578R0.m24332a(exc);
    }

    @Override // com.daaw.hp8
    /* renamed from: N */
    public final void mo9757N(String str, zo8 zo8Var, long j, long j2) {
        this.f8578R0.m24330c(str, j, j2);
    }

    @Override // com.daaw.hp8
    /* renamed from: O */
    public final void mo9756O(String str) {
        this.f8578R0.m24329d(str);
    }

    @Override // com.daaw.hp8
    /* renamed from: W */
    public final void mo9755W(f92 f92Var, MediaFormat mediaFormat) {
        int i;
        f92 f92Var2 = this.f8582V0;
        int[] iArr = null;
        if (f92Var2 != null) {
            f92Var = f92Var2;
        } else if (m20525f0() != null) {
            int m19408X = "audio/raw".equals(f92Var.f9275l) ? f92Var.f9258A : (it5.f13991a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? it5.m19408X(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            b72 b72Var = new b72();
            b72Var.m26372s("audio/raw");
            b72Var.m26377n(m19408X);
            b72Var.m26394c(f92Var.f9259B);
            b72Var.m26392d(f92Var.f9260C);
            b72Var.m26389e0(mediaFormat.getInteger("channel-count"));
            b72Var.m26371t(mediaFormat.getInteger("sample-rate"));
            f92 m26366y = b72Var.m26366y();
            if (this.f8581U0 && m26366y.f9288y == 6 && (i = f92Var.f9288y) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < f92Var.f9288y; i2++) {
                    iArr[i2] = i2;
                }
            }
            f92Var = m26366y;
        }
        try {
            this.f8579S0.mo10180f(f92Var, 0, iArr);
        } catch (hj8 e) {
            throw m15101s(e, e.f12613p, false, 5001);
        }
    }

    /* renamed from: X */
    public final void m23369X() {
        this.f8585Y0 = true;
    }

    @Override // com.daaw.hp8
    /* renamed from: Y */
    public final void mo9753Y() {
        this.f8579S0.zzf();
    }

    @Override // com.daaw.hp8
    /* renamed from: Z */
    public final void mo9752Z(ma7 ma7Var) {
        if (!this.f8584X0 || ma7Var.m20160f()) {
            return;
        }
        if (Math.abs(ma7Var.f18730e - this.f8583W0) > 500000) {
            this.f8583W0 = ma7Var.f18730e;
        }
        this.f8584X0 = false;
    }

    @Override // com.daaw.i98, com.daaw.l98
    /* renamed from: a */
    public final String mo9751a() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.daaw.hp8
    /* renamed from: a0 */
    public final void mo20529a0() {
        try {
            this.f8579S0.zzi();
        } catch (pj8 e) {
            throw m15101s(e, e.f22997r, e.f22996q, 5002);
        }
    }

    @Override // com.daaw.hp8
    /* renamed from: b0 */
    public final boolean mo9750b0(long j, long j2, bp8 bp8Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, f92 f92Var) {
        Objects.requireNonNull(byteBuffer);
        if (this.f8582V0 != null && (i2 & 2) != 0) {
            Objects.requireNonNull(bp8Var);
            bp8Var.mo18327g(i, false);
            return true;
        } else if (z) {
            if (bp8Var != null) {
                bp8Var.mo18327g(i, false);
            }
            this.f12794J0.f24155f += i3;
            this.f8579S0.zzf();
            return true;
        } else {
            try {
                if (this.f8579S0.mo10183c(byteBuffer, j3, i3)) {
                    if (bp8Var != null) {
                        bp8Var.mo18327g(i, false);
                    }
                    this.f12794J0.f24154e += i3;
                    return true;
                }
                return false;
            } catch (jj8 e) {
                throw m15101s(e, e.f15141r, e.f15140q, 5001);
            } catch (pj8 e2) {
                throw m15101s(e2, f92Var, e2.f22996q, 5002);
            }
        }
    }

    @Override // com.daaw.hp8
    /* renamed from: c0 */
    public final boolean mo20528c0(f92 f92Var) {
        return this.f8579S0.mo10178h(f92Var);
    }

    @Override // com.daaw.nk7, com.daaw.w88
    /* renamed from: h */
    public final void mo6337h(int i, Object obj) {
        if (i == 2) {
            this.f8579S0.mo10176j(((Float) obj).floatValue());
        } else if (i == 3) {
            this.f8579S0.mo10174l((o98) obj);
        } else if (i == 6) {
            this.f8579S0.mo10177i((sc8) obj);
        } else {
            switch (i) {
                case 9:
                    this.f8579S0.mo10175k(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.f8579S0.mo10179g(((Integer) obj).intValue());
                    return;
                case 11:
                    this.f8587a1 = (f98) obj;
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.daaw.g78
    /* renamed from: l */
    public final void mo19439l(pp3 pp3Var) {
        this.f8579S0.mo10172n(pp3Var);
    }

    @Override // com.daaw.hp8, com.daaw.nk7
    /* renamed from: x */
    public final void mo9742x() {
        this.f8586Z0 = true;
        try {
            this.f8579S0.zze();
            try {
                super.mo9742x();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.mo9742x();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.daaw.hp8, com.daaw.nk7
    /* renamed from: y */
    public final void mo9740y(boolean z, boolean z2) {
        super.mo9740y(z, z2);
        this.f8578R0.m24327f(this.f12794J0);
        m15098v();
        this.f8579S0.mo10182d(m15097w());
    }

    /* renamed from: y0 */
    public final int m23365y0(ep8 ep8Var, f92 f92Var) {
        int i;
        if (!"OMX.google.raw.decoder".equals(ep8Var.f8666a) || (i = it5.f13991a) >= 24 || (i == 23 && it5.m19372x(this.f8577Q0))) {
            return f92Var.f9276m;
        }
        return -1;
    }

    @Override // com.daaw.hp8, com.daaw.nk7
    /* renamed from: z */
    public final void mo9738z(long j, boolean z) {
        super.mo9738z(j, z);
        this.f8579S0.zze();
        this.f8583W0 = j;
        this.f8584X0 = true;
        this.f8585Y0 = true;
    }

    @Override // com.daaw.hp8, com.daaw.i98
    public final boolean zzM() {
        return super.zzM() && this.f8579S0.mo10184b();
    }

    @Override // com.daaw.hp8, com.daaw.i98
    public final boolean zzN() {
        return this.f8579S0.zzt() || super.zzN();
    }

    @Override // com.daaw.g78
    public final long zza() {
        if (mo15107m() == 2) {
            m23368u0();
        }
        return this.f8583W0;
    }

    @Override // com.daaw.g78
    public final pp3 zzc() {
        return this.f8579S0.zzc();
    }

    @Override // com.daaw.nk7, com.daaw.i98
    public final g78 zzi() {
        return this;
    }
}
