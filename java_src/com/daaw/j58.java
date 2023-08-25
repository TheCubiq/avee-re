package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzbq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class j58 extends gf8 {

    /* renamed from: j0 */
    public static final /* synthetic */ int f14373j0 = 0;

    /* renamed from: A */
    public final cb8 f14374A;

    /* renamed from: B */
    public final long f14375B;

    /* renamed from: C */
    public int f14376C;

    /* renamed from: D */
    public int f14377D;

    /* renamed from: E */
    public boolean f14378E;

    /* renamed from: F */
    public int f14379F;

    /* renamed from: G */
    public aa8 f14380G;

    /* renamed from: H */
    public lu3 f14381H;

    /* renamed from: I */
    public gc3 f14382I;

    /* renamed from: J */
    public gc3 f14383J;

    /* renamed from: K */
    public f92 f14384K;

    /* renamed from: L */
    public f92 f14385L;

    /* renamed from: M */
    public AudioTrack f14386M;

    /* renamed from: N */
    public Object f14387N;

    /* renamed from: O */
    public Surface f14388O;

    /* renamed from: P */
    public int f14389P;

    /* renamed from: Q */
    public int f14390Q;

    /* renamed from: R */
    public int f14391R;

    /* renamed from: S */
    public ql7 f14392S;

    /* renamed from: T */
    public ql7 f14393T;

    /* renamed from: U */
    public int f14394U;

    /* renamed from: V */
    public o98 f14395V;

    /* renamed from: W */
    public float f14396W;

    /* renamed from: X */
    public boolean f14397X;

    /* renamed from: Y */
    public rn4 f14398Y;

    /* renamed from: Z */
    public boolean f14399Z;

    /* renamed from: a0 */
    public boolean f14400a0;

    /* renamed from: b */
    public final fw8 f14401b;

    /* renamed from: b0 */
    public is8 f14402b0;

    /* renamed from: c */
    public final lu3 f14403c;

    /* renamed from: c0 */
    public ll4 f14404c0;

    /* renamed from: d */
    public final ds4 f14405d;

    /* renamed from: d0 */
    public gc3 f14406d0;

    /* renamed from: e */
    public final Context f14407e;

    /* renamed from: e0 */
    public q88 f14408e0;

    /* renamed from: f */
    public final ty3 f14409f;

    /* renamed from: f0 */
    public int f14410f0;

    /* renamed from: g */
    public final i98[] f14411g;

    /* renamed from: g0 */
    public long f14412g0;

    /* renamed from: h */
    public final zv8 f14413h;

    /* renamed from: h0 */
    public final x38 f14414h0;

    /* renamed from: i */
    public final vz4 f14415i;

    /* renamed from: i0 */
    public wt8 f14416i0;

    /* renamed from: j */
    public final u68 f14417j;

    /* renamed from: k */
    public final k65 f14418k;

    /* renamed from: l */
    public final CopyOnWriteArraySet f14419l;

    /* renamed from: m */
    public final d34 f14420m;

    /* renamed from: n */
    public final List f14421n;

    /* renamed from: o */
    public final boolean f14422o;

    /* renamed from: p */
    public final or8 f14423p;

    /* renamed from: q */
    public final fb8 f14424q;

    /* renamed from: r */
    public final Looper f14425r;

    /* renamed from: s */
    public final mw8 f14426s;

    /* renamed from: t */
    public final xp4 f14427t;

    /* renamed from: u */
    public final y48 f14428u;

    /* renamed from: v */
    public final d58 f14429v;

    /* renamed from: w */
    public final ye7 f14430w;

    /* renamed from: x */
    public final kj7 f14431x;

    /* renamed from: y */
    public final wa8 f14432y;

    /* renamed from: z */
    public final za8 f14433z;

    static {
        k63.m18024b("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.daaw.lw8, com.daaw.fb8, java.lang.Object] */
    @SuppressLint({"HandlerLeak"})
    public j58(d18 d18Var, ty3 ty3Var) {
        int m19413S;
        j58 j58Var = this;
        ds4 ds4Var = new ds4(xp4.f32865a);
        j58Var.f14405d = ds4Var;
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = it5.f13995e;
            s95.m10494d("ExoPlayerImpl", "Init " + hexString + " [AndroidXMedia3/1.0.0-beta02] [" + str + "]");
            Context applicationContext = d18Var.f6371a.getApplicationContext();
            j58Var.f14407e = applicationContext;
            ?? apply = d18Var.f6378h.apply(d18Var.f6372b);
            j58Var.f14424q = apply;
            j58Var.f14395V = d18Var.f6380j;
            j58Var.f14389P = d18Var.f6381k;
            j58Var.f14397X = false;
            j58Var.f14375B = d18Var.f6385o;
            y48 y48Var = new y48(j58Var, null);
            j58Var.f14428u = y48Var;
            d58 d58Var = new d58(null);
            j58Var.f14429v = d58Var;
            Handler handler = new Handler(d18Var.f6379i);
            i98[] m21900a = ((gz7) d18Var.f6373c).f11898p.m21900a(handler, y48Var, y48Var, y48Var, y48Var);
            j58Var.f14411g = m21900a;
            int length = m21900a.length;
            zv8 zv8Var = (zv8) d18Var.f6375e.zza();
            j58Var.f14413h = zv8Var;
            j58Var.f14423p = d18.m24797a(((j08) d18Var.f6374d).f14168p);
            qw8 m12008d = qw8.m12008d(((x08) d18Var.f6377g).f31725p);
            j58Var.f14426s = m12008d;
            j58Var.f14422o = d18Var.f6382l;
            j58Var.f14380G = d18Var.f6383m;
            Looper looper = d18Var.f6379i;
            j58Var.f14425r = looper;
            xp4 xp4Var = d18Var.f6372b;
            j58Var.f14427t = xp4Var;
            j58Var.f14409f = ty3Var;
            k65 k65Var = new k65(looper, xp4Var, new e45() { // from class: com.daaw.u38
                @Override // com.daaw.e45
                /* renamed from: a */
                public final void mo8306a(Object obj, r32 r32Var) {
                    mv3 mv3Var = (mv3) obj;
                }
            });
            j58Var.f14418k = k65Var;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            j58Var.f14419l = copyOnWriteArraySet;
            j58Var.f14421n = new ArrayList();
            j58Var.f14416i0 = new wt8(0);
            int length2 = m21900a.length;
            fw8 fw8Var = new fw8(new x98[2], new tv8[2], ni4.f20135b, null);
            j58Var.f14401b = fw8Var;
            j58Var.f14420m = new d34();
            ls3 ls3Var = new ls3();
            ls3Var.m16607c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28);
            zv8Var.mo1833c();
            ls3Var.m16606d(29, true);
            lu3 m16605e = ls3Var.m16605e();
            j58Var.f14403c = m16605e;
            ls3 ls3Var2 = new ls3();
            ls3Var2.m16608b(m16605e);
            ls3Var2.m16609a(4);
            ls3Var2.m16609a(10);
            j58Var.f14381H = ls3Var2.m16605e();
            j58Var.f14415i = xp4Var.mo4854a(looper, null);
            x38 x38Var = new x38(j58Var);
            j58Var.f14414h0 = x38Var;
            j58Var.f14408e0 = q88.m12701g(fw8Var);
            apply.mo9154R(ty3Var, looper);
            int i = it5.f13991a;
            lh8 lh8Var = i < 31 ? new lh8() : d48.m24644a(applicationContext, j58Var, d18Var.f6386p);
            d78 d78Var = (d78) d18Var.f6376f.zza();
            aa8 aa8Var = j58Var.f14380G;
            try {
                j58Var = this;
                j58Var.f14417j = new u68(m21900a, zv8Var, fw8Var, d78Var, m12008d, 0, false, apply, aa8Var, d18Var.f6388r, d18Var.f6384n, false, looper, xp4Var, x38Var, lh8Var, null);
                j58Var.f14396W = 1.0f;
                gc3 gc3Var = gc3.f11048v;
                j58Var.f14382I = gc3Var;
                j58Var.f14383J = gc3Var;
                j58Var.f14406d0 = gc3Var;
                j58Var.f14410f0 = -1;
                if (i < 21) {
                    AudioTrack audioTrack = j58Var.f14386M;
                    if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                        j58Var.f14386M.release();
                        j58Var.f14386M = null;
                    }
                    if (j58Var.f14386M == null) {
                        j58Var.f14386M = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                    }
                    m19413S = j58Var.f14386M.getAudioSessionId();
                } else {
                    m19413S = it5.m19413S(applicationContext);
                }
                j58Var.f14394U = m19413S;
                j58Var.f14398Y = rn4.f25423b;
                j58Var.f14399Z = true;
                Objects.requireNonNull(apply);
                k65Var.m18022b(apply);
                m12008d.mo12009c(new Handler(looper), apply);
                copyOnWriteArraySet.add(y48Var);
                j58Var.f14430w = new ye7(d18Var.f6371a, handler, y48Var);
                j58Var.f14431x = new kj7(d18Var.f6371a, handler, y48Var);
                it5.m19376t(null, null);
                wa8 wa8Var = new wa8(d18Var.f6371a, handler, y48Var);
                j58Var.f14432y = wa8Var;
                int i2 = j58Var.f14395V.f21187a;
                wa8Var.m6257f(3);
                j58Var.f14433z = new za8(d18Var.f6371a);
                j58Var.f14374A = new cb8(d18Var.f6371a);
                j58Var.f14402b0 = m18839M(wa8Var);
                j58Var.f14404c0 = ll4.f17520e;
                zv8Var.mo1834b(j58Var.f14395V);
                j58Var.m18835Q(1, 10, Integer.valueOf(j58Var.f14394U));
                j58Var.m18835Q(2, 10, Integer.valueOf(j58Var.f14394U));
                j58Var.m18835Q(1, 3, j58Var.f14395V);
                j58Var.m18835Q(2, 4, Integer.valueOf(j58Var.f14389P));
                j58Var.m18835Q(2, 5, 0);
                j58Var.m18835Q(1, 9, Boolean.valueOf(j58Var.f14397X));
                j58Var.m18835Q(2, 7, d58Var);
                j58Var.m18835Q(6, 8, d58Var);
                ds4Var.m24006e();
            } catch (Throwable th) {
                th = th;
                j58Var = this;
                j58Var.f14405d.m24006e();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: H */
    public static int m18844H(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    /* renamed from: J */
    public static long m18842J(q88 q88Var) {
        i54 i54Var = new i54();
        d34 d34Var = new d34();
        q88Var.f23759a.mo13467n(q88Var.f23760b.f18805a, d34Var);
        long j = q88Var.f23761c;
        if (j == -9223372036854775807L) {
            long j2 = q88Var.f23759a.mo1923e(d34Var.f6450c, i54Var, 0L).f13277k;
            return 0L;
        }
        return j;
    }

    /* renamed from: M */
    public static is8 m18839M(wa8 wa8Var) {
        return new is8(0, wa8Var.m6261b(), wa8Var.m6262a());
    }

    /* renamed from: Y */
    public static boolean m18827Y(q88 q88Var) {
        return q88Var.f23763e == 3 && q88Var.f23770l && q88Var.f23771m == 0;
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ wa8 m18822c(j58 j58Var) {
        return j58Var.f14432y;
    }

    /* renamed from: d0 */
    public static /* bridge */ /* synthetic */ is8 m18819d0(j58 j58Var) {
        return j58Var.f14402b0;
    }

    /* renamed from: e0 */
    public static /* bridge */ /* synthetic */ is8 m18817e0(wa8 wa8Var) {
        return m18839M(wa8Var);
    }

    /* renamed from: f0 */
    public static /* bridge */ /* synthetic */ k65 m18815f0(j58 j58Var) {
        return j58Var.f14418k;
    }

    /* renamed from: h */
    public static /* bridge */ /* synthetic */ void m18813h(j58 j58Var, is8 is8Var) {
        j58Var.f14402b0 = is8Var;
    }

    /* renamed from: o */
    public static /* bridge */ /* synthetic */ void m18806o(j58 j58Var, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        j58Var.m18833S(surface);
        j58Var.f14388O = surface;
    }

    /* renamed from: A */
    public final void m18851A(rr8 rr8Var) {
        m18828X();
        List singletonList = Collections.singletonList(rr8Var);
        m18828X();
        m18828X();
        m18845G();
        zzl();
        this.f14376C++;
        if (!this.f14421n.isEmpty()) {
            int size = this.f14421n.size();
            for (int i = size - 1; i >= 0; i--) {
                this.f14421n.remove(i);
            }
            this.f14416i0 = this.f14416i0.m5795h(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < singletonList.size(); i2++) {
            h88 h88Var = new h88((rr8) singletonList.get(i2), this.f14422o);
            arrayList.add(h88Var);
            this.f14421n.add(i2, new g58(h88Var.f12185b, h88Var.f12184a.m17448I()));
        }
        this.f14416i0 = this.f14416i0.m5796g(0, arrayList.size());
        c98 c98Var = new c98(this.f14421n, this.f14416i0, null);
        if (!c98Var.m17121o() && c98Var.mo4509c() < 0) {
            throw new na2(c98Var, -1, -9223372036854775807L);
        }
        int mo4800g = c98Var.mo4800g(false);
        q88 m18838N = m18838N(this.f14408e0, c98Var, m18840L(c98Var, mo4800g, -9223372036854775807L));
        int i3 = m18838N.f23763e;
        if (mo4800g != -1 && i3 != 1) {
            i3 = (c98Var.m17121o() || mo4800g >= c98Var.mo4509c()) ? 4 : 2;
        }
        q88 m12703e = m18838N.m12703e(i3);
        this.f14417j.m8519Z(arrayList, mo4800g, it5.m19394f0(-9223372036854775807L), this.f14416i0);
        m18830V(m12703e, 0, 1, false, (this.f14408e0.f23760b.f18805a.equals(m12703e.f23760b.f18805a) || this.f14408e0.f23759a.m17121o()) ? false : true, 4, m18843I(m12703e), -1, false);
    }

    /* renamed from: B */
    public final void m18850B(boolean z) {
        m18828X();
        int m17693b = this.f14431x.m17693b(z, zzh());
        m18831U(z, m17693b, m18844H(z, m17693b));
    }

    /* renamed from: C */
    public final void m18849C(Surface surface) {
        m18828X();
        m18833S(surface);
        int i = surface == null ? 0 : -1;
        m18836P(i, i);
    }

    /* renamed from: D */
    public final void m18848D(float f) {
        m18828X();
        final float m19431A = it5.m19431A(f, 0.0f, 1.0f);
        if (this.f14396W == m19431A) {
            return;
        }
        this.f14396W = m19431A;
        m18834R();
        k65 k65Var = this.f14418k;
        k65Var.m18020d(22, new c35() { // from class: com.daaw.o38
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                float f2 = m19431A;
                int i = j58.f14373j0;
                ((mv3) obj).mo9117y(f2);
            }
        });
        k65Var.m18021c();
    }

    /* renamed from: E */
    public final void m18847E() {
        m18828X();
        m18828X();
        this.f14431x.m17693b(zzq(), 1);
        m18832T(false, null);
        this.f14398Y = new rn4(y17.m4260u(), this.f14408e0.f23776r);
    }

    /* renamed from: G */
    public final int m18845G() {
        if (this.f14408e0.f23759a.m17121o()) {
            return this.f14410f0;
        }
        q88 q88Var = this.f14408e0;
        return q88Var.f23759a.mo13467n(q88Var.f23760b.f18805a, this.f14420m).f6450c;
    }

    /* renamed from: I */
    public final long m18843I(q88 q88Var) {
        if (q88Var.f23759a.m17121o()) {
            return it5.m19394f0(this.f14412g0);
        }
        if (q88Var.f23760b.m16079b()) {
            return q88Var.f23776r;
        }
        l64 l64Var = q88Var.f23759a;
        pr8 pr8Var = q88Var.f23760b;
        long j = q88Var.f23776r;
        m18841K(l64Var, pr8Var, j);
        return j;
    }

    /* renamed from: K */
    public final long m18841K(l64 l64Var, pr8 pr8Var, long j) {
        l64Var.mo13467n(pr8Var.f18805a, this.f14420m);
        return j;
    }

    /* renamed from: L */
    public final Pair m18840L(l64 l64Var, int i, long j) {
        if (l64Var.m17121o()) {
            this.f14410f0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f14412g0 = j;
            return null;
        }
        if (i == -1 || i >= l64Var.mo4509c()) {
            i = l64Var.mo4800g(false);
            long j2 = l64Var.mo1923e(i, this.f11157a, 0L).f13277k;
            j = it5.m19386j0(0L);
        }
        return l64Var.m17123l(this.f11157a, this.f14420m, i, it5.m19394f0(j));
    }

    /* renamed from: N */
    public final q88 m18838N(q88 q88Var, l64 l64Var, Pair pair) {
        long j;
        q88 m12706b;
        uo4.m7874d(l64Var.m17121o() || pair != null);
        l64 l64Var2 = q88Var.f23759a;
        q88 m12702f = q88Var.m12702f(l64Var);
        if (l64Var.m17121o()) {
            pr8 m12700h = q88.m12700h();
            long m19394f0 = it5.m19394f0(this.f14412g0);
            q88 m12707a = m12702f.m12706b(m12700h, m19394f0, m19394f0, m19394f0, 0L, au8.f3666d, this.f14401b, y17.m4260u()).m12707a(m12700h);
            m12707a.f23774p = m12707a.f23776r;
            return m12707a;
        }
        Object obj = m12702f.f23760b.f18805a;
        int i = it5.f13991a;
        boolean z = !obj.equals(pair.first);
        pr8 pr8Var = z ? new pr8(pair.first) : m12702f.f23760b;
        long longValue = ((Long) pair.second).longValue();
        long m19394f02 = it5.m19394f0(zzk());
        if (!l64Var2.m17121o()) {
            l64Var2.mo13467n(obj, this.f14420m);
        }
        if (z || longValue < m19394f02) {
            uo4.m7872f(!pr8Var.m16079b());
            q88 m12707a2 = m12702f.m12706b(pr8Var, longValue, longValue, longValue, 0L, z ? au8.f3666d : m12702f.f23766h, z ? this.f14401b : m12702f.f23767i, z ? y17.m4260u() : m12702f.f23768j).m12707a(pr8Var);
            m12707a2.f23774p = longValue;
            return m12707a2;
        }
        if (longValue == m19394f02) {
            int mo4511a = l64Var.mo4511a(m12702f.f23769k.f18805a);
            if (mo4511a != -1 && l64Var.mo1924d(mo4511a, this.f14420m, false).f6450c == l64Var.mo13467n(pr8Var.f18805a, this.f14420m).f6450c) {
                return m12702f;
            }
            l64Var.mo13467n(pr8Var.f18805a, this.f14420m);
            j = pr8Var.m16079b() ? this.f14420m.m24722g(pr8Var.f18806b, pr8Var.f18807c) : this.f14420m.f6451d;
            m12706b = m12702f.m12706b(pr8Var, m12702f.f23776r, m12702f.f23776r, m12702f.f23762d, j - m12702f.f23776r, m12702f.f23766h, m12702f.f23767i, m12702f.f23768j).m12707a(pr8Var);
        } else {
            uo4.m7872f(!pr8Var.m16079b());
            long max = Math.max(0L, m12702f.f23775q - (longValue - m19394f02));
            j = m12702f.f23774p;
            if (m12702f.f23769k.equals(m12702f.f23760b)) {
                j = longValue + max;
            }
            m12706b = m12702f.m12706b(pr8Var, longValue, longValue, longValue, max, m12702f.f23766h, m12702f.f23767i, m12702f.f23768j);
        }
        m12706b.f23774p = j;
        return m12706b;
    }

    /* renamed from: O */
    public final z88 m18837O(w88 w88Var) {
        int m18845G = m18845G();
        u68 u68Var = this.f14417j;
        return new z88(u68Var, w88Var, this.f14408e0.f23759a, m18845G == -1 ? 0 : m18845G, this.f14427t, u68Var.m8529P());
    }

    /* renamed from: P */
    public final void m18836P(final int i, final int i2) {
        if (i == this.f14390Q && i2 == this.f14391R) {
            return;
        }
        this.f14390Q = i;
        this.f14391R = i2;
        k65 k65Var = this.f14418k;
        k65Var.m18020d(24, new c35() { // from class: com.daaw.j18
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                int i3 = i;
                int i4 = i2;
                int i5 = j58.f14373j0;
                ((mv3) obj).mo9120v(i3, i4);
            }
        });
        k65Var.m18021c();
    }

    /* renamed from: Q */
    public final void m18835Q(int i, int i2, Object obj) {
        i98[] i98VarArr = this.f14411g;
        int length = i98VarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            i98 i98Var = i98VarArr[i3];
            if (i98Var.zzb() == i) {
                z88 m18837O = m18837O(i98Var);
                m18837O.m2604f(i2);
                m18837O.m2605e(obj);
                m18837O.m2606d();
            }
        }
    }

    /* renamed from: R */
    public final void m18834R() {
        m18835Q(1, 2, Float.valueOf(this.f14396W * this.f14431x.m17694a()));
    }

    /* renamed from: S */
    public final void m18833S(Object obj) {
        boolean z;
        ArrayList<z88> arrayList = new ArrayList();
        i98[] i98VarArr = this.f14411g;
        int length = i98VarArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= 2) {
                break;
            }
            i98 i98Var = i98VarArr[i];
            if (i98Var.zzb() == 2) {
                z88 m18837O = m18837O(i98Var);
                m18837O.m2604f(1);
                m18837O.m2605e(obj);
                m18837O.m2606d();
                arrayList.add(m18837O);
            }
            i++;
        }
        Object obj2 = this.f14387N;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                for (z88 z88Var : arrayList) {
                    z88Var.m2601i(this.f14375B);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.f14387N;
            Surface surface = this.f14388O;
            if (obj3 == surface) {
                surface.release();
                this.f14388O = null;
            }
        }
        this.f14387N = obj;
        if (z) {
            m18832T(false, vu7.m6771d(new x68(3), 1003));
        }
    }

    /* renamed from: T */
    public final void m18832T(boolean z, vu7 vu7Var) {
        q88 q88Var = this.f14408e0;
        q88 m12707a = q88Var.m12707a(q88Var.f23760b);
        m12707a.f23774p = m12707a.f23776r;
        m12707a.f23775q = 0L;
        q88 m12703e = m12707a.m12703e(1);
        if (vu7Var != null) {
            m12703e = m12703e.m12704d(vu7Var);
        }
        q88 q88Var2 = m12703e;
        this.f14376C++;
        this.f14417j.m8521X();
        m18830V(q88Var2, 0, 1, false, q88Var2.f23759a.m17121o() && !this.f14408e0.f23759a.m17121o(), 4, m18843I(q88Var2), -1, false);
    }

    /* renamed from: U */
    public final void m18831U(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        q88 q88Var = this.f14408e0;
        if (q88Var.f23770l == z2 && q88Var.f23771m == i3) {
            return;
        }
        this.f14376C++;
        q88 m12705c = q88Var.m12705c(z2, i3);
        this.f14417j.m8522W(z2, i3);
        m18830V(m12705c, 0, i2, false, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:225:0x0216, code lost:
        if (r4 != false) goto L36;
     */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m18830V(final q88 q88Var, final int i, final int i2, boolean z, boolean z2, final int i3, long j, int i4, boolean z3) {
        Pair pair;
        int i5;
        final f53 f53Var;
        boolean z4;
        int i6;
        Object obj;
        f53 f53Var2;
        Object obj2;
        int i7;
        long j2;
        long j3;
        Object obj3;
        f53 f53Var3;
        Object obj4;
        int i8;
        q88 q88Var2 = this.f14408e0;
        this.f14408e0 = q88Var;
        boolean z5 = !q88Var2.f23759a.equals(q88Var.f23759a);
        l64 l64Var = q88Var2.f23759a;
        l64 l64Var2 = q88Var.f23759a;
        int i9 = 0;
        if (l64Var2.m17121o() && l64Var.m17121o()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (l64Var2.m17121o() != l64Var.m17121o()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (l64Var.mo1923e(l64Var.mo13467n(q88Var2.f23760b.f18805a, this.f14420m).f6450c, this.f11157a, 0L).f13267a.equals(l64Var2.mo1923e(l64Var2.mo13467n(q88Var.f23760b.f18805a, this.f14420m).f6450c, this.f11157a, 0L).f13267a)) {
            pair = (z2 && i3 == 0 && q88Var2.f23760b.f18808d < q88Var.f23760b.f18808d) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z2 && i3 == 0) {
                i5 = 1;
            } else if (z2 && i3 == 1) {
                i5 = 2;
            } else if (!z5) {
                throw new IllegalStateException();
            } else {
                i5 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i5));
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue = ((Integer) pair.second).intValue();
        gc3 gc3Var = this.f14382I;
        if (booleanValue) {
            f53Var = !q88Var.f23759a.m17121o() ? q88Var.f23759a.mo1923e(q88Var.f23759a.mo13467n(q88Var.f23760b.f18805a, this.f14420m).f6450c, this.f11157a, 0L).f13268b : null;
            this.f14406d0 = gc3.f11048v;
        } else {
            f53Var = null;
        }
        if (booleanValue || !q88Var2.f23768j.equals(q88Var.f23768j)) {
            x93 m21755a = this.f14406d0.m21755a();
            List list = q88Var.f23768j;
            int i10 = 0;
            while (i10 < list.size()) {
                zzbq zzbqVar = (zzbq) list.get(i10);
                while (i9 < zzbqVar.m1103a()) {
                    zzbqVar.m1102b(i9).mo1104f(m21755a);
                    i9++;
                }
                i10++;
                i9 = 0;
            }
            this.f14406d0 = m21755a.m5403L();
            l64 zzn = zzn();
            if (zzn.m17121o()) {
                gc3Var = this.f14406d0;
            } else {
                f53 f53Var4 = zzn.mo1923e(zzf(), this.f11157a, 0L).f13268b;
                x93 m21755a2 = this.f14406d0.m21755a();
                m21755a2.m5381r(f53Var4.f9122e);
                gc3Var = m21755a2.m5403L();
            }
        }
        boolean z6 = !gc3Var.equals(this.f14382I);
        this.f14382I = gc3Var;
        boolean z7 = q88Var2.f23770l != q88Var.f23770l;
        boolean z8 = q88Var2.f23763e != q88Var.f23763e;
        if (z8 || z7) {
            m18829W();
        }
        boolean z9 = q88Var2.f23765g != q88Var.f23765g;
        if (z5) {
            this.f14418k.m18020d(0, new c35() { // from class: com.daaw.m18
                @Override // com.daaw.c35
                public final void zza(Object obj5) {
                    q88 q88Var3 = q88.this;
                    int i11 = i;
                    int i12 = j58.f14373j0;
                    ((mv3) obj5).mo9158M(q88Var3.f23759a, i11);
                }
            });
        }
        if (z2) {
            d34 d34Var = new d34();
            if (q88Var2.f23759a.m17121o()) {
                z4 = z9;
                i6 = i4;
                obj = null;
                f53Var2 = null;
                obj2 = null;
                i7 = -1;
            } else {
                Object obj5 = q88Var2.f23760b.f18805a;
                q88Var2.f23759a.mo13467n(obj5, d34Var);
                int i11 = d34Var.f6450c;
                z4 = z9;
                i7 = q88Var2.f23759a.mo4511a(obj5);
                obj2 = obj5;
                obj = q88Var2.f23759a.mo1923e(i11, this.f11157a, 0L).f13267a;
                f53Var2 = this.f11157a.f13268b;
                i6 = i11;
            }
            if (i3 != 0) {
                boolean m16079b = q88Var2.f23760b.m16079b();
                j2 = q88Var2.f23776r;
            } else if (q88Var2.f23760b.m16079b()) {
                pr8 pr8Var = q88Var2.f23760b;
                j2 = d34Var.m24722g(pr8Var.f18806b, pr8Var.f18807c);
                j3 = m18842J(q88Var2);
            } else {
                j2 = q88Var2.f23760b.f18809e != -1 ? m18842J(this.f14408e0) : d34Var.f6451d;
                j3 = j2;
            }
            long m19386j0 = it5.m19386j0(j2);
            pr8 pr8Var2 = q88Var2.f23760b;
            final nx3 nx3Var = new nx3(obj, i6, f53Var2, obj2, i7, m19386j0, it5.m19386j0(j3), pr8Var2.f18806b, pr8Var2.f18807c);
            int zzf = zzf();
            if (this.f14408e0.f23759a.m17121o()) {
                obj3 = null;
                f53Var3 = null;
                obj4 = null;
                i8 = -1;
            } else {
                q88 q88Var3 = this.f14408e0;
                Object obj6 = q88Var3.f23760b.f18805a;
                q88Var3.f23759a.mo13467n(obj6, this.f14420m);
                i8 = this.f14408e0.f23759a.mo4511a(obj6);
                obj3 = this.f14408e0.f23759a.mo1923e(zzf, this.f11157a, 0L).f13267a;
                f53Var3 = this.f11157a.f13268b;
                obj4 = obj6;
            }
            long m19386j02 = it5.m19386j0(j);
            long m19386j03 = this.f14408e0.f23760b.m16079b() ? it5.m19386j0(m18842J(this.f14408e0)) : m19386j02;
            pr8 pr8Var3 = this.f14408e0.f23760b;
            final nx3 nx3Var2 = new nx3(obj3, zzf, f53Var3, obj4, i8, m19386j02, m19386j03, pr8Var3.f18806b, pr8Var3.f18807c);
            this.f14418k.m18020d(11, new c35() { // from class: com.daaw.e28
                @Override // com.daaw.c35
                public final void zza(Object obj7) {
                    int i12 = i3;
                    nx3 nx3Var3 = nx3Var;
                    nx3 nx3Var4 = nx3Var2;
                    int i13 = j58.f14373j0;
                    ((mv3) obj7).mo9166D(nx3Var3, nx3Var4, i12);
                }
            });
        } else {
            z4 = z9;
        }
        if (booleanValue) {
            this.f14418k.m18020d(1, new c35() { // from class: com.daaw.h28
                @Override // com.daaw.c35
                public final void zza(Object obj7) {
                    f53 f53Var5 = f53.this;
                    int i12 = intValue;
                    int i13 = j58.f14373j0;
                    ((mv3) obj7).mo9168B(f53Var5, i12);
                }
            });
        }
        if (q88Var2.f23764f != q88Var.f23764f) {
            this.f14418k.m18020d(10, new c35() { // from class: com.daaw.k28
                @Override // com.daaw.c35
                public final void zza(Object obj7) {
                    q88 q88Var4 = q88.this;
                    int i12 = j58.f14373j0;
                    ((mv3) obj7).mo9162H(q88Var4.f23764f);
                }
            });
            if (q88Var.f23764f != null) {
                this.f14418k.m18020d(10, new c35() { // from class: com.daaw.n28
                    @Override // com.daaw.c35
                    public final void zza(Object obj7) {
                        q88 q88Var4 = q88.this;
                        int i12 = j58.f14373j0;
                        ((mv3) obj7).mo9165E(q88Var4.f23764f);
                    }
                });
            }
        }
        fw8 fw8Var = q88Var2.f23767i;
        fw8 fw8Var2 = q88Var.f23767i;
        if (fw8Var != fw8Var2) {
            this.f14413h.mo1831e(fw8Var2.f10044e);
            this.f14418k.m18020d(2, new c35() { // from class: com.daaw.q28
                @Override // com.daaw.c35
                public final void zza(Object obj7) {
                    q88 q88Var4 = q88.this;
                    int i12 = j58.f14373j0;
                    ((mv3) obj7).mo9169A(q88Var4.f23767i.f10043d);
                }
            });
        }
        if (z6) {
            final gc3 gc3Var2 = this.f14382I;
            this.f14418k.m18020d(14, new c35() { // from class: com.daaw.t28
                @Override // com.daaw.c35
                public final void zza(Object obj7) {
                    gc3 gc3Var3 = gc3.this;
                    int i12 = j58.f14373j0;
                    ((mv3) obj7).mo9116z(gc3Var3);
                }
            });
        }
        if (z4) {
            this.f14418k.m18020d(3, new c35() { // from class: com.daaw.w28
                @Override // com.daaw.c35
                public final void zza(Object obj7) {
                    q88 q88Var4 = q88.this;
                    int i12 = j58.f14373j0;
                    ((mv3) obj7).mo9118x(q88Var4.f23765g);
                }
            });
        }
        if (z8 || z7) {
            this.f14418k.m18020d(-1, new c35() { // from class: com.daaw.i38
                @Override // com.daaw.c35
                public final void zza(Object obj7) {
                    q88 q88Var4 = q88.this;
                    int i12 = j58.f14373j0;
                    ((mv3) obj7).mo9161I(q88Var4.f23770l, q88Var4.f23763e);
                }
            });
        }
        if (z8) {
            this.f14418k.m18020d(4, new c35() { // from class: com.daaw.l38
                @Override // com.daaw.c35
                public final void zza(Object obj7) {
                    q88 q88Var4 = q88.this;
                    int i12 = j58.f14373j0;
                    ((mv3) obj7).mo9164F(q88Var4.f23763e);
                }
            });
        }
        if (z7) {
            this.f14418k.m18020d(5, new c35() { // from class: com.daaw.p18
                @Override // com.daaw.c35
                public final void zza(Object obj7) {
                    q88 q88Var4 = q88.this;
                    int i12 = i2;
                    int i13 = j58.f14373j0;
                    ((mv3) obj7).mo9167C(q88Var4.f23770l, i12);
                }
            });
        }
        if (q88Var2.f23771m != q88Var.f23771m) {
            this.f14418k.m18020d(6, new c35() { // from class: com.daaw.s18
                @Override // com.daaw.c35
                public final void zza(Object obj7) {
                    q88 q88Var4 = q88.this;
                    int i12 = j58.f14373j0;
                    ((mv3) obj7).mo9121u(q88Var4.f23771m);
                }
            });
        }
        if (m18827Y(q88Var2) != m18827Y(q88Var)) {
            this.f14418k.m18020d(7, new c35() { // from class: com.daaw.v18
                @Override // com.daaw.c35
                public final void zza(Object obj7) {
                    ((mv3) obj7).mo9122t(j58.m18827Y(q88.this));
                }
            });
        }
        if (!q88Var2.f23772n.equals(q88Var.f23772n)) {
            this.f14418k.m18020d(12, new c35() { // from class: com.daaw.y18
                @Override // com.daaw.c35
                public final void zza(Object obj7) {
                    q88 q88Var4 = q88.this;
                    int i12 = j58.f14373j0;
                    ((mv3) obj7).mo9119w(q88Var4.f23772n);
                }
            });
        }
        if (z) {
            this.f14418k.m18020d(-1, new c35() { // from class: com.daaw.b28
                @Override // com.daaw.c35
                public final void zza(Object obj7) {
                    ((mv3) obj7).zzp();
                }
            });
        }
        lu3 lu3Var = this.f14381H;
        lu3 m19393g = it5.m19393g(this.f14409f, this.f14403c);
        this.f14381H = m19393g;
        if (!m19393g.equals(lu3Var)) {
            this.f14418k.m18020d(13, new c35() { // from class: com.daaw.r38
                @Override // com.daaw.c35
                public final void zza(Object obj7) {
                    j58.this.m18799v((mv3) obj7);
                }
            });
        }
        this.f14418k.m18021c();
        if (q88Var2.f23773o != q88Var.f23773o) {
            Iterator it = this.f14419l.iterator();
            while (it.hasNext()) {
                ((yv7) it.next()).zza(q88Var.f23773o);
            }
        }
    }

    /* renamed from: W */
    public final void m18829W() {
        int zzh = zzh();
        if (zzh == 2 || zzh == 3) {
            m18828X();
            boolean z = this.f14408e0.f23773o;
            zzq();
            zzq();
        }
    }

    /* renamed from: X */
    public final void m18828X() {
        this.f14405d.m24009b();
        if (Thread.currentThread() != this.f14425r.getThread()) {
            String m19389i = it5.m19389i("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f14425r.getThread().getName());
            if (this.f14399Z) {
                throw new IllegalStateException(m19389i);
            }
            s95.m10492f("ExoPlayerImpl", m19389i, this.f14400a0 ? null : new IllegalStateException());
            this.f14400a0 = true;
        }
    }

    @Override // com.daaw.ty3
    /* renamed from: a */
    public final void mo8696a(int i, long j) {
        m18828X();
        this.f14424q.zzx();
        l64 l64Var = this.f14408e0.f23759a;
        if (i < 0 || (!l64Var.m17121o() && i >= l64Var.mo4509c())) {
            throw new na2(l64Var, i, j);
        }
        this.f14376C++;
        if (zzs()) {
            s95.m10493e("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            o68 o68Var = new o68(this.f14408e0);
            o68Var.m14520a(1);
            this.f14414h0.f32076a.m18800u(o68Var);
            return;
        }
        int i2 = zzh() != 1 ? 2 : 1;
        int zzf = zzf();
        q88 m18838N = m18838N(this.f14408e0.m12703e(i2), l64Var, m18840L(l64Var, i, j));
        this.f14417j.m8523V(l64Var, i, it5.m19394f0(j));
        m18830V(m18838N, 0, 1, true, true, 1, m18843I(m18838N), zzf, false);
    }

    /* renamed from: a0 */
    public final int m18825a0() {
        m18828X();
        int length = this.f14411g.length;
        return 2;
    }

    /* renamed from: b */
    public final vu7 m18824b() {
        m18828X();
        return this.f14408e0.f23764f;
    }

    /* renamed from: b0 */
    public final long m18823b0() {
        m18828X();
        if (zzs()) {
            q88 q88Var = this.f14408e0;
            return q88Var.f23769k.equals(q88Var.f23760b) ? it5.m19386j0(this.f14408e0.f23774p) : m18821c0();
        }
        m18828X();
        if (this.f14408e0.f23759a.m17121o()) {
            return this.f14412g0;
        }
        q88 q88Var2 = this.f14408e0;
        long j = 0;
        if (q88Var2.f23769k.f18808d != q88Var2.f23760b.f18808d) {
            return it5.m19386j0(q88Var2.f23759a.mo1923e(zzf(), this.f11157a, 0L).f13278l);
        }
        long j2 = q88Var2.f23774p;
        if (this.f14408e0.f23769k.m16079b()) {
            q88 q88Var3 = this.f14408e0;
            q88Var3.f23759a.mo13467n(q88Var3.f23769k.f18805a, this.f14420m).m24721h(this.f14408e0.f23769k.f18806b);
        } else {
            j = j2;
        }
        q88 q88Var4 = this.f14408e0;
        m18841K(q88Var4.f23759a, q88Var4.f23769k, j);
        return it5.m19386j0(j);
    }

    /* renamed from: c0 */
    public final long m18821c0() {
        long m24722g;
        m18828X();
        if (zzs()) {
            q88 q88Var = this.f14408e0;
            pr8 pr8Var = q88Var.f23760b;
            q88Var.f23759a.mo13467n(pr8Var.f18805a, this.f14420m);
            m24722g = this.f14420m.m24722g(pr8Var.f18806b, pr8Var.f18807c);
        } else {
            l64 zzn = zzn();
            if (zzn.m17121o()) {
                return -9223372036854775807L;
            }
            m24722g = zzn.mo1923e(zzf(), this.f11157a, 0L).f13278l;
        }
        return it5.m19386j0(m24722g);
    }

    /* renamed from: s */
    public final void m18802s(ob8 ob8Var) {
        fb8 fb8Var = this.f14424q;
        Objects.requireNonNull(ob8Var);
        fb8Var.mo9132j(ob8Var);
    }

    /* renamed from: t */
    public final /* synthetic */ void m18801t(o68 o68Var) {
        long j;
        boolean z;
        long j2;
        int i = this.f14376C - o68Var.f21093c;
        this.f14376C = i;
        boolean z2 = true;
        if (o68Var.f21094d) {
            this.f14377D = o68Var.f21095e;
            this.f14378E = true;
        }
        if (o68Var.f21096f) {
            this.f14379F = o68Var.f21097g;
        }
        if (i == 0) {
            l64 l64Var = o68Var.f21092b.f23759a;
            if (!this.f14408e0.f23759a.m17121o() && l64Var.m17121o()) {
                this.f14410f0 = -1;
                this.f14412g0 = 0L;
            }
            if (!l64Var.m17121o()) {
                List m25480y = ((c98) l64Var).m25480y();
                uo4.m7872f(m25480y.size() == this.f14421n.size());
                for (int i2 = 0; i2 < m25480y.size(); i2++) {
                    ((g58) this.f14421n.get(i2)).f10293b = (l64) m25480y.get(i2);
                }
            }
            if (this.f14378E) {
                if (o68Var.f21092b.f23760b.equals(this.f14408e0.f23760b) && o68Var.f21092b.f23762d == this.f14408e0.f23776r) {
                    z2 = false;
                }
                if (z2) {
                    if (l64Var.m17121o() || o68Var.f21092b.f23760b.m16079b()) {
                        j2 = o68Var.f21092b.f23762d;
                    } else {
                        q88 q88Var = o68Var.f21092b;
                        pr8 pr8Var = q88Var.f23760b;
                        j2 = q88Var.f23762d;
                        m18841K(l64Var, pr8Var, j2);
                    }
                    z = z2;
                    j = j2;
                } else {
                    j = -9223372036854775807L;
                    z = z2;
                }
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.f14378E = false;
            m18830V(o68Var.f21092b, 1, this.f14379F, false, z, this.f14377D, j, -1, false);
        }
    }

    /* renamed from: u */
    public final /* synthetic */ void m18800u(final o68 o68Var) {
        this.f14415i.mo5893b(new Runnable() { // from class: com.daaw.a48
            @Override // java.lang.Runnable
            public final void run() {
                j58.this.m18801t(o68Var);
            }
        });
    }

    /* renamed from: v */
    public final /* synthetic */ void m18799v(mv3 mv3Var) {
        mv3Var.mo9163G(this.f14381H);
    }

    /* renamed from: x */
    public final void m18797x() {
        m18828X();
        boolean zzq = zzq();
        int m17693b = this.f14431x.m17693b(zzq, 2);
        m18831U(zzq, m17693b, m18844H(zzq, m17693b));
        q88 q88Var = this.f14408e0;
        if (q88Var.f23763e != 1) {
            return;
        }
        q88 m12704d = q88Var.m12704d(null);
        q88 m12703e = m12704d.m12703e(true == m12704d.f23759a.m17121o() ? 4 : 2);
        this.f14376C++;
        this.f14417j.m8524U();
        m18830V(m12703e, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    /* renamed from: y */
    public final void m18796y() {
        AudioTrack audioTrack;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = it5.f13995e;
        String m18025a = k63.m18025a();
        s95.m10494d("ExoPlayerImpl", "Release " + hexString + " [AndroidXMedia3/1.0.0-beta02] [" + str + "] [" + m18025a + "]");
        m18828X();
        if (it5.f13991a < 21 && (audioTrack = this.f14386M) != null) {
            audioTrack.release();
            this.f14386M = null;
        }
        this.f14432y.m6258e();
        this.f14431x.m17691d();
        if (!this.f14417j.m8520Y()) {
            k65 k65Var = this.f14418k;
            k65Var.m18020d(10, new c35() { // from class: com.daaw.g18
                @Override // com.daaw.c35
                public final void zza(Object obj) {
                    ((mv3) obj).mo9165E(vu7.m6771d(new x68(1), 1003));
                }
            });
            k65Var.m18021c();
        }
        this.f14418k.m18019e();
        this.f14415i.mo5890e(null);
        this.f14426s.mo12010b(this.f14424q);
        q88 m12703e = this.f14408e0.m12703e(1);
        this.f14408e0 = m12703e;
        q88 m12707a = m12703e.m12707a(m12703e.f23760b);
        this.f14408e0 = m12707a;
        m12707a.f23774p = m12707a.f23776r;
        this.f14408e0.f23775q = 0L;
        this.f14424q.mo9127o();
        this.f14413h.mo1835a();
        Surface surface = this.f14388O;
        if (surface != null) {
            surface.release();
            this.f14388O = null;
        }
        this.f14398Y = rn4.f25423b;
    }

    /* renamed from: z */
    public final void m18795z(ob8 ob8Var) {
        this.f14424q.mo9134h(ob8Var);
    }

    @Override // com.daaw.ty3
    public final int zzd() {
        m18828X();
        if (zzs()) {
            return this.f14408e0.f23760b.f18806b;
        }
        return -1;
    }

    @Override // com.daaw.ty3
    public final int zze() {
        m18828X();
        if (zzs()) {
            return this.f14408e0.f23760b.f18807c;
        }
        return -1;
    }

    @Override // com.daaw.ty3
    public final int zzf() {
        m18828X();
        int m18845G = m18845G();
        if (m18845G == -1) {
            return 0;
        }
        return m18845G;
    }

    @Override // com.daaw.ty3
    public final int zzg() {
        m18828X();
        if (this.f14408e0.f23759a.m17121o()) {
            return 0;
        }
        q88 q88Var = this.f14408e0;
        return q88Var.f23759a.mo4511a(q88Var.f23760b.f18805a);
    }

    @Override // com.daaw.ty3
    public final int zzh() {
        m18828X();
        return this.f14408e0.f23763e;
    }

    @Override // com.daaw.ty3
    public final int zzi() {
        m18828X();
        return this.f14408e0.f23771m;
    }

    @Override // com.daaw.ty3
    public final int zzj() {
        m18828X();
        return 0;
    }

    @Override // com.daaw.ty3
    public final long zzk() {
        m18828X();
        if (zzs()) {
            q88 q88Var = this.f14408e0;
            q88Var.f23759a.mo13467n(q88Var.f23760b.f18805a, this.f14420m);
            q88 q88Var2 = this.f14408e0;
            if (q88Var2.f23761c == -9223372036854775807L) {
                long j = q88Var2.f23759a.mo1923e(zzf(), this.f11157a, 0L).f13277k;
                return it5.m19386j0(0L);
            }
            return it5.m19386j0(0L) + it5.m19386j0(this.f14408e0.f23761c);
        }
        return zzl();
    }

    @Override // com.daaw.ty3
    public final long zzl() {
        m18828X();
        return it5.m19386j0(m18843I(this.f14408e0));
    }

    @Override // com.daaw.ty3
    public final long zzm() {
        m18828X();
        return it5.m19386j0(this.f14408e0.f23775q);
    }

    @Override // com.daaw.ty3
    public final l64 zzn() {
        m18828X();
        return this.f14408e0.f23759a;
    }

    @Override // com.daaw.ty3
    public final ni4 zzo() {
        m18828X();
        return this.f14408e0.f23767i.f10043d;
    }

    @Override // com.daaw.ty3
    public final boolean zzq() {
        m18828X();
        return this.f14408e0.f23770l;
    }

    @Override // com.daaw.ty3
    public final boolean zzr() {
        m18828X();
        return false;
    }

    @Override // com.daaw.ty3
    public final boolean zzs() {
        m18828X();
        return this.f14408e0.f23760b.m16079b();
    }
}
