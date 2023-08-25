package com.daaw;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.gms.internal.ads.zzatd;
import java.nio.ByteBuffer;
@TargetApi(16)
/* loaded from: classes.dex */
public final class sr2 extends qu2 implements ez2 {
    public final xq2 Q;
    public final or2 R;
    public boolean S;
    public int T;
    public int U;
    public long V;
    public boolean W;

    public sr2(su2 su2Var, ks2 ks2Var, boolean z, Handler handler, dr2 dr2Var) {
        super(1, su2Var, null, true);
        this.R = new or2(null, new qq2[0], new rr2(this, null));
        this.Q = new xq2(handler, dr2Var);
    }

    @Override // com.daaw.qu2
    public final ju2 A(su2 su2Var, zzatd zzatdVar, boolean z) {
        return super.A(su2Var, zzatdVar, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r4.startsWith("heroqlte") == false) goto L16;
     */
    @Override // com.daaw.qu2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(com.daaw.ju2 r4, android.media.MediaCodec r5, com.google.android.gms.internal.ads.zzatd r6, android.media.MediaCrypto r7) {
        /*
            r3 = this;
            java.lang.String r4 = r4.a
            int r7 = com.daaw.pz2.a
            r0 = 1
            r1 = 0
            r2 = 24
            if (r7 >= r2) goto L37
            java.lang.String r7 = "OMX.SEC.aac.dec"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L37
            java.lang.String r4 = com.daaw.pz2.c
            java.lang.String r7 = "samsung"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L37
            java.lang.String r4 = com.daaw.pz2.b
            java.lang.String r7 = "zeroflte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L38
            java.lang.String r7 = "herolte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L38
            java.lang.String r7 = "heroqlte"
            boolean r4 = r4.startsWith(r7)
            if (r4 == 0) goto L37
            goto L38
        L37:
            r0 = 0
        L38:
            r3.S = r0
            android.media.MediaFormat r4 = r6.b()
            r6 = 0
            r5.configure(r4, r6, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.sr2.B(com.daaw.ju2, android.media.MediaCodec, com.google.android.gms.internal.ads.zzatd, android.media.MediaCrypto):void");
    }

    @Override // com.daaw.qu2
    public final void C(String str, long j, long j2) {
        this.Q.d(str, j, j2);
    }

    @Override // com.daaw.qu2
    public final void D(zzatd zzatdVar) {
        super.D(zzatdVar);
        this.Q.g(zzatdVar);
        this.T = "audio/raw".equals(zzatdVar.u) ? zzatdVar.I : 2;
        this.U = zzatdVar.G;
    }

    @Override // com.daaw.qu2
    public final void E(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int[] iArr;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.S && integer == 6) {
            int i2 = this.U;
            if (i2 < 6) {
                int[] iArr2 = new int[i2];
                for (int i3 = 0; i3 < this.U; i3++) {
                    iArr2[i3] = i3;
                }
                iArr = iArr2;
            } else {
                iArr = null;
            }
            i = 6;
        } else {
            i = integer;
            iArr = null;
        }
        try {
            this.R.e("audio/raw", i, integer2, this.T, 0, iArr);
        } catch (ir2 e) {
            throw kp2.a(e, l());
        }
    }

    @Override // com.daaw.qu2
    public final void F() {
        try {
            this.R.i();
        } catch (nr2 e) {
            throw kp2.a(e, l());
        }
    }

    @Override // com.daaw.qu2
    public final boolean G(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.O.e++;
            this.R.f();
            return true;
        }
        try {
            if (this.R.m(byteBuffer, j3)) {
                mediaCodec.releaseOutputBuffer(i, false);
                this.O.d++;
                return true;
            }
            return false;
        } catch (jr2 | nr2 e) {
            throw kp2.a(e, l());
        }
    }

    @Override // com.daaw.mp2
    public final void b(int i, Object obj) {
        if (i != 2) {
            return;
        }
        this.R.l(((Float) obj).floatValue());
    }

    @Override // com.daaw.qu2, com.daaw.gq2
    public final boolean d() {
        return this.R.n() || super.d();
    }

    @Override // com.daaw.ez2
    public final long h() {
        long a = this.R.a(zzE());
        if (a != Long.MIN_VALUE) {
            if (!this.W) {
                a = Math.max(this.V, a);
            }
            this.V = a;
            this.W = false;
        }
        return this.V;
    }

    @Override // com.daaw.ez2
    public final fq2 n() {
        return this.R.c();
    }

    @Override // com.daaw.ez2
    public final fq2 o(fq2 fq2Var) {
        return this.R.d(fq2Var);
    }

    @Override // com.daaw.qu2, com.daaw.ip2
    public final void q() {
        try {
            this.R.j();
            try {
                super.q();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.q();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.daaw.qu2, com.daaw.ip2
    public final void r(boolean z) {
        super.r(z);
        this.Q.f(this.O);
        int i = p().a;
    }

    @Override // com.daaw.qu2, com.daaw.ip2
    public final void s(long j, boolean z) {
        super.s(j, z);
        this.R.k();
        this.V = j;
        this.W = true;
    }

    @Override // com.daaw.ip2
    public final void t() {
        this.R.h();
    }

    @Override // com.daaw.ip2
    public final void u() {
        this.R.g();
    }

    @Override // com.daaw.qu2
    public final int x(su2 su2Var, zzatd zzatdVar) {
        int i;
        int i2;
        String str = zzatdVar.u;
        if (fz2.a(str)) {
            int i3 = pz2.a;
            int i4 = i3 >= 21 ? 16 : 0;
            ju2 c = av2.c(str, false);
            if (c == null) {
                return 1;
            }
            int i5 = 2;
            if (i3 < 21 || (((i = zzatdVar.H) == -1 || c.d(i)) && ((i2 = zzatdVar.G) == -1 || c.c(i2)))) {
                i5 = 3;
            }
            return i4 | 4 | i5;
        }
        return 0;
    }

    @Override // com.daaw.qu2, com.daaw.gq2
    public final boolean zzE() {
        return super.zzE() && this.R.o();
    }

    @Override // com.daaw.ip2, com.daaw.gq2
    public final ez2 zzi() {
        return this;
    }
}
