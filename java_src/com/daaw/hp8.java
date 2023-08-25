package com.daaw;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class hp8 extends nk7 {
    public static final byte[] P0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public int A0;
    public final ap8 B;
    public boolean B0;
    public final jp8 C;
    public boolean C0;
    public final float D;
    public boolean D0;
    public final ma7 E;
    public long E0;
    public final ma7 F;
    public long F0;
    public final ma7 G;
    public boolean G0;
    public final vo8 H;
    public boolean H0;
    public final zp5 I;
    public boolean I0;
    public final ArrayList J;
    public ql7 J0;
    public final MediaCodec.BufferInfo K;
    public long K0;
    public final long[] L;
    public long L0;
    public final long[] M;
    public int M0;
    public final long[] N;
    public xn8 N0;
    public f92 O;
    public xn8 O0;
    public f92 P;
    public MediaCrypto Q;
    public boolean R;
    public long S;
    public float T;
    public float U;
    public bp8 V;
    public f92 W;
    public MediaFormat X;
    public boolean Y;
    public float Z;
    public ArrayDeque a0;
    public gp8 b0;
    public ep8 c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public wo8 n0;
    public long o0;
    public int p0;
    public int q0;
    public ByteBuffer r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public int y0;
    public int z0;

    public hp8(int i, ap8 ap8Var, jp8 jp8Var, boolean z, float f) {
        super(i);
        this.B = ap8Var;
        Objects.requireNonNull(jp8Var);
        this.C = jp8Var;
        this.D = f;
        this.E = new ma7(0, 0);
        this.F = new ma7(0, 0);
        this.G = new ma7(2, 0);
        vo8 vo8Var = new vo8();
        this.H = vo8Var;
        this.I = new zp5(10);
        this.J = new ArrayList();
        this.K = new MediaCodec.BufferInfo();
        this.T = 1.0f;
        this.U = 1.0f;
        this.S = -9223372036854775807L;
        this.L = new long[10];
        this.M = new long[10];
        this.N = new long[10];
        this.K0 = -9223372036854775807L;
        this.L0 = -9223372036854775807L;
        vo8Var.i(0);
        vo8Var.c.order(ByteOrder.nativeOrder());
        this.Z = -1.0f;
        this.d0 = 0;
        this.y0 = 0;
        this.p0 = -1;
        this.q0 = -1;
        this.o0 = -9223372036854775807L;
        this.E0 = -9223372036854775807L;
        this.F0 = -9223372036854775807L;
        this.z0 = 0;
        this.A0 = 0;
    }

    private final void X() {
        try {
            this.V.zzi();
        } finally {
            m0();
        }
    }

    public static boolean r0(f92 f92Var) {
        return f92Var.E == 0;
    }

    @Override // com.daaw.nk7
    public void A() {
        try {
            I();
            l0();
        } finally {
            this.O0 = null;
        }
    }

    @Override // com.daaw.nk7
    public final void D(f92[] f92VarArr, long j, long j2) {
        if (this.L0 == -9223372036854775807L) {
            uo4.f(this.K0 == -9223372036854775807L);
            this.K0 = j;
            this.L0 = j2;
            return;
        }
        int i = this.M0;
        if (i == 10) {
            s95.e("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.M[9]);
        } else {
            this.M0 = i + 1;
        }
        long[] jArr = this.L;
        int i2 = this.M0 - 1;
        jArr[i2] = j;
        this.M[i2] = j2;
        this.N[i2] = this.E0;
    }

    public abstract float E(float f, f92 f92Var, f92[] f92VarArr);

    public abstract int F(jp8 jp8Var, f92 f92Var);

    public abstract tm7 G(ep8 ep8Var, f92 f92Var, f92 f92Var2);

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
        if (Q() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
        if (Q() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
        if (Q() == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.daaw.tm7 H(com.daaw.a78 r12) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.hp8.H(com.daaw.a78):com.daaw.tm7");
    }

    public final void I() {
        this.w0 = false;
        this.H.b();
        this.G.b();
        this.v0 = false;
        this.u0 = false;
    }

    public final void J() {
        if (this.B0) {
            this.z0 = 1;
            this.A0 = 3;
            return;
        }
        l0();
        j0();
    }

    public abstract zo8 K(ep8 ep8Var, f92 f92Var, MediaCrypto mediaCrypto, float f);

    public abstract List L(jp8 jp8Var, f92 f92Var, boolean z);

    public abstract void M(Exception exc);

    public abstract void N(String str, zo8 zo8Var, long j, long j2);

    public abstract void O(String str);

    public final void P() {
        try {
            throw null;
        } catch (MediaCryptoException e) {
            throw s(e, this.O, false, 6006);
        }
    }

    @TargetApi(23)
    public final boolean Q() {
        if (this.B0) {
            this.z0 = 1;
            if (this.f0 || this.h0) {
                this.A0 = 3;
                return false;
            }
            this.A0 = 2;
        } else {
            P();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    public final boolean R() {
        bp8 bp8Var = this.V;
        boolean z = 0;
        if (bp8Var == null || this.z0 == 2 || this.G0) {
            return false;
        }
        if (this.p0 < 0) {
            int zza = bp8Var.zza();
            this.p0 = zza;
            if (zza < 0) {
                return false;
            }
            this.F.c = this.V.zzf(zza);
            this.F.b();
        }
        if (this.z0 == 1) {
            if (!this.m0) {
                this.C0 = true;
                this.V.b(this.p0, 0, 0, 0L, 4);
                u0();
            }
            this.z0 = 2;
            return false;
        } else if (this.k0) {
            this.k0 = false;
            this.F.c.put(P0);
            this.V.b(this.p0, 0, 38, 0L, 0);
            u0();
            this.B0 = true;
            return true;
        } else {
            if (this.y0 == 1) {
                for (int i = 0; i < this.W.n.size(); i++) {
                    this.F.c.put((byte[]) this.W.n.get(i));
                }
                this.y0 = 2;
            }
            int position = this.F.c.position();
            a78 u = u();
            try {
                int r = r(u, this.F, 0);
                if (j()) {
                    this.F0 = this.E0;
                }
                if (r == -3) {
                    return false;
                }
                if (r == -5) {
                    if (this.y0 == 2) {
                        this.F.b();
                        this.y0 = 1;
                    }
                    H(u);
                    return true;
                }
                ma7 ma7Var = this.F;
                if (ma7Var.g()) {
                    if (this.y0 == 2) {
                        ma7Var.b();
                        this.y0 = 1;
                    }
                    this.G0 = true;
                    if (!this.B0) {
                        t0();
                        return false;
                    }
                    try {
                        if (!this.m0) {
                            this.C0 = true;
                            this.V.b(this.p0, 0, 0, 0L, 4);
                            u0();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw s(e, this.O, false, it5.V(e.getErrorCode()));
                    }
                } else if (!this.B0 && !ma7Var.h()) {
                    ma7Var.b();
                    if (this.y0 == 2) {
                        this.y0 = 1;
                    }
                    return true;
                } else {
                    boolean k = ma7Var.k();
                    if (k) {
                        ma7Var.b.b(position);
                    }
                    if (this.e0 && !k) {
                        ByteBuffer byteBuffer = this.F.c;
                        byte[] bArr = c42.a;
                        int position2 = byteBuffer.position();
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            int i4 = i2 + 1;
                            if (i4 >= position2) {
                                byteBuffer.clear();
                                break;
                            }
                            int i5 = byteBuffer.get(i2) & 255;
                            if (i3 == 3) {
                                if (i5 == 1) {
                                    if ((byteBuffer.get(i4) & 31) == 7) {
                                        ByteBuffer duplicate = byteBuffer.duplicate();
                                        duplicate.position(i2 - 3);
                                        duplicate.limit(position2);
                                        byteBuffer.position(0);
                                        byteBuffer.put(duplicate);
                                        break;
                                    }
                                    i5 = 1;
                                }
                            } else if (i5 == 0) {
                                i3++;
                            }
                            if (i5 != 0) {
                                i3 = 0;
                            }
                            i2 = i4;
                        }
                        if (this.F.c.position() == 0) {
                            return true;
                        }
                        this.e0 = false;
                    }
                    ma7 ma7Var2 = this.F;
                    long j = ma7Var2.e;
                    wo8 wo8Var = this.n0;
                    if (wo8Var != null) {
                        j = wo8Var.b(this.O, ma7Var2);
                        this.E0 = Math.max(this.E0, this.n0.a(this.O));
                    }
                    long j2 = j;
                    if (this.F.f()) {
                        this.J.add(Long.valueOf(j2));
                    }
                    if (this.I0) {
                        this.I.d(j2, this.O);
                        this.I0 = false;
                    }
                    this.E0 = Math.max(this.E0, j2);
                    this.F.j();
                    ma7 ma7Var3 = this.F;
                    if (ma7Var3.e()) {
                        i0(ma7Var3);
                    }
                    Z(this.F);
                    try {
                        if (k) {
                            this.V.d(this.p0, 0, this.F.b, j2, 0);
                        } else {
                            this.V.b(this.p0, 0, this.F.c.limit(), j2, 0);
                        }
                        u0();
                        this.B0 = true;
                        this.y0 = 0;
                        ql7 ql7Var = this.J0;
                        z = ql7Var.c + 1;
                        ql7Var.c = z;
                        return true;
                    } catch (MediaCodec.CryptoException e2) {
                        throw s(e2, this.O, z, it5.V(e2.getErrorCode()));
                    }
                }
            } catch (j97 e3) {
                M(e3);
                T(0);
                X();
                return true;
            }
        }
    }

    public final boolean S() {
        return this.q0 >= 0;
    }

    public final boolean T(int i) {
        a78 u = u();
        this.E.b();
        int r = r(u, this.E, i | 4);
        if (r == -5) {
            H(u);
            return true;
        } else if (r == -4 && this.E.g()) {
            this.G0 = true;
            t0();
            return false;
        } else {
            return false;
        }
    }

    public final boolean U(long j) {
        return this.S == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.S;
    }

    public final boolean V(f92 f92Var) {
        if (it5.a >= 23 && this.V != null && this.A0 != 3 && m() != 0) {
            float E = E(this.U, f92Var, p());
            float f = this.Z;
            if (f == E) {
                return true;
            }
            if (E == -1.0f) {
                J();
                return false;
            } else if (f == -1.0f && E <= this.D) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", E);
                this.V.o(bundle);
                this.Z = E;
            }
        }
        return true;
    }

    public abstract void W(f92 f92Var, MediaFormat mediaFormat);

    public abstract void Y();

    public abstract void Z(ma7 ma7Var);

    public void a0() {
    }

    public abstract boolean b0(long j, long j2, bp8 bp8Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, f92 f92Var);

    @Override // com.daaw.l98
    public final int c(f92 f92Var) {
        try {
            return F(this.C, f92Var);
        } catch (qp8 e) {
            throw s(e, f92Var, false, 4002);
        }
    }

    public boolean c0(f92 f92Var) {
        return false;
    }

    public final float d0() {
        return this.T;
    }

    @Override // com.daaw.nk7, com.daaw.i98
    public void e(float f, float f2) {
        this.T = f;
        this.U = f2;
        V(this.W);
    }

    public final long e0() {
        return this.L0;
    }

    public final bp8 f0() {
        return this.V;
    }

    public cp8 g0(Throwable th, ep8 ep8Var) {
        return new cp8(th, ep8Var);
    }

    public final ep8 h0() {
        return this.c0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x019c, code lost:
        if (r15.z0 == r11) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x019e, code lost:
        t0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x025c, code lost:
        if (r15.P != null) goto L204;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x030a A[LOOP:2: B:72:0x0138->B:180:0x030a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x031a A[Catch: IllegalStateException -> 0x034b, TryCatch #10 {IllegalStateException -> 0x034b, blocks: (B:177:0x0303, B:182:0x0314, B:184:0x031a, B:186:0x0320, B:173:0x02eb, B:175:0x02fd, B:193:0x0331), top: B:248:0x012b }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0309 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0311 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    @Override // com.daaw.i98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(long r24, long r26) {
        /*
            Method dump skipped, instructions count: 927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.hp8.i(long, long):void");
    }

    public void i0(ma7 ma7Var) {
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f6 A[Catch: gp8 -> 0x0119, TryCatch #2 {gp8 -> 0x0119, blocks: (B:30:0x0065, B:33:0x006a, B:35:0x0080, B:36:0x008b, B:41:0x009a, B:43:0x00a2, B:44:0x00aa, B:46:0x00ae, B:57:0x00d6, B:59:0x00f6, B:61:0x00ff, B:64:0x0108, B:65:0x010a, B:60:0x00f9, B:66:0x010b, B:68:0x010e, B:69:0x0118, B:39:0x008f, B:40:0x0099, B:54:0x00c6, B:55:0x00d4, B:49:0x00bd), top: B:78:0x0065, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9 A[Catch: gp8 -> 0x0119, TryCatch #2 {gp8 -> 0x0119, blocks: (B:30:0x0065, B:33:0x006a, B:35:0x0080, B:36:0x008b, B:41:0x009a, B:43:0x00a2, B:44:0x00aa, B:46:0x00ae, B:57:0x00d6, B:59:0x00f6, B:61:0x00ff, B:64:0x0108, B:65:0x010a, B:60:0x00f9, B:66:0x010b, B:68:0x010e, B:69:0x0118, B:39:0x008f, B:40:0x0099, B:54:0x00c6, B:55:0x00d4, B:49:0x00bd), top: B:78:0x0065, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0108 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.hp8.j0():void");
    }

    public void k0(long j) {
        while (true) {
            int i = this.M0;
            if (i == 0 || j < this.N[0]) {
                return;
            }
            long[] jArr = this.L;
            this.K0 = jArr[0];
            this.L0 = this.M[0];
            int i2 = i - 1;
            this.M0 = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.M;
            System.arraycopy(jArr2, 1, jArr2, 0, this.M0);
            long[] jArr3 = this.N;
            System.arraycopy(jArr3, 1, jArr3, 0, this.M0);
            Y();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.daaw.bp8, android.media.MediaCrypto, com.daaw.xn8] */
    public final void l0() {
        try {
            bp8 bp8Var = this.V;
            if (bp8Var != null) {
                bp8Var.zzl();
                this.J0.b++;
                O(this.c0.a);
            }
        } finally {
            this.V = null;
            this.Q = null;
            this.N0 = null;
            n0();
        }
    }

    public void m0() {
        u0();
        v0();
        this.o0 = -9223372036854775807L;
        this.C0 = false;
        this.B0 = false;
        this.k0 = false;
        this.l0 = false;
        this.s0 = false;
        this.t0 = false;
        this.J.clear();
        this.E0 = -9223372036854775807L;
        this.F0 = -9223372036854775807L;
        wo8 wo8Var = this.n0;
        if (wo8Var != null) {
            wo8Var.c();
        }
        this.z0 = 0;
        this.A0 = 0;
        this.y0 = this.x0 ? 1 : 0;
    }

    public final void n0() {
        m0();
        this.n0 = null;
        this.a0 = null;
        this.c0 = null;
        this.W = null;
        this.X = null;
        this.Y = false;
        this.D0 = false;
        this.Z = -1.0f;
        this.d0 = 0;
        this.e0 = false;
        this.f0 = false;
        this.g0 = false;
        this.h0 = false;
        this.i0 = false;
        this.j0 = false;
        this.m0 = false;
        this.x0 = false;
        this.y0 = 0;
        this.R = false;
    }

    public final boolean o0() {
        boolean p0 = p0();
        if (p0) {
            j0();
        }
        return p0;
    }

    public final boolean p0() {
        if (this.V == null) {
            return false;
        }
        int i = this.A0;
        if (i == 3 || this.f0 || ((this.g0 && !this.D0) || (this.h0 && this.C0))) {
            l0();
            return true;
        }
        if (i == 2) {
            int i2 = it5.a;
            uo4.f(i2 >= 23);
            if (i2 >= 23) {
                try {
                    P();
                } catch (vu7 e) {
                    s95.f("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    l0();
                    return true;
                }
            }
        }
        X();
        return false;
    }

    public boolean q0(ep8 ep8Var) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0196, code lost:
        if ("stvm8".equals(r5) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a6, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s0(com.daaw.ep8 r17, android.media.MediaCrypto r18) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.hp8.s0(com.daaw.ep8, android.media.MediaCrypto):void");
    }

    @TargetApi(23)
    public final void t0() {
        int i = this.A0;
        if (i == 1) {
            X();
        } else if (i == 2) {
            X();
            P();
        } else if (i != 3) {
            this.H0 = true;
            a0();
        } else {
            l0();
            j0();
        }
    }

    public final void u0() {
        this.p0 = -1;
        this.F.c = null;
    }

    public final void v0() {
        this.q0 = -1;
        this.r0 = null;
    }

    @Override // com.daaw.nk7
    public void x() {
        this.O = null;
        this.K0 = -9223372036854775807L;
        this.L0 = -9223372036854775807L;
        this.M0 = 0;
        p0();
    }

    @Override // com.daaw.nk7
    public void y(boolean z, boolean z2) {
        this.J0 = new ql7();
    }

    @Override // com.daaw.nk7
    public void z(long j, boolean z) {
        this.G0 = false;
        this.H0 = false;
        if (this.u0) {
            this.H.b();
            this.G.b();
            this.v0 = false;
        } else {
            o0();
        }
        zp5 zp5Var = this.I;
        if (zp5Var.a() > 0) {
            this.I0 = true;
        }
        zp5Var.e();
        int i = this.M0;
        if (i != 0) {
            int i2 = i - 1;
            this.L0 = this.M[i2];
            this.K0 = this.L[i2];
            this.M0 = 0;
        }
    }

    @Override // com.daaw.i98
    public boolean zzM() {
        return this.H0;
    }

    @Override // com.daaw.i98
    public boolean zzN() {
        if (this.O != null) {
            if (o() || S()) {
                return true;
            }
            if (this.o0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.o0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.nk7, com.daaw.l98
    public final int zze() {
        return 8;
    }
}
