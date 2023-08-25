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
import com.daaw.InterfaceC2251n7;
import com.daaw.InterfaceC2411o7;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.nio.ByteBuffer;
@TargetApi(16)
/* loaded from: classes.dex */
public class bo0 extends do0 implements ao0 {

    /* renamed from: m0 */
    public final Context f4991m0;

    /* renamed from: n0 */
    public final InterfaceC2251n7.C2252a f4992n0;

    /* renamed from: o0 */
    public final InterfaceC2411o7 f4993o0;

    /* renamed from: p0 */
    public int f4994p0;

    /* renamed from: q0 */
    public boolean f4995q0;

    /* renamed from: r0 */
    public boolean f4996r0;

    /* renamed from: s0 */
    public MediaFormat f4997s0;

    /* renamed from: t0 */
    public int f4998t0;

    /* renamed from: u0 */
    public int f4999u0;

    /* renamed from: v0 */
    public int f5000v0;

    /* renamed from: w0 */
    public int f5001w0;

    /* renamed from: x0 */
    public long f5002x0;

    /* renamed from: y0 */
    public boolean f5003y0;

    /* renamed from: z0 */
    public boolean f5004z0;

    /* renamed from: com.daaw.bo0$b */
    /* loaded from: classes.dex */
    public final class C0878b implements InterfaceC2411o7.InterfaceC2414c {
        public C0878b() {
        }

        @Override // com.daaw.InterfaceC2411o7.InterfaceC2414c
        /* renamed from: a */
        public void mo14496a(int i) {
            bo0.this.f4992n0.m15488b(i);
            bo0.this.mo14858F0(i);
        }

        @Override // com.daaw.InterfaceC2411o7.InterfaceC2414c
        /* renamed from: b */
        public void mo14495b(int i, long j, long j2) {
            bo0.this.f4992n0.m15487c(i, j, j2);
            bo0.this.m25960H0(i, j, j2);
        }

        @Override // com.daaw.InterfaceC2411o7.InterfaceC2414c
        /* renamed from: c */
        public void mo14494c() {
            bo0.this.m25961G0();
            bo0.this.f5004z0 = true;
        }
    }

    public bo0(Context context, eo0 eo0Var, InterfaceC3746yu<i40> interfaceC3746yu, boolean z, Handler handler, InterfaceC2251n7 interfaceC2251n7, C1372g7 c1372g7, InterfaceC2154m7... interfaceC2154m7Arr) {
        this(context, eo0Var, interfaceC3746yu, z, handler, interfaceC2251n7, new C1972kq(c1372g7, interfaceC2154m7Arr));
    }

    public bo0(Context context, eo0 eo0Var, InterfaceC3746yu<i40> interfaceC3746yu, boolean z, Handler handler, InterfaceC2251n7 interfaceC2251n7, InterfaceC2411o7 interfaceC2411o7) {
        super(1, eo0Var, interfaceC3746yu, z);
        this.f4991m0 = context.getApplicationContext();
        this.f4993o0 = interfaceC2411o7;
        this.f4992n0 = new InterfaceC2251n7.C2252a(handler, interfaceC2251n7);
        interfaceC2411o7.mo14497u(new C0878b());
    }

