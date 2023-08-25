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

    /* renamed from: X0 */
    public static final int[] f11486X0 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: A0 */
    public long f11487A0;

    /* renamed from: B0 */
    public long f11488B0;

    /* renamed from: C0 */
    public long f11489C0;

    /* renamed from: D0 */
    public int f11490D0;

    /* renamed from: E0 */
    public int f11491E0;

    /* renamed from: F0 */
    public int f11492F0;

    /* renamed from: G0 */
    public long f11493G0;

    /* renamed from: H0 */
    public int f11494H0;

    /* renamed from: I0 */
    public float f11495I0;

    /* renamed from: J0 */
    public int f11496J0;

    /* renamed from: K0 */
    public int f11497K0;

    /* renamed from: L0 */
    public int f11498L0;

    /* renamed from: M0 */
    public float f11499M0;

    /* renamed from: N0 */
    public int f11500N0;

    /* renamed from: O0 */
    public int f11501O0;

    /* renamed from: P0 */
    public int f11502P0;

    /* renamed from: Q0 */
    public float f11503Q0;

    /* renamed from: R0 */
    public boolean f11504R0;

    /* renamed from: S0 */
    public int f11505S0;

    /* renamed from: T0 */
    public C1452c f11506T0;

    /* renamed from: U0 */
    public long f11507U0;

    /* renamed from: V0 */
    public long f11508V0;

    /* renamed from: W0 */
    public int f11509W0;

    /* renamed from: m0 */
    public final Context f11510m0;

    /* renamed from: n0 */
    public final ps1 f11511n0;

    /* renamed from: o0 */
    public final rs1.C2878a f11512o0;

    /* renamed from: p0 */
    public final long f11513p0;

    /* renamed from: q0 */
    public final int f11514q0;

    /* renamed from: r0 */
    public final boolean f11515r0;

    /* renamed from: s0 */
    public final long[] f11516s0;

    /* renamed from: t0 */
    public final long[] f11517t0;

    /* renamed from: u0 */
    public C1451b f11518u0;

    /* renamed from: v0 */
    public boolean f11519v0;

    /* renamed from: w0 */
    public Surface f11520w0;

    /* renamed from: x0 */
    public Surface f11521x0;

    /* renamed from: y0 */
    public int f11522y0;

    /* renamed from: z0 */
    public boolean f11523z0;

    /* renamed from: com.daaw.go0$b */
    /* loaded from: classes.dex */
    public static final class C1451b {

        /* renamed from: a */
        public final int f11524a;

        /* renamed from: b */
        public final int f11525b;

        /* renamed from: c */
        public final int f11526c;

        public C1451b(int i, int i2, int i3) {
            this.f11524a = i;
            this.f11525b = i2;
            this.f11526c = i3;
        }
    }

    @TargetApi(23)
    /* renamed from: com.daaw.go0$c */
    /* loaded from: classes.dex */
    public final class C1452c implements MediaCodec.OnFrameRenderedListener {
        public C1452c(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }

        @Override // android.media.MediaCodec.OnFrameRenderedListener
        public void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
            go0 go0Var = go0.this;
            if (this != go0Var.f11506T0) {
                return;
            }
            go0Var.m21411O0();
        }
    }

    public go0(Context context, eo0 eo0Var, long j, InterfaceC3746yu<i40> interfaceC3746yu, boolean z, Handler handler, rs1 rs1Var, int i) {
        super(2, eo0Var, interfaceC3746yu, z);
        this.f11513p0 = j;
        this.f11514q0 = i;
        Context applicationContext = context.getApplicationContext();
        this.f11510m0 = applicationContext;
        this.f11511n0 = new ps1(applicationContext);
        this.f11512o0 = new rs1.C2878a(handler, rs1Var);
        this.f11515r0 = m21423D0();
        this.f11516s0 = new long[10];
        this.f11517t0 = new long[10];
        this.f11508V0 = -9223372036854775807L;
        this.f11507U0 = -9223372036854775807L;
        this.f11488B0 = -9223372036854775807L;
        this.f11496J0 = -1;
        this.f11497K0 = -1;
        this.f11499M0 = -1.0f;
        this.f11495I0 = -1.0f;
        this.f11522y0 = 1;
        m21426A0();
    }

    /* renamed from: B0 */
    public static boolean m21425B0(String str) {
        String str2 = sq1.f26526b;
        if (((!"deb".equals(str2) && !"flo".equals(str2) && !"mido".equals(str2) && !"santoni".equals(str2)) || !"OMX.qcom.video.decoder.avc".equals(str)) && ((!"tcl_eu".equals(str2) && !"SVP-DTV15".equals(str2) && !"BRAVIA_ATV2".equals(str2) && !str2.startsWith("panell_") && !"F3311".equals(str2) && !"M5c".equals(str2) && !"QM16XE_U".equals(str2) && !"A7010a48".equals(str2) && !"woods_f".equals(sq1.f26528d) && !"watson".equals(str2)) || !"OMX.MTK.VIDEO.DECODER.AVC".equals(str))) {
            String str3 = sq1.f26528d;
            if (((!"ALE-L21".equals(str3) && !"CAM-L21".equals(str3)) || !"OMX.k3.video.decoder.avc".equals(str)) && (!"HUAWEI VNS-L21".equals(str3) || !"OMX.IMG.MSVDX.Decoder.AVC".equals(str))) {
                return false;
            }
        }
        return true;
    }

    @TargetApi(21)
    /* renamed from: C0 */
    public static void m21424C0(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    /* renamed from: D0 */
    public static boolean m21423D0() {
        return sq1.f26525a <= 22 && "foster".equals(sq1.f26526b) && "NVIDIA".equals(sq1.f26527c);
    }

    /* renamed from: F0 */
    public static Point m21421F0(co0 co0Var, Format format) {
        int[] iArr;
        int i = format.f35726z;
        int i2 = format.f35725y;
        boolean z = i > i2;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        float f = i / i3;
        for (int i4 : f11486X0) {
            int i5 = (int) (i4 * f);
            if (i4 <= i3 || i5 <= i) {
                break;
            }
            if (sq1.f26525a >= 21) {
                int i6 = z ? i5 : i4;
                if (!z) {
                    i4 = i5;
                }
                Point m25189b = co0Var.m25189b(i6, i4);
                if (co0Var.m25177n(m25189b.x, m25189b.y, format.f35700A)) {
                    return m25189b;
                }
            } else {
                int m10010f = sq1.m10010f(i4, 16) * 16;
                int m10010f2 = sq1.m10010f(i5, 16) * 16;
                if (m10010f * m10010f2 <= fo0.m22463l()) {
                    int i7 = z ? m10010f2 : m10010f;
                    if (!z) {
                        m10010f = m10010f2;
                    }
                    return new Point(i7, m10010f);
                }
            }
        }
        return null;
    }

    /* renamed from: H0 */
    public static int m21419H0(Format format) {
        if (format.f35722v != -1) {
            int size = format.f35723w.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += format.f35723w.get(i2).length;
            }
            return format.f35722v + i;
        }
        return m21418I0(format.f35721u, format.f35725y, format.f35726z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: I0 */
    public static int m21418I0(String str, int i, int i2) {
        char c;
        int i3;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        str.hashCode();
        int i4 = 4;
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
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 4;
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
        switch (c) {
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
                if (!"BRAVIA 4K 2015".equals(sq1.f26528d)) {
                    i3 = sq1.m10010f(i, 16) * sq1.m10010f(i2, 16) * 16 * 16;
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

    /* renamed from: K0 */
    public static boolean m21415K0(long j) {
        return j < -30000;
    }

    /* renamed from: L0 */
    public static boolean m21414L0(long j) {
        return j < -500000;
    }

    @TargetApi(23)
    /* renamed from: V0 */
    public static void m21402V0(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    /* renamed from: y0 */
    public static boolean m21388y0(boolean z, Format format, Format format2) {
        return format.f35721u.equals(format2.f35721u) && format.f35701B == format2.f35701B && (z || (format.f35725y == format2.f35725y && format.f35726z == format2.f35726z)) && sq1.m10016b(format.f35705F, format2.f35705F);
    }

    @Override // com.daaw.do0, com.daaw.AbstractC3517xa
    /* renamed from: A */
    public void mo3466A() {
        this.f11496J0 = -1;
        this.f11497K0 = -1;
        this.f11499M0 = -1.0f;
        this.f11495I0 = -1.0f;
        this.f11508V0 = -9223372036854775807L;
        this.f11507U0 = -9223372036854775807L;
        this.f11509W0 = 0;
        m21426A0();
        m21387z0();
        this.f11511n0.m13175d();
        this.f11506T0 = null;
        this.f11504R0 = false;
        try {
            super.mo3466A();
        } finally {
            this.f7543k0.m22418a();
            this.f11512o0.m10983c(this.f7543k0);
        }
    }

    /* renamed from: A0 */
    public final void m21426A0() {
        this.f11500N0 = -1;
        this.f11501O0 = -1;
        this.f11503Q0 = -1.0f;
        this.f11502P0 = -1;
    }

    @Override // com.daaw.do0, com.daaw.AbstractC3517xa
    /* renamed from: B */
    public void mo5370B(boolean z) {
        super.mo5370B(z);
        int i = m5349w().f5461a;
        this.f11505S0 = i;
        this.f11504R0 = i != 0;
        this.f11512o0.m10981e(this.f7543k0);
        this.f11511n0.m13174e();
    }

    @Override // com.daaw.do0, com.daaw.AbstractC3517xa
    /* renamed from: C */
    public void mo3465C(long j, boolean z) {
        super.mo3465C(j, z);
        m21387z0();
        this.f11487A0 = -9223372036854775807L;
        this.f11491E0 = 0;
        this.f11507U0 = -9223372036854775807L;
        int i = this.f11509W0;
        if (i != 0) {
            this.f11508V0 = this.f11516s0[i - 1];
            this.f11509W0 = 0;
        }
        if (z) {
            m21403U0();
        } else {
            this.f11488B0 = -9223372036854775807L;
        }
    }

    @Override // com.daaw.do0, com.daaw.AbstractC3517xa
    /* renamed from: D */
    public void mo5369D() {
        super.mo5369D();
        this.f11490D0 = 0;
        this.f11489C0 = SystemClock.elapsedRealtime();
        this.f11493G0 = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // com.daaw.do0, com.daaw.AbstractC3517xa
    /* renamed from: E */
    public void mo5368E() {
        this.f11488B0 = -9223372036854775807L;
        m21412N0();
        super.mo5368E();
    }

    /* renamed from: E0 */
    public void m21422E0(MediaCodec mediaCodec, int i, long j) {
        mm1.m15937a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        mm1.m15935c();
        m21395c1(1);
    }

    @Override // com.daaw.AbstractC3517xa
    /* renamed from: F */
    public void mo3464F(Format[] formatArr, long j) {
        if (this.f11508V0 == -9223372036854775807L) {
            this.f11508V0 = j;
        } else {
            int i = this.f11509W0;
            if (i == this.f11516s0.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("Too many stream changes, so dropping offset: ");
                sb.append(this.f11516s0[this.f11509W0 - 1]);
            } else {
                this.f11509W0 = i + 1;
            }
            long[] jArr = this.f11516s0;
            int i2 = this.f11509W0;
            jArr[i2 - 1] = j;
            this.f11517t0[i2 - 1] = this.f11507U0;
        }
        super.mo3464F(formatArr, j);
    }

    /* renamed from: G0 */
    public C1451b m21420G0(co0 co0Var, Format format, Format[] formatArr) {
        int i = format.f35725y;
        int i2 = format.f35726z;
        int m21419H0 = m21419H0(format);
        if (formatArr.length == 1) {
            return new C1451b(i, i2, m21419H0);
        }
        boolean z = false;
        for (Format format2 : formatArr) {
            if (m21388y0(co0Var.f5993d, format, format2)) {
                int i3 = format2.f35725y;
                z |= i3 == -1 || format2.f35726z == -1;
                i = Math.max(i, i3);
                i2 = Math.max(i2, format2.f35726z);
                m21419H0 = Math.max(m21419H0, m21419H0(format2));
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Resolutions unknown. Codec max resolution: ");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            Point m21421F0 = m21421F0(co0Var, format);
            if (m21421F0 != null) {
                i = Math.max(i, m21421F0.x);
                i2 = Math.max(i2, m21421F0.y);
                m21419H0 = Math.max(m21419H0, m21418I0(format.f35721u, i, i2));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Codec max resolution adjusted to: ");
                sb2.append(i);
                sb2.append("x");
                sb2.append(i2);
            }
        }
        return new C1451b(i, i2, m21419H0);
    }

    @Override // com.daaw.do0
    /* renamed from: J */
    public int mo21417J(MediaCodec mediaCodec, co0 co0Var, Format format, Format format2) {
        if (m21388y0(co0Var.f5993d, format, format2)) {
            int i = format2.f35725y;
            C1451b c1451b = this.f11518u0;
            if (i > c1451b.f11524a || format2.f35726z > c1451b.f11525b || m21419H0(format2) > this.f11518u0.f11526c) {
                return 0;
            }
            return format.m1734L(format2) ? 1 : 3;
        }
        return 0;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: J0 */
    public MediaFormat m21416J0(Format format, C1451b c1451b, boolean z, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", format.f35721u);
        mediaFormat.setInteger("width", format.f35725y);
        mediaFormat.setInteger("height", format.f35726z);
        no0.m14904e(mediaFormat, format.f35723w);
        no0.m14906c(mediaFormat, "frame-rate", format.f35700A);
        no0.m14905d(mediaFormat, "rotation-degrees", format.f35701B);
        no0.m14907b(mediaFormat, format.f35705F);
        mediaFormat.setInteger("max-width", c1451b.f11524a);
        mediaFormat.setInteger("max-height", c1451b.f11525b);
        no0.m14905d(mediaFormat, "max-input-size", c1451b.f11526c);
        if (sq1.f26525a >= 23) {
            mediaFormat.setInteger("priority", 0);
        }
        if (z) {
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            m21424C0(mediaFormat, i);
        }
        return mediaFormat;
    }

    /* renamed from: M0 */
    public boolean m21413M0(MediaCodec mediaCodec, int i, long j, long j2) {
        int m5366H = m5366H(j2);
        if (m5366H == 0) {
            return false;
        }
        this.f7543k0.f9770i++;
        m21395c1(this.f11492F0 + m5366H);
        mo21404U();
        return true;
    }

    /* renamed from: N0 */
    public final void m21412N0() {
        if (this.f11490D0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f11512o0.m10982d(this.f11490D0, elapsedRealtime - this.f11489C0);
            this.f11490D0 = 0;
            this.f11489C0 = elapsedRealtime;
        }
    }

    /* renamed from: O0 */
    public void m21411O0() {
        if (this.f11523z0) {
            return;
        }
        this.f11523z0 = true;
        this.f11512o0.m10979g(this.f11520w0);
    }

    /* renamed from: P0 */
    public final void m21410P0() {
        int i = this.f11496J0;
        if (i == -1 && this.f11497K0 == -1) {
            return;
        }
        if (this.f11500N0 == i && this.f11501O0 == this.f11497K0 && this.f11502P0 == this.f11498L0 && this.f11503Q0 == this.f11499M0) {
            return;
        }
        this.f11512o0.m10978h(i, this.f11497K0, this.f11498L0, this.f11499M0);
        this.f11500N0 = this.f11496J0;
        this.f11501O0 = this.f11497K0;
        this.f11502P0 = this.f11498L0;
        this.f11503Q0 = this.f11499M0;
    }

    /* renamed from: Q0 */
    public final void m21409Q0() {
        if (this.f11523z0) {
            this.f11512o0.m10979g(this.f11520w0);
        }
    }

    @Override // com.daaw.do0
    /* renamed from: R */
    public void mo21408R(co0 co0Var, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        C1451b m21420G0 = m21420G0(co0Var, format, m5347y());
        this.f11518u0 = m21420G0;
        MediaFormat m21416J0 = m21416J0(format, m21420G0, this.f11515r0, this.f11505S0);
        if (this.f11520w0 == null) {
            C2914s6.m10685f(m21397a1(co0Var));
            if (this.f11521x0 == null) {
                this.f11521x0 = DummySurface.m1473g(this.f11510m0, co0Var.f5995f);
            }
            this.f11520w0 = this.f11521x0;
        }
        mediaCodec.configure(m21416J0, this.f11520w0, mediaCrypto, 0);
        if (sq1.f26525a < 23 || !this.f11504R0) {
            return;
        }
        this.f11506T0 = new C1452c(mediaCodec);
    }

    /* renamed from: R0 */
    public final void m21407R0() {
        int i = this.f11500N0;
        if (i == -1 && this.f11501O0 == -1) {
            return;
        }
        this.f11512o0.m10978h(i, this.f11501O0, this.f11502P0, this.f11503Q0);
    }

    /* renamed from: S0 */
    public void m21406S0(MediaCodec mediaCodec, int i, long j) {
        m21410P0();
        mm1.m15937a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        mm1.m15935c();
        this.f11493G0 = SystemClock.elapsedRealtime() * 1000;
        this.f7543k0.f9766e++;
        this.f11491E0 = 0;
        m21411O0();
    }

    @TargetApi(21)
    /* renamed from: T0 */
    public void m21405T0(MediaCodec mediaCodec, int i, long j, long j2) {
        m21410P0();
        mm1.m15937a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        mm1.m15935c();
        this.f11493G0 = SystemClock.elapsedRealtime() * 1000;
        this.f7543k0.f9766e++;
        this.f11491E0 = 0;
        m21411O0();
    }

    @Override // com.daaw.do0
    /* renamed from: U */
    public void mo21404U() {
        super.mo21404U();
        this.f11492F0 = 0;
    }

    /* renamed from: U0 */
    public final void m21403U0() {
        this.f11488B0 = this.f11513p0 > 0 ? SystemClock.elapsedRealtime() + this.f11513p0 : -9223372036854775807L;
    }

    /* renamed from: W0 */
    public final void m21401W0(Surface surface) {
        if (surface == null) {
            Surface surface2 = this.f11521x0;
            if (surface2 != null) {
                surface = surface2;
            } else {
                co0 m24186X = m24186X();
                if (m24186X != null && m21397a1(m24186X)) {
                    surface = DummySurface.m1473g(this.f11510m0, m24186X.f5995f);
                    this.f11521x0 = surface;
                }
            }
        }
        if (this.f11520w0 == surface) {
            if (surface == null || surface == this.f11521x0) {
                return;
            }
            m21407R0();
            m21409Q0();
            return;
        }
        this.f11520w0 = surface;
        int state = getState();
        if (state == 1 || state == 2) {
            MediaCodec m24188V = m24188V();
            if (sq1.f26525a < 23 || m24188V == null || surface == null || this.f11519v0) {
                mo21391o0();
                m24179e0();
            } else {
                m21402V0(m24188V, surface);
            }
        }
        if (surface == null || surface == this.f11521x0) {
            m21426A0();
            m21387z0();
            return;
        }
        m21407R0();
        m21387z0();
        if (state == 2) {
            m21403U0();
        }
    }

    /* renamed from: X0 */
    public boolean m21400X0(long j, long j2) {
        return m21414L0(j);
    }

    /* renamed from: Y0 */
    public boolean m21399Y0(long j, long j2) {
        return m21415K0(j);
    }

    /* renamed from: Z0 */
    public boolean m21398Z0(long j, long j2) {
        return m21415K0(j) && j2 > 100000;
    }

    /* renamed from: a1 */
    public final boolean m21397a1(co0 co0Var) {
        return sq1.f26525a >= 23 && !this.f11504R0 && !m21425B0(co0Var.f5990a) && (!co0Var.f5995f || DummySurface.m1474c(this.f11510m0));
    }

    /* renamed from: b1 */
    public void m21396b1(MediaCodec mediaCodec, int i, long j) {
        mm1.m15937a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        mm1.m15935c();
        this.f7543k0.f9767f++;
    }

    /* renamed from: c1 */
    public void m21395c1(int i) {
        C1321fq c1321fq = this.f7543k0;
        c1321fq.f9768g += i;
        this.f11490D0 += i;
        int i2 = this.f11491E0 + i;
        this.f11491E0 = i2;
        c1321fq.f9769h = Math.max(i2, c1321fq.f9769h);
        if (this.f11490D0 >= this.f11514q0) {
            m21412N0();
        }
    }

    @Override // com.daaw.do0, com.daaw.a41
    /* renamed from: d */
    public boolean mo3458d() {
        Surface surface;
        if (super.mo3458d() && (this.f11523z0 || (((surface = this.f11521x0) != null && this.f11520w0 == surface) || m24188V() == null || this.f11504R0))) {
            this.f11488B0 = -9223372036854775807L;
            return true;
        } else if (this.f11488B0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f11488B0) {
                return true;
            }
            this.f11488B0 = -9223372036854775807L;
            return false;
        }
    }

    @Override // com.daaw.do0
    /* renamed from: f0 */
    public void mo21394f0(String str, long j, long j2) {
        this.f11512o0.m10984b(str, j, j2);
        this.f11519v0 = m21425B0(str);
    }

    @Override // com.daaw.do0
    /* renamed from: g0 */
    public void mo14857g0(Format format) {
        super.mo14857g0(format);
        this.f11512o0.m10980f(format);
        this.f11495I0 = format.f35702C;
        this.f11494H0 = format.f35701B;
    }

    @Override // com.daaw.do0
    /* renamed from: h0 */
    public void mo14856h0(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        this.f11496J0 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.f11497K0 = integer;
        float f = this.f11495I0;
        this.f11499M0 = f;
        if (sq1.f26525a >= 21) {
            int i = this.f11494H0;
            if (i == 90 || i == 270) {
                int i2 = this.f11496J0;
                this.f11496J0 = integer;
                this.f11497K0 = i2;
                this.f11499M0 = 1.0f / f;
            }
        } else {
            this.f11498L0 = this.f11494H0;
        }
        mediaCodec.setVideoScalingMode(this.f11522y0);
    }

    @Override // com.daaw.do0
    /* renamed from: i0 */
    public void mo21393i0(long j) {
        this.f11492F0--;
        while (true) {
            int i = this.f11509W0;
            if (i == 0 || j < this.f11517t0[0]) {
                return;
            }
            long[] jArr = this.f11516s0;
            this.f11508V0 = jArr[0];
            int i2 = i - 1;
            this.f11509W0 = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.f11517t0;
            System.arraycopy(jArr2, 1, jArr2, 0, this.f11509W0);
        }
    }

    @Override // com.daaw.do0
    /* renamed from: j0 */
    public void mo21392j0(C1454gq c1454gq) {
        this.f11492F0++;
        this.f11507U0 = Math.max(c1454gq.f11566s, this.f11507U0);
        if (sq1.f26525a >= 23 || !this.f11504R0) {
            return;
        }
        m21411O0();
    }

    @Override // com.daaw.do0
    /* renamed from: l0 */
    public boolean mo14855l0(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        if (this.f11487A0 == -9223372036854775807L) {
            this.f11487A0 = j;
        }
        long j4 = j3 - this.f11508V0;
        if (z) {
            m21396b1(mediaCodec, i, j4);
            return true;
        }
        long j5 = j3 - j;
        if (this.f11520w0 == this.f11521x0) {
            if (m21415K0(j5)) {
                m21396b1(mediaCodec, i, j4);
                return true;
            }
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        boolean z2 = getState() == 2;
        if (!this.f11523z0 || (z2 && m21398Z0(j5, elapsedRealtime - this.f11493G0))) {
            if (sq1.f26525a >= 21) {
                m21405T0(mediaCodec, i, j4, System.nanoTime());
                return true;
            }
            m21406S0(mediaCodec, i, j4);
            return true;
        }
        if (z2 && j != this.f11487A0) {
            long nanoTime = System.nanoTime();
            long m13177b = this.f11511n0.m13177b(j3, ((j5 - (elapsedRealtime - j2)) * 1000) + nanoTime);
            long j6 = (m13177b - nanoTime) / 1000;
            if (m21400X0(j6, j2) && m21413M0(mediaCodec, i, j4, j)) {
                return false;
            }
            if (m21399Y0(j6, j2)) {
                m21422E0(mediaCodec, i, j4);
                return true;
            } else if (sq1.f26525a >= 21) {
                if (j6 < 50000) {
                    m21405T0(mediaCodec, i, j4, m13177b);
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
                m21406S0(mediaCodec, i, j4);
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.do0
    /* renamed from: o0 */
    public void mo21391o0() {
        try {
            super.mo21391o0();
            this.f11492F0 = 0;
            Surface surface = this.f11521x0;
            if (surface != null) {
                if (this.f11520w0 == surface) {
                    this.f11520w0 = null;
                }
                surface.release();
                this.f11521x0 = null;
            }
        } catch (Throwable th) {
            this.f11492F0 = 0;
            if (this.f11521x0 != null) {
                Surface surface2 = this.f11520w0;
                Surface surface3 = this.f11521x0;
                if (surface2 == surface3) {
                    this.f11520w0 = null;
                }
                surface3.release();
                this.f11521x0 = null;
            }
            throw th;
        }
    }

    @Override // com.daaw.AbstractC3517xa, com.daaw.fx0.InterfaceC1343b
    /* renamed from: r */
    public void mo5354r(int i, Object obj) {
        if (i == 1) {
            m21401W0((Surface) obj);
        } else if (i != 4) {
            super.mo5354r(i, obj);
        } else {
            this.f11522y0 = ((Integer) obj).intValue();
            MediaCodec m24188V = m24188V();
            if (m24188V != null) {
                m24188V.setVideoScalingMode(this.f11522y0);
            }
        }
    }

    @Override // com.daaw.do0
    /* renamed from: t0 */
    public boolean mo21390t0(co0 co0Var) {
        return this.f11520w0 != null || m21397a1(co0Var);
    }

    @Override // com.daaw.do0
    /* renamed from: w0 */
    public int mo21389w0(eo0 eo0Var, InterfaceC3746yu<i40> interfaceC3746yu, Format format) {
        boolean z;
        int i;
        int i2;
        String str = format.f35721u;
        if (hq0.m20492m(str)) {
            DrmInitData drmInitData = format.f35724x;
            if (drmInitData != null) {
                z = false;
                for (int i3 = 0; i3 < drmInitData.f35730s; i3++) {
                    z |= drmInitData.m1710h(i3).f35735t;
                }
            } else {
                z = false;
            }
            co0 mo23339b = eo0Var.mo23339b(str, z);
            if (mo23339b == null) {
                return (!z || eo0Var.mo23339b(str, false) == null) ? 1 : 2;
            } else if (AbstractC3517xa.m5365I(interfaceC3746yu, drmInitData)) {
                boolean m25182i = mo23339b.m25182i(format.f35718r);
                if (m25182i && (i = format.f35725y) > 0 && (i2 = format.f35726z) > 0) {
                    if (sq1.f26525a >= 21) {
                        m25182i = mo23339b.m25177n(i, i2, format.f35700A);
                    } else {
                        boolean z2 = i * i2 <= fo0.m22463l();
                        if (!z2) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("FalseCheck [legacyFrameSize, ");
                            sb.append(format.f35725y);
                            sb.append("x");
                            sb.append(format.f35726z);
                            sb.append("] [");
                            sb.append(sq1.f26529e);
                            sb.append("]");
                        }
                        m25182i = z2;
                    }
                }
                return (m25182i ? 4 : 3) | (mo23339b.f5993d ? 16 : 8) | (mo23339b.f5994e ? 32 : 0);
            } else {
                return 2;
            }
        }
        return 0;
    }

    /* renamed from: z0 */
    public final void m21387z0() {
        MediaCodec m24188V;
        this.f11523z0 = false;
        if (sq1.f26525a < 23 || !this.f11504R0 || (m24188V = m24188V()) == null) {
            return;
        }
        this.f11506T0 = new C1452c(m24188V);
    }
}
