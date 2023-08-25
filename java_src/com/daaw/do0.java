package com.daaw;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.daaw.fo0;
import com.google.android.exoplayer2.Format;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
@TargetApi(16)
/* loaded from: classes.dex */
public abstract class do0 extends xa {
    public static final byte[] l0 = sq1.r("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    public final boolean A;
    public final gq B;
    public final gq C;
    public final k30 D;
    public final List<Long> E;
    public final MediaCodec.BufferInfo F;
    public Format G;
    public com.google.android.exoplayer2.drm.d<i40> H;
    public com.google.android.exoplayer2.drm.d<i40> I;
    public MediaCodec J;
    public co0 K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public ByteBuffer[] U;
    public ByteBuffer[] V;
    public long W;
    public int X;
    public int Y;
    public ByteBuffer Z;
    public boolean a0;
    public boolean b0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public fq k0;
    public final eo0 y;
    public final yu<i40> z;

    /* loaded from: classes.dex */
    public static class a extends Exception {
        public final String p;
        public final boolean q;
        public final String r;
        public final String s;

        public a(Format format, Throwable th, boolean z, int i) {
            super("Decoder init failed: [" + i + "], " + format, th);
            this.p = format.u;
            this.q = z;
            this.r = null;
            this.s = a(i);
        }

        public a(Format format, Throwable th, boolean z, String str) {
            super("Decoder init failed: " + str + ", " + format, th);
            this.p = format.u;
            this.q = z;
            this.r = str;
            this.s = sq1.a >= 21 ? b(th) : null;
        }

        public static String a(int i) {
            String str = i < 0 ? "neg_" : "";
            return "com.google.android.exoplayer.MediaCodecTrackRenderer_" + str + Math.abs(i);
        }

        @TargetApi(21)
        public static String b(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }
    }

    public do0(int i, eo0 eo0Var, yu<i40> yuVar, boolean z) {
        super(i);
        s6.f(sq1.a >= 16);
        this.y = (eo0) s6.e(eo0Var);
        this.z = yuVar;
        this.A = z;
        this.B = new gq(0);
        this.C = gq.r();
        this.D = new k30();
        this.E = new ArrayList();
        this.F = new MediaCodec.BufferInfo();
        this.c0 = 0;
        this.d0 = 0;
    }

    public static boolean L(String str, Format format) {
        return sq1.a < 21 && format.w.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    public static boolean M(String str) {
        int i = sq1.a;
        return (i <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (i <= 19 && "hb2000".equals(sq1.b) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str)));
    }

    public static boolean N(String str) {
        return sq1.a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    public static boolean O(String str) {
        return sq1.a <= 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str));
    }

