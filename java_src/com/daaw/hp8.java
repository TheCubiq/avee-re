package com.daaw;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
/* loaded from: classes.dex */
public abstract class hp8 extends nk7 {

    /* renamed from: P0 */
    public static final byte[] f12775P0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A0 */
    public int f12776A0;

    /* renamed from: B */
    public final ap8 f12777B;

    /* renamed from: B0 */
    public boolean f12778B0;

    /* renamed from: C */
    public final jp8 f12779C;

    /* renamed from: C0 */
    public boolean f12780C0;

    /* renamed from: D */
    public final float f12781D;

    /* renamed from: D0 */
    public boolean f12782D0;

    /* renamed from: E */
    public final ma7 f12783E;

    /* renamed from: E0 */
    public long f12784E0;

    /* renamed from: F */
    public final ma7 f12785F;

    /* renamed from: F0 */
    public long f12786F0;

    /* renamed from: G */
    public final ma7 f12787G;

    /* renamed from: G0 */
    public boolean f12788G0;

    /* renamed from: H */
    public final vo8 f12789H;

    /* renamed from: H0 */
    public boolean f12790H0;

    /* renamed from: I */
    public final zp5 f12791I;

    /* renamed from: I0 */
    public boolean f12792I0;

    /* renamed from: J */
    public final ArrayList f12793J;

    /* renamed from: J0 */
    public ql7 f12794J0;

    /* renamed from: K */
    public final MediaCodec.BufferInfo f12795K;

    /* renamed from: K0 */
    public long f12796K0;

    /* renamed from: L */
    public final long[] f12797L;

    /* renamed from: L0 */
    public long f12798L0;

    /* renamed from: M */
    public final long[] f12799M;

    /* renamed from: M0 */
    public int f12800M0;

    /* renamed from: N */
    public final long[] f12801N;

    /* renamed from: N0 */
    public xn8 f12802N0;

    /* renamed from: O */
    public f92 f12803O;

    /* renamed from: O0 */
    public xn8 f12804O0;

    /* renamed from: P */
    public f92 f12805P;

    /* renamed from: Q */
    public MediaCrypto f12806Q;

    /* renamed from: R */
    public boolean f12807R;

    /* renamed from: S */
    public long f12808S;

    /* renamed from: T */
    public float f12809T;

    /* renamed from: U */
    public float f12810U;

    /* renamed from: V */
    public bp8 f12811V;

    /* renamed from: W */
    public f92 f12812W;

    /* renamed from: X */
    public MediaFormat f12813X;

    /* renamed from: Y */
    public boolean f12814Y;

    /* renamed from: Z */
    public float f12815Z;

    /* renamed from: a0 */
    public ArrayDeque f12816a0;

    /* renamed from: b0 */
    public gp8 f12817b0;

    /* renamed from: c0 */
    public ep8 f12818c0;

    /* renamed from: d0 */
    public int f12819d0;

    /* renamed from: e0 */
    public boolean f12820e0;

    /* renamed from: f0 */
    public boolean f12821f0;

    /* renamed from: g0 */
    public boolean f12822g0;

    /* renamed from: h0 */
    public boolean f12823h0;

    /* renamed from: i0 */
    public boolean f12824i0;

    /* renamed from: j0 */
    public boolean f12825j0;

    /* renamed from: k0 */
    public boolean f12826k0;

    /* renamed from: l0 */
    public boolean f12827l0;

    /* renamed from: m0 */
    public boolean f12828m0;

    /* renamed from: n0 */
    public wo8 f12829n0;

    /* renamed from: o0 */
    public long f12830o0;

    /* renamed from: p0 */
    public int f12831p0;

    /* renamed from: q0 */
    public int f12832q0;

    /* renamed from: r0 */
    public ByteBuffer f12833r0;

    /* renamed from: s0 */
    public boolean f12834s0;

    /* renamed from: t0 */
    public boolean f12835t0;

    /* renamed from: u0 */
    public boolean f12836u0;

    /* renamed from: v0 */
    public boolean f12837v0;

    /* renamed from: w0 */
    public boolean f12838w0;

    /* renamed from: x0 */
    public boolean f12839x0;

    /* renamed from: y0 */
    public int f12840y0;

    /* renamed from: z0 */
    public int f12841z0;

    public hp8(int i, ap8 ap8Var, jp8 jp8Var, boolean z, float f) {
        super(i);
        this.f12777B = ap8Var;
        Objects.requireNonNull(jp8Var);
        this.f12779C = jp8Var;
        this.f12781D = f;
        this.f12783E = new ma7(0, 0);
        this.f12785F = new ma7(0, 0);
        this.f12787G = new ma7(2, 0);
        vo8 vo8Var = new vo8();
        this.f12789H = vo8Var;
        this.f12791I = new zp5(10);
        this.f12793J = new ArrayList();
        this.f12795K = new MediaCodec.BufferInfo();
        this.f12809T = 1.0f;
        this.f12810U = 1.0f;
        this.f12808S = -9223372036854775807L;
        this.f12797L = new long[10];
        this.f12799M = new long[10];
        this.f12801N = new long[10];
        this.f12796K0 = -9223372036854775807L;
        this.f12798L0 = -9223372036854775807L;
        vo8Var.m16130i(0);
        vo8Var.f18728c.order(ByteOrder.nativeOrder());
        this.f12815Z = -1.0f;
        this.f12819d0 = 0;
        this.f12840y0 = 0;
        this.f12831p0 = -1;
        this.f12832q0 = -1;
        this.f12830o0 = -9223372036854775807L;
        this.f12784E0 = -9223372036854775807L;
        this.f12786F0 = -9223372036854775807L;
        this.f12841z0 = 0;
        this.f12776A0 = 0;
    }

    /* renamed from: X */
    private final void m20530X() {
        try {
            this.f12811V.zzi();
        } finally {
            mo9745m0();
        }
    }

    /* renamed from: r0 */
    public static boolean m20518r0(f92 f92Var) {
        return f92Var.f9262E == 0;
    }

    @Override // com.daaw.nk7
    /* renamed from: A */
    public void mo9777A() {
        try {
            m20539I();
            m20522l0();
        } finally {
            this.f12804O0 = null;
        }
    }

