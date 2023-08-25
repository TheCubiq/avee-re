package com.daaw;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class sl8 implements rj8 {

    /* renamed from: W */
    public static final Object f26360W = new Object();

    /* renamed from: X */
    public static ExecutorService f26361X;

    /* renamed from: Y */
    public static int f26362Y;

    /* renamed from: A */
    public boolean f26363A;

    /* renamed from: B */
    public boolean f26364B;

    /* renamed from: C */
    public long f26365C;

    /* renamed from: D */
    public float f26366D;

    /* renamed from: E */
    public hi8[] f26367E;

    /* renamed from: F */
    public ByteBuffer[] f26368F;

    /* renamed from: G */
    public ByteBuffer f26369G;

    /* renamed from: H */
    public int f26370H;

    /* renamed from: I */
    public ByteBuffer f26371I;

    /* renamed from: J */
    public byte[] f26372J;

    /* renamed from: K */
    public int f26373K;

    /* renamed from: L */
    public int f26374L;

    /* renamed from: M */
    public boolean f26375M;

    /* renamed from: N */
    public boolean f26376N;

    /* renamed from: O */
    public boolean f26377O;

    /* renamed from: P */
    public boolean f26378P;

    /* renamed from: Q */
    public int f26379Q;

    /* renamed from: R */
    public sc8 f26380R;

    /* renamed from: S */
    public long f26381S;

    /* renamed from: T */
    public boolean f26382T;

    /* renamed from: U */
    public boolean f26383U;

    /* renamed from: V */
    public final yk8 f26384V;

    /* renamed from: a */
    public final bi8 f26385a;

    /* renamed from: b */
    public final mk8 f26386b;

    /* renamed from: c */
    public final an8 f26387c;

    /* renamed from: d */
    public final hi8[] f26388d;

    /* renamed from: e */
    public final hi8[] f26389e;

    /* renamed from: f */
    public final ds4 f26390f;

    /* renamed from: g */
    public final ik8 f26391g;

    /* renamed from: h */
    public final ArrayDeque f26392h;

    /* renamed from: i */
    public ol8 f26393i;

    /* renamed from: j */
    public final el8 f26394j;

    /* renamed from: k */
    public final el8 f26395k;

    /* renamed from: l */
    public final sk8 f26396l;

    /* renamed from: m */
    public lh8 f26397m;

    /* renamed from: n */
    public lj8 f26398n;

    /* renamed from: o */
    public wk8 f26399o;

    /* renamed from: p */
    public wk8 f26400p;

    /* renamed from: q */
    public AudioTrack f26401q;

    /* renamed from: r */
    public o98 f26402r;

    /* renamed from: s */
    public cl8 f26403s;

    /* renamed from: t */
    public cl8 f26404t;

    /* renamed from: u */
    public final pp3 f26405u;

    /* renamed from: v */
    public long f26406v;

    /* renamed from: w */
    public long f26407w;

    /* renamed from: x */
    public long f26408x;

    /* renamed from: y */
    public long f26409y;

    /* renamed from: z */
    public int f26410z;

    public /* synthetic */ sl8(uk8 uk8Var, ql8 ql8Var) {
        bi8 bi8Var;
        yk8 yk8Var;
        bi8Var = uk8Var.f29151a;
        this.f26385a = bi8Var;
        yk8Var = uk8Var.f29153c;
        this.f26384V = yk8Var;
        int i = it5.f13991a;
        this.f26396l = uk8Var.f29152b;
        ds4 ds4Var = new ds4(xp4.f32865a);
        this.f26390f = ds4Var;
        ds4Var.m24006e();
        this.f26391g = new ik8(new il8(this, null));
        mk8 mk8Var = new mk8();
        this.f26386b = mk8Var;
        an8 an8Var = new an8();
        this.f26387c = an8Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new gm8(), mk8Var, an8Var);
        Collections.addAll(arrayList, yk8Var.m3597e());
        this.f26388d = (hi8[]) arrayList.toArray(new hi8[0]);
        this.f26389e = new hi8[]{new yl8()};
        this.f26366D = 1.0f;
        this.f26402r = o98.f21185c;
        this.f26379Q = 0;
        this.f26380R = new sc8(0, 0.0f);
        pp3 pp3Var = pp3.f23129d;
        this.f26404t = new cl8(pp3Var, false, 0L, 0L, null);
        this.f26405u = pp3Var;
        this.f26374L = -1;
        this.f26367E = new hi8[0];
        this.f26368F = new ByteBuffer[0];
        this.f26392h = new ArrayDeque();
        this.f26394j = new el8(100L);
        this.f26395k = new el8(100L);
    }

    /* renamed from: F */
    public static boolean m10191F(AudioTrack audioTrack) {
        return it5.f13991a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* renamed from: q */
    public static /* synthetic */ void m10169q(AudioTrack audioTrack, ds4 ds4Var) {
        try {
            audioTrack.flush();
            audioTrack.release();
            ds4Var.m24006e();
            synchronized (f26360W) {
                int i = f26362Y - 1;
                f26362Y = i;
                if (i == 0) {
                    f26361X.shutdown();
                    f26361X = null;
                }
            }
        } catch (Throwable th) {
            ds4Var.m24006e();
            synchronized (f26360W) {
                int i2 = f26362Y - 1;
                f26362Y = i2;
                if (i2 == 0) {
                    f26361X.shutdown();
                    f26361X = null;
                }
                throw th;
            }
        }
    }

    /* renamed from: A */
    public final void m10196A(pp3 pp3Var, boolean z) {
        cl8 m10164v = m10164v();
        if (pp3Var.equals(m10164v.f5946a) && z == m10164v.f5947b) {
            return;
        }
        cl8 cl8Var = new cl8(pp3Var, z, -9223372036854775807L, -9223372036854775807L, null);
        if (m10192E()) {
            this.f26403s = cl8Var;
        } else {
            this.f26404t = cl8Var;
        }
    }

    /* renamed from: B */
    public final void m10195B() {
        if (m10192E()) {
            if (it5.f13991a >= 21) {
                this.f26401q.setVolume(this.f26366D);
                return;
            }
            AudioTrack audioTrack = this.f26401q;
            float f = this.f26366D;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* renamed from: C */
    public final void m10194C(ByteBuffer byteBuffer, long j) {
        int write;
        lj8 lj8Var;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f26371I;
            if (byteBuffer2 != null) {
                uo4.m7874d(byteBuffer2 == byteBuffer);
            } else {
                this.f26371I = byteBuffer;
                if (it5.f13991a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f26372J;
                    if (bArr == null || bArr.length < remaining) {
                        this.f26372J = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f26372J, 0, remaining);
                    byteBuffer.position(position);
                    this.f26373K = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            int i = it5.f13991a;
            if (i < 21) {
                int m19688a = this.f26391g.m19688a(this.f26408x);
                if (m19688a > 0) {
                    write = this.f26401q.write(this.f26372J, this.f26373K, Math.min(remaining2, m19688a));
                    if (write > 0) {
                        this.f26373K += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
            } else {
                write = this.f26401q.write(byteBuffer, remaining2, 1);
            }
            this.f26381S = SystemClock.elapsedRealtime();
            if (write < 0) {
                pj8 pj8Var = new pj8(write, this.f26400p.f31300a, (((i < 24 || write != -6) && write != -32) || this.f26409y <= 0) ? false : false);
                lj8 lj8Var2 = this.f26398n;
                if (lj8Var2 != null) {
                    lj8Var2.mo16898a(pj8Var);
                }
                if (pj8Var.f22996q) {
                    throw pj8Var;
                }
                this.f26395k.m23380b(pj8Var);
                return;
            }
            this.f26395k.m23381a();
            if (m10191F(this.f26401q)) {
                if (this.f26409y > 0) {
                    this.f26383U = false;
                }
                if (this.f26377O && (lj8Var = this.f26398n) != null && write < remaining2 && !this.f26383U) {
                    em8 em8Var = ((cm8) lj8Var).f5958a;
                    if (em8.m23367w0(em8Var) != null) {
                        em8.m23367w0(em8Var).zza();
                    }
                }
            }
            int i2 = this.f26400p.f31302c;
            if (i2 == 0) {
                this.f26408x += write;
            }
            if (write == remaining2) {
                if (i2 != 0) {
                    uo4.m7872f(byteBuffer == this.f26369G);
                    this.f26409y += this.f26410z * this.f26370H;
                }
                this.f26371I = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please submit an issue!!! */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m10193D() {
        boolean z;
        int i;
        hi8[] hi8VarArr;
        if (this.f26374L == -1) {
            this.f26374L = 0;
            z = true;
            i = this.f26374L;
            hi8VarArr = this.f26367E;
            if (i < hi8VarArr.length) {
                hi8 hi8Var = hi8VarArr[i];
                if (z) {
                    hi8Var.zzd();
                }
                m10160z(-9223372036854775807L);
                if (!hi8Var.zzh()) {
                    return false;
                }
                this.f26374L++;
                z = true;
                i = this.f26374L;
                hi8VarArr = this.f26367E;
                if (i < hi8VarArr.length) {
                    ByteBuffer byteBuffer = this.f26371I;
                    if (byteBuffer != null) {
                        m10194C(byteBuffer, -9223372036854775807L);
                        if (this.f26371I != null) {
                            return false;
                        }
                    }
                    this.f26374L = -1;
                    return true;
                }
            }
        } else {
            z = false;
            i = this.f26374L;
            hi8VarArr = this.f26367E;
            if (i < hi8VarArr.length) {
            }
        }
    }

    /* renamed from: E */
    public final boolean m10192E() {
        return this.f26401q != null;
    }

    /* renamed from: G */
    public final boolean m10190G() {
        if ("audio/raw".equals(this.f26400p.f31300a.f9275l)) {
            int i = this.f26400p.f31300a.f9258A;
            return true;
        }
        return false;
    }

    @Override // com.daaw.rj8
    /* renamed from: a */
    public final int mo10185a(f92 f92Var) {
        if (!"audio/raw".equals(f92Var.f9275l)) {
            if (!this.f26382T) {
                int i = it5.f13991a;
            }
            return this.f26385a.m26138a(f92Var) != null ? 2 : 0;
        }
        boolean m19374v = it5.m19374v(f92Var.f9258A);
        int i2 = f92Var.f9258A;
        if (m19374v) {
            return i2 != 2 ? 1 : 2;
        }
        s95.m10493e("DefaultAudioSink", "Invalid PCM encoding: " + i2);
        return 0;
    }

    @Override // com.daaw.rj8
    /* renamed from: b */
    public final boolean mo10184b() {
        return !m10192E() || (this.f26375M && !zzt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0152 A[Catch: jj8 -> 0x0156, TryCatch #2 {jj8 -> 0x0156, blocks: (B:36:0x0087, B:49:0x00d2, B:51:0x00da, B:53:0x00e0, B:54:0x00e7, B:55:0x00f9, B:57:0x00fd, B:59:0x0101, B:60:0x0106, B:64:0x011c, B:45:0x009c, B:47:0x00a5, B:69:0x014a, B:71:0x0152, B:72:0x0155, B:39:0x0090, B:41:0x0095), top: B:186:0x0087, inners: #3 }] */
    @Override // com.daaw.rj8
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo10183c(ByteBuffer byteBuffer, long j, int i) {
        AudioTrack m10165u;
        lh8 lh8Var;
        boolean z;
        int m24854a;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ByteBuffer byteBuffer2 = this.f26369G;
        boolean z2 = false;
        uo4.m7874d(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f26399o != null) {
            if (!m10193D()) {
                return false;
            }
            wk8 wk8Var = this.f26399o;
            wk8 wk8Var2 = this.f26400p;
            if (wk8Var2.f31302c == wk8Var.f31302c && wk8Var2.f31306g == wk8Var.f31306g && wk8Var2.f31304e == wk8Var.f31304e && wk8Var2.f31305f == wk8Var.f31305f && wk8Var2.f31303d == wk8Var.f31303d) {
                this.f26400p = wk8Var;
                this.f26399o = null;
                if (m10191F(this.f26401q)) {
                    if (this.f26401q.getPlayState() == 3) {
                        this.f26401q.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f26401q;
                    f92 f92Var = this.f26400p.f31300a;
                    audioTrack.setOffloadDelayPadding(f92Var.f9259B, f92Var.f9260C);
                    this.f26383U = true;
                }
            } else {
                m10161y();
                if (zzt()) {
                    return false;
                }
                zze();
            }
            m10163w(j);
        }
        if (!m10192E()) {
            try {
                if (!this.f26390f.m24007d()) {
                    return false;
                }
                try {
                    wk8 wk8Var3 = this.f26400p;
                    Objects.requireNonNull(wk8Var3);
                    m10165u = m10165u(wk8Var3);
                } catch (jj8 e) {
                    wk8 wk8Var4 = this.f26400p;
                    if (wk8Var4.f31307h > 1000000) {
                        wk8 wk8Var5 = new wk8(wk8Var4.f31300a, wk8Var4.f31301b, wk8Var4.f31302c, wk8Var4.f31303d, wk8Var4.f31304e, wk8Var4.f31305f, wk8Var4.f31306g, 1000000, wk8Var4.f31308i);
                        try {
                            m10165u = m10165u(wk8Var5);
                            this.f26400p = wk8Var5;
                        } catch (jj8 e2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e2);
                            } catch (Exception unused) {
                            }
                            if (this.f26400p.m6025c()) {
                                this.f26382T = true;
                            }
                            throw e;
                        }
                    }
                    if (this.f26400p.m6025c()) {
                    }
                    throw e;
                }
                this.f26401q = m10165u;
                if (m10191F(m10165u)) {
                    AudioTrack audioTrack2 = this.f26401q;
                    if (this.f26393i == null) {
                        this.f26393i = new ol8(this);
                    }
                    this.f26393i.m14173a(audioTrack2);
                    AudioTrack audioTrack3 = this.f26401q;
                    f92 f92Var2 = this.f26400p.f31300a;
                    audioTrack3.setOffloadDelayPadding(f92Var2.f9259B, f92Var2.f9260C);
                }
                if (it5.f13991a >= 31 && (lh8Var = this.f26397m) != null) {
                    qk8.m12360a(this.f26401q, lh8Var);
                }
                this.f26379Q = this.f26401q.getAudioSessionId();
                ik8 ik8Var = this.f26391g;
                AudioTrack audioTrack4 = this.f26401q;
                wk8 wk8Var6 = this.f26400p;
                ik8Var.m19684e(audioTrack4, wk8Var6.f31302c == 2, wk8Var6.f31306g, wk8Var6.f31303d, wk8Var6.f31307h);
                m10195B();
                int i8 = this.f26380R.f26079a;
                this.f26364B = true;
                z2 = false;
            } catch (jj8 e3) {
                if (e3.f15140q) {
                    throw e3;
                }
                this.f26394j.m23380b(e3);
                return false;
            }
        }
        this.f26394j.m23381a();
        if (this.f26364B) {
            this.f26365C = Math.max(0L, j);
            this.f26363A = z2;
            this.f26364B = z2;
            m10163w(j);
            if (this.f26377O) {
                zzh();
            }
        }
        if (this.f26391g.m19679j(m10166t())) {
            if (this.f26369G == null) {
                uo4.m7874d(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
                if (!byteBuffer.hasRemaining()) {
                    return true;
                }
                wk8 wk8Var7 = this.f26400p;
                if (wk8Var7.f31302c != 0 && this.f26410z == 0) {
                    int i9 = wk8Var7.f31306g;
                    switch (i9) {
                        case 5:
                        case 6:
                        case 18:
                            z = true;
                            m24854a = cz8.m24854a(byteBuffer);
                            break;
                        case 7:
                        case 8:
                            int i10 = g09.f10137d;
                            int position = byteBuffer.position();
                            byte b = byteBuffer.get(position);
                            if (b != -2) {
                                if (b == -1) {
                                    i3 = 2;
                                    i4 = (byteBuffer.get(position + 4) & 7) << 4;
                                    i5 = position + 7;
                                } else if (b != 31) {
                                    i4 = (byteBuffer.get(position + 4) & 1) << 6;
                                    i6 = byteBuffer.get(position + 5) & 252;
                                    i3 = 2;
                                    i2 = (i6 >> i3) | i4;
                                    z = true;
                                } else {
                                    i3 = 2;
                                    i4 = (byteBuffer.get(position + 5) & 7) << 4;
                                    i5 = position + 6;
                                }
                                i6 = byteBuffer.get(i5) & 60;
                                i2 = (i6 >> i3) | i4;
                                z = true;
                            } else {
                                z = true;
                                i2 = ((byteBuffer.get(position + 4) & 252) >> 2) | ((byteBuffer.get(position + 5) & 1) << 6);
                            }
                            m24854a = (i2 + (z ? 1 : 0)) * 32;
                            break;
                        case 9:
                            m24854a = z32.m2862c(it5.m19411U(byteBuffer, byteBuffer.position()));
                            if (m24854a == -1) {
                                throw new IllegalArgumentException();
                            }
                            z = true;
                            break;
                        case 10:
                        case 16:
                            m24854a = NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
                            z = true;
                            break;
                        case 11:
                        case 12:
                            m24854a = 2048;
                            z = true;
                            break;
                        case 13:
                        default:
                            throw new IllegalStateException("Unexpected audio encoding: " + i9);
                        case 14:
                            int i11 = cz8.f6322g;
                            int position2 = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i12 = position2;
                            while (true) {
                                if (i12 > limit) {
                                    i7 = -1;
                                } else if ((it5.m19411U(byteBuffer, i12 + 4) & (-2)) == -126718022) {
                                    i7 = i12 - position2;
                                } else {
                                    i12++;
                                }
                            }
                            if (i7 == -1) {
                                m24854a = 0;
                            } else {
                                m24854a = (40 << ((byteBuffer.get((byteBuffer.position() + i7) + ((byteBuffer.get((byteBuffer.position() + i7) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                            }
                            z = true;
                            break;
                        case 15:
                            m24854a = 512;
                            z = true;
                            break;
                        case 17:
                            int i13 = fz8.f10118b;
                            byte[] bArr = new byte[16];
                            int position3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(position3);
                            m24854a = fz8.m22117a(new cj5(bArr, 16)).f8976c;
                            z = true;
                            break;
                    }
                    this.f26410z = m24854a;
                    if (m24854a == 0) {
                        return z;
                    }
                }
                if (this.f26403s != null) {
                    if (!m10193D()) {
                        return false;
                    }
                    m10163w(j);
                    this.f26403s = null;
                }
                long m10167s = this.f26365C + (((m10167s() - this.f26387c.m27319i()) * 1000000) / this.f26400p.f31300a.f9289z);
                if (!this.f26363A && Math.abs(m10167s - j) > 200000) {
                    this.f26398n.mo16898a(new nj8(j, m10167s));
                    this.f26363A = true;
                }
                if (this.f26363A) {
                    if (!m10193D()) {
                        return false;
                    }
                    long j2 = j - m10167s;
                    this.f26365C += j2;
                    this.f26363A = false;
                    m10163w(j);
                    lj8 lj8Var = this.f26398n;
                    if (lj8Var != null && j2 != 0) {
                        ((cm8) lj8Var).f5958a.m23369X();
                    }
                }
                if (this.f26400p.f31302c == 0) {
                    this.f26406v += byteBuffer.remaining();
                } else {
                    this.f26407w += this.f26410z * i;
                }
                this.f26369G = byteBuffer;
                this.f26370H = i;
            }
            m10160z(j);
            if (!this.f26369G.hasRemaining()) {
                this.f26369G = null;
                this.f26370H = 0;
                return true;
            } else if (this.f26391g.m19680i(m10166t())) {
                s95.m10493e("DefaultAudioSink", "Resetting stalled audio track");
                zze();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // com.daaw.rj8
    /* renamed from: d */
    public final void mo10182d(lh8 lh8Var) {
        this.f26397m = lh8Var;
    }

    @Override // com.daaw.rj8
    /* renamed from: e */
    public final long mo10181e(boolean z) {
        long m19400c0;
        if (!m10192E() || this.f26364B) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.f26391g.m19687b(z), this.f26400p.m6027a(m10166t()));
        while (!this.f26392h.isEmpty() && min >= ((cl8) this.f26392h.getFirst()).f5949d) {
            this.f26404t = (cl8) this.f26392h.remove();
        }
        cl8 cl8Var = this.f26404t;
        long j = min - cl8Var.f5949d;
        if (cl8Var.f5946a.equals(pp3.f23129d)) {
            m19400c0 = this.f26404t.f5948c + j;
        } else if (this.f26392h.isEmpty()) {
            m19400c0 = this.f26384V.m3601a(j) + this.f26404t.f5948c;
        } else {
            cl8 cl8Var2 = (cl8) this.f26392h.getFirst();
            m19400c0 = cl8Var2.f5948c - it5.m19400c0(cl8Var2.f5949d - min, this.f26404t.f5946a.f23131a);
        }
        return m19400c0 + this.f26400p.m6027a(this.f26384V.m3600b());
    }

    @Override // com.daaw.rj8
    /* renamed from: f */
    public final void mo10180f(f92 f92Var, int i, int[] iArr) {
        int i2;
        hi8[] hi8VarArr;
        int intValue;
        int i3;
        int intValue2;
        int i4;
        int i5;
        int m19416P;
        int[] iArr2;
        if ("audio/raw".equals(f92Var.f9275l)) {
            uo4.m7874d(it5.m19374v(f92Var.f9258A));
            i3 = it5.m19407Y(f92Var.f9258A, f92Var.f9288y);
            hi8[] hi8VarArr2 = this.f26388d;
            this.f26387c.m27317k(f92Var.f9259B, f92Var.f9260C);
            if (it5.f13991a < 21 && f92Var.f9288y == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i6 = 0; i6 < 6; i6++) {
                    iArr2[i6] = i6;
                }
            } else {
                iArr2 = iArr;
            }
            this.f26386b.m15983i(iArr2);
            di8 di8Var = new di8(f92Var.f9289z, f92Var.f9288y, f92Var.f9258A);
            for (hi8 hi8Var : hi8VarArr2) {
                try {
                    di8 mo3499a = hi8Var.mo3499a(di8Var);
                    if (true == hi8Var.zzg()) {
                        di8Var = mo3499a;
                    }
                } catch (fi8 e) {
                    throw new hj8(e, f92Var);
                }
            }
            int i7 = di8Var.f7135c;
            int i8 = di8Var.f7133a;
            int i9 = di8Var.f7134b;
            int m19412T = it5.m19412T(i9);
            hi8VarArr = hi8VarArr2;
            i5 = it5.m19407Y(i7, i9);
            i4 = i8;
            i2 = 0;
            intValue = i7;
            intValue2 = m19412T;
        } else {
            hi8[] hi8VarArr3 = new hi8[0];
            int i10 = f92Var.f9289z;
            int i11 = it5.f13991a;
            Pair m26138a = this.f26385a.m26138a(f92Var);
            if (m26138a == null) {
                throw new hj8("Unable to configure passthrough for: ".concat(String.valueOf(f92Var)), f92Var);
            }
            i2 = 2;
            hi8VarArr = hi8VarArr3;
            intValue = ((Integer) m26138a.first).intValue();
            i3 = -1;
            intValue2 = ((Integer) m26138a.second).intValue();
            i4 = i10;
            i5 = -1;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i4, intValue2, intValue);
        uo4.m7872f(minBufferSize != -2);
        int i12 = 250000;
        if (i2 == 0) {
            m19416P = it5.m19416P(minBufferSize * 4, wl8.m6010a(250000, i4, i5), wl8.m6010a(750000, i4, i5));
        } else if (i2 != 1) {
            int i13 = 5;
            if (intValue == 5) {
                i12 = 500000;
                intValue = 5;
            } else {
                i13 = intValue;
            }
            m19416P = i47.m20126a((i12 * wl8.m6009b(intValue)) / 1000000);
            i5 = i5;
            intValue = i13;
        } else {
            m19416P = i47.m20126a((wl8.m6009b(intValue) * 50000000) / 1000000);
        }
        int max = (((Math.max(minBufferSize, m19416P) + i5) - 1) / i5) * i5;
        if (intValue == 0) {
            throw new hj8("Invalid output encoding (mode=" + i2 + ") for: " + String.valueOf(f92Var), f92Var);
        } else if (intValue2 == 0) {
            throw new hj8("Invalid output channel config (mode=" + i2 + ") for: " + String.valueOf(f92Var), f92Var);
        } else {
            this.f26382T = false;
            wk8 wk8Var = new wk8(f92Var, i3, i2, i5, i4, intValue2, intValue, max, hi8VarArr);
            if (m10192E()) {
                this.f26399o = wk8Var;
            } else {
                this.f26400p = wk8Var;
            }
        }
    }

    @Override // com.daaw.rj8
    /* renamed from: g */
    public final void mo10179g(int i) {
        if (this.f26379Q != i) {
            this.f26379Q = i;
            this.f26378P = i != 0;
            zze();
        }
    }

    @Override // com.daaw.rj8
    /* renamed from: h */
    public final boolean mo10178h(f92 f92Var) {
        return mo10185a(f92Var) != 0;
    }

    @Override // com.daaw.rj8
    /* renamed from: i */
    public final void mo10177i(sc8 sc8Var) {
        if (this.f26380R.equals(sc8Var)) {
            return;
        }
        int i = sc8Var.f26079a;
        if (this.f26401q != null) {
            int i2 = this.f26380R.f26079a;
        }
        this.f26380R = sc8Var;
    }

    @Override // com.daaw.rj8
    /* renamed from: j */
    public final void mo10176j(float f) {
        if (this.f26366D != f) {
            this.f26366D = f;
            m10195B();
        }
    }

    @Override // com.daaw.rj8
    /* renamed from: k */
    public final void mo10175k(boolean z) {
        m10196A(m10164v().f5946a, z);
    }

    @Override // com.daaw.rj8
    /* renamed from: l */
    public final void mo10174l(o98 o98Var) {
        if (this.f26402r.equals(o98Var)) {
            return;
        }
        this.f26402r = o98Var;
        zze();
    }

    @Override // com.daaw.rj8
    /* renamed from: m */
    public final void mo10173m(lj8 lj8Var) {
        this.f26398n = lj8Var;
    }

    @Override // com.daaw.rj8
    /* renamed from: n */
    public final void mo10172n(pp3 pp3Var) {
        m10196A(new pp3(it5.m19431A(pp3Var.f23131a, 0.1f, 8.0f), it5.m19431A(pp3Var.f23132b, 0.1f, 8.0f)), m10164v().f5947b);
    }

    /* renamed from: s */
    public final long m10167s() {
        wk8 wk8Var = this.f26400p;
        return wk8Var.f31302c == 0 ? this.f26406v / wk8Var.f31301b : this.f26407w;
    }

    /* renamed from: t */
    public final long m10166t() {
        wk8 wk8Var = this.f26400p;
        return wk8Var.f31302c == 0 ? this.f26408x / wk8Var.f31303d : this.f26409y;
    }

    /* renamed from: u */
    public final AudioTrack m10165u(wk8 wk8Var) {
        try {
            return wk8Var.m6026b(false, this.f26402r, this.f26379Q);
        } catch (jj8 e) {
            lj8 lj8Var = this.f26398n;
            if (lj8Var != null) {
                lj8Var.mo16898a(e);
            }
            throw e;
        }
    }

    /* renamed from: v */
    public final cl8 m10164v() {
        cl8 cl8Var = this.f26403s;
        return cl8Var != null ? cl8Var : !this.f26392h.isEmpty() ? (cl8) this.f26392h.getLast() : this.f26404t;
    }

    /* renamed from: w */
    public final void m10163w(long j) {
        pp3 pp3Var;
        boolean z;
        if (m10190G()) {
            yk8 yk8Var = this.f26384V;
            pp3Var = m10164v().f5946a;
            yk8Var.m3599c(pp3Var);
        } else {
            pp3Var = pp3.f23129d;
        }
        pp3 pp3Var2 = pp3Var;
        if (m10190G()) {
            yk8 yk8Var2 = this.f26384V;
            boolean z2 = m10164v().f5947b;
            yk8Var2.m3598d(z2);
            z = z2;
        } else {
            z = false;
        }
        this.f26392h.add(new cl8(pp3Var2, z, Math.max(0L, j), this.f26400p.m6027a(m10166t()), null));
        hi8[] hi8VarArr = this.f26400p.f31308i;
        ArrayList arrayList = new ArrayList();
        for (hi8 hi8Var : hi8VarArr) {
            if (hi8Var.zzg()) {
                arrayList.add(hi8Var);
            } else {
                hi8Var.zzc();
            }
        }
        int size = arrayList.size();
        this.f26367E = (hi8[]) arrayList.toArray(new hi8[size]);
        this.f26368F = new ByteBuffer[size];
        m10162x();
        lj8 lj8Var = this.f26398n;
        if (lj8Var != null) {
            em8.m23366x0(((cm8) lj8Var).f5958a).m24314s(z);
        }
    }

    /* renamed from: x */
    public final void m10162x() {
        int i = 0;
        while (true) {
            hi8[] hi8VarArr = this.f26367E;
            if (i >= hi8VarArr.length) {
                return;
            }
            hi8 hi8Var = hi8VarArr[i];
            hi8Var.zzc();
            this.f26368F[i] = hi8Var.zzb();
            i++;
        }
    }

    /* renamed from: y */
    public final void m10161y() {
        if (this.f26376N) {
            return;
        }
        this.f26376N = true;
        this.f26391g.m19686c(m10166t());
        this.f26401q.stop();
    }

    /* renamed from: z */
    public final void m10160z(long j) {
        ByteBuffer byteBuffer;
        int length = this.f26367E.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f26368F[i - 1];
            } else {
                byteBuffer = this.f26369G;
                if (byteBuffer == null) {
                    byteBuffer = hi8.f12557a;
                }
            }
            if (i == length) {
                m10194C(byteBuffer, j);
            } else {
                hi8 hi8Var = this.f26367E[i];
                if (i > this.f26374L) {
                    hi8Var.mo3498b(byteBuffer);
                }
                ByteBuffer zzb = hi8Var.zzb();
                this.f26368F[i] = zzb;
                if (zzb.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i--;
        }
    }

    @Override // com.daaw.rj8
    public final pp3 zzc() {
        return m10164v().f5946a;
    }

    @Override // com.daaw.rj8
    public final void zze() {
        if (m10192E()) {
            this.f26406v = 0L;
            this.f26407w = 0L;
            this.f26408x = 0L;
            this.f26409y = 0L;
            this.f26383U = false;
            this.f26410z = 0;
            this.f26404t = new cl8(m10164v().f5946a, m10164v().f5947b, 0L, 0L, null);
            this.f26365C = 0L;
            this.f26403s = null;
            this.f26392h.clear();
            this.f26369G = null;
            this.f26370H = 0;
            this.f26371I = null;
            this.f26376N = false;
            this.f26375M = false;
            this.f26374L = -1;
            this.f26387c.m27318j();
            m10162x();
            if (this.f26391g.m19681h()) {
                this.f26401q.pause();
            }
            if (m10191F(this.f26401q)) {
                ol8 ol8Var = this.f26393i;
                Objects.requireNonNull(ol8Var);
                ol8Var.m14172b(this.f26401q);
            }
            if (it5.f13991a < 21 && !this.f26378P) {
                this.f26379Q = 0;
            }
            wk8 wk8Var = this.f26399o;
            if (wk8Var != null) {
                this.f26400p = wk8Var;
                this.f26399o = null;
            }
            this.f26391g.m19685d();
            final AudioTrack audioTrack = this.f26401q;
            final ds4 ds4Var = this.f26390f;
            ds4Var.m24008c();
            synchronized (f26360W) {
                if (f26361X == null) {
                    f26361X = it5.m19379q("ExoPlayer:AudioTrackReleaseThread");
                }
                f26362Y++;
                f26361X.execute(new Runnable() { // from class: com.daaw.ok8
                    @Override // java.lang.Runnable
                    public final void run() {
                        sl8.m10169q(audioTrack, ds4Var);
                    }
                });
            }
            this.f26401q = null;
        }
        this.f26395k.m23381a();
        this.f26394j.m23381a();
    }

    @Override // com.daaw.rj8
    public final void zzf() {
        this.f26363A = true;
    }

    @Override // com.daaw.rj8
    public final void zzg() {
        this.f26377O = false;
        if (m10192E() && this.f26391g.m19678k()) {
            this.f26401q.pause();
        }
    }

    @Override // com.daaw.rj8
    public final void zzh() {
        this.f26377O = true;
        if (m10192E()) {
            this.f26391g.m19683f();
            this.f26401q.play();
        }
    }

    @Override // com.daaw.rj8
    public final void zzi() {
        if (!this.f26375M && m10192E() && m10193D()) {
            m10161y();
            this.f26375M = true;
        }
    }

    @Override // com.daaw.rj8
    public final void zzj() {
        zze();
        for (hi8 hi8Var : this.f26388d) {
            hi8Var.zzf();
        }
        hi8[] hi8VarArr = this.f26389e;
        int length = hi8VarArr.length;
        for (int i = 0; i <= 0; i++) {
            hi8VarArr[i].zzf();
        }
        this.f26377O = false;
        this.f26382T = false;
    }

    @Override // com.daaw.rj8
    public final boolean zzt() {
        return m10192E() && this.f26391g.m19682g(m10166t());
    }
}