    /* renamed from: B0 */
    public static boolean m25965B0(String str) {
        if (sq1.f26525a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(sq1.f26527c)) {
            String str2 = sq1.f26526b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.do0, com.daaw.AbstractC3517xa
    /* renamed from: A */
    public void mo3466A() {
        try {
            this.f4993o0.mo14515a();
            try {
                super.mo3466A();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.mo3466A();
                throw th;
            } finally {
            }
        }
    }

    /* renamed from: A0 */
    public boolean m25966A0(String str) {
        int m20502c = hq0.m20502c(str);
        return m20502c != 0 && this.f4993o0.mo14498t(m20502c);
    }

    @Override // com.daaw.do0, com.daaw.AbstractC3517xa
    /* renamed from: B */
    public void mo5370B(boolean z) {
        super.mo5370B(z);
        this.f4992n0.m15484f(this.f7543k0);
        int i = m5349w().f5461a;
        if (i != 0) {
            this.f4993o0.mo14500r(i);
        } else {
            this.f4993o0.mo14505m();
        }
    }

    @Override // com.daaw.do0, com.daaw.AbstractC3517xa
    /* renamed from: C */
    public void mo3465C(long j, boolean z) {
        super.mo3465C(j, z);
        this.f4993o0.mo14512e();
        this.f5002x0 = j;
        this.f5003y0 = true;
        this.f5004z0 = true;
    }

    /* renamed from: C0 */
    public final int m25964C0(co0 co0Var, Format format) {
        PackageManager packageManager;
        int i = sq1.f26525a;
        if (i < 24 && "OMX.google.raw.decoder".equals(co0Var.f5990a)) {
            boolean z = true;
            if (i == 23 && (packageManager = this.f4991m0.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback")) {
                z = false;
            }
            if (z) {
                return -1;
            }
        }
        return format.f35722v;
    }

    @Override // com.daaw.do0, com.daaw.AbstractC3517xa
    /* renamed from: D */
    public void mo5369D() {
        super.mo5369D();
        this.f4993o0.mo14499s();
    }

    /* renamed from: D0 */
    public int m25963D0(co0 co0Var, Format format, Format[] formatArr) {
        return m25964C0(co0Var, format);
    }

    @Override // com.daaw.do0, com.daaw.AbstractC3517xa
    /* renamed from: E */
    public void mo5368E() {
        m25959I0();
        this.f4993o0.mo14514b();
        super.mo5368E();
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: E0 */
    public MediaFormat m25962E0(Format format, String str, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", format.f35706G);
        mediaFormat.setInteger("sample-rate", format.f35707H);
        no0.m14904e(mediaFormat, format.f35723w);
        no0.m14905d(mediaFormat, "max-input-size", i);
        if (sq1.f26525a >= 23) {
            mediaFormat.setInteger("priority", 0);
        }
        return mediaFormat;
    }

    /* renamed from: F0 */
    public void mo14858F0(int i) {
    }

    /* renamed from: G0 */
    public void m25961G0() {
    }

    /* renamed from: H0 */
    public void m25960H0(int i, long j, long j2) {
    }

    /* renamed from: I0 */
    public final void m25959I0() {
        long mo14506l = this.f4993o0.mo14506l(mo3459c());
        if (mo14506l != Long.MIN_VALUE) {
            if (!this.f5004z0) {
                mo14506l = Math.max(this.f5002x0, mo14506l);
            }
            this.f5002x0 = mo14506l;
            this.f5004z0 = false;
        }
    }

    @Override // com.daaw.do0
    /* renamed from: J */
    public int mo21417J(MediaCodec mediaCodec, co0 co0Var, Format format, Format format2) {
        return 0;
    }

    @Override // com.daaw.do0
    /* renamed from: R */
    public void mo21408R(co0 co0Var, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        this.f4994p0 = m25963D0(co0Var, format, m5347y());
        this.f4996r0 = m25965B0(co0Var.f5990a);
        this.f4995q0 = co0Var.f5996g;
        String str = co0Var.f5991b;
        if (str == null) {
            str = "audio/raw";
        }
        MediaFormat m25962E0 = m25962E0(format, str, this.f4994p0);
        mediaCodec.configure(m25962E0, (Surface) null, mediaCrypto, 0);
        if (!this.f4995q0) {
            this.f4997s0 = null;
            return;
        }
        this.f4997s0 = m25962E0;
        m25962E0.setString("mime", format.f35721u);
    }

    @Override // com.daaw.do0
    /* renamed from: Y */
    public co0 mo24185Y(eo0 eo0Var, Format format, boolean z) {
        co0 mo23340a;
        return (!m25966A0(format.f35721u) || (mo23340a = eo0Var.mo23340a()) == null) ? super.mo24185Y(eo0Var, format, z) : mo23340a;
    }

    @Override // com.daaw.do0, com.daaw.a41
    /* renamed from: c */
    public boolean mo3459c() {
        return super.mo3459c() && this.f4993o0.mo14513c();
    }

    @Override // com.daaw.do0, com.daaw.a41
    /* renamed from: d */
    public boolean mo3458d() {
        return this.f4993o0.mo14507k() || super.mo3458d();
    }

    @Override // com.daaw.ao0
    /* renamed from: f */
    public zw0 mo15829f(zw0 zw0Var) {
        return this.f4993o0.mo14511f(zw0Var);
    }

    @Override // com.daaw.do0
    /* renamed from: f0 */
    public void mo21394f0(String str, long j, long j2) {
        this.f4992n0.m15486d(str, j, j2);
    }

    @Override // com.daaw.do0
    /* renamed from: g0 */
    public void mo14857g0(Format format) {
        super.mo14857g0(format);
        this.f4992n0.m15483g(format);
        this.f4998t0 = "audio/raw".equals(format.f35721u) ? format.f35708I : 2;
        this.f4999u0 = format.f35706G;
        this.f5000v0 = format.f35709J;
        this.f5001w0 = format.f35710K;
    }

    @Override // com.daaw.ao0
    /* renamed from: h */
    public zw0 mo15827h() {
        return this.f4993o0.mo14510h();
    }

    @Override // com.daaw.do0
    /* renamed from: h0 */
    public void mo14856h0(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int[] iArr;
        int i2;
        MediaFormat mediaFormat2 = this.f4997s0;
        if (mediaFormat2 != null) {
            i = hq0.m20502c(mediaFormat2.getString("mime"));
            mediaFormat = this.f4997s0;
        } else {
            i = this.f4998t0;
        }
        int i3 = i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.f4996r0 && integer == 6 && (i2 = this.f4999u0) < 6) {
            iArr = new int[i2];
            for (int i4 = 0; i4 < this.f4999u0; i4++) {
                iArr[i4] = i4;
            }
        } else {
            iArr = null;
        }
        try {
            this.f4993o0.mo14509i(i3, integer, integer2, 0, iArr, this.f5000v0, this.f5001w0);
        } catch (InterfaceC2411o7.C2412a e) {
            throw C2802qz.m11927a(e, m5348x());
        }
    }

    @Override // com.daaw.do0
    /* renamed from: j0 */
    public void mo21392j0(C1454gq c1454gq) {
        if (!this.f5003y0 || c1454gq.m11438i()) {
            return;
        }
        if (Math.abs(c1454gq.f11566s - this.f5002x0) > 500000) {
            this.f5002x0 = c1454gq.f11566s;
        }
        this.f5003y0 = false;
    }

    @Override // com.daaw.do0
    /* renamed from: l0 */
    public boolean mo14855l0(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        if (this.f4995q0 && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f7543k0.f9767f++;
            this.f4993o0.mo14503o();
            return true;
        } else {
            try {
                if (this.f4993o0.mo14501q(byteBuffer, j3)) {
                    mediaCodec.releaseOutputBuffer(i, false);
                    this.f7543k0.f9766e++;
                    return true;
                }
                return false;
            } catch (InterfaceC2411o7.C2413b | InterfaceC2411o7.C2415d e) {
                throw C2802qz.m11927a(e, m5348x());
            }
        }
    }

    @Override // com.daaw.ao0
    /* renamed from: o */
    public long mo15824o() {
        if (getState() == 2) {
            m25959I0();
        }
        return this.f5002x0;
    }

    @Override // com.daaw.do0
    /* renamed from: p0 */
    public void mo24175p0() {
        try {
            this.f4993o0.mo14508j();
        } catch (InterfaceC2411o7.C2415d e) {
            throw C2802qz.m11927a(e, m5348x());
        }
    }

    @Override // com.daaw.AbstractC3517xa, com.daaw.fx0.InterfaceC1343b
    /* renamed from: r */
    public void mo5354r(int i, Object obj) {
        if (i == 2) {
            this.f4993o0.mo14502p(((Float) obj).floatValue());
        } else if (i != 3) {
            super.mo5354r(i, obj);
        } else {
            this.f4993o0.mo14504n((C1255f7) obj);
        }
    }

    @Override // com.daaw.AbstractC3517xa, com.daaw.a41
    /* renamed from: v */
    public ao0 mo5350v() {
        return this;
    }

    @Override // com.daaw.do0
    /* renamed from: w0 */
    public int mo21389w0(eo0 eo0Var, InterfaceC3746yu<i40> interfaceC3746yu, Format format) {
        boolean z;
        int i;
        int i2;
        String str = format.f35721u;
        boolean z2 = false;
        if (hq0.m20494k(str)) {
            int i3 = sq1.f26525a >= 21 ? 32 : 0;
            boolean m5365I = AbstractC3517xa.m5365I(interfaceC3746yu, format.f35724x);
            if (m5365I && m25966A0(str) && eo0Var.mo23340a() != null) {
                return i3 | 8 | 4;
            }
            if ((!"audio/raw".equals(str) || this.f4993o0.mo14498t(format.f35708I)) && this.f4993o0.mo14498t(2)) {
                DrmInitData drmInitData = format.f35724x;
                if (drmInitData != null) {
                    z = false;
                    for (int i4 = 0; i4 < drmInitData.f35730s; i4++) {
                        z |= drmInitData.m1710h(i4).f35735t;
                    }
                } else {
                    z = false;
                }
                co0 mo23339b = eo0Var.mo23339b(str, z);
                if (mo23339b == null) {
                    return (!z || eo0Var.mo23339b(str, false) == null) ? 1 : 2;
                } else if (m5365I) {
                    if (sq1.f26525a < 21 || (((i = format.f35707H) == -1 || mo23339b.m25183h(i)) && ((i2 = format.f35706G) == -1 || mo23339b.m25184g(i2)))) {
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
