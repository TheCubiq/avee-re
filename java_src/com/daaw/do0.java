package com.daaw;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import com.daaw.fo0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.InterfaceC3933d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
@TargetApi(16)
/* loaded from: classes.dex */
public abstract class do0 extends AbstractC3517xa {

    /* renamed from: l0 */
    public static final byte[] f7506l0 = sq1.m9998r("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");

    /* renamed from: A */
    public final boolean f7507A;

    /* renamed from: B */
    public final C1454gq f7508B;

    /* renamed from: C */
    public final C1454gq f7509C;

    /* renamed from: D */
    public final k30 f7510D;

    /* renamed from: E */
    public final List<Long> f7511E;

    /* renamed from: F */
    public final MediaCodec.BufferInfo f7512F;

    /* renamed from: G */
    public Format f7513G;

    /* renamed from: H */
    public InterfaceC3933d<i40> f7514H;

    /* renamed from: I */
    public InterfaceC3933d<i40> f7515I;

    /* renamed from: J */
    public MediaCodec f7516J;

    /* renamed from: K */
    public co0 f7517K;

    /* renamed from: L */
    public int f7518L;

    /* renamed from: M */
    public boolean f7519M;

    /* renamed from: N */
    public boolean f7520N;

    /* renamed from: O */
    public boolean f7521O;

    /* renamed from: P */
    public boolean f7522P;

    /* renamed from: Q */
    public boolean f7523Q;

    /* renamed from: R */
    public boolean f7524R;

    /* renamed from: S */
    public boolean f7525S;

    /* renamed from: T */
    public boolean f7526T;

    /* renamed from: U */
    public ByteBuffer[] f7527U;

    /* renamed from: V */
    public ByteBuffer[] f7528V;

    /* renamed from: W */
    public long f7529W;

    /* renamed from: X */
    public int f7530X;

    /* renamed from: Y */
    public int f7531Y;

    /* renamed from: Z */
    public ByteBuffer f7532Z;

    /* renamed from: a0 */
    public boolean f7533a0;

    /* renamed from: b0 */
    public boolean f7534b0;

    /* renamed from: c0 */
    public int f7535c0;

    /* renamed from: d0 */
    public int f7536d0;

    /* renamed from: e0 */
    public boolean f7537e0;

    /* renamed from: f0 */
    public boolean f7538f0;

    /* renamed from: g0 */
    public boolean f7539g0;

    /* renamed from: h0 */
    public boolean f7540h0;

    /* renamed from: i0 */
    public boolean f7541i0;

    /* renamed from: j0 */
    public boolean f7542j0;

    /* renamed from: k0 */
    public C1321fq f7543k0;

    /* renamed from: y */
    public final eo0 f7544y;

    /* renamed from: z */
    public final InterfaceC3746yu<i40> f7545z;

    /* renamed from: com.daaw.do0$a */
    /* loaded from: classes.dex */
    public static class C1118a extends Exception {

        /* renamed from: p */
        public final String f7546p;

        /* renamed from: q */
        public final boolean f7547q;

        /* renamed from: r */
        public final String f7548r;

        /* renamed from: s */
        public final String f7549s;

        public C1118a(Format format, Throwable th, boolean z, int i) {
            super("Decoder init failed: [" + i + "], " + format, th);
            this.f7546p = format.f35721u;
            this.f7547q = z;
            this.f7548r = null;
            this.f7549s = m24168a(i);
        }

        public C1118a(Format format, Throwable th, boolean z, String str) {
            super("Decoder init failed: " + str + ", " + format, th);
            this.f7546p = format.f35721u;
            this.f7547q = z;
            this.f7548r = str;
            this.f7549s = sq1.f26525a >= 21 ? m24167b(th) : null;
        }

        /* renamed from: a */
        public static String m24168a(int i) {
            String str = i < 0 ? "neg_" : "";
            return "com.google.android.exoplayer.MediaCodecTrackRenderer_" + str + Math.abs(i);
        }

        @TargetApi(21)
        /* renamed from: b */
        public static String m24167b(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }
    }