    @Override // com.daaw.nk7
    /* renamed from: D */
    public final void mo15114D(f92[] f92VarArr, long j, long j2) {
        if (this.f12798L0 == -9223372036854775807L) {
            uo4.m7872f(this.f12796K0 == -9223372036854775807L);
            this.f12796K0 = j;
            this.f12798L0 = j2;
            return;
        }
        int i = this.f12800M0;
        if (i == 10) {
            s95.m10493e("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.f12799M[9]);
        } else {
            this.f12800M0 = i + 1;
        }
        long[] jArr = this.f12797L;
        int i2 = this.f12800M0 - 1;
        jArr[i2] = j;
        this.f12799M[i2] = j2;
        this.f12801N[i2] = this.f12784E0;
    }

    /* renamed from: E */
    public abstract float mo9770E(float f, f92 f92Var, f92[] f92VarArr);

    /* renamed from: F */
    public abstract int mo9768F(jp8 jp8Var, f92 f92Var);

    /* renamed from: G */
    public abstract tm7 mo9766G(ep8 ep8Var, f92 f92Var, f92 f92Var2);

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
        if (m20536Q() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
        if (m20536Q() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
        if (m20536Q() == false) goto L30;
     */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tm7 mo9764H(a78 a78Var) {
        boolean z = true;
        this.f12792I0 = true;
        f92 f92Var = a78Var.f2960a;
        Objects.requireNonNull(f92Var);
        if (f92Var.f9275l == null) {
            throw m15101s(new IllegalArgumentException(), f92Var, false, 4005);
        }
        xn8 xn8Var = a78Var.f2961b;
        this.f12804O0 = xn8Var;
        this.f12803O = f92Var;
        if (this.f12836u0) {
            this.f12838w0 = true;
            return null;
        }
        bp8 bp8Var = this.f12811V;
        if (bp8Var == null) {
            this.f12816a0 = null;
            m20523j0();
            return null;
        }
        ep8 ep8Var = this.f12818c0;
        f92 f92Var2 = this.f12812W;
        xn8 xn8Var2 = this.f12802N0;
        if (xn8Var2 != xn8Var) {
            if (xn8Var != null && xn8Var2 != null) {
                UUID uuid = ak8.f3281a;
                if (uuid.equals(uuid) && it5.f13991a >= 23) {
                    UUID uuid2 = ak8.f3285e;
                    if (!uuid2.equals(uuid)) {
                        uuid2.equals(uuid);
                    }
                }
            }
            m20538J();
            return new tm7(ep8Var.f8666a, f92Var2, f92Var, 0, 128);
        }
        boolean z2 = xn8Var != xn8Var2;
        uo4.m7872f(!z2 || it5.f13991a >= 23);
        tm7 mo9766G = mo9766G(ep8Var, f92Var2, f92Var);
        int i = mo9766G.f27878d;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                if (m20531V(f92Var)) {
                    this.f12812W = f92Var;
                    if (!z2) {
                        if (this.f12778B0) {
                            this.f12841z0 = 1;
                            if (this.f12821f0 || this.f12823h0) {
                                this.f12776A0 = 3;
                            } else {
                                this.f12776A0 = 1;
                            }
                        }
                    }
                }
                i2 = 16;
            } else if (i != 2) {
                if (m20531V(f92Var)) {
                    this.f12812W = f92Var;
                    if (z2) {
                    }
                }
                i2 = 16;
            } else {
                if (m20531V(f92Var)) {
                    this.f12839x0 = true;
                    this.f12840y0 = 1;
                    int i3 = this.f12819d0;
                    if (i3 != 2 && (i3 != 1 || f92Var.f9280q != f92Var2.f9280q || f92Var.f9281r != f92Var2.f9281r)) {
                        z = false;
                    }
                    this.f12826k0 = z;
                    this.f12812W = f92Var;
                    if (z2) {
                    }
                }
                i2 = 16;
            }
            return (mo9766G.f27878d != 0 || (this.f12811V == bp8Var && this.f12776A0 != 3)) ? mo9766G : new tm7(ep8Var.f8666a, f92Var2, f92Var, 0, i2);
        }
        m20538J();
        i2 = 0;
        if (mo9766G.f27878d != 0) {
        }
    }

    /* renamed from: I */
    public final void m20539I() {
        this.f12838w0 = false;
        this.f12789H.mo6965b();
        this.f12787G.mo6965b();
        this.f12837v0 = false;
        this.f12836u0 = false;
    }

    /* renamed from: J */
    public final void m20538J() {
        if (this.f12778B0) {
            this.f12841z0 = 1;
            this.f12776A0 = 3;
            return;
        }
        m20522l0();
        m20523j0();
    }

    /* renamed from: K */
    public abstract zo8 mo9760K(ep8 ep8Var, f92 f92Var, MediaCrypto mediaCrypto, float f);

    /* renamed from: L */
    public abstract List mo9759L(jp8 jp8Var, f92 f92Var, boolean z);

    /* renamed from: M */
    public abstract void mo9758M(Exception exc);

    /* renamed from: N */
    public abstract void mo9757N(String str, zo8 zo8Var, long j, long j2);

    /* renamed from: O */
    public abstract void mo9756O(String str);

    /* renamed from: P */
    public final void m20537P() {
        try {
            throw null;
        } catch (MediaCryptoException e) {
            throw m15101s(e, this.f12803O, false, 6006);
        }
    }

    @TargetApi(23)
    /* renamed from: Q */
    public final boolean m20536Q() {
        if (this.f12778B0) {
            this.f12841z0 = 1;
            if (this.f12821f0 || this.f12823h0) {
                this.f12776A0 = 3;
                return false;
            }
            this.f12776A0 = 2;
        } else {
            m20537P();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* renamed from: R */
    public final boolean m20535R() {
        bp8 bp8Var = this.f12811V;
        boolean z = 0;
        if (bp8Var == null || this.f12841z0 == 2 || this.f12788G0) {
            return false;
        }
        if (this.f12831p0 < 0) {
            int zza = bp8Var.zza();
            this.f12831p0 = zza;
            if (zza < 0) {
                return false;
            }
            this.f12785F.f18728c = this.f12811V.zzf(zza);
            this.f12785F.mo6965b();
        }
        if (this.f12841z0 == 1) {
            if (!this.f12828m0) {
                this.f12780C0 = true;
                this.f12811V.mo18332b(this.f12831p0, 0, 0, 0L, 4);
                m20515u0();
            }
            this.f12841z0 = 2;
            return false;
        } else if (this.f12826k0) {
            this.f12826k0 = false;
            this.f12785F.f18728c.put(f12775P0);
            this.f12811V.mo18332b(this.f12831p0, 0, 38, 0L, 0);
            m20515u0();
            this.f12778B0 = true;
            return true;
        } else {
            if (this.f12840y0 == 1) {
                for (int i = 0; i < this.f12812W.f9277n.size(); i++) {
                    this.f12785F.f18728c.put((byte[]) this.f12812W.f9277n.get(i));
                }
                this.f12840y0 = 2;
            }
            int position = this.f12785F.f18728c.position();
            a78 m15099u = m15099u();
            try {
                int m15102r = m15102r(m15099u, this.f12785F, 0);
                if (mo15109j()) {
                    this.f12786F0 = this.f12784E0;
                }
                if (m15102r == -3) {
                    return false;
                }
                if (m15102r == -5) {
                    if (this.f12840y0 == 2) {
                        this.f12785F.mo6965b();
                        this.f12840y0 = 1;
                    }
                    mo9764H(m15099u);
                    return true;
                }
                ma7 ma7Var = this.f12785F;
                if (ma7Var.m20159g()) {
                    if (this.f12840y0 == 2) {
                        ma7Var.mo6965b();
                        this.f12840y0 = 1;
                    }
                    this.f12788G0 = true;
                    if (!this.f12778B0) {
                        m20516t0();
                        return false;
                    }
                    try {
                        if (!this.f12828m0) {
                            this.f12780C0 = true;
                            this.f12811V.mo18332b(this.f12831p0, 0, 0, 0L, 4);
                            m20515u0();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw m15101s(e, this.f12803O, false, it5.m19410V(e.getErrorCode()));
                    }
                } else if (!this.f12778B0 && !ma7Var.m20158h()) {
                    ma7Var.mo6965b();
                    if (this.f12840y0 == 2) {
                        this.f12840y0 = 1;
                    }
                    return true;
                } else {
                    boolean m16128k = ma7Var.m16128k();
                    if (m16128k) {
                        ma7Var.f18727b.m24609b(position);
                    }
                    if (this.f12820e0 && !m16128k) {
                        ByteBuffer byteBuffer = this.f12785F.f18728c;
                        byte[] bArr = c42.f5462a;
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
                        if (this.f12785F.f18728c.position() == 0) {
                            return true;
                        }
                        this.f12820e0 = false;
                    }
                    ma7 ma7Var2 = this.f12785F;
                    long j = ma7Var2.f18730e;
                    wo8 wo8Var = this.f12829n0;
                    if (wo8Var != null) {
                        j = wo8Var.m5883b(this.f12803O, ma7Var2);
                        this.f12784E0 = Math.max(this.f12784E0, this.f12829n0.m5884a(this.f12803O));
                    }
                    long j2 = j;
                    if (this.f12785F.m20160f()) {
                        this.f12793J.add(Long.valueOf(j2));
                    }
                    if (this.f12792I0) {
                        this.f12791I.m2001d(j2, this.f12803O);
                        this.f12792I0 = false;
                    }
                    this.f12784E0 = Math.max(this.f12784E0, j2);
                    this.f12785F.m16129j();
                    ma7 ma7Var3 = this.f12785F;
                    if (ma7Var3.m20161e()) {
                        mo9747i0(ma7Var3);
                    }
                    mo9752Z(this.f12785F);
                    try {
                        if (m16128k) {
                            this.f12811V.mo18330d(this.f12831p0, 0, this.f12785F.f18727b, j2, 0);
                        } else {
                            this.f12811V.mo18332b(this.f12831p0, 0, this.f12785F.f18728c.limit(), j2, 0);
                        }
                        m20515u0();
                        this.f12778B0 = true;
                        this.f12840y0 = 0;
                        ql7 ql7Var = this.f12794J0;
                        z = ql7Var.f24152c + 1;
                        ql7Var.f24152c = z;
                        return true;
                    } catch (MediaCodec.CryptoException e2) {
                        throw m15101s(e2, this.f12803O, z, it5.m19410V(e2.getErrorCode()));
                    }
                }
            } catch (j97 e3) {
                mo9758M(e3);
                m20533T(0);
                m20530X();
                return true;
            }
        }
    }

    /* renamed from: S */
    public final boolean m20534S() {
        return this.f12832q0 >= 0;
    }

    /* renamed from: T */
    public final boolean m20533T(int i) {
        a78 m15099u = m15099u();
        this.f12783E.mo6965b();
        int m15102r = m15102r(m15099u, this.f12783E, i | 4);
        if (m15102r == -5) {
            mo9764H(m15099u);
            return true;
        } else if (m15102r == -4 && this.f12783E.m20159g()) {
            this.f12788G0 = true;
            m20516t0();
            return false;
        } else {
            return false;
        }
    }

    /* renamed from: U */
    public final boolean m20532U(long j) {
        return this.f12808S == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.f12808S;
    }

    /* renamed from: V */
    public final boolean m20531V(f92 f92Var) {
        if (it5.f13991a >= 23 && this.f12811V != null && this.f12776A0 != 3 && mo15107m() != 0) {
            float mo9770E = mo9770E(this.f12810U, f92Var, m15104p());
            float f = this.f12815Z;
            if (f == mo9770E) {
                return true;
            }
            if (mo9770E == -1.0f) {
                m20538J();
                return false;
            } else if (f == -1.0f && mo9770E <= this.f12781D) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", mo9770E);
                this.f12811V.mo18325o(bundle);
                this.f12815Z = mo9770E;
            }
        }
        return true;
    }

    /* renamed from: W */
    public abstract void mo9755W(f92 f92Var, MediaFormat mediaFormat);

    /* renamed from: Y */
    public abstract void mo9753Y();

    /* renamed from: Z */
    public abstract void mo9752Z(ma7 ma7Var);

    /* renamed from: a0 */
    public void mo20529a0() {
    }

    /* renamed from: b0 */
    public abstract boolean mo9750b0(long j, long j2, bp8 bp8Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, f92 f92Var);

    @Override // com.daaw.l98
    /* renamed from: c */
    public final int mo17079c(f92 f92Var) {
        try {
            return mo9768F(this.f12779C, f92Var);
        } catch (qp8 e) {
            throw m15101s(e, f92Var, false, 4002);
        }
    }

    /* renamed from: c0 */
    public boolean mo20528c0(f92 f92Var) {
        return false;
    }

    /* renamed from: d0 */
    public final float m20527d0() {
        return this.f12809T;
    }

    @Override // com.daaw.nk7, com.daaw.i98
    /* renamed from: e */
    public void mo9749e(float f, float f2) {
        this.f12809T = f;
        this.f12810U = f2;
        m20531V(this.f12812W);
    }

    /* renamed from: e0 */
    public final long m20526e0() {
        return this.f12798L0;
    }

    /* renamed from: f0 */
    public final bp8 m20525f0() {
        return this.f12811V;
    }

    /* renamed from: g0 */
    public cp8 mo9748g0(Throwable th, ep8 ep8Var) {
        return new cp8(th, ep8Var);
    }

    /* renamed from: h0 */
    public final ep8 m20524h0() {
        return this.f12818c0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x019c, code lost:
        if (r15.f12841z0 == r11) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x019e, code lost:
        m20516t0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x025c, code lost:
        if (r15.f12805P != null) goto L204;
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
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo20009i(long j, long j2) {
        hp8 hp8Var;
        char c;
        int i;
        StackTraceElement[] stackTrace;
        long j3;
        bp8 bp8Var;
        ByteBuffer byteBuffer;
        int i2;
        MediaCodec.BufferInfo bufferInfo;
        boolean mo9750b0;
        long j4;
        bp8 bp8Var2;
        ByteBuffer byteBuffer2;
        int i3;
        MediaCodec.BufferInfo bufferInfo2;
        int mo18326h;
        boolean z;
        ?? r13;
        hp8 hp8Var2 = this;
        boolean z2 = true;
        boolean z3 = false;
        try {
            if (hp8Var2.f12790H0) {
                mo20529a0();
                return;
            }
            int i4 = 2;
            if (hp8Var2.f12803O == null && !hp8Var2.m20533T(2)) {
                return;
            }
            m20523j0();
            if (hp8Var2.f12836u0) {
                int i5 = it5.f13991a;
                Trace.beginSection("bypassRender");
                while (true) {
                    uo4.m7872f(hp8Var2.f12790H0 ^ z2);
                    vo8 vo8Var = hp8Var2.f12789H;
                    if (vo8Var.m6960q()) {
                        try {
                            if (!mo9750b0(j, j2, null, vo8Var.f18728c, hp8Var2.f12832q0, 0, vo8Var.m6964m(), vo8Var.f18730e, vo8Var.m20160f(), vo8Var.m20159g(), hp8Var2.f12805P)) {
                                hp8Var2 = this;
                                break;
                            }
                            hp8Var2 = this;
                            hp8Var2.mo9746k0(hp8Var2.f12789H.m6963n());
                            hp8Var2.f12789H.mo6965b();
                        } catch (IllegalStateException e) {
                            e = e;
                            c = 0;
                            hp8Var = this;
                            i = it5.f13991a;
                            if (i >= 21) {
                            }
                            stackTrace = e.getStackTrace();
                            if (stackTrace.length > 0) {
                            }
                            throw e;
                        }
                    }
                    z2 = true;
                    if (!hp8Var2.f12788G0) {
                        if (hp8Var2.f12837v0) {
                            uo4.m7872f(hp8Var2.f12789H.m6961p(hp8Var2.f12787G));
                            r13 = 0;
                            hp8Var2.f12837v0 = false;
                        } else {
                            r13 = 0;
                        }
                        if (hp8Var2.f12838w0) {
                            if (!hp8Var2.f12789H.m6960q()) {
                                m20539I();
                                hp8Var2.f12838w0 = r13;
                                m20523j0();
                                if (!hp8Var2.f12836u0) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        uo4.m7872f(!hp8Var2.f12788G0);
                        a78 m15099u = m15099u();
                        hp8Var2.f12787G.mo6965b();
                        while (true) {
                            hp8Var2.f12787G.mo6965b();
                            int m15102r = hp8Var2.m15102r(m15099u, hp8Var2.f12787G, r13);
                            if (m15102r == -5) {
                                hp8Var2.mo9764H(m15099u);
                                break;
                            } else if (m15102r != -4) {
                                break;
                            } else if (!hp8Var2.f12787G.m20159g()) {
                                if (hp8Var2.f12792I0) {
                                    f92 f92Var = hp8Var2.f12803O;
                                    Objects.requireNonNull(f92Var);
                                    hp8Var2.f12805P = f92Var;
                                    hp8Var2.mo9755W(f92Var, null);
                                    hp8Var2.f12792I0 = r13;
                                }
                                hp8Var2.f12787G.m16129j();
                                if (!hp8Var2.f12789H.m6961p(hp8Var2.f12787G)) {
                                    hp8Var2.f12837v0 = true;
                                    break;
                                }
                            } else {
                                hp8Var2.f12788G0 = true;
                                break;
                            }
                        }
                        vo8 vo8Var2 = hp8Var2.f12789H;
                        if (vo8Var2.m6960q()) {
                            vo8Var2.m16129j();
                        }
                        if (!hp8Var2.f12789H.m6960q() && !hp8Var2.f12788G0 && !hp8Var2.f12838w0) {
                            break;
                        }
                    } else {
                        hp8Var2.f12790H0 = true;
                        break;
                    }
                }
                Trace.endSection();
                hp8Var = hp8Var2;
                c = 0;
            } else {
                try {
                    if (hp8Var2.f12811V != null) {
                        try {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            int i6 = it5.f13991a;
                            Trace.beginSection("drainAndFeed");
                            while (true) {
                                try {
                                    try {
                                        if (!m20534S()) {
                                            if (hp8Var2.f12824i0 && hp8Var2.f12780C0) {
                                                try {
                                                    mo18326h = hp8Var2.f12811V.mo18326h(hp8Var2.f12795K);
                                                } catch (IllegalStateException unused) {
                                                    m20516t0();
                                                    if (hp8Var2.f12790H0) {
                                                        m20522l0();
                                                    }
                                                    j4 = elapsedRealtime;
                                                    hp8Var = hp8Var2;
                                                    c = 0;
                                                    while (m20535R()) {
                                                        while (m20535R()) {
                                                        }
                                                    }
                                                    Trace.endSection();
                                                    hp8Var.f12794J0.m12343a();
                                                }
                                            } else {
                                                mo18326h = hp8Var2.f12811V.mo18326h(hp8Var2.f12795K);
                                            }
                                            if (mo18326h >= 0) {
                                                if (!hp8Var2.f12827l0) {
                                                    MediaCodec.BufferInfo bufferInfo3 = hp8Var2.f12795K;
                                                    if (bufferInfo3.size == 0 && (bufferInfo3.flags & 4) != 0) {
                                                        break;
                                                    }
                                                    hp8Var2.f12832q0 = mo18326h;
                                                    ByteBuffer mo18331c = hp8Var2.f12811V.mo18331c(mo18326h);
                                                    hp8Var2.f12833r0 = mo18331c;
                                                    if (mo18331c != null) {
                                                        mo18331c.position(hp8Var2.f12795K.offset);
                                                        ByteBuffer byteBuffer3 = hp8Var2.f12833r0;
                                                        MediaCodec.BufferInfo bufferInfo4 = hp8Var2.f12795K;
                                                        byteBuffer3.limit(bufferInfo4.offset + bufferInfo4.size);
                                                    }
                                                    if (hp8Var2.f12825j0) {
                                                        MediaCodec.BufferInfo bufferInfo5 = hp8Var2.f12795K;
                                                        if (bufferInfo5.presentationTimeUs == 0 && (bufferInfo5.flags & 4) != 0) {
                                                            long j5 = hp8Var2.f12784E0;
                                                            if (j5 != -9223372036854775807L) {
                                                                bufferInfo5.presentationTimeUs = j5;
                                                            }
                                                        }
                                                    }
                                                    long j6 = hp8Var2.f12795K.presentationTimeUs;
                                                    int size = hp8Var2.f12793J.size();
                                                    int i7 = 0;
                                                    while (true) {
                                                        if (i7 >= size) {
                                                            z = false;
                                                            break;
                                                        } else if (((Long) hp8Var2.f12793J.get(i7)).longValue() == j6) {
                                                            hp8Var2.f12793J.remove(i7);
                                                            z = true;
                                                            break;
                                                        } else {
                                                            i7++;
                                                        }
                                                    }
                                                    hp8Var2.f12834s0 = z;
                                                    long j7 = hp8Var2.f12786F0;
                                                    long j8 = hp8Var2.f12795K.presentationTimeUs;
                                                    hp8Var2.f12835t0 = j7 == j8;
                                                    f92 f92Var2 = (f92) hp8Var2.f12791I.m2002c(j8);
                                                    if (f92Var2 == null && hp8Var2.f12814Y) {
                                                        f92Var2 = (f92) hp8Var2.f12791I.m2003b();
                                                    }
                                                    if (f92Var2 != null) {
                                                        hp8Var2.f12805P = f92Var2;
                                                    } else if (hp8Var2.f12814Y) {
                                                    }
                                                    hp8Var2.mo9755W(hp8Var2.f12805P, hp8Var2.f12813X);
                                                    hp8Var2.f12814Y = z3;
                                                } else {
                                                    hp8Var2.f12827l0 = z3;
                                                    hp8Var2.f12811V.mo18327g(mo18326h, z3);
                                                    j4 = elapsedRealtime;
                                                    hp8Var = hp8Var2;
                                                    c = 0;
                                                }
                                            } else if (mo18326h == -2) {
                                                hp8Var2.f12782D0 = z2;
                                                MediaFormat zzc = hp8Var2.f12811V.zzc();
                                                if (hp8Var2.f12819d0 != 0 && zzc.getInteger("width") == 32 && zzc.getInteger("height") == 32) {
                                                    hp8Var2.f12827l0 = z2;
                                                } else {
                                                    hp8Var2.f12813X = zzc;
                                                    hp8Var2.f12814Y = z2;
                                                }
                                                j4 = elapsedRealtime;
                                                hp8Var = hp8Var2;
                                                c = 0;
                                            } else if (hp8Var2.f12828m0) {
                                                if (!hp8Var2.f12788G0) {
                                                }
                                            }
                                            if (hp8Var.m20532U(j4)) {
                                                break;
                                            }
                                            hp8Var2 = hp8Var;
                                            elapsedRealtime = j4;
                                            i4 = 2;
                                            z3 = false;
                                            z2 = true;
                                        }
                                        if (hp8Var2.f12824i0) {
                                            try {
                                                if (hp8Var2.f12780C0) {
                                                    try {
                                                        bp8Var2 = hp8Var2.f12811V;
                                                        byteBuffer2 = hp8Var2.f12833r0;
                                                        i3 = hp8Var2.f12832q0;
                                                        bufferInfo2 = hp8Var2.f12795K;
                                                        j3 = elapsedRealtime;
                                                        c = 0;
                                                    } catch (IllegalStateException unused2) {
                                                        j3 = elapsedRealtime;
                                                        c = 0;
                                                    }
                                                    try {
                                                        mo9750b0 = mo9750b0(j, j2, bp8Var2, byteBuffer2, i3, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, hp8Var2.f12834s0, hp8Var2.f12835t0, hp8Var2.f12805P);
                                                        if (mo9750b0) {
                                                            hp8Var = this;
                                                            break;
                                                        }
                                                        hp8Var = this;
                                                        hp8Var.mo9746k0(hp8Var.f12795K.presentationTimeUs);
                                                        int i8 = hp8Var.f12795K.flags;
                                                        m20514v0();
                                                        if ((i8 & 4) != 0) {
                                                            m20516t0();
                                                            break;
                                                        } else {
                                                            j4 = j3;
                                                            if (hp8Var.m20532U(j4)) {
                                                            }
                                                        }
                                                    } catch (IllegalStateException unused3) {
                                                        try {
                                                            m20516t0();
                                                            hp8Var2 = this;
                                                            if (hp8Var2.f12790H0) {
                                                                m20522l0();
                                                            }
                                                            hp8Var = hp8Var2;
                                                            j4 = j3;
                                                            while (m20535R()) {
                                                            }
                                                            Trace.endSection();
                                                            hp8Var.f12794J0.m12343a();
                                                        } catch (IllegalStateException e2) {
                                                            e = e2;
                                                            hp8Var = this;
                                                            i = it5.f13991a;
                                                            if (i >= 21) {
                                                            }
                                                            stackTrace = e.getStackTrace();
                                                            if (stackTrace.length > 0) {
                                                            }
                                                            throw e;
                                                        }
                                                    }
                                                }
                                            } catch (IllegalStateException e3) {
                                                e = e3;
                                                c = 0;
                                                hp8Var = hp8Var2;
                                                i = it5.f13991a;
                                                if (i >= 21 || !(e instanceof MediaCodec.CodecException)) {
                                                    stackTrace = e.getStackTrace();
                                                    if (stackTrace.length > 0 || !stackTrace[c].getClassName().equals("android.media.MediaCodec")) {
                                                        throw e;
                                                    }
                                                }
                                                hp8Var.mo9758M(e);
                                                boolean z4 = i >= 21 && (e instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e).isRecoverable();
                                                if (z4) {
                                                    m20522l0();
                                                }
                                                throw hp8Var.m15101s(hp8Var.mo9748g0(e, hp8Var.f12818c0), hp8Var.f12803O, z4, 4003);
                                            }
                                        }
                                        mo9750b0 = mo9750b0(j, j2, bp8Var, byteBuffer, i2, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, hp8Var2.f12834s0, hp8Var2.f12835t0, hp8Var2.f12805P);
                                        if (mo9750b0) {
                                        }
                                    } catch (IllegalStateException e4) {
                                        e = e4;
                                        hp8Var = this;
                                        i = it5.f13991a;
                                        if (i >= 21) {
                                        }
                                        stackTrace = e.getStackTrace();
                                        if (stackTrace.length > 0) {
                                        }
                                        throw e;
                                    }
                                    j3 = elapsedRealtime;
                                    c = 0;
                                    bp8Var = hp8Var2.f12811V;
                                    byteBuffer = hp8Var2.f12833r0;
                                    i2 = hp8Var2.f12832q0;
                                    bufferInfo = hp8Var2.f12795K;
                                } catch (IllegalStateException e5) {
                                    e = e5;
                                    hp8Var = hp8Var2;
                                    i = it5.f13991a;
                                    if (i >= 21) {
                                    }
                                    stackTrace = e.getStackTrace();
                                    if (stackTrace.length > 0) {
                                    }
                                    throw e;
                                }
                            }
                            j4 = j3;
                            while (m20535R() && hp8Var.m20532U(j4)) {
                            }
                            Trace.endSection();
                        } catch (IllegalStateException e6) {
                            e = e6;
                            hp8Var = hp8Var2;
                            c = 0;
                        }
                    } else {
                        hp8Var = hp8Var2;
                        c = 0;
                        hp8Var.f12794J0.f24153d += m15100t(j);
                        try {
                            hp8Var.m20533T(1);
                        } catch (IllegalStateException e7) {
                            e = e7;
                            i = it5.f13991a;
                            if (i >= 21) {
                            }
                            stackTrace = e.getStackTrace();
                            if (stackTrace.length > 0) {
                            }
                            throw e;
                        }
                    }
                } catch (IllegalStateException e8) {
                    e = e8;
                }
            }
            hp8Var.f12794J0.m12343a();
        } catch (IllegalStateException e9) {
            e = e9;
            hp8Var = hp8Var2;
            c = 0;
        }
    }

    /* renamed from: i0 */
    public void mo9747i0(ma7 ma7Var) {
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f6 A[Catch: gp8 -> 0x0119, TryCatch #2 {gp8 -> 0x0119, blocks: (B:30:0x0065, B:33:0x006a, B:35:0x0080, B:36:0x008b, B:41:0x009a, B:43:0x00a2, B:44:0x00aa, B:46:0x00ae, B:57:0x00d6, B:59:0x00f6, B:61:0x00ff, B:64:0x0108, B:65:0x010a, B:60:0x00f9, B:66:0x010b, B:68:0x010e, B:69:0x0118, B:39:0x008f, B:40:0x0099, B:54:0x00c6, B:55:0x00d4, B:49:0x00bd), top: B:78:0x0065, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9 A[Catch: gp8 -> 0x0119, TryCatch #2 {gp8 -> 0x0119, blocks: (B:30:0x0065, B:33:0x006a, B:35:0x0080, B:36:0x008b, B:41:0x009a, B:43:0x00a2, B:44:0x00aa, B:46:0x00ae, B:57:0x00d6, B:59:0x00f6, B:61:0x00ff, B:64:0x0108, B:65:0x010a, B:60:0x00f9, B:66:0x010b, B:68:0x010e, B:69:0x0118, B:39:0x008f, B:40:0x0099, B:54:0x00c6, B:55:0x00d4, B:49:0x00bd), top: B:78:0x0065, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0108 A[SYNTHETIC] */
    /* renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m20523j0() {
        f92 f92Var;
        gp8 gp8Var;
        if (this.f12811V != null || this.f12836u0 || (f92Var = this.f12803O) == null) {
            return;
        }
        if (this.f12804O0 == null && mo20528c0(f92Var)) {
            f92 f92Var2 = this.f12803O;
            m20539I();
            String str = f92Var2.f9275l;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.f12789H.m6962o(32);
            } else {
                this.f12789H.m6962o(1);
            }
            this.f12836u0 = true;
            return;
        }
        xn8 xn8Var = this.f12804O0;
        this.f12802N0 = xn8Var;
        f92 f92Var3 = this.f12803O;
        String str2 = f92Var3.f9275l;
        if (xn8Var != null && zn8.f35272a) {
            fn8 m4938a = xn8Var.m4938a();
            throw m15101s(m4938a, this.f12803O, false, m4938a.f9711p);
        }
        try {
            if (this.f12816a0 == null) {
                try {
                    List mo9759L = mo9759L(this.f12779C, f92Var3, false);
                    mo9759L.isEmpty();
                    this.f12816a0 = new ArrayDeque();
                    if (!mo9759L.isEmpty()) {
                        this.f12816a0.add((ep8) mo9759L.get(0));
                    }
                    this.f12817b0 = null;
                } catch (qp8 e) {
                    throw new gp8(this.f12803O, (Throwable) e, false, -49998);
                }
            }
            if (this.f12816a0.isEmpty()) {
                throw new gp8(this.f12803O, (Throwable) null, false, -49999);
            }
            ep8 ep8Var = (ep8) this.f12816a0.peekFirst();
            while (this.f12811V == null) {
                ep8 ep8Var2 = (ep8) this.f12816a0.peekFirst();
                if (!mo9744q0(ep8Var2)) {
                    return;
                }
                try {
                    m20517s0(ep8Var2, null);
                } catch (Exception e2) {
                    if (ep8Var2 != ep8Var) {
                        throw e2;
                        break;
                    }
                    try {
                        s95.m10493e("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                        Thread.sleep(50L);
                        m20517s0(ep8Var2, null);
                    } catch (Exception e3) {
                        s95.m10492f("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(ep8Var2)), e3);
                        this.f12816a0.removeFirst();
                        gp8 gp8Var2 = new gp8(this.f12803O, (Throwable) e3, false, ep8Var2);
                        mo9758M(gp8Var2);
                        gp8Var = this.f12817b0;
                        if (gp8Var != null) {
                            this.f12817b0 = gp8Var2;
                        } else {
                            this.f12817b0 = gp8.m21353a(gp8Var, gp8Var2);
                        }
                        if (!this.f12816a0.isEmpty()) {
                            throw this.f12817b0;
                        }
                    }
                    s95.m10492f("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(ep8Var2)), e3);
                    this.f12816a0.removeFirst();
                    gp8 gp8Var22 = new gp8(this.f12803O, (Throwable) e3, false, ep8Var2);
                    mo9758M(gp8Var22);
                    gp8Var = this.f12817b0;
                    if (gp8Var != null) {
                    }
                    if (!this.f12816a0.isEmpty()) {
                    }
                }
            }
            this.f12816a0 = null;
        } catch (gp8 e4) {
            throw m15101s(e4, this.f12803O, false, 4001);
        }
    }

    /* renamed from: k0 */
    public void mo9746k0(long j) {
        while (true) {
            int i = this.f12800M0;
            if (i == 0 || j < this.f12801N[0]) {
                return;
            }
            long[] jArr = this.f12797L;
            this.f12796K0 = jArr[0];
            this.f12798L0 = this.f12799M[0];
            int i2 = i - 1;
            this.f12800M0 = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.f12799M;
            System.arraycopy(jArr2, 1, jArr2, 0, this.f12800M0);
            long[] jArr3 = this.f12801N;
            System.arraycopy(jArr3, 1, jArr3, 0, this.f12800M0);
            mo9753Y();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.daaw.bp8, android.media.MediaCrypto, com.daaw.xn8] */
    /* renamed from: l0 */
    public final void m20522l0() {
        try {
            bp8 bp8Var = this.f12811V;
            if (bp8Var != null) {
                bp8Var.zzl();
                this.f12794J0.f24151b++;
                mo9756O(this.f12818c0.f8666a);
            }
        } finally {
            this.f12811V = null;
            this.f12806Q = null;
            this.f12802N0 = null;
            m20521n0();
        }
    }

    /* renamed from: m0 */
    public void mo9745m0() {
        m20515u0();
        m20514v0();
        this.f12830o0 = -9223372036854775807L;
        this.f12780C0 = false;
        this.f12778B0 = false;
        this.f12826k0 = false;
        this.f12827l0 = false;
        this.f12834s0 = false;
        this.f12835t0 = false;
        this.f12793J.clear();
        this.f12784E0 = -9223372036854775807L;
        this.f12786F0 = -9223372036854775807L;
        wo8 wo8Var = this.f12829n0;
        if (wo8Var != null) {
            wo8Var.m5882c();
        }
        this.f12841z0 = 0;
        this.f12776A0 = 0;
        this.f12840y0 = this.f12839x0 ? 1 : 0;
    }

    /* renamed from: n0 */
    public final void m20521n0() {
        mo9745m0();
        this.f12829n0 = null;
        this.f12816a0 = null;
        this.f12818c0 = null;
        this.f12812W = null;
        this.f12813X = null;
        this.f12814Y = false;
        this.f12782D0 = false;
        this.f12815Z = -1.0f;
        this.f12819d0 = 0;
        this.f12820e0 = false;
        this.f12821f0 = false;
        this.f12822g0 = false;
        this.f12823h0 = false;
        this.f12824i0 = false;
        this.f12825j0 = false;
        this.f12828m0 = false;
        this.f12839x0 = false;
        this.f12840y0 = 0;
        this.f12807R = false;
    }

    /* renamed from: o0 */
    public final boolean m20520o0() {
        boolean m20519p0 = m20519p0();
        if (m20519p0) {
            m20523j0();
        }
        return m20519p0;
    }

    /* renamed from: p0 */
    public final boolean m20519p0() {
        if (this.f12811V == null) {
            return false;
        }
        int i = this.f12776A0;
        if (i == 3 || this.f12821f0 || ((this.f12822g0 && !this.f12782D0) || (this.f12823h0 && this.f12780C0))) {
            m20522l0();
            return true;
        }
        if (i == 2) {
            int i2 = it5.f13991a;
            uo4.m7872f(i2 >= 23);
            if (i2 >= 23) {
                try {
                    m20537P();
                } catch (vu7 e) {
                    s95.m10492f("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    m20522l0();
                    return true;
                }
            }
        }
        m20530X();
        return false;
    }

    /* renamed from: q0 */
    public boolean mo9744q0(ep8 ep8Var) {
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
    /* renamed from: s0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m20517s0(ep8 ep8Var, MediaCrypto mediaCrypto) {
        MediaCodec createByCodecName;
        go8 jq8Var;
        int i;
        boolean z;
        boolean z2;
        String str;
        String str2 = ep8Var.f8666a;
        int i2 = it5.f13991a;
        float mo9770E = i2 < 23 ? -1.0f : mo9770E(this.f12810U, this.f12803O, m15104p());
        float f = mo9770E > this.f12781D ? mo9770E : -1.0f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        MediaCodec mediaCodec = null;
        zo8 mo9760K = mo9760K(ep8Var, this.f12803O, null, f);
        if (i2 >= 31) {
            fp8.m22419a(mo9760K, m15097w());
        }
        try {
            Trace.beginSection("createCodec:" + str2);
            if (i2 < 23 || i2 < 31) {
                try {
                    ep8 ep8Var2 = mo9760K.f35330a;
                    Objects.requireNonNull(ep8Var2);
                    String str3 = ep8Var2.f8666a;
                    Trace.beginSection("createCodec:".concat(String.valueOf(str3)));
                    createByCodecName = MediaCodec.createByCodecName(str3);
                    Trace.endSection();
                } catch (IOException e) {
                    e = e;
                } catch (RuntimeException e2) {
                    e = e2;
                }
                try {
                    Trace.beginSection("configureCodec");
                    createByCodecName.configure(mo9760K.f35331b, mo9760K.f35333d, (MediaCrypto) null, 0);
                    Trace.endSection();
                    Trace.beginSection("startCodec");
                    createByCodecName.start();
                    Trace.endSection();
                    jq8Var = new jq8(createByCodecName, null);
                } catch (IOException | RuntimeException e3) {
                    e = e3;
                    mediaCodec = createByCodecName;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } else {
                int m27388b = ak3.m27388b(mo9760K.f35332c.f9275l);
                s95.m10494d("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(it5.m19381o(m27388b)));
                jq8Var = new eo8(m27388b, false).m23326c(mo9760K);
            }
            this.f12811V = jq8Var;
            Trace.endSection();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f12818c0 = ep8Var;
            this.f12815Z = f;
            this.f12812W = this.f12803O;
            if (i2 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str2)) {
                String str4 = it5.f13994d;
                if (str4.startsWith("SM-T585") || str4.startsWith("SM-A510") || str4.startsWith("SM-A520") || str4.startsWith("SM-J700")) {
                    i = 2;
                    this.f12819d0 = i;
                    this.f12820e0 = i2 >= 21 && this.f12812W.f9277n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
                    this.f12821f0 = i2 != 19 && it5.f13994d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2));
                    this.f12822g0 = i2 != 29 && "c2.android.aac.decoder".equals(str2);
                    if (i2 <= 23 || !"OMX.google.vorbis.decoder".equals(str2)) {
                        if (i2 <= 19) {
                            String str5 = it5.f13992b;
                            if (!"hb2000".equals(str5)) {
                            }
                            if (!"OMX.amlogic.avc.decoder.awesome".equals(str2)) {
                            }
                        }
                        z = false;
                        this.f12823h0 = z;
                        this.f12824i0 = i2 != 21 && "OMX.google.aac.decoder".equals(str2);
                        if (i2 < 21 && "OMX.SEC.mp3.dec".equals(str2) && "samsung".equals(it5.f13993c)) {
                            str = it5.f13992b;
                            if (!str.startsWith("baffin") || str.startsWith("grand") || str.startsWith("fortuna") || str.startsWith("gprimelte") || str.startsWith("j2y18lte") || str.startsWith("ms01")) {
                                z2 = true;
                                this.f12825j0 = z2;
                                String str6 = ep8Var.f8666a;
                                this.f12828m0 = (i2 > 25 && "OMX.rk.video_decoder.avc".equals(str6)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str6) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str6))) || ("Amazon".equals(it5.f13993c) && "AFTS".equals(it5.f13994d) && ep8Var.f8671f);
                                this.f12811V.zzr();
                                if ("c2.android.mp3.decoder".equals(ep8Var.f8666a)) {
                                    this.f12829n0 = new wo8();
                                }
                                if (mo15107m() == 2) {
                                    this.f12830o0 = SystemClock.elapsedRealtime() + 1000;
                                }
                                this.f12794J0.f24150a++;
                                mo9757N(str2, mo9760K, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                            }
                        }
                        z2 = false;
                        this.f12825j0 = z2;
                        String str62 = ep8Var.f8666a;
                        this.f12828m0 = (i2 > 25 && "OMX.rk.video_decoder.avc".equals(str62)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str62) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str62))) || ("Amazon".equals(it5.f13993c) && "AFTS".equals(it5.f13994d) && ep8Var.f8671f);
                        this.f12811V.zzr();
                        if ("c2.android.mp3.decoder".equals(ep8Var.f8666a)) {
                        }
                        if (mo15107m() == 2) {
                        }
                        this.f12794J0.f24150a++;
                        mo9757N(str2, mo9760K, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    }
                    z = true;
                    this.f12823h0 = z;
                    this.f12824i0 = i2 != 21 && "OMX.google.aac.decoder".equals(str2);
                    if (i2 < 21) {
                        str = it5.f13992b;
                        if (!str.startsWith("baffin")) {
                        }
                        z2 = true;
                        this.f12825j0 = z2;
                        String str622 = ep8Var.f8666a;
                        this.f12828m0 = (i2 > 25 && "OMX.rk.video_decoder.avc".equals(str622)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str622) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str622))) || ("Amazon".equals(it5.f13993c) && "AFTS".equals(it5.f13994d) && ep8Var.f8671f);
                        this.f12811V.zzr();
                        if ("c2.android.mp3.decoder".equals(ep8Var.f8666a)) {
                        }
                        if (mo15107m() == 2) {
                        }
                        this.f12794J0.f24150a++;
                        mo9757N(str2, mo9760K, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    }
                    z2 = false;
                    this.f12825j0 = z2;
                    String str6222 = ep8Var.f8666a;
                    this.f12828m0 = (i2 > 25 && "OMX.rk.video_decoder.avc".equals(str6222)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str6222) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str6222))) || ("Amazon".equals(it5.f13993c) && "AFTS".equals(it5.f13994d) && ep8Var.f8671f);
                    this.f12811V.zzr();
                    if ("c2.android.mp3.decoder".equals(ep8Var.f8666a)) {
                    }
                    if (mo15107m() == 2) {
                    }
                    this.f12794J0.f24150a++;
                    mo9757N(str2, mo9760K, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                }
            }
            if (i2 < 24 && ("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2))) {
                String str7 = it5.f13992b;
                if ("flounder".equals(str7) || "flounder_lte".equals(str7) || "grouper".equals(str7) || "tilapia".equals(str7)) {
                    i = 1;
                    this.f12819d0 = i;
                    this.f12820e0 = i2 >= 21 && this.f12812W.f9277n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
                    this.f12821f0 = i2 != 19 && it5.f13994d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2));
                    this.f12822g0 = i2 != 29 && "c2.android.aac.decoder".equals(str2);
                    if (i2 <= 23) {
                    }
                    if (i2 <= 19) {
                    }
                    z = false;
                    this.f12823h0 = z;
                    this.f12824i0 = i2 != 21 && "OMX.google.aac.decoder".equals(str2);
                    if (i2 < 21) {
                    }
                    z2 = false;
                    this.f12825j0 = z2;
                    String str62222 = ep8Var.f8666a;
                    this.f12828m0 = (i2 > 25 && "OMX.rk.video_decoder.avc".equals(str62222)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str62222) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str62222))) || ("Amazon".equals(it5.f13993c) && "AFTS".equals(it5.f13994d) && ep8Var.f8671f);
                    this.f12811V.zzr();
                    if ("c2.android.mp3.decoder".equals(ep8Var.f8666a)) {
                    }
                    if (mo15107m() == 2) {
                    }
                    this.f12794J0.f24150a++;
                    mo9757N(str2, mo9760K, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                }
            }
            i = 0;
            this.f12819d0 = i;
            this.f12820e0 = i2 >= 21 && this.f12812W.f9277n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
            this.f12821f0 = i2 != 19 && it5.f13994d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2));
            this.f12822g0 = i2 != 29 && "c2.android.aac.decoder".equals(str2);
            if (i2 <= 23) {
            }
            if (i2 <= 19) {
            }
            z = false;
            this.f12823h0 = z;
            this.f12824i0 = i2 != 21 && "OMX.google.aac.decoder".equals(str2);
            if (i2 < 21) {
            }
            z2 = false;
            this.f12825j0 = z2;
            String str622222 = ep8Var.f8666a;
            this.f12828m0 = (i2 > 25 && "OMX.rk.video_decoder.avc".equals(str622222)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str622222) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str622222))) || ("Amazon".equals(it5.f13993c) && "AFTS".equals(it5.f13994d) && ep8Var.f8671f);
            this.f12811V.zzr();
            if ("c2.android.mp3.decoder".equals(ep8Var.f8666a)) {
            }
            if (mo15107m() == 2) {
            }
            this.f12794J0.f24150a++;
            mo9757N(str2, mo9760K, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @TargetApi(23)
    /* renamed from: t0 */
    public final void m20516t0() {
        int i = this.f12776A0;
        if (i == 1) {
            m20530X();
        } else if (i == 2) {
            m20530X();
            m20537P();
        } else if (i != 3) {
            this.f12790H0 = true;
            mo20529a0();
        } else {
            m20522l0();
            m20523j0();
        }
    }

    /* renamed from: u0 */
    public final void m20515u0() {
        this.f12831p0 = -1;
        this.f12785F.f18728c = null;
    }

    /* renamed from: v0 */
    public final void m20514v0() {
        this.f12832q0 = -1;
        this.f12833r0 = null;
    }

    @Override // com.daaw.nk7
    /* renamed from: x */
    public void mo9742x() {
        this.f12803O = null;
        this.f12796K0 = -9223372036854775807L;
        this.f12798L0 = -9223372036854775807L;
        this.f12800M0 = 0;
        m20519p0();
    }

    @Override // com.daaw.nk7
    /* renamed from: y */
    public void mo9740y(boolean z, boolean z2) {
        this.f12794J0 = new ql7();
    }

    @Override // com.daaw.nk7
    /* renamed from: z */
    public void mo9738z(long j, boolean z) {
        this.f12788G0 = false;
        this.f12790H0 = false;
        if (this.f12836u0) {
            this.f12789H.mo6965b();
            this.f12787G.mo6965b();
            this.f12837v0 = false;
        } else {
            m20520o0();
        }
        zp5 zp5Var = this.f12791I;
        if (zp5Var.m2004a() > 0) {
            this.f12792I0 = true;
        }
        zp5Var.m2000e();
        int i = this.f12800M0;
        if (i != 0) {
            int i2 = i - 1;
            this.f12798L0 = this.f12799M[i2];
            this.f12796K0 = this.f12797L[i2];
            this.f12800M0 = 0;
        }
    }

    @Override // com.daaw.i98
    public boolean zzM() {
        return this.f12790H0;
    }

    @Override // com.daaw.i98
    public boolean zzN() {
        if (this.f12803O != null) {
            if (m15105o() || m20534S()) {
                return true;
            }
            if (this.f12830o0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f12830o0) {
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
