package com.daaw;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
/* renamed from: com.daaw.r7 */
/* loaded from: classes.dex */
public final class C2830r7 {

    /* renamed from: a */
    public final InterfaceC2831a f24905a;

    /* renamed from: b */
    public final long[] f24906b;

    /* renamed from: c */
    public AudioTrack f24907c;

    /* renamed from: d */
    public int f24908d;

    /* renamed from: e */
    public int f24909e;

    /* renamed from: f */
    public C2692q7 f24910f;

    /* renamed from: g */
    public int f24911g;

    /* renamed from: h */
    public boolean f24912h;

    /* renamed from: i */
    public long f24913i;

    /* renamed from: j */
    public long f24914j;

    /* renamed from: k */
    public long f24915k;

    /* renamed from: l */
    public Method f24916l;

    /* renamed from: m */
    public long f24917m;

    /* renamed from: n */
    public boolean f24918n;

    /* renamed from: o */
    public boolean f24919o;

    /* renamed from: p */
    public long f24920p;

    /* renamed from: q */
    public long f24921q;

    /* renamed from: r */
    public long f24922r;

    /* renamed from: s */
    public long f24923s;

    /* renamed from: t */
    public int f24924t;

    /* renamed from: u */
    public int f24925u;

    /* renamed from: v */
    public long f24926v;

    /* renamed from: w */
    public long f24927w;

    /* renamed from: x */
    public long f24928x;

    /* renamed from: y */
    public long f24929y;

    /* renamed from: com.daaw.r7$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2831a {
        /* renamed from: a */
        void mo11689a(int i, long j);

        /* renamed from: b */
        void mo11688b(long j);

        /* renamed from: c */
        void mo11687c(long j, long j2, long j3, long j4);

