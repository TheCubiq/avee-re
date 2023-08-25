package com.daaw;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzatd;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
@TargetApi(19)
/* loaded from: classes.dex */
public abstract class qu2 extends ip2 {
    public static final byte[] P = pz2.p("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    public ByteBuffer[] A;
    public ByteBuffer[] B;
    public long C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public as2 O;
    public final su2 i;
    public final bs2 j;
    public final bs2 k;
    public final cq2 l;
    public final List m;
    public final MediaCodec.BufferInfo n;
    public zzatd o;
    public MediaCodec p;
    public ju2 q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public qu2(int i, su2 su2Var, ks2 ks2Var, boolean z) {
        super(i);
        az2.e(pz2.a >= 16);
        this.i = su2Var;
        this.j = new bs2(0);
        this.k = new bs2(0);
        this.l = new cq2();
        this.m = new ArrayList();
        this.n = new MediaCodec.BufferInfo();
        this.H = 0;
        this.I = 0;
    }

    private final void y() {
        if (this.I == 2) {
            L();
            J();
            return;
        }
        this.M = true;
        F();
    }

    public ju2 A(su2 su2Var, zzatd zzatdVar, boolean z) {
        return av2.c(zzatdVar.u, false);
    }

    public abstract void B(ju2 ju2Var, MediaCodec mediaCodec, zzatd zzatdVar, MediaCrypto mediaCrypto);

    public abstract void C(String str, long j, long j2);

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r6.z == r0.z) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D(com.google.android.gms.internal.ads.zzatd r6) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzatd r0 = r5.o
            r5.o = r6
            com.google.android.gms.internal.ads.zzavc r6 = r6.x
            if (r0 != 0) goto La
            r1 = 0
            goto Lc
        La:
            com.google.android.gms.internal.ads.zzavc r1 = r0.x
        Lc:
            boolean r6 = com.daaw.pz2.o(r6, r1)
            if (r6 != 0) goto L29
            com.google.android.gms.internal.ads.zzatd r6 = r5.o
            com.google.android.gms.internal.ads.zzavc r6 = r6.x
            if (r6 != 0) goto L19
            goto L29
        L19:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r6.<init>(r0)
            int r0 = r5.l()
            com.daaw.kp2 r6 = com.daaw.kp2.a(r6, r0)
            throw r6
        L29:
            android.media.MediaCodec r6 = r5.p
            r1 = 1
            if (r6 == 0) goto L56
            com.daaw.ju2 r2 = r5.q
            boolean r2 = r2.b
            com.google.android.gms.internal.ads.zzatd r3 = r5.o
            boolean r6 = r5.M(r6, r2, r0, r3)
            if (r6 == 0) goto L56
            r5.G = r1
            r5.H = r1
            boolean r6 = r5.t
            r2 = 0
            if (r6 == 0) goto L52
            com.google.android.gms.internal.ads.zzatd r6 = r5.o
            int r3 = r6.y
            int r4 = r0.y
            if (r3 != r4) goto L52
            int r6 = r6.z
            int r0 = r0.z
            if (r6 != r0) goto L52
            goto L53
        L52:
            r1 = 0
        L53:
            r5.y = r1
            return
        L56:
            boolean r6 = r5.J
            if (r6 == 0) goto L5d
            r5.I = r1
            return
        L5d:
            r5.L()
            r5.J()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.qu2.D(com.google.android.gms.internal.ads.zzatd):void");
    }

    public abstract void E(MediaCodec mediaCodec, MediaFormat mediaFormat);

    public void F() {
    }

    public abstract boolean G(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z);

    public final MediaCodec H() {
        return this.p;
    }

    public final ju2 I() {
        return this.q;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J() {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.qu2.J():void");
    }

    public void K(bs2 bs2Var) {
    }

    public void L() {
        this.C = -9223372036854775807L;
        this.D = -1;
        this.E = -1;
        this.F = false;
        this.m.clear();
        this.A = null;
        this.B = null;
        this.q = null;
        this.G = false;
        this.J = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.K = false;
        this.H = 0;
        this.I = 0;
        this.j.c = null;
        MediaCodec mediaCodec = this.p;
        if (mediaCodec != null) {
            this.O.b++;
            try {
                mediaCodec.stop();
                try {
                    this.p.release();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    this.p.release();
                    throw th;
                } finally {
                }
            }
        }
    }

    public boolean M(MediaCodec mediaCodec, boolean z, zzatd zzatdVar, zzatd zzatdVar2) {
        return false;
    }

    public boolean N(ju2 ju2Var) {
        return true;
    }

    @Override // com.daaw.hq2
    public final int a(zzatd zzatdVar) {
        try {
            return x(this.i, zzatdVar);
        } catch (vu2 e) {
            throw kp2.a(e, l());
        }
    }

    @Override // com.daaw.gq2
    public boolean d() {
        if (this.o != null) {
            if (c() || this.E >= 0) {
                return true;
            }
            if (this.C != -9223372036854775807L && SystemClock.elapsedRealtime() < this.C) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
        if (r16.M == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014e, code lost:
        if (r16.M == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0150, code lost:
        L();
     */
    @Override // com.daaw.gq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(long r17, long r19) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.qu2.k(long, long):void");
    }

    @Override // com.daaw.ip2
    public void q() {
        this.o = null;
        L();
    }

    @Override // com.daaw.ip2
    public void r(boolean z) {
        this.O = new as2();
    }

    @Override // com.daaw.ip2
    public void s(long j, boolean z) {
        this.L = false;
        this.M = false;
        if (this.p != null) {
            this.C = -9223372036854775807L;
            this.D = -1;
            this.E = -1;
            this.N = true;
            this.F = false;
            this.m.clear();
            this.y = false;
            this.z = false;
            if (this.s || ((this.v && this.K) || this.I != 0)) {
                L();
                J();
            } else {
                this.p.flush();
                this.J = false;
            }
            if (!this.G || this.o == null) {
                return;
            }
            this.H = 1;
        }
    }

    public abstract int x(su2 su2Var, zzatd zzatdVar);

    public final boolean z() {
        MediaCodec mediaCodec = this.p;
        if (mediaCodec == null || this.I == 2 || this.L) {
            return false;
        }
        if (this.D < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.D = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            bs2 bs2Var = this.j;
            bs2Var.c = this.A[dequeueInputBuffer];
            bs2Var.b();
        }
        if (this.I == 1) {
            if (!this.u) {
                this.K = true;
                this.p.queueInputBuffer(this.D, 0, 0, 0L, 4);
                this.D = -1;
            }
            this.I = 2;
            return false;
        } else if (this.y) {
            this.y = false;
            ByteBuffer byteBuffer = this.j.c;
            byte[] bArr = P;
            byteBuffer.put(bArr);
            MediaCodec mediaCodec2 = this.p;
            int i = this.D;
            int length = bArr.length;
            mediaCodec2.queueInputBuffer(i, 0, 38, 0L, 0);
            this.D = -1;
            this.J = true;
            return true;
        } else {
            if (this.H == 1) {
                for (int i2 = 0; i2 < this.o.w.size(); i2++) {
                    this.j.c.put((byte[]) this.o.w.get(i2));
                }
                this.H = 2;
            }
            int position = this.j.c.position();
            int m = m(this.l, this.j, false);
            if (m == -3) {
                return false;
            }
            if (m == -5) {
                if (this.H == 2) {
                    this.j.b();
                    this.H = 1;
                }
                D(this.l.a);
                return true;
            }
            bs2 bs2Var2 = this.j;
            if (bs2Var2.f()) {
                if (this.H == 2) {
                    bs2Var2.b();
                    this.H = 1;
                }
                this.L = true;
                if (!this.J) {
                    y();
                    return false;
                }
                try {
                    if (!this.u) {
                        this.K = true;
                        this.p.queueInputBuffer(this.D, 0, 0, 0L, 4);
                        this.D = -1;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw kp2.a(e, l());
                }
            } else if (this.N && !bs2Var2.g()) {
                bs2Var2.b();
                if (this.H == 2) {
                    this.H = 1;
                }
                return true;
            } else {
                this.N = false;
                boolean i3 = bs2Var2.i();
                if (this.r && !i3) {
                    ByteBuffer byteBuffer2 = bs2Var2.c;
                    byte[] bArr2 = gz2.a;
                    int position2 = byteBuffer2.position();
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        int i6 = i4 + 1;
                        if (i6 >= position2) {
                            byteBuffer2.clear();
                            break;
                        }
                        int i7 = byteBuffer2.get(i4) & 255;
                        if (i5 == 3) {
                            if (i7 == 1) {
                                if ((byteBuffer2.get(i6) & 31) == 7) {
                                    ByteBuffer duplicate = byteBuffer2.duplicate();
                                    duplicate.position(i4 - 3);
                                    duplicate.limit(position2);
                                    byteBuffer2.position(0);
                                    byteBuffer2.put(duplicate);
                                    break;
                                }
                                i7 = 1;
                            }
                        } else if (i7 == 0) {
                            i5++;
                        }
                        if (i7 != 0) {
                            i5 = 0;
                        }
                        i4 = i6;
                    }
                    if (this.j.c.position() == 0) {
                        return true;
                    }
                    this.r = false;
                }
                try {
                    bs2 bs2Var3 = this.j;
                    long j = bs2Var3.d;
                    if (bs2Var3.e()) {
                        this.m.add(Long.valueOf(j));
                    }
                    this.j.c.flip();
                    K(this.j);
                    if (i3) {
                        MediaCodec.CryptoInfo a = this.j.b.a();
                        if (position != 0) {
                            if (a.numBytesOfClearData == null) {
                                a.numBytesOfClearData = new int[1];
                            }
                            int[] iArr = a.numBytesOfClearData;
                            iArr[0] = iArr[0] + position;
                        }
                        this.p.queueSecureInputBuffer(this.D, 0, a, j, 0);
                    } else {
                        this.p.queueInputBuffer(this.D, 0, this.j.c.limit(), j, 0);
                    }
                    this.D = -1;
                    this.J = true;
                    this.H = 0;
                    this.O.c++;
                    return true;
                } catch (MediaCodec.CryptoException e2) {
                    throw kp2.a(e2, l());
                }
            }
        }
    }

    @Override // com.daaw.gq2
    public boolean zzE() {
        return this.M;
    }

    @Override // com.daaw.hq2
    public final int zze() {
        return 4;
    }
}
