package com.daaw;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.Objects;
/* loaded from: classes.dex */
public final class ik8 {

    /* renamed from: A */
    public long f13727A;

    /* renamed from: B */
    public long f13728B;

    /* renamed from: C */
    public long f13729C;

    /* renamed from: D */
    public boolean f13730D;

    /* renamed from: E */
    public long f13731E;

    /* renamed from: F */
    public long f13732F;

    /* renamed from: a */
    public final xj8 f13733a;

    /* renamed from: b */
    public final long[] f13734b;

    /* renamed from: c */
    public AudioTrack f13735c;

    /* renamed from: d */
    public int f13736d;

    /* renamed from: e */
    public int f13737e;

    /* renamed from: f */
    public vj8 f13738f;

    /* renamed from: g */
    public int f13739g;

    /* renamed from: h */
    public boolean f13740h;

    /* renamed from: i */
    public long f13741i;

    /* renamed from: j */
    public float f13742j;

    /* renamed from: k */
    public boolean f13743k;

    /* renamed from: l */
    public long f13744l;

    /* renamed from: m */
    public long f13745m;

    /* renamed from: n */
    public Method f13746n;

    /* renamed from: o */
    public long f13747o;

    /* renamed from: p */
    public boolean f13748p;

    /* renamed from: q */
    public boolean f13749q;

    /* renamed from: r */
    public long f13750r;

    /* renamed from: s */
    public long f13751s;

    /* renamed from: t */
    public long f13752t;

    /* renamed from: u */
    public long f13753u;

    /* renamed from: v */
    public int f13754v;

    /* renamed from: w */
    public int f13755w;

    /* renamed from: x */
    public long f13756x;

    /* renamed from: y */
    public long f13757y;

    /* renamed from: z */
    public long f13758z;