        /* renamed from: d */
        void mo11686d(long j, long j2, long j3, long j4);
    }

    public C2830r7(InterfaceC2831a interfaceC2831a) {
        this.f24905a = (InterfaceC2831a) C2914s6.m10686e(interfaceC2831a);
        if (sq1.f26525a >= 18) {
            try {
                this.f24916l = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f24906b = new long[10];
    }

    /* renamed from: o */
    public static boolean m11695o(int i) {
        return sq1.f26525a < 23 && (i == 5 || i == 6);
    }

    /* renamed from: a */
    public final boolean m11709a() {
        return this.f24912h && this.f24907c.getPlayState() == 2 && m11705e() == 0;
    }

    /* renamed from: b */
    public final long m11708b(long j) {
        return (j * 1000000) / this.f24911g;
    }

    /* renamed from: c */
    public int m11707c(long j) {
        return this.f24909e - ((int) (j - (m11705e() * this.f24908d)));
    }

    /* renamed from: d */
    public long m11706d(boolean z) {
        if (this.f24907c.getPlayState() == 3) {
            m11697m();
        }
        long nanoTime = System.nanoTime() / 1000;
        if (this.f24910f.m12735d()) {
            long m11708b = m11708b(this.f24910f.m12737b());
            return !this.f24910f.m12734e() ? m11708b : m11708b + (nanoTime - this.f24910f.m12736c());
        }
        long m11704f = this.f24925u == 0 ? m11704f() : nanoTime + this.f24914j;
        return !z ? m11704f - this.f24917m : m11704f;
    }

    /* renamed from: e */
    public final long m11705e() {
        if (this.f24926v != -9223372036854775807L) {
            return Math.min(this.f24929y, this.f24928x + ((((SystemClock.elapsedRealtime() * 1000) - this.f24926v) * this.f24911g) / 1000000));
        }
        int playState = this.f24907c.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & this.f24907c.getPlaybackHeadPosition();
        if (this.f24912h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f24923s = this.f24921q;
            }
            playbackHeadPosition += this.f24923s;
        }
        if (sq1.f26525a <= 28) {
            if (playbackHeadPosition == 0 && this.f24921q > 0 && playState == 3) {
                if (this.f24927w == -9223372036854775807L) {
                    this.f24927w = SystemClock.elapsedRealtime();
                }
                return this.f24921q;
            }
            this.f24927w = -9223372036854775807L;
        }
        if (this.f24921q > playbackHeadPosition) {
            this.f24922r++;
        }
        this.f24921q = playbackHeadPosition;
        return playbackHeadPosition + (this.f24922r << 32);
    }

    /* renamed from: f */
    public final long m11704f() {
        return m11708b(m11705e());
    }

    /* renamed from: g */
    public void m11703g(long j) {
        this.f24928x = m11705e();
        this.f24926v = SystemClock.elapsedRealtime() * 1000;
        this.f24929y = j;
    }

    /* renamed from: h */
    public boolean m11702h(long j) {
        return j > m11705e() || m11709a();
    }

    /* renamed from: i */
    public boolean m11701i() {
        return this.f24907c.getPlayState() == 3;
    }

    /* renamed from: j */
    public boolean m11700j(long j) {
        return this.f24927w != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f24927w >= 200;
    }

    /* renamed from: k */
    public boolean m11699k(long j) {
        InterfaceC2831a interfaceC2831a;
        int playState = this.f24907c.getPlayState();
        if (this.f24912h) {
            if (playState == 2) {
                this.f24918n = false;
                return false;
            } else if (playState == 1 && m11705e() == 0) {
                return false;
            }
        }
        boolean z = this.f24918n;
        boolean m11702h = m11702h(j);
        this.f24918n = m11702h;
        if (z && !m11702h && playState != 1 && (interfaceC2831a = this.f24905a) != null) {
            interfaceC2831a.mo11689a(this.f24909e, C1075dd.m24526b(this.f24913i));
        }
        return true;
    }

    /* renamed from: l */
    public final void m11698l(long j, long j2) {
        if (this.f24910f.m12733f(j)) {
            long m12736c = this.f24910f.m12736c();
            long m12737b = this.f24910f.m12737b();
            if (Math.abs(m12736c - j) > 5000000) {
                this.f24905a.mo11686d(m12737b, m12736c, j, j2);
            } else if (Math.abs(m11708b(m12737b) - j2) <= 5000000) {
                this.f24910f.m12738a();
                return;
            } else {
                this.f24905a.mo11687c(m12737b, m12736c, j, j2);
            }
            this.f24910f.m12732g();
        }
    }

    /* renamed from: m */
    public final void m11697m() {
        long m11704f = m11704f();
        if (m11704f == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.f24915k >= 30000) {
            long[] jArr = this.f24906b;
            int i = this.f24924t;
            jArr[i] = m11704f - nanoTime;
            this.f24924t = (i + 1) % 10;
            int i2 = this.f24925u;
            if (i2 < 10) {
                this.f24925u = i2 + 1;
            }
            this.f24915k = nanoTime;
            this.f24914j = 0L;
            int i3 = 0;
            while (true) {
                int i4 = this.f24925u;
                if (i3 >= i4) {
                    break;
                }
                this.f24914j += this.f24906b[i3] / i4;
                i3++;
            }
        }
        if (this.f24912h) {
            return;
        }
        m11698l(nanoTime, m11704f);
        m11696n(nanoTime);
    }

    /* renamed from: n */
    public final void m11696n(long j) {
        Method method;
        if (!this.f24919o || (method = this.f24916l) == null || j - this.f24920p < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) method.invoke(this.f24907c, null)).intValue() * 1000) - this.f24913i;
            this.f24917m = intValue;
            long max = Math.max(intValue, 0L);
            this.f24917m = max;
            if (max > 5000000) {
                this.f24905a.mo11688b(max);
                this.f24917m = 0L;
            }
        } catch (Exception unused) {
            this.f24916l = null;
        }
        this.f24920p = j;
    }

    /* renamed from: p */
    public boolean m11694p() {
        m11692r();
        if (this.f24926v == -9223372036854775807L) {
            this.f24910f.m12731h();
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public void m11693q() {
        m11692r();
        this.f24907c = null;
        this.f24910f = null;
    }

    /* renamed from: r */
    public final void m11692r() {
        this.f24914j = 0L;
        this.f24925u = 0;
        this.f24924t = 0;
        this.f24915k = 0L;
    }

    /* renamed from: s */
    public void m11691s(AudioTrack audioTrack, int i, int i2, int i3) {
        this.f24907c = audioTrack;
        this.f24908d = i2;
        this.f24909e = i3;
        this.f24910f = new C2692q7(audioTrack);
        this.f24911g = audioTrack.getSampleRate();
        this.f24912h = m11695o(i);
        boolean m10036I = sq1.m10036I(i);
        this.f24919o = m10036I;
        this.f24913i = m10036I ? m11708b(i3 / i2) : -9223372036854775807L;
        this.f24921q = 0L;
        this.f24922r = 0L;
        this.f24923s = 0L;
        this.f24918n = false;
        this.f24926v = -9223372036854775807L;
        this.f24927w = -9223372036854775807L;
        this.f24917m = 0L;
    }

    /* renamed from: t */
    public void m11690t() {
        this.f24910f.m12731h();
    }
}
