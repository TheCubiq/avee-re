package com.daaw;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
/* loaded from: classes.dex */
public final class or2 {

    /* renamed from: A */
    public Method f21853A;

    /* renamed from: B */
    public int f21854B;

    /* renamed from: C */
    public long f21855C;

    /* renamed from: D */
    public long f21856D;

    /* renamed from: E */
    public int f21857E;

    /* renamed from: F */
    public long f21858F;

    /* renamed from: G */
    public long f21859G;

    /* renamed from: H */
    public int f21860H;

    /* renamed from: I */
    public int f21861I;

    /* renamed from: J */
    public long f21862J;

    /* renamed from: K */
    public long f21863K;

    /* renamed from: L */
    public long f21864L;

    /* renamed from: M */
    public float f21865M;

    /* renamed from: N */
    public qq2[] f21866N;

    /* renamed from: O */
    public ByteBuffer[] f21867O;

    /* renamed from: P */
    public ByteBuffer f21868P;

    /* renamed from: Q */
    public ByteBuffer f21869Q;

    /* renamed from: R */
    public byte[] f21870R;

    /* renamed from: S */
    public int f21871S;

    /* renamed from: T */
    public int f21872T;

    /* renamed from: U */
    public boolean f21873U;

    /* renamed from: V */
    public boolean f21874V;

    /* renamed from: W */
    public int f21875W;

    /* renamed from: X */
    public boolean f21876X;

    /* renamed from: Y */
    public long f21877Y;

    /* renamed from: a */
    public final pr2 f21878a;

    /* renamed from: b */
    public final vr2 f21879b;

    /* renamed from: c */
    public final qq2[] f21880c;

    /* renamed from: d */
    public final kr2 f21881d;

    /* renamed from: e */
    public final ConditionVariable f21882e = new ConditionVariable(true);

    /* renamed from: f */
    public final long[] f21883f;

    /* renamed from: g */
    public final gr2 f21884g;

    /* renamed from: h */
    public final LinkedList f21885h;

    /* renamed from: i */
    public AudioTrack f21886i;

    /* renamed from: j */
    public int f21887j;

    /* renamed from: k */
    public int f21888k;

    /* renamed from: l */
    public int f21889l;

    /* renamed from: m */
    public int f21890m;

    /* renamed from: n */
    public boolean f21891n;

    /* renamed from: o */
    public int f21892o;

    /* renamed from: p */
    public long f21893p;

    /* renamed from: q */
    public fq2 f21894q;

    /* renamed from: r */
    public fq2 f21895r;

    /* renamed from: s */
    public long f21896s;

    /* renamed from: t */
    public long f21897t;

    /* renamed from: u */
    public int f21898u;

    /* renamed from: v */
    public int f21899v;

    /* renamed from: w */
    public long f21900w;

    /* renamed from: x */
    public long f21901x;

    /* renamed from: y */
    public boolean f21902y;

    /* renamed from: z */
    public long f21903z;