    public ik8(xj8 xj8Var) {
        this.f13733a = xj8Var;
        int i = it5.f13991a;
        try {
            this.f13746n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f13734b = new long[10];
    }

    /* renamed from: a */
    public final int m19688a(long j) {
        return this.f13737e - ((int) (j - (m19676m() * this.f13736d)));
    }

    /* renamed from: b */
    public final long m19687b(boolean z) {
        long m19677l;
        lj8 lj8Var;
        lj8 lj8Var2;
        dj8 dj8Var;
        Method method;
        AudioTrack audioTrack;
        vj8 vj8Var;
        long m10167s;
        long m10166t;
        String str;
        long m10167s2;
        long m10166t2;
        ik8 ik8Var = this;
        AudioTrack audioTrack2 = ik8Var.f13735c;
        Objects.requireNonNull(audioTrack2);
        if (audioTrack2.getPlayState() == 3) {
            long m19677l2 = ik8Var.m19677l(m19676m());
            if (m19677l2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - ik8Var.f13745m >= 30000) {
                    long[] jArr = ik8Var.f13734b;
                    int i = ik8Var.f13754v;
                    jArr[i] = m19677l2 - nanoTime;
                    ik8Var.f13754v = (i + 1) % 10;
                    int i2 = ik8Var.f13755w;
                    if (i2 < 10) {
                        ik8Var.f13755w = i2 + 1;
                    }
                    ik8Var.f13745m = nanoTime;
                    ik8Var.f13744l = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = ik8Var.f13755w;
                        if (i3 >= i4) {
                            break;
                        }
                        ik8Var.f13744l += ik8Var.f13734b[i3] / i4;
                        i3++;
                    }
                }
                if (!ik8Var.f13740h) {
                    vj8 vj8Var2 = ik8Var.f13738f;
                    Objects.requireNonNull(vj8Var2);
                    if (vj8Var2.m7102g(nanoTime)) {
                        long m7107b = vj8Var2.m7107b();
                        long m7108a = vj8Var2.m7108a();
                        if (Math.abs(m7107b - nanoTime) > 5000000) {
                            il8 il8Var = (il8) ik8Var.f13733a;
                            m10167s2 = il8Var.f13778a.m10167s();
                            m10166t2 = il8Var.f13778a.m10166t();
                            StringBuilder sb = new StringBuilder();
                            vj8Var = vj8Var2;
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(m7108a);
                            sb.append(", ");
                            sb.append(m7107b);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(m19677l2);
                            sb.append(", ");
                            sb.append(m10167s2);
                            sb.append(", ");
                            sb.append(m10166t2);
                            str = sb.toString();
                        } else {
                            vj8Var = vj8Var2;
                            if (Math.abs(ik8Var.m19677l(m7108a) - m19677l2) > 5000000) {
                                il8 il8Var2 = (il8) ik8Var.f13733a;
                                m10167s = il8Var2.f13778a.m10167s();
                                m10166t = il8Var2.f13778a.m10166t();
                                str = "Spurious audio timestamp (frame position mismatch): " + m7108a + ", " + m7107b + ", " + nanoTime + ", " + m19677l2 + ", " + m10167s + ", " + m10166t;
                            } else {
                                vj8Var.m7106c();
                                ik8Var = this;
                            }
                        }
                        s95.m10493e("DefaultAudioSink", str);
                        vj8Var.m7105d();
                        ik8Var = this;
                    }
                    if (ik8Var.f13749q && (method = ik8Var.f13746n) != null && nanoTime - ik8Var.f13750r >= 500000) {
                        try {
                            Objects.requireNonNull(ik8Var.f13735c);
                            int i5 = it5.f13991a;
                            long intValue = (((Integer) method.invoke(audioTrack, new Object[0])).intValue() * 1000) - ik8Var.f13741i;
                            ik8Var.f13747o = intValue;
                            long max = Math.max(intValue, 0L);
                            ik8Var.f13747o = max;
                            if (max > 5000000) {
                                s95.m10493e("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                                ik8Var.f13747o = 0L;
                            }
                        } catch (Exception unused) {
                            ik8Var.f13746n = null;
                        }
                        ik8Var.f13750r = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        vj8 vj8Var3 = ik8Var.f13738f;
        Objects.requireNonNull(vj8Var3);
        boolean m7103f = vj8Var3.m7103f();
        if (m7103f) {
            m19677l = ik8Var.m19677l(vj8Var3.m7108a()) + it5.m19400c0(nanoTime2 - vj8Var3.m7107b(), ik8Var.f13742j);
        } else {
            m19677l = ik8Var.f13755w == 0 ? ik8Var.m19677l(m19676m()) : ik8Var.f13744l + nanoTime2;
            if (!z) {
                m19677l = Math.max(0L, m19677l - ik8Var.f13747o);
            }
        }
        if (ik8Var.f13730D != m7103f) {
            ik8Var.f13732F = ik8Var.f13729C;
            ik8Var.f13731E = ik8Var.f13728B;
        }
        long j = nanoTime2 - ik8Var.f13732F;
        if (j < 1000000) {
            long j2 = (j * 1000) / 1000000;
            m19677l = ((m19677l * j2) + ((1000 - j2) * (ik8Var.f13731E + it5.m19400c0(j, ik8Var.f13742j)))) / 1000;
        }
        if (!ik8Var.f13743k) {
            long j3 = ik8Var.f13728B;
            if (m19677l > j3) {
                ik8Var.f13743k = true;
                long currentTimeMillis = System.currentTimeMillis() - it5.m19386j0(it5.m19396e0(it5.m19386j0(m19677l - j3), ik8Var.f13742j));
                sl8 sl8Var = ((il8) ik8Var.f13733a).f13778a;
                lj8Var = sl8Var.f26398n;
                if (lj8Var != null) {
                    lj8Var2 = sl8Var.f26398n;
                    dj8Var = ((cm8) lj8Var2).f5958a.f8578R0;
                    dj8Var.m24315r(currentTimeMillis);
                }
            }
        }
        ik8Var.f13729C = nanoTime2;
        ik8Var.f13728B = m19677l;
        ik8Var.f13730D = m7103f;
        return m19677l;
    }

    /* renamed from: c */
    public final void m19686c(long j) {
        this.f13758z = m19676m();
        this.f13756x = SystemClock.elapsedRealtime() * 1000;
        this.f13727A = j;
    }

    /* renamed from: d */
    public final void m19685d() {
        m19675n();
        this.f13735c = null;
        this.f13738f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m19684e(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.f13735c = audioTrack;
        this.f13736d = i2;
        this.f13737e = i3;
        this.f13738f = new vj8(audioTrack);
        this.f13739g = audioTrack.getSampleRate();
        boolean z2 = true;
        if (z && it5.f13991a < 23) {
            if (i != 5) {
                if (i == 6) {
                    i = 6;
                }
            }
            this.f13740h = z2;
            boolean m19374v = it5.m19374v(i);
            this.f13749q = m19374v;
            this.f13741i = !m19374v ? m19677l(i3 / i2) : -9223372036854775807L;
            this.f13751s = 0L;
            this.f13752t = 0L;
            this.f13753u = 0L;
            this.f13748p = false;
            this.f13756x = -9223372036854775807L;
            this.f13757y = -9223372036854775807L;
            this.f13750r = 0L;
            this.f13747o = 0L;
            this.f13742j = 1.0f;
        }
        z2 = false;
        this.f13740h = z2;
        boolean m19374v2 = it5.m19374v(i);
        this.f13749q = m19374v2;
        this.f13741i = !m19374v2 ? m19677l(i3 / i2) : -9223372036854775807L;
        this.f13751s = 0L;
        this.f13752t = 0L;
        this.f13753u = 0L;
        this.f13748p = false;
        this.f13756x = -9223372036854775807L;
        this.f13757y = -9223372036854775807L;
        this.f13750r = 0L;
        this.f13747o = 0L;
        this.f13742j = 1.0f;
    }

    /* renamed from: f */
    public final void m19683f() {
        vj8 vj8Var = this.f13738f;
        Objects.requireNonNull(vj8Var);
        vj8Var.m7104e();
    }

    /* renamed from: g */
    public final boolean m19682g(long j) {
        if (j <= m19676m()) {
            if (this.f13740h) {
                AudioTrack audioTrack = this.f13735c;
                Objects.requireNonNull(audioTrack);
                return audioTrack.getPlayState() == 2 && m19676m() == 0;
            }
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean m19681h() {
        AudioTrack audioTrack = this.f13735c;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    /* renamed from: i */
    public final boolean m19680i(long j) {
        return this.f13757y != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f13757y >= 200;
    }

    /* renamed from: j */
    public final boolean m19679j(long j) {
        lj8 lj8Var;
        long j2;
        lj8 lj8Var2;
        dj8 dj8Var;
        AudioTrack audioTrack = this.f13735c;
        Objects.requireNonNull(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.f13740h) {
            if (playState == 2) {
                this.f13748p = false;
                return false;
            } else if (playState == 1) {
                if (m19676m() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.f13748p;
        boolean m19682g = m19682g(j);
        this.f13748p = m19682g;
        if (z && !m19682g && playState != 1) {
            xj8 xj8Var = this.f13733a;
            int i = this.f13737e;
            long m19386j0 = it5.m19386j0(this.f13741i);
            il8 il8Var = (il8) xj8Var;
            lj8Var = il8Var.f13778a.f26398n;
            if (lj8Var != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                sl8 sl8Var = il8Var.f13778a;
                j2 = sl8Var.f26381S;
                lj8Var2 = sl8Var.f26398n;
                dj8Var = ((cm8) lj8Var2).f5958a.f8578R0;
                dj8Var.m24313t(i, m19386j0, elapsedRealtime - j2);
            }
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m19678k() {
        m19675n();
        if (this.f13756x == -9223372036854775807L) {
            vj8 vj8Var = this.f13738f;
            Objects.requireNonNull(vj8Var);
            vj8Var.m7104e();
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final long m19677l(long j) {
        return (j * 1000000) / this.f13739g;
    }

    /* renamed from: m */
    public final long m19676m() {
        AudioTrack audioTrack = this.f13735c;
        Objects.requireNonNull(audioTrack);
        if (this.f13756x != -9223372036854775807L) {
            return Math.min(this.f13727A, this.f13758z + ((((SystemClock.elapsedRealtime() * 1000) - this.f13756x) * this.f13739g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        long j = 0;
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f13740h) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.f13753u = this.f13751s;
                }
                playState = 2;
            }
            playbackHeadPosition += this.f13753u;
        }
        if (it5.f13991a <= 29) {
            if (playbackHeadPosition != 0) {
                j = playbackHeadPosition;
            } else if (this.f13751s > 0 && playState == 3) {
                if (this.f13757y == -9223372036854775807L) {
                    this.f13757y = SystemClock.elapsedRealtime();
                }
                return this.f13751s;
            }
            this.f13757y = -9223372036854775807L;
            playbackHeadPosition = j;
        }
        if (this.f13751s > playbackHeadPosition) {
            this.f13752t++;
        }
        this.f13751s = playbackHeadPosition;
        return playbackHeadPosition + (this.f13752t << 32);
    }

    /* renamed from: n */
    public final void m19675n() {
        this.f13744l = 0L;
        this.f13755w = 0;
        this.f13754v = 0;
        this.f13745m = 0L;
        this.f13729C = 0L;
        this.f13732F = 0L;
        this.f13743k = false;
    }
}
