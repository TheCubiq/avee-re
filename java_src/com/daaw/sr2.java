package com.daaw;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzatd;
import java.nio.ByteBuffer;
@TargetApi(16)
/* loaded from: classes.dex */
public final class sr2 extends qu2 implements ez2 {

    /* renamed from: Q */
    public final xq2 f26563Q;

    /* renamed from: R */
    public final or2 f26564R;

    /* renamed from: S */
    public boolean f26565S;

    /* renamed from: T */
    public int f26566T;

    /* renamed from: U */
    public int f26567U;

    /* renamed from: V */
    public long f26568V;

    /* renamed from: W */
    public boolean f26569W;

    public sr2(su2 su2Var, ks2 ks2Var, boolean z, Handler handler, dr2 dr2Var) {
        super(1, su2Var, null, true);
        this.f26564R = new or2(null, new qq2[0], new rr2(this, null));
        this.f26563Q = new xq2(handler, dr2Var);
    }

    @Override // com.daaw.qu2
    /* renamed from: A */
    public final ju2 mo9963A(su2 su2Var, zzatd zzatdVar, boolean z) {
        return super.mo9963A(su2Var, zzatdVar, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r4.startsWith("heroqlte") == false) goto L16;
     */
    @Override // com.daaw.qu2
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo9962B(ju2 ju2Var, MediaCodec mediaCodec, zzatd zzatdVar, MediaCrypto mediaCrypto) {
        String str = ju2Var.f15415a;
        boolean z = true;
        if (pz2.f23547a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(pz2.f23549c)) {
            String str2 = pz2.f23548b;
            if (!str2.startsWith("zeroflte")) {
                if (!str2.startsWith("herolte")) {
                }
            }
            this.f26565S = z;
            mediaCodec.configure(zzatdVar.m1131b(), (Surface) null, (MediaCrypto) null, 0);
        }
        z = false;
        this.f26565S = z;
        mediaCodec.configure(zzatdVar.m1131b(), (Surface) null, (MediaCrypto) null, 0);
    }

    @Override // com.daaw.qu2
    /* renamed from: C */
    public final void mo9961C(String str, long j, long j2) {
        this.f26563Q.m4820d(str, j, j2);
    }

    @Override // com.daaw.qu2
    /* renamed from: D */
    public final void mo9960D(zzatd zzatdVar) {
        super.mo9960D(zzatdVar);
        this.f26563Q.m4817g(zzatdVar);
        this.f26566T = "audio/raw".equals(zzatdVar.f36794u) ? zzatdVar.f36781I : 2;
        this.f26567U = zzatdVar.f36779G;
    }

    @Override // com.daaw.qu2
    /* renamed from: E */
    public final void mo9959E(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int[] iArr;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.f26565S && integer == 6) {
            int i2 = this.f26567U;
            if (i2 < 6) {
                int[] iArr2 = new int[i2];
                for (int i3 = 0; i3 < this.f26567U; i3++) {
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
            this.f26564R.m14047e("audio/raw", i, integer2, this.f26566T, 0, iArr);
        } catch (ir2 e) {
            throw kp2.m17548a(e, m19536l());
        }
    }

    @Override // com.daaw.qu2
    /* renamed from: F */
    public final void mo9958F() {
        try {
            this.f26564R.m14043i();
        } catch (nr2 e) {
            throw kp2.m17548a(e, m19536l());
        }
    }

    @Override // com.daaw.qu2
    /* renamed from: G */
    public final boolean mo9957G(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f24347O.f3522e++;
            this.f26564R.m14046f();
            return true;
        }
        try {
            if (this.f26564R.m14039m(byteBuffer, j3)) {
                mediaCodec.releaseOutputBuffer(i, false);
                this.f24347O.f3521d++;
                return true;
            }
            return false;
        } catch (jr2 | nr2 e) {
            throw kp2.m17548a(e, m19536l());
        }
    }

    @Override // com.daaw.mp2
    /* renamed from: b */
    public final void mo9954b(int i, Object obj) {
        if (i != 2) {
            return;
        }
        this.f26564R.m14040l(((Float) obj).floatValue());
    }

    @Override // com.daaw.qu2, com.daaw.gq2
    /* renamed from: d */
    public final boolean mo9953d() {
        return this.f26564R.m14038n() || super.mo9953d();
    }

    @Override // com.daaw.ez2
    /* renamed from: h */
    public final long mo9952h() {
        long m14051a = this.f26564R.m14051a(zzE());
        if (m14051a != Long.MIN_VALUE) {
            if (!this.f26569W) {
                m14051a = Math.max(this.f26568V, m14051a);
            }
            this.f26568V = m14051a;
            this.f26569W = false;
        }
        return this.f26568V;
    }

    @Override // com.daaw.ez2
    /* renamed from: n */
    public final fq2 mo9951n() {
        return this.f26564R.m14049c();
    }

    @Override // com.daaw.ez2
    /* renamed from: o */
    public final fq2 mo9950o(fq2 fq2Var) {
        return this.f26564R.m14048d(fq2Var);
    }

    @Override // com.daaw.qu2, com.daaw.ip2
    /* renamed from: q */
    public final void mo9949q() {
        try {
            this.f26564R.m14042j();
            try {
                super.mo9949q();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.mo9949q();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.daaw.qu2, com.daaw.ip2
    /* renamed from: r */
    public final void mo9948r(boolean z) {
        super.mo9948r(z);
        this.f26563Q.m4818f(this.f24347O);
        int i = m19534p().f13924a;
    }

    @Override // com.daaw.qu2, com.daaw.ip2
    /* renamed from: s */
    public final void mo9947s(long j, boolean z) {
        super.mo9947s(j, z);
        this.f26564R.m14041k();
        this.f26568V = j;
        this.f26569W = true;
    }

    @Override // com.daaw.ip2
    /* renamed from: t */
    public final void mo9946t() {
        this.f26564R.m14044h();
    }

    @Override // com.daaw.ip2
    /* renamed from: u */
    public final void mo9945u() {
        this.f26564R.m14045g();
    }

    @Override // com.daaw.qu2
    /* renamed from: x */
    public final int mo9944x(su2 su2Var, zzatd zzatdVar) {
        int i;
        int i2;
        String str = zzatdVar.f36794u;
        if (fz2.m22128a(str)) {
            int i3 = pz2.f23547a;
            int i4 = i3 >= 21 ? 16 : 0;
            ju2 m26959c = av2.m26959c(str, false);
            if (m26959c == null) {
                return 1;
            }
            int i5 = 2;
            if (i3 < 21 || (((i = zzatdVar.f36780H) == -1 || m26959c.m18245d(i)) && ((i2 = zzatdVar.f36779G) == -1 || m26959c.m18246c(i2)))) {
                i5 = 3;
            }
            return i4 | 4 | i5;
        }
        return 0;
    }

    @Override // com.daaw.qu2, com.daaw.gq2
    public final boolean zzE() {
        return super.zzE() && this.f26564R.m14037o();
    }

    @Override // com.daaw.ip2, com.daaw.gq2
    public final ez2 zzi() {
        return this;
    }
}