    public do0(int i, eo0 eo0Var, InterfaceC3746yu<i40> interfaceC3746yu, boolean z) {
        super(i);
        C2914s6.m10685f(sq1.f26525a >= 16);
        this.f7544y = (eo0) C2914s6.m10686e(eo0Var);
        this.f7545z = interfaceC3746yu;
        this.f7507A = z;
        this.f7508B = new C1454gq(0);
        this.f7509C = C1454gq.m21347r();
        this.f7510D = new k30();
        this.f7511E = new ArrayList();
        this.f7512F = new MediaCodec.BufferInfo();
        this.f7535c0 = 0;
        this.f7536d0 = 0;
    }

    /* renamed from: L */
    public static boolean m24196L(String str, Format format) {
        return sq1.f26525a < 21 && format.f35723w.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    /* renamed from: M */
    public static boolean m24195M(String str) {
        int i = sq1.f26525a;
        return (i <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (i <= 19 && "hb2000".equals(sq1.f26526b) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str)));
    }

    /* renamed from: N */
    public static boolean m24194N(String str) {
        return sq1.f26525a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    /* renamed from: O */
    public static boolean m24193O(String str) {
        return sq1.f26525a <= 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str));
    }

    /* renamed from: P */
    public static boolean m24192P(String str) {
        int i = sq1.f26525a;
        return i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i == 19 && sq1.f26528d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    /* renamed from: Q */
    public static boolean m24191Q(String str, Format format) {
        return sq1.f26525a <= 18 && format.f35706G == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    /* renamed from: a0 */
    public static MediaCodec.CryptoInfo m24183a0(C1454gq c1454gq, int i) {
        MediaCodec.CryptoInfo m18404a = c1454gq.f11564q.m18404a();
        if (i == 0) {
            return m18404a;
        }
        if (m18404a.numBytesOfClearData == null) {
            m18404a.numBytesOfClearData = new int[1];
        }
        int[] iArr = m18404a.numBytesOfClearData;
        iArr[0] = iArr[0] + i;
        return m18404a;
    }

    @Override // com.daaw.AbstractC3517xa
    /* renamed from: A */
    public void mo3466A() {
        this.f7513G = null;
        try {
            mo21391o0();
            try {
                InterfaceC3933d<i40> interfaceC3933d = this.f7514H;
                if (interfaceC3933d != null) {
                    this.f7545z.mo1671f(interfaceC3933d);
                }
                try {
                    InterfaceC3933d<i40> interfaceC3933d2 = this.f7515I;
                    if (interfaceC3933d2 != null && interfaceC3933d2 != this.f7514H) {
                        this.f7545z.mo1671f(interfaceC3933d2);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    InterfaceC3933d<i40> interfaceC3933d3 = this.f7515I;
                    if (interfaceC3933d3 != null && interfaceC3933d3 != this.f7514H) {
                        this.f7545z.mo1671f(interfaceC3933d3);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.f7514H != null) {
                    this.f7545z.mo1671f(this.f7514H);
                }
                try {
                    InterfaceC3933d<i40> interfaceC3933d4 = this.f7515I;
                    if (interfaceC3933d4 != null && interfaceC3933d4 != this.f7514H) {
                        this.f7545z.mo1671f(interfaceC3933d4);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    InterfaceC3933d<i40> interfaceC3933d5 = this.f7515I;
                    if (interfaceC3933d5 != null && interfaceC3933d5 != this.f7514H) {
                        this.f7545z.mo1671f(interfaceC3933d5);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    @Override // com.daaw.AbstractC3517xa
    /* renamed from: B */
    public void mo5370B(boolean z) {
        this.f7543k0 = new C1321fq();
    }

    @Override // com.daaw.AbstractC3517xa
    /* renamed from: C */
    public void mo3465C(long j, boolean z) {
        this.f7539g0 = false;
        this.f7540h0 = false;
        if (this.f7516J != null) {
            mo21404U();
        }
    }

    @Override // com.daaw.AbstractC3517xa
    /* renamed from: D */
    public void mo5369D() {
    }

    @Override // com.daaw.AbstractC3517xa
    /* renamed from: E */
    public void mo5368E() {
    }

    /* renamed from: J */
    public abstract int mo21417J(MediaCodec mediaCodec, co0 co0Var, Format format, Format format2);

    /* renamed from: K */
    public final int m24197K(String str) {
        int i = sq1.f26525a;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = sq1.f26528d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i < 24) {
            if ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) {
                String str3 = sq1.f26526b;
                return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
            }
            return 0;
        }
        return 0;
    }

    /* renamed from: R */
    public abstract void mo21408R(co0 co0Var, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto);

    /* renamed from: S */
    public final boolean m24190S(long j, long j2) {
        boolean mo14855l0;
        int dequeueOutputBuffer;
        if (!m24180d0()) {
            if (this.f7523Q && this.f7538f0) {
                try {
                    dequeueOutputBuffer = this.f7516J.dequeueOutputBuffer(this.f7512F, m24184Z());
                } catch (IllegalStateException unused) {
                    m24178k0();
                    if (this.f7540h0) {
                        mo21391o0();
                    }
                    return false;
                }
            } else {
                dequeueOutputBuffer = this.f7516J.dequeueOutputBuffer(this.f7512F, m24184Z());
            }
            if (dequeueOutputBuffer < 0) {
                if (dequeueOutputBuffer == -2) {
                    m24176n0();
                    return true;
                } else if (dequeueOutputBuffer == -3) {
                    m24177m0();
                    return true;
                } else {
                    if (this.f7521O && (this.f7539g0 || this.f7536d0 == 2)) {
                        m24178k0();
                    }
                    return false;
                }
            } else if (this.f7526T) {
                this.f7526T = false;
                this.f7516J.releaseOutputBuffer(dequeueOutputBuffer, false);
                return true;
            } else {
                MediaCodec.BufferInfo bufferInfo = this.f7512F;
                if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                    m24178k0();
                    return false;
                }
                this.f7531Y = dequeueOutputBuffer;
                ByteBuffer m24181c0 = m24181c0(dequeueOutputBuffer);
                this.f7532Z = m24181c0;
                if (m24181c0 != null) {
                    m24181c0.position(this.f7512F.offset);
                    ByteBuffer byteBuffer = this.f7532Z;
                    MediaCodec.BufferInfo bufferInfo2 = this.f7512F;
                    byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                }
                this.f7533a0 = m24171u0(this.f7512F.presentationTimeUs);
            }
        }
        if (this.f7523Q && this.f7538f0) {
            try {
                MediaCodec mediaCodec = this.f7516J;
                ByteBuffer byteBuffer2 = this.f7532Z;
                int i = this.f7531Y;
                MediaCodec.BufferInfo bufferInfo3 = this.f7512F;
                mo14855l0 = mo14855l0(j, j2, mediaCodec, byteBuffer2, i, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.f7533a0);
            } catch (IllegalStateException unused2) {
                m24178k0();
                if (this.f7540h0) {
                    mo21391o0();
                }
                return false;
            }
        } else {
            MediaCodec mediaCodec2 = this.f7516J;
            ByteBuffer byteBuffer3 = this.f7532Z;
            int i2 = this.f7531Y;
            MediaCodec.BufferInfo bufferInfo4 = this.f7512F;
            mo14855l0 = mo14855l0(j, j2, mediaCodec2, byteBuffer3, i2, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.f7533a0);
        }
        if (mo14855l0) {
            mo21393i0(this.f7512F.presentationTimeUs);
            boolean z = (this.f7512F.flags & 4) != 0;
            m24172s0();
            if (!z) {
                return true;
            }
            m24178k0();
        }
        return false;
    }

    /* renamed from: T */
    public final boolean m24189T() {
        int position;
        int m5367G;
        MediaCodec mediaCodec = this.f7516J;
        if (mediaCodec == null || this.f7536d0 == 2 || this.f7539g0) {
            return false;
        }
        if (this.f7530X < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.f7530X = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            this.f7508B.f11565r = m24182b0(dequeueInputBuffer);
            this.f7508B.mo3749f();
        }
        if (this.f7536d0 == 1) {
            if (!this.f7521O) {
                this.f7538f0 = true;
                this.f7516J.queueInputBuffer(this.f7530X, 0, 0, 0L, 4);
                m24173r0();
            }
            this.f7536d0 = 2;
            return false;
        } else if (this.f7525S) {
            this.f7525S = false;
            ByteBuffer byteBuffer = this.f7508B.f11565r;
            byte[] bArr = f7506l0;
            byteBuffer.put(bArr);
            this.f7516J.queueInputBuffer(this.f7530X, 0, bArr.length, 0L, 0);
            m24173r0();
            this.f7537e0 = true;
            return true;
        } else {
            if (this.f7541i0) {
                m5367G = -4;
                position = 0;
            } else {
                if (this.f7535c0 == 1) {
                    for (int i = 0; i < this.f7513G.f35723w.size(); i++) {
                        this.f7508B.f11565r.put(this.f7513G.f35723w.get(i));
                    }
                    this.f7535c0 = 2;
                }
                position = this.f7508B.f11565r.position();
                m5367G = m5367G(this.f7510D, this.f7508B, false);
            }
            if (m5367G == -3) {
                return false;
            }
            if (m5367G == -5) {
                if (this.f7535c0 == 2) {
                    this.f7508B.mo3749f();
                    this.f7535c0 = 1;
                }
                mo14857g0(this.f7510D.f15633a);
                return true;
            } else if (this.f7508B.m11437j()) {
                if (this.f7535c0 == 2) {
                    this.f7508B.mo3749f();
                    this.f7535c0 = 1;
                }
                this.f7539g0 = true;
                if (!this.f7537e0) {
                    m24178k0();
                    return false;
                }
                try {
                    if (!this.f7521O) {
                        this.f7538f0 = true;
                        this.f7516J.queueInputBuffer(this.f7530X, 0, 0, 0L, 4);
                        m24173r0();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw C2802qz.m11927a(e, m5348x());
                }
            } else if (this.f7542j0 && !this.f7508B.m11436k()) {
                this.f7508B.mo3749f();
                if (this.f7535c0 == 2) {
                    this.f7535c0 = 1;
                }
                return true;
            } else {
                this.f7542j0 = false;
                boolean m21349p = this.f7508B.m21349p();
                boolean m24170v0 = m24170v0(m21349p);
                this.f7541i0 = m24170v0;
                if (m24170v0) {
                    return false;
                }
                if (this.f7519M && !m21349p) {
                    sr0.m9977b(this.f7508B.f11565r);
                    if (this.f7508B.f11565r.position() == 0) {
                        return true;
                    }
                    this.f7519M = false;
                }
                try {
                    C1454gq c1454gq = this.f7508B;
                    long j = c1454gq.f11566s;
                    if (c1454gq.m11438i()) {
                        this.f7511E.add(Long.valueOf(j));
                    }
                    this.f7508B.m21350o();
                    mo21392j0(this.f7508B);
                    if (m21349p) {
                        this.f7516J.queueSecureInputBuffer(this.f7530X, 0, m24183a0(this.f7508B, position), j, 0);
                    } else {
                        this.f7516J.queueInputBuffer(this.f7530X, 0, this.f7508B.f11565r.limit(), j, 0);
                    }
                    m24173r0();
                    this.f7537e0 = true;
                    this.f7535c0 = 0;
                    this.f7543k0.f9764c++;
                    return true;
                } catch (MediaCodec.CryptoException e2) {
                    throw C2802qz.m11927a(e2, m5348x());
                }
            }
        }
    }

    /* renamed from: U */
    public void mo21404U() {
        this.f7529W = -9223372036854775807L;
        m24173r0();
        m24172s0();
        this.f7542j0 = true;
        this.f7541i0 = false;
        this.f7533a0 = false;
        this.f7511E.clear();
        this.f7525S = false;
        this.f7526T = false;
        if (this.f7520N || ((this.f7522P && this.f7538f0) || this.f7536d0 != 0)) {
            mo21391o0();
            m24179e0();
        } else {
            this.f7516J.flush();
            this.f7537e0 = false;
        }
        if (!this.f7534b0 || this.f7513G == null) {
            return;
        }
        this.f7535c0 = 1;
    }

    /* renamed from: V */
    public final MediaCodec m24188V() {
        return this.f7516J;
    }

    /* renamed from: W */
    public final void m24187W() {
        if (sq1.f26525a < 21) {
            this.f7527U = this.f7516J.getInputBuffers();
            this.f7528V = this.f7516J.getOutputBuffers();
        }
    }

    /* renamed from: X */
    public final co0 m24186X() {
        return this.f7517K;
    }

    /* renamed from: Y */
    public co0 mo24185Y(eo0 eo0Var, Format format, boolean z) {
        return eo0Var.mo23339b(format.f35721u, z);
    }

    /* renamed from: Z */
    public long m24184Z() {
        return 0L;
    }

    @Override // com.daaw.b41
    /* renamed from: a */
    public final int mo3460a(Format format) {
        try {
            return mo21389w0(this.f7544y, this.f7545z, format);
        } catch (fo0.C1312c e) {
            throw C2802qz.m11927a(e, m5348x());
        }
    }

    /* renamed from: b0 */
    public final ByteBuffer m24182b0(int i) {
        return sq1.f26525a >= 21 ? this.f7516J.getInputBuffer(i) : this.f7527U[i];
    }

    @Override // com.daaw.a41
    /* renamed from: c */
    public boolean mo3459c() {
        return this.f7540h0;
    }

    /* renamed from: c0 */
    public final ByteBuffer m24181c0(int i) {
        return sq1.f26525a >= 21 ? this.f7516J.getOutputBuffer(i) : this.f7528V[i];
    }

    @Override // com.daaw.a41
    /* renamed from: d */
    public boolean mo3458d() {
        return (this.f7513G == null || this.f7541i0 || (!m5346z() && !m24180d0() && (this.f7529W == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f7529W))) ? false : true;
    }

    /* renamed from: d0 */
    public final boolean m24180d0() {
        return this.f7531Y >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m24179e0() {
        Format format;
        MediaCrypto mediaCrypto;
        boolean z;
        if (this.f7516J != null || (format = this.f7513G) == null) {
            return;
        }
        InterfaceC3933d<i40> interfaceC3933d = this.f7515I;
        this.f7514H = interfaceC3933d;
        String str = format.f35721u;
        if (interfaceC3933d != null) {
            i40 mo1664b = interfaceC3933d.mo1664b();
            if (mo1664b != null) {
                mediaCrypto = mo1664b.m20145a();
                z = mo1664b.m20144b(str);
                if (this.f7517K == null) {
                    try {
                        co0 mo24185Y = mo24185Y(this.f7544y, this.f7513G, z);
                        this.f7517K = mo24185Y;
                        if (mo24185Y == null && z) {
                            co0 mo24185Y2 = mo24185Y(this.f7544y, this.f7513G, false);
                            this.f7517K = mo24185Y2;
                            if (mo24185Y2 != null) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Drm session requires secure decoder for ");
                                sb.append(str);
                                sb.append(", but no secure decoder available. Trying to proceed with ");
                                sb.append(this.f7517K.f5990a);
                                sb.append(".");
                            }
                        }
                    } catch (fo0.C1312c e) {
                        m24169x0(new C1118a(this.f7513G, e, z, -49998));
                    }
                    if (this.f7517K == null) {
                        m24169x0(new C1118a(this.f7513G, (Throwable) null, z, -49999));
                    }
                }
                if (mo21390t0(this.f7517K)) {
                    return;
                }
                String str2 = this.f7517K.f5990a;
                this.f7518L = m24197K(str2);
                this.f7519M = m24196L(str2, this.f7513G);
                this.f7520N = m24192P(str2);
                this.f7521O = m24193O(str2);
                this.f7522P = m24195M(str2);
                this.f7523Q = m24194N(str2);
                this.f7524R = m24191Q(str2, this.f7513G);
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    mm1.m15937a("createCodec:" + str2);
                    this.f7516J = MediaCodec.createByCodecName(str2);
                    mm1.m15935c();
                    mm1.m15937a("configureCodec");
                    mo21408R(this.f7517K, this.f7516J, this.f7513G, mediaCrypto);
                    mm1.m15935c();
                    mm1.m15937a("startCodec");
                    this.f7516J.start();
                    mm1.m15935c();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    mo21394f0(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    m24187W();
                } catch (Exception e2) {
                    m24169x0(new C1118a(this.f7513G, e2, z, str2));
                }
                this.f7529W = getState() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                m24173r0();
                m24172s0();
                this.f7542j0 = true;
                this.f7543k0.f9762a++;
                return;
            } else if (this.f7514H.mo1663c() == null) {
                return;
            }
        }
        mediaCrypto = null;
        z = false;
        if (this.f7517K == null) {
        }
        if (mo21390t0(this.f7517K)) {
        }
    }

    /* renamed from: f0 */
    public abstract void mo21394f0(String str, long j, long j2);

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
        if (r6.f35726z == r0.f35726z) goto L34;
     */
    /* renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo14857g0(Format format) {
        MediaCodec mediaCodec;
        int mo21417J;
        Format format2 = this.f7513G;
        this.f7513G = format;
        if (!sq1.m10016b(format.f35724x, format2 == null ? null : format2.f35724x)) {
            if (this.f7513G.f35724x != null) {
                InterfaceC3746yu<i40> interfaceC3746yu = this.f7545z;
                if (interfaceC3746yu == null) {
                    throw C2802qz.m11927a(new IllegalStateException("Media requires a DrmSessionManager"), m5348x());
                }
                InterfaceC3933d<i40> mo1676a = interfaceC3746yu.mo1676a(Looper.myLooper(), this.f7513G.f35724x);
                this.f7515I = mo1676a;
                if (mo1676a == this.f7514H) {
                    this.f7545z.mo1671f(mo1676a);
                }
            } else {
                this.f7515I = null;
            }
        }
        boolean z = false;
        if (this.f7515I == this.f7514H && (mediaCodec = this.f7516J) != null && (mo21417J = mo21417J(mediaCodec, this.f7517K, format2, this.f7513G)) != 0) {
            if (mo21417J != 1) {
                if (mo21417J != 3) {
                    throw new IllegalStateException();
                }
                this.f7534b0 = true;
                this.f7535c0 = 1;
                int i = this.f7518L;
                if (i != 2) {
                    if (i == 1) {
                        Format format3 = this.f7513G;
                        if (format3.f35725y == format2.f35725y) {
                        }
                    }
                    this.f7525S = z;
                }
                z = true;
                this.f7525S = z;
            }
            z = true;
        }
        if (z) {
            return;
        }
        if (this.f7537e0) {
            this.f7536d0 = 1;
            return;
        }
        mo21391o0();
        m24179e0();
    }

    /* renamed from: h0 */
    public abstract void mo14856h0(MediaCodec mediaCodec, MediaFormat mediaFormat);

    /* renamed from: i0 */
    public void mo21393i0(long j) {
    }

    /* renamed from: j0 */
    public abstract void mo21392j0(C1454gq c1454gq);

    /* renamed from: k0 */
    public final void m24178k0() {
        if (this.f7536d0 == 2) {
            mo21391o0();
            m24179e0();
            return;
        }
        this.f7540h0 = true;
        mo24175p0();
    }

    /* renamed from: l0 */
    public abstract boolean mo14855l0(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z);

    /* renamed from: m0 */
    public final void m24177m0() {
        if (sq1.f26525a < 21) {
            this.f7528V = this.f7516J.getOutputBuffers();
        }
    }

    /* renamed from: n0 */
    public final void m24176n0() {
        MediaFormat outputFormat = this.f7516J.getOutputFormat();
        if (this.f7518L != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.f7526T = true;
            return;
        }
        if (this.f7524R) {
            outputFormat.setInteger("channel-count", 1);
        }
        mo14856h0(this.f7516J, outputFormat);
    }

    /* renamed from: o0 */
    public void mo21391o0() {
        this.f7529W = -9223372036854775807L;
        m24173r0();
        m24172s0();
        this.f7541i0 = false;
        this.f7533a0 = false;
        this.f7511E.clear();
        m24174q0();
        this.f7517K = null;
        this.f7534b0 = false;
        this.f7537e0 = false;
        this.f7519M = false;
        this.f7520N = false;
        this.f7518L = 0;
        this.f7521O = false;
        this.f7522P = false;
        this.f7524R = false;
        this.f7525S = false;
        this.f7526T = false;
        this.f7538f0 = false;
        this.f7535c0 = 0;
        this.f7536d0 = 0;
        MediaCodec mediaCodec = this.f7516J;
        if (mediaCodec != null) {
            this.f7543k0.f9763b++;
            try {
                mediaCodec.stop();
                try {
                    this.f7516J.release();
                    this.f7516J = null;
                    InterfaceC3933d<i40> interfaceC3933d = this.f7514H;
                    if (interfaceC3933d == null || this.f7515I == interfaceC3933d) {
                        return;
                    }
                    try {
                        this.f7545z.mo1671f(interfaceC3933d);
                    } finally {
                    }
                } catch (Throwable th) {
                    this.f7516J = null;
                    InterfaceC3933d<i40> interfaceC3933d2 = this.f7514H;
                    if (interfaceC3933d2 != null && this.f7515I != interfaceC3933d2) {
                        try {
                            this.f7545z.mo1671f(interfaceC3933d2);
                        } finally {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.f7516J.release();
                    this.f7516J = null;
                    InterfaceC3933d<i40> interfaceC3933d3 = this.f7514H;
                    if (interfaceC3933d3 != null && this.f7515I != interfaceC3933d3) {
                        try {
                            this.f7545z.mo1671f(interfaceC3933d3);
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.f7516J = null;
                    InterfaceC3933d<i40> interfaceC3933d4 = this.f7514H;
                    if (interfaceC3933d4 != null && this.f7515I != interfaceC3933d4) {
                        try {
                            this.f7545z.mo1671f(interfaceC3933d4);
                        } finally {
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    @Override // com.daaw.AbstractC3517xa, com.daaw.b41
    /* renamed from: p */
    public final int mo5355p() {
        return 8;
    }

    /* renamed from: p0 */
    public void mo24175p0() {
    }

    @Override // com.daaw.a41
    /* renamed from: q */
    public void mo3457q(long j, long j2) {
        if (this.f7540h0) {
            mo24175p0();
            return;
        }
        if (this.f7513G == null) {
            this.f7509C.mo3749f();
            int m5367G = m5367G(this.f7510D, this.f7509C, true);
            if (m5367G != -5) {
                if (m5367G == -4) {
                    C2914s6.m10685f(this.f7509C.m11437j());
                    this.f7539g0 = true;
                    m24178k0();
                    return;
                }
                return;
            }
            mo14857g0(this.f7510D.f15633a);
        }
        m24179e0();
        if (this.f7516J != null) {
            mm1.m15937a("drainAndFeed");
            do {
            } while (m24190S(j, j2));
            do {
            } while (m24189T());
            mm1.m15935c();
        } else {
            this.f7543k0.f9765d += m5366H(j);
            this.f7509C.mo3749f();
            int m5367G2 = m5367G(this.f7510D, this.f7509C, false);
            if (m5367G2 == -5) {
                mo14857g0(this.f7510D.f15633a);
            } else if (m5367G2 == -4) {
                C2914s6.m10685f(this.f7509C.m11437j());
                this.f7539g0 = true;
                m24178k0();
            }
        }
        this.f7543k0.m22418a();
    }

    /* renamed from: q0 */
    public final void m24174q0() {
        if (sq1.f26525a < 21) {
            this.f7527U = null;
            this.f7528V = null;
        }
    }

    /* renamed from: r0 */
    public final void m24173r0() {
        this.f7530X = -1;
        this.f7508B.f11565r = null;
    }

    /* renamed from: s0 */
    public final void m24172s0() {
        this.f7531Y = -1;
        this.f7532Z = null;
    }

    /* renamed from: t0 */
    public boolean mo21390t0(co0 co0Var) {
        return true;
    }

    /* renamed from: u0 */
    public final boolean m24171u0(long j) {
        int size = this.f7511E.size();
        for (int i = 0; i < size; i++) {
            if (this.f7511E.get(i).longValue() == j) {
                this.f7511E.remove(i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: v0 */
    public final boolean m24170v0(boolean z) {
        InterfaceC3933d<i40> interfaceC3933d = this.f7514H;
        if (interfaceC3933d == null || (!z && this.f7507A)) {
            return false;
        }
        int state = interfaceC3933d.getState();
        if (state != 1) {
            return state != 4;
        }
        throw C2802qz.m11927a(this.f7514H.mo1663c(), m5348x());
    }

    /* renamed from: w0 */
    public abstract int mo21389w0(eo0 eo0Var, InterfaceC3746yu<i40> interfaceC3746yu, Format format);

    /* renamed from: x0 */
    public final void m24169x0(C1118a c1118a) {
        throw C2802qz.m11927a(c1118a, m5348x());
    }
}