    public or2(oq2 oq2Var, qq2[] qq2VarArr, kr2 kr2Var) {
        this.f21881d = kr2Var;
        if (pz2.f23547a >= 18) {
            try {
                this.f21853A = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f21884g = pz2.f23547a >= 19 ? new hr2() : new gr2(null);
        pr2 pr2Var = new pr2();
        this.f21878a = pr2Var;
        vr2 vr2Var = new vr2();
        this.f21879b = vr2Var;
        this.f21880c = r1;
        System.arraycopy(qq2VarArr, 0, r1, 2, 0);
        qq2[] qq2VarArr2 = {new tr2(), pr2Var, vr2Var};
        this.f21883f = new long[10];
        this.f21865M = 1.0f;
        this.f21861I = 0;
        this.f21875W = 0;
        this.f21895r = fq2.f9781d;
        this.f21872T = -1;
        this.f21866N = new qq2[0];
        this.f21867O = new ByteBuffer[0];
        this.f21885h = new LinkedList();
    }

    /* renamed from: a */
    public final long m14051a(boolean z) {
        long m21309b;
        long j;
        long j2;
        fq2 fq2Var;
        long j3;
        long j4;
        Method method;
        StringBuilder sb;
        String str;
        if (!m14028x() || this.f21861I == 0) {
            return Long.MIN_VALUE;
        }
        if (this.f21886i.getPlayState() == 3) {
            long m21309b2 = this.f21884g.m21309b();
            if (m21309b2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f21901x >= 30000) {
                    long[] jArr = this.f21883f;
                    int i = this.f21898u;
                    jArr[i] = m21309b2 - nanoTime;
                    this.f21898u = (i + 1) % 10;
                    int i2 = this.f21899v;
                    if (i2 < 10) {
                        this.f21899v = i2 + 1;
                    }
                    this.f21901x = nanoTime;
                    this.f21900w = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f21899v;
                        if (i3 >= i4) {
                            break;
                        }
                        this.f21900w += this.f21883f[i3] / i4;
                        i3++;
                    }
                }
                if (!m14027y() && nanoTime - this.f21903z >= 500000) {
                    boolean mo20461h = this.f21884g.mo20461h();
                    this.f21902y = mo20461h;
                    if (mo20461h) {
                        long mo20463d = this.f21884g.mo20463d() / 1000;
                        long mo20464c = this.f21884g.mo20464c();
                        if (mo20463d >= this.f21863K) {
                            if (Math.abs(mo20463d - nanoTime) > 5000000) {
                                sb = new StringBuilder();
                                str = "Spurious audio timestamp (system clock mismatch): ";
                            } else if (Math.abs(m14035q(mo20464c) - m21309b2) > 5000000) {
                                sb = new StringBuilder();
                                str = "Spurious audio timestamp (frame position mismatch): ";
                            }
                            sb.append(str);
                            sb.append(mo20464c);
                            sb.append(", ");
                            sb.append(mo20463d);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(m21309b2);
                        }
                        this.f21902y = false;
                    }
                    if (this.f21853A != null && !this.f21891n) {
                        try {
                            long intValue = (((Integer) method.invoke(this.f21886i, null)).intValue() * 1000) - this.f21893p;
                            this.f21864L = intValue;
                            long max = Math.max(intValue, 0L);
                            this.f21864L = max;
                            if (max > 5000000) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Ignoring impossibly large audio latency: ");
                                sb2.append(max);
                                this.f21864L = 0L;
                            }
                        } catch (Exception unused) {
                            this.f21853A = null;
                        }
                    }
                    this.f21903z = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.f21902y) {
            m21309b = m14035q(this.f21884g.mo20464c() + m14036p(nanoTime2 - (this.f21884g.mo20463d() / 1000)));
        } else {
            m21309b = this.f21899v == 0 ? this.f21884g.m21309b() : nanoTime2 + this.f21900w;
            if (!z) {
                m21309b -= this.f21864L;
            }
        }
        long j5 = this.f21862J;
        while (!this.f21885h.isEmpty()) {
            j2 = ((mr2) this.f21885h.getFirst()).f19105c;
            if (m21309b < j2) {
                break;
            }
            mr2 mr2Var = (mr2) this.f21885h.remove();
            fq2Var = mr2Var.f19103a;
            this.f21895r = fq2Var;
            j3 = mr2Var.f19105c;
            this.f21897t = j3;
            j4 = mr2Var.f19104b;
            this.f21896s = j4 - this.f21862J;
        }
        if (this.f21895r.f9782a == 1.0f) {
            j = (m21309b + this.f21896s) - this.f21897t;
        } else {
            if (this.f21885h.isEmpty()) {
                vr2 vr2Var = this.f21879b;
                if (vr2Var.m6837f() >= 1024) {
                    j = pz2.m12840j(m21309b - this.f21897t, vr2Var.m6838e(), vr2Var.m6837f()) + this.f21896s;
                }
            }
            long j6 = this.f21896s;
            double d = this.f21895r.f9782a;
            double d2 = m21309b - this.f21897t;
            Double.isNaN(d);
            Double.isNaN(d2);
            j = ((long) (d * d2)) + j6;
        }
        return j5 + j;
    }

    /* renamed from: c */
    public final fq2 m14049c() {
        return this.f21895r;
    }

    /* renamed from: d */
    public final fq2 m14048d(fq2 fq2Var) {
        if (this.f21891n) {
            fq2 fq2Var2 = fq2.f9781d;
            this.f21895r = fq2Var2;
            return fq2Var2;
        }
        float m6839d = this.f21879b.m6839d(fq2Var.f9782a);
        this.f21879b.m6840c(1.0f);
        fq2 fq2Var3 = new fq2(m6839d, 1.0f);
        fq2 fq2Var4 = this.f21894q;
        if (fq2Var4 == null) {
            fq2Var4 = !this.f21885h.isEmpty() ? ((mr2) this.f21885h.getLast()).f19103a : this.f21895r;
        }
        if (!fq2Var3.equals(fq2Var4)) {
            if (m14028x()) {
                this.f21894q = fq2Var3;
            } else {
                this.f21895r = fq2Var3;
            }
        }
        return this.f21895r;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m14047e(String str, int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        int i6;
        int i7;
        this.f21854B = pz2.m12841i(i3, i);
        this.f21878a.m13197c(iArr);
        qq2[] qq2VarArr = this.f21880c;
        boolean z = false;
        for (int i8 = 0; i8 < 3; i8++) {
            qq2 qq2Var = qq2VarArr[i8];
            try {
                z |= qq2Var.mo6841b(i2, i, i3);
                if (qq2Var.zzi()) {
                    i = qq2Var.zza();
                    qq2Var.zzb();
                    i3 = 2;
                }
            } catch (pq2 e) {
                throw new ir2(e);
            }
        }
        if (z) {
            m14032t();
        }
        int i9 = 252;
        switch (i) {
            case 1:
                i5 = 4;
                break;
            case 2:
                i5 = 12;
                break;
            case 3:
                i5 = 28;
                break;
            case 4:
                i5 = 204;
                break;
            case 5:
                i5 = 220;
                break;
            case 6:
                i5 = 252;
                break;
            case 7:
                i5 = 1276;
                break;
            case 8:
                i5 = jp2.f15305a;
                break;
            default:
                throw new ir2("Unsupported channel count: " + i);
        }
        int i10 = pz2.f23547a;
        if (i10 <= 23 && "foster".equals(pz2.f23548b) && "NVIDIA".equals(pz2.f23549c)) {
            if (i != 3 && i != 5) {
                if (i == 7) {
                    i9 = jp2.f15305a;
                }
            }
            if (i10 <= 25) {
                "fugu".equals(pz2.f23548b);
            }
            if (z && m14028x() && this.f21889l == i3 && this.f21887j == i2 && this.f21888k == i9) {
                return;
            }
            m14041k();
            this.f21889l = i3;
            this.f21891n = false;
            this.f21887j = i2;
            this.f21888k = i9;
            this.f21890m = 2;
            this.f21857E = pz2.m12841i(2, i);
            int minBufferSize = AudioTrack.getMinBufferSize(i2, i9, this.f21890m);
            az2.m26583e(minBufferSize != -2);
            i6 = minBufferSize * 4;
            long m14036p = m14036p(250000L);
            int i11 = this.f21857E;
            i7 = ((int) m14036p) * i11;
            int max = (int) Math.max(minBufferSize, m14036p(750000L) * i11);
            if (i6 >= i7) {
                i6 = i7;
            } else if (i6 > max) {
                i6 = max;
            }
            this.f21892o = i6;
            this.f21893p = m14035q(i6 / this.f21857E);
            m14048d(this.f21895r);
        }
        i9 = i5;
        if (i10 <= 25) {
        }
        if (z) {
        }
        m14041k();
        this.f21889l = i3;
        this.f21891n = false;
        this.f21887j = i2;
        this.f21888k = i9;
        this.f21890m = 2;
        this.f21857E = pz2.m12841i(2, i);
        int minBufferSize2 = AudioTrack.getMinBufferSize(i2, i9, this.f21890m);
        az2.m26583e(minBufferSize2 != -2);
        i6 = minBufferSize2 * 4;
        long m14036p2 = m14036p(250000L);
        int i112 = this.f21857E;
        i7 = ((int) m14036p2) * i112;
        int max2 = (int) Math.max(minBufferSize2, m14036p(750000L) * i112);
        if (i6 >= i7) {
        }
        this.f21892o = i6;
        this.f21893p = m14035q(i6 / this.f21857E);
        m14048d(this.f21895r);
    }

    /* renamed from: f */
    public final void m14046f() {
        if (this.f21861I == 1) {
            this.f21861I = 2;
        }
    }

    /* renamed from: g */
    public final void m14045g() {
        this.f21874V = false;
        if (m14028x()) {
            m14031u();
            this.f21884g.m21307f();
        }
    }

    /* renamed from: h */
    public final void m14044h() {
        this.f21874V = true;
        if (m14028x()) {
            this.f21863K = System.nanoTime() / 1000;
            this.f21886i.play();
        }
    }

    /* renamed from: i */
    public final void m14043i() {
        if (!this.f21873U && m14028x() && m14029w()) {
            this.f21884g.m21308e(m14034r());
            this.f21873U = true;
        }
    }

    /* renamed from: j */
    public final void m14042j() {
        m14041k();
        qq2[] qq2VarArr = this.f21880c;
        for (int i = 0; i < 3; i++) {
            qq2VarArr[i].zzg();
        }
        this.f21875W = 0;
        this.f21874V = false;
    }

    /* renamed from: k */
    public final void m14041k() {
        fq2 fq2Var;
        if (m14028x()) {
            this.f21855C = 0L;
            this.f21856D = 0L;
            this.f21858F = 0L;
            this.f21859G = 0L;
            this.f21860H = 0;
            fq2 fq2Var2 = this.f21894q;
            if (fq2Var2 != null) {
                this.f21895r = fq2Var2;
                this.f21894q = null;
            } else if (!this.f21885h.isEmpty()) {
                fq2Var = ((mr2) this.f21885h.getLast()).f19103a;
                this.f21895r = fq2Var;
            }
            this.f21885h.clear();
            this.f21896s = 0L;
            this.f21897t = 0L;
            this.f21868P = null;
            this.f21869Q = null;
            int i = 0;
            while (true) {
                qq2[] qq2VarArr = this.f21866N;
                if (i >= qq2VarArr.length) {
                    break;
                }
                qq2 qq2Var = qq2VarArr[i];
                qq2Var.zzd();
                this.f21867O[i] = qq2Var.zzc();
                i++;
            }
            this.f21873U = false;
            this.f21872T = -1;
            this.f21861I = 0;
            this.f21864L = 0L;
            m14031u();
            if (this.f21886i.getPlayState() == 3) {
                this.f21886i.pause();
            }
            AudioTrack audioTrack = this.f21886i;
            this.f21886i = null;
            this.f21884g.mo20462g(null, false);
            this.f21882e.close();
            new er2(this, audioTrack).start();
        }
    }

    /* renamed from: l */
    public final void m14040l(float f) {
        if (this.f21865M != f) {
            this.f21865M = f;
            m14030v();
        }
    }

    /* renamed from: m */
    public final boolean m14039m(ByteBuffer byteBuffer, long j) {
        int i;
        xq2 xq2Var;
        xq2 xq2Var2;
        ByteBuffer byteBuffer2 = this.f21868P;
        az2.m26585c(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!m14028x()) {
            this.f21882e.block();
            int i2 = this.f21875W;
            int i3 = this.f21887j;
            int i4 = this.f21888k;
            int i5 = this.f21890m;
            int i6 = this.f21892o;
            this.f21886i = i2 == 0 ? new AudioTrack(3, i3, i4, i5, i6, 1) : new AudioTrack(3, i3, i4, i5, i6, 1, i2);
            int state = this.f21886i.getState();
            if (state != 1) {
                try {
                    this.f21886i.release();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    this.f21886i = null;
                    throw th;
                }
                this.f21886i = null;
                throw new jr2(state, this.f21887j, this.f21888k, this.f21892o);
            }
            int audioSessionId = this.f21886i.getAudioSessionId();
            if (this.f21875W != audioSessionId) {
                this.f21875W = audioSessionId;
                xq2Var2 = ((rr2) this.f21881d).f25537a.f26563Q;
                xq2Var2.m4822b(audioSessionId);
            }
            this.f21884g.mo20462g(this.f21886i, m14027y());
            m14030v();
            this.f21876X = false;
            if (this.f21874V) {
                m14044h();
            }
        }
        if (m14027y()) {
            if (this.f21886i.getPlayState() == 2) {
                this.f21876X = false;
                return false;
            } else if (this.f21886i.getPlayState() == 1 && this.f21884g.m21310a() != 0) {
                return false;
            }
        }
        boolean z = this.f21876X;
        boolean m14038n = m14038n();
        this.f21876X = m14038n;
        if (z && !m14038n && this.f21886i.getPlayState() != 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.f21877Y;
            kr2 kr2Var = this.f21881d;
            int i7 = this.f21892o;
            long m18344b = jp2.m18344b(this.f21893p);
            xq2Var = ((rr2) kr2Var).f25537a.f26563Q;
            xq2Var.m4821c(i7, m18344b, elapsedRealtime - j2);
        }
        if (this.f21868P == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f21891n && this.f21860H == 0) {
                int i8 = this.f21890m;
                if (i8 == 7 || i8 == 8) {
                    int position = byteBuffer.position();
                    i = ((((byteBuffer.get(position + 5) & 252) >> 2) | ((byteBuffer.get(position + 4) & 1) << 6)) + 1) * 32;
                } else if (i8 == 5) {
                    int i9 = nq2.f20575d;
                    i = 1536;
                } else if (i8 != 6) {
                    throw new IllegalStateException("Unexpected audio encoding: " + i8);
                } else {
                    i = nq2.m14882a(byteBuffer);
                }
                this.f21860H = i;
            }
            if (this.f21894q != null) {
                if (!m14029w()) {
                    return false;
                }
                this.f21885h.add(new mr2(this.f21894q, Math.max(0L, j), m14035q(m14034r()), null));
                this.f21894q = null;
                m14032t();
            }
            if (this.f21861I == 0) {
                this.f21862J = Math.max(0L, j);
                this.f21861I = 1;
            } else {
                long m14035q = this.f21862J + m14035q(this.f21891n ? this.f21856D : this.f21855C / this.f21854B);
                if (this.f21861I == 1 && Math.abs(m14035q - j) > 200000) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Discontinuity detected [expected ");
                    sb.append(m14035q);
                    sb.append(", got ");
                    sb.append(j);
                    sb.append("]");
                    this.f21861I = 2;
                }
                if (this.f21861I == 2) {
                    this.f21862J += j - m14035q;
                    this.f21861I = 1;
                    ((rr2) this.f21881d).f25537a.f26569W = true;
                }
            }
            if (this.f21891n) {
                this.f21856D += this.f21860H;
            } else {
                this.f21855C += byteBuffer.remaining();
            }
            this.f21868P = byteBuffer;
        }
        if (this.f21891n) {
            m14026z(this.f21868P, j);
        } else {
            m14033s(j);
        }
        if (this.f21868P.hasRemaining()) {
            return false;
        }
        this.f21868P = null;
        return true;
    }

    /* renamed from: n */
    public final boolean m14038n() {
        if (m14028x()) {
            if (m14034r() > this.f21884g.m21310a()) {
                return true;
            }
            if (m14027y() && this.f21886i.getPlayState() == 2 && this.f21886i.getPlaybackHeadPosition() == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m14037o() {
        return !m14028x() || (this.f21873U && !m14038n());
    }

    /* renamed from: p */
    public final long m14036p(long j) {
        return (j * this.f21887j) / 1000000;
    }

    /* renamed from: q */
    public final long m14035q(long j) {
        return (j * 1000000) / this.f21887j;
    }

    /* renamed from: r */
    public final long m14034r() {
        return this.f21891n ? this.f21859G : this.f21858F / this.f21857E;
    }

    /* renamed from: s */
    public final void m14033s(long j) {
        ByteBuffer byteBuffer;
        int length = this.f21866N.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f21867O[i - 1];
            } else {
                byteBuffer = this.f21868P;
                if (byteBuffer == null) {
                    byteBuffer = qq2.f24260a;
                }
            }
            if (i == length) {
                m14026z(byteBuffer, j);
            } else {
                qq2 qq2Var = this.f21866N[i];
                qq2Var.mo6842a(byteBuffer);
                ByteBuffer zzc = qq2Var.zzc();
                this.f21867O[i] = zzc;
                if (zzc.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i--;
        }
    }

    /* renamed from: t */
    public final void m14032t() {
        ArrayList arrayList = new ArrayList();
        qq2[] qq2VarArr = this.f21880c;
        for (int i = 0; i < 3; i++) {
            qq2 qq2Var = qq2VarArr[i];
            if (qq2Var.zzi()) {
                arrayList.add(qq2Var);
            } else {
                qq2Var.zzd();
            }
        }
        int size = arrayList.size();
        this.f21866N = (qq2[]) arrayList.toArray(new qq2[size]);
        this.f21867O = new ByteBuffer[size];
        for (int i2 = 0; i2 < size; i2++) {
            qq2 qq2Var2 = this.f21866N[i2];
            qq2Var2.zzd();
            this.f21867O[i2] = qq2Var2.zzc();
        }
    }

    /* renamed from: u */
    public final void m14031u() {
        this.f21900w = 0L;
        this.f21899v = 0;
        this.f21898u = 0;
        this.f21901x = 0L;
        this.f21902y = false;
        this.f21903z = 0L;
    }

    /* renamed from: v */
    public final void m14030v() {
        if (m14028x()) {
            if (pz2.f23547a >= 21) {
                this.f21886i.setVolume(this.f21865M);
                return;
            }
            AudioTrack audioTrack = this.f21886i;
            float f = this.f21865M;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0032 -> B:8:0x0010). Please submit an issue!!! */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m14029w() {
        boolean z;
        int i;
        qq2[] qq2VarArr;
        if (this.f21872T == -1) {
            int i2 = this.f21891n ? this.f21866N.length : 0;
            this.f21872T = i2;
            z = true;
            i = this.f21872T;
            qq2VarArr = this.f21866N;
            if (i < qq2VarArr.length) {
                qq2 qq2Var = qq2VarArr[i];
                if (z) {
                    qq2Var.zze();
                }
                m14033s(-9223372036854775807L);
                if (!qq2Var.zzj()) {
                    return false;
                }
                i2 = this.f21872T + 1;
                this.f21872T = i2;
                z = true;
                i = this.f21872T;
                qq2VarArr = this.f21866N;
                if (i < qq2VarArr.length) {
                    ByteBuffer byteBuffer = this.f21869Q;
                    if (byteBuffer != null) {
                        m14026z(byteBuffer, -9223372036854775807L);
                        if (this.f21869Q != null) {
                            return false;
                        }
                    }
                    this.f21872T = -1;
                    return true;
                }
            }
        } else {
            z = false;
            i = this.f21872T;
            qq2VarArr = this.f21866N;
            if (i < qq2VarArr.length) {
            }
        }
    }

    /* renamed from: x */
    public final boolean m14028x() {
        return this.f21886i != null;
    }

    /* renamed from: y */
    public final boolean m14027y() {
        int i;
        return pz2.f23547a < 23 && ((i = this.f21890m) == 5 || i == 6);
    }

    /* renamed from: z */
    public final boolean m14026z(ByteBuffer byteBuffer, long j) {
        int write;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f21869Q;
            if (byteBuffer2 != null) {
                az2.m26585c(byteBuffer2 == byteBuffer);
            } else {
                this.f21869Q = byteBuffer;
                if (pz2.f23547a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f21870R;
                    if (bArr == null || bArr.length < remaining) {
                        this.f21870R = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f21870R, 0, remaining);
                    byteBuffer.position(position);
                    this.f21871S = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (pz2.f23547a < 21) {
                int m21310a = this.f21892o - ((int) (this.f21858F - (this.f21884g.m21310a() * this.f21857E)));
                if (m21310a > 0) {
                    write = this.f21886i.write(this.f21870R, this.f21871S, Math.min(remaining2, m21310a));
                    if (write > 0) {
                        this.f21871S += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
            } else {
                write = this.f21886i.write(byteBuffer, remaining2, 1);
            }
            this.f21877Y = SystemClock.elapsedRealtime();
            if (write >= 0) {
                boolean z = this.f21891n;
                if (!z) {
                    this.f21858F += write;
                }
                if (write == remaining2) {
                    if (z) {
                        this.f21859G += this.f21860H;
                    }
                    this.f21869Q = null;
                    return true;
                }
                return false;
            }
            throw new nr2(write);
        }
        return true;
    }
}