    public static boolean P(String str) {
        int i = sq1.a;
        return i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i == 19 && sq1.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    public static boolean Q(String str, Format format) {
        return sq1.a <= 18 && format.G == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    public static MediaCodec.CryptoInfo a0(gq gqVar, int i) {
        MediaCodec.CryptoInfo a2 = gqVar.q.a();
        if (i == 0) {
            return a2;
        }
        if (a2.numBytesOfClearData == null) {
            a2.numBytesOfClearData = new int[1];
        }
        int[] iArr = a2.numBytesOfClearData;
        iArr[0] = iArr[0] + i;
        return a2;
    }

    @Override // com.daaw.xa
    public void A() {
        this.G = null;
        try {
            o0();
            try {
                com.google.android.exoplayer2.drm.d<i40> dVar = this.H;
                if (dVar != null) {
                    this.z.f(dVar);
                }
                try {
                    com.google.android.exoplayer2.drm.d<i40> dVar2 = this.I;
                    if (dVar2 != null && dVar2 != this.H) {
                        this.z.f(dVar2);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    com.google.android.exoplayer2.drm.d<i40> dVar3 = this.I;
                    if (dVar3 != null && dVar3 != this.H) {
                        this.z.f(dVar3);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.H != null) {
                    this.z.f(this.H);
                }
                try {
                    com.google.android.exoplayer2.drm.d<i40> dVar4 = this.I;
                    if (dVar4 != null && dVar4 != this.H) {
                        this.z.f(dVar4);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    com.google.android.exoplayer2.drm.d<i40> dVar5 = this.I;
                    if (dVar5 != null && dVar5 != this.H) {
                        this.z.f(dVar5);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    @Override // com.daaw.xa
    public void B(boolean z) {
        this.k0 = new fq();
    }

    @Override // com.daaw.xa
    public void C(long j, boolean z) {
        this.g0 = false;
        this.h0 = false;
        if (this.J != null) {
            U();
        }
    }

    @Override // com.daaw.xa
    public void D() {
    }

    @Override // com.daaw.xa
    public void E() {
    }

    public abstract int J(MediaCodec mediaCodec, co0 co0Var, Format format, Format format2);

    public final int K(String str) {
        int i = sq1.a;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = sq1.d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i < 24) {
            if ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) {
                String str3 = sq1.b;
                return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
            }
            return 0;
        }
        return 0;
    }

    public abstract void R(co0 co0Var, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto);

    public final boolean S(long j, long j2) {
        boolean l02;
        int dequeueOutputBuffer;
        if (!d0()) {
            if (this.Q && this.f0) {
                try {
                    dequeueOutputBuffer = this.J.dequeueOutputBuffer(this.F, Z());
                } catch (IllegalStateException unused) {
                    k0();
                    if (this.h0) {
                        o0();
                    }
                    return false;
                }
            } else {
                dequeueOutputBuffer = this.J.dequeueOutputBuffer(this.F, Z());
            }
            if (dequeueOutputBuffer < 0) {
                if (dequeueOutputBuffer == -2) {
                    n0();
                    return true;
                } else if (dequeueOutputBuffer == -3) {
                    m0();
                    return true;
                } else {
                    if (this.O && (this.g0 || this.d0 == 2)) {
                        k0();
                    }
                    return false;
                }
            } else if (this.T) {
                this.T = false;
                this.J.releaseOutputBuffer(dequeueOutputBuffer, false);
                return true;
            } else {
                MediaCodec.BufferInfo bufferInfo = this.F;
                if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                    k0();
                    return false;
                }
                this.Y = dequeueOutputBuffer;
                ByteBuffer c0 = c0(dequeueOutputBuffer);
                this.Z = c0;
                if (c0 != null) {
                    c0.position(this.F.offset);
                    ByteBuffer byteBuffer = this.Z;
                    MediaCodec.BufferInfo bufferInfo2 = this.F;
                    byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                }
                this.a0 = u0(this.F.presentationTimeUs);
            }
        }
        if (this.Q && this.f0) {
            try {
                MediaCodec mediaCodec = this.J;
                ByteBuffer byteBuffer2 = this.Z;
                int i = this.Y;
                MediaCodec.BufferInfo bufferInfo3 = this.F;
                l02 = l0(j, j2, mediaCodec, byteBuffer2, i, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.a0);
            } catch (IllegalStateException unused2) {
                k0();
                if (this.h0) {
                    o0();
                }
                return false;
            }
        } else {
            MediaCodec mediaCodec2 = this.J;
            ByteBuffer byteBuffer3 = this.Z;
            int i2 = this.Y;
            MediaCodec.BufferInfo bufferInfo4 = this.F;
            l02 = l0(j, j2, mediaCodec2, byteBuffer3, i2, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.a0);
        }
        if (l02) {
            i0(this.F.presentationTimeUs);
            boolean z = (this.F.flags & 4) != 0;
            s0();
            if (!z) {
                return true;
            }
            k0();
        }
        return false;
    }

    public final boolean T() {
        int position;
        int G;
        MediaCodec mediaCodec = this.J;
        if (mediaCodec == null || this.d0 == 2 || this.g0) {
            return false;
        }
        if (this.X < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.X = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            this.B.r = b0(dequeueInputBuffer);
            this.B.f();
        }
        if (this.d0 == 1) {
            if (!this.O) {
                this.f0 = true;
                this.J.queueInputBuffer(this.X, 0, 0, 0L, 4);
                r0();
            }
            this.d0 = 2;
            return false;
        } else if (this.S) {
            this.S = false;
            ByteBuffer byteBuffer = this.B.r;
            byte[] bArr = l0;
            byteBuffer.put(bArr);
            this.J.queueInputBuffer(this.X, 0, bArr.length, 0L, 0);
            r0();
            this.e0 = true;
            return true;
        } else {
            if (this.i0) {
                G = -4;
                position = 0;
            } else {
                if (this.c0 == 1) {
                    for (int i = 0; i < this.G.w.size(); i++) {
                        this.B.r.put(this.G.w.get(i));
                    }
                    this.c0 = 2;
                }
                position = this.B.r.position();
                G = G(this.D, this.B, false);
            }
            if (G == -3) {
                return false;
            }
            if (G == -5) {
                if (this.c0 == 2) {
                    this.B.f();
                    this.c0 = 1;
                }
                g0(this.D.a);
                return true;
            } else if (this.B.j()) {
                if (this.c0 == 2) {
                    this.B.f();
                    this.c0 = 1;
                }
                this.g0 = true;
                if (!this.e0) {
                    k0();
                    return false;
                }
                try {
                    if (!this.O) {
                        this.f0 = true;
                        this.J.queueInputBuffer(this.X, 0, 0, 0L, 4);
                        r0();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw qz.a(e, x());
                }
            } else if (this.j0 && !this.B.k()) {
                this.B.f();
                if (this.c0 == 2) {
                    this.c0 = 1;
                }
                return true;
            } else {
                this.j0 = false;
                boolean p = this.B.p();
                boolean v0 = v0(p);
                this.i0 = v0;
                if (v0) {
                    return false;
                }
                if (this.M && !p) {
                    sr0.b(this.B.r);
                    if (this.B.r.position() == 0) {
                        return true;
                    }
                    this.M = false;
                }
                try {
                    gq gqVar = this.B;
                    long j = gqVar.s;
                    if (gqVar.i()) {
                        this.E.add(Long.valueOf(j));
                    }
                    this.B.o();
                    j0(this.B);
                    if (p) {
                        this.J.queueSecureInputBuffer(this.X, 0, a0(this.B, position), j, 0);
                    } else {
                        this.J.queueInputBuffer(this.X, 0, this.B.r.limit(), j, 0);
                    }
                    r0();
                    this.e0 = true;
                    this.c0 = 0;
                    this.k0.c++;
                    return true;
                } catch (MediaCodec.CryptoException e2) {
                    throw qz.a(e2, x());
                }
            }
        }
    }

    public void U() {
        this.W = -9223372036854775807L;
        r0();
        s0();
        this.j0 = true;
        this.i0 = false;
        this.a0 = false;
        this.E.clear();
        this.S = false;
        this.T = false;
        if (this.N || ((this.P && this.f0) || this.d0 != 0)) {
            o0();
            e0();
        } else {
            this.J.flush();
            this.e0 = false;
        }
        if (!this.b0 || this.G == null) {
            return;
        }
        this.c0 = 1;
    }

    public final MediaCodec V() {
        return this.J;
    }

    public final void W() {
        if (sq1.a < 21) {
            this.U = this.J.getInputBuffers();
            this.V = this.J.getOutputBuffers();
        }
    }

    public final co0 X() {
        return this.K;
    }

    public co0 Y(eo0 eo0Var, Format format, boolean z) {
        return eo0Var.b(format.u, z);
    }

    public long Z() {
        return 0L;
    }

    @Override // com.daaw.b41
    public final int a(Format format) {
        try {
            return w0(this.y, this.z, format);
        } catch (fo0.c e) {
            throw qz.a(e, x());
        }
    }

    public final ByteBuffer b0(int i) {
        return sq1.a >= 21 ? this.J.getInputBuffer(i) : this.U[i];
    }

    @Override // com.daaw.a41
    public boolean c() {
        return this.h0;
    }

    public final ByteBuffer c0(int i) {
        return sq1.a >= 21 ? this.J.getOutputBuffer(i) : this.V[i];
    }

    @Override // com.daaw.a41
    public boolean d() {
        return (this.G == null || this.i0 || (!z() && !d0() && (this.W == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.W))) ? false : true;
    }

    public final boolean d0() {
        return this.Y >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0() {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.do0.e0():void");
    }

    public abstract void f0(String str, long j, long j2);

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
        if (r6.z == r0.z) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g0(com.google.android.exoplayer2.Format r6) {
        /*
            r5 = this;
            com.google.android.exoplayer2.Format r0 = r5.G
            r5.G = r6
            com.google.android.exoplayer2.drm.DrmInitData r6 = r6.x
            r1 = 0
            if (r0 != 0) goto Lb
            r2 = r1
            goto Ld
        Lb:
            com.google.android.exoplayer2.drm.DrmInitData r2 = r0.x
        Ld:
            boolean r6 = com.daaw.sq1.b(r6, r2)
            r2 = 1
            r6 = r6 ^ r2
            if (r6 == 0) goto L49
            com.google.android.exoplayer2.Format r6 = r5.G
            com.google.android.exoplayer2.drm.DrmInitData r6 = r6.x
            if (r6 == 0) goto L47
            com.daaw.yu<com.daaw.i40> r6 = r5.z
            if (r6 == 0) goto L37
            android.os.Looper r1 = android.os.Looper.myLooper()
            com.google.android.exoplayer2.Format r3 = r5.G
            com.google.android.exoplayer2.drm.DrmInitData r3 = r3.x
            com.google.android.exoplayer2.drm.d r6 = r6.a(r1, r3)
            r5.I = r6
            com.google.android.exoplayer2.drm.d<com.daaw.i40> r1 = r5.H
            if (r6 != r1) goto L49
            com.daaw.yu<com.daaw.i40> r1 = r5.z
            r1.f(r6)
            goto L49
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r6.<init>(r0)
            int r0 = r5.x()
            com.daaw.qz r6 = com.daaw.qz.a(r6, r0)
            throw r6
        L47:
            r5.I = r1
        L49:
            com.google.android.exoplayer2.drm.d<com.daaw.i40> r6 = r5.I
            com.google.android.exoplayer2.drm.d<com.daaw.i40> r1 = r5.H
            r3 = 0
            if (r6 != r1) goto L87
            android.media.MediaCodec r6 = r5.J
            if (r6 == 0) goto L87
            com.daaw.co0 r1 = r5.K
            com.google.android.exoplayer2.Format r4 = r5.G
            int r6 = r5.J(r6, r1, r0, r4)
            if (r6 == 0) goto L87
            if (r6 == r2) goto L86
            r1 = 3
            if (r6 != r1) goto L80
            r5.b0 = r2
            r5.c0 = r2
            int r6 = r5.L
            r1 = 2
            if (r6 == r1) goto L7c
            if (r6 != r2) goto L7d
            com.google.android.exoplayer2.Format r6 = r5.G
            int r1 = r6.y
            int r4 = r0.y
            if (r1 != r4) goto L7d
            int r6 = r6.z
            int r0 = r0.z
            if (r6 != r0) goto L7d
        L7c:
            r3 = 1
        L7d:
            r5.S = r3
            goto L86
        L80:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        L86:
            r3 = 1
        L87:
            if (r3 != 0) goto L96
            boolean r6 = r5.e0
            if (r6 == 0) goto L90
            r5.d0 = r2
            goto L96
        L90:
            r5.o0()
            r5.e0()
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.do0.g0(com.google.android.exoplayer2.Format):void");
    }

    public abstract void h0(MediaCodec mediaCodec, MediaFormat mediaFormat);

    public void i0(long j) {
    }

    public abstract void j0(gq gqVar);

    public final void k0() {
        if (this.d0 == 2) {
            o0();
            e0();
            return;
        }
        this.h0 = true;
        p0();
    }

    public abstract boolean l0(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z);

    public final void m0() {
        if (sq1.a < 21) {
            this.V = this.J.getOutputBuffers();
        }
    }

    public final void n0() {
        MediaFormat outputFormat = this.J.getOutputFormat();
        if (this.L != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.T = true;
            return;
        }
        if (this.R) {
            outputFormat.setInteger("channel-count", 1);
        }
        h0(this.J, outputFormat);
    }

    public void o0() {
        this.W = -9223372036854775807L;
        r0();
        s0();
        this.i0 = false;
        this.a0 = false;
        this.E.clear();
        q0();
        this.K = null;
        this.b0 = false;
        this.e0 = false;
        this.M = false;
        this.N = false;
        this.L = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.S = false;
        this.T = false;
        this.f0 = false;
        this.c0 = 0;
        this.d0 = 0;
        MediaCodec mediaCodec = this.J;
        if (mediaCodec != null) {
            this.k0.b++;
            try {
                mediaCodec.stop();
                try {
                    this.J.release();
                    this.J = null;
                    com.google.android.exoplayer2.drm.d<i40> dVar = this.H;
                    if (dVar == null || this.I == dVar) {
                        return;
                    }
                    try {
                        this.z.f(dVar);
                    } finally {
                    }
                } catch (Throwable th) {
                    this.J = null;
                    com.google.android.exoplayer2.drm.d<i40> dVar2 = this.H;
                    if (dVar2 != null && this.I != dVar2) {
                        try {
                            this.z.f(dVar2);
                        } finally {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.J.release();
                    this.J = null;
                    com.google.android.exoplayer2.drm.d<i40> dVar3 = this.H;
                    if (dVar3 != null && this.I != dVar3) {
                        try {
                            this.z.f(dVar3);
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.J = null;
                    com.google.android.exoplayer2.drm.d<i40> dVar4 = this.H;
                    if (dVar4 != null && this.I != dVar4) {
                        try {
                            this.z.f(dVar4);
                        } finally {
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    @Override // com.daaw.xa, com.daaw.b41
    public final int p() {
        return 8;
    }

    public void p0() {
    }

    @Override // com.daaw.a41
    public void q(long j, long j2) {
        if (this.h0) {
            p0();
            return;
        }
        if (this.G == null) {
            this.C.f();
            int G = G(this.D, this.C, true);
            if (G != -5) {
                if (G == -4) {
                    s6.f(this.C.j());
                    this.g0 = true;
                    k0();
                    return;
                }
                return;
            }
            g0(this.D.a);
        }
        e0();
        if (this.J != null) {
            mm1.a("drainAndFeed");
            do {
            } while (S(j, j2));
            do {
            } while (T());
            mm1.c();
        } else {
            this.k0.d += H(j);
            this.C.f();
            int G2 = G(this.D, this.C, false);
            if (G2 == -5) {
                g0(this.D.a);
            } else if (G2 == -4) {
                s6.f(this.C.j());
                this.g0 = true;
                k0();
            }
        }
        this.k0.a();
    }

    public final void q0() {
        if (sq1.a < 21) {
            this.U = null;
            this.V = null;
        }
    }

    public final void r0() {
        this.X = -1;
        this.B.r = null;
    }

    public final void s0() {
        this.Y = -1;
        this.Z = null;
    }

    public boolean t0(co0 co0Var) {
        return true;
    }

    public final boolean u0(long j) {
        int size = this.E.size();
        for (int i = 0; i < size; i++) {
            if (this.E.get(i).longValue() == j) {
                this.E.remove(i);
                return true;
            }
        }
        return false;
    }

    public final boolean v0(boolean z) {
        com.google.android.exoplayer2.drm.d<i40> dVar = this.H;
        if (dVar == null || (!z && this.A)) {
            return false;
        }
        int state = dVar.getState();
        if (state != 1) {
            return state != 4;
        }
        throw qz.a(this.H.c(), x());
    }

    public abstract int w0(eo0 eo0Var, yu<i40> yuVar, Format format);

    public final void x0(a aVar) {
        throw qz.a(aVar, x());
    }
}
