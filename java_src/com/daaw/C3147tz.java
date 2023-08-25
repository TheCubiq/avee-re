package com.daaw;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.daaw.bp0;
import com.daaw.bx0;
import com.daaw.fx0;
import com.daaw.nl1;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.InterfaceC3970c;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* renamed from: com.daaw.tz */
/* loaded from: classes.dex */
public final class C3147tz implements InterfaceC2898rz {

    /* renamed from: a */
    public final a41[] f28252a;

    /* renamed from: b */
    public final wm1 f28253b;

    /* renamed from: c */
    public final xm1 f28254c;

    /* renamed from: d */
    public final Handler f28255d;

    /* renamed from: e */
    public final C3266uz f28256e;

    /* renamed from: f */
    public final Handler f28257f;

    /* renamed from: g */
    public final CopyOnWriteArraySet<bx0.InterfaceC0893a> f28258g;

    /* renamed from: h */
    public final nl1.C2315c f28259h;

    /* renamed from: i */
    public final nl1.C2314b f28260i;

    /* renamed from: j */
    public final ArrayDeque<C3149b> f28261j;

    /* renamed from: k */
    public boolean f28262k;

    /* renamed from: l */
    public int f28263l;

    /* renamed from: m */
    public boolean f28264m;

    /* renamed from: n */
    public int f28265n;

    /* renamed from: o */
    public boolean f28266o;

    /* renamed from: p */
    public boolean f28267p;

    /* renamed from: q */
    public zw0 f28268q;

    /* renamed from: r */
    public C2802qz f28269r;

    /* renamed from: s */
    public yw0 f28270s;

    /* renamed from: t */
    public int f28271t;

    /* renamed from: u */
    public int f28272u;

    /* renamed from: v */
    public long f28273v;

    /* renamed from: com.daaw.tz$a */
    /* loaded from: classes.dex */
    public class HandlerC3148a extends Handler {
        public HandlerC3148a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C3147tz.this.m8677r(message);
        }
    }

    /* renamed from: com.daaw.tz$b */
    /* loaded from: classes.dex */
    public static final class C3149b {

        /* renamed from: a */
        public final yw0 f28275a;

        /* renamed from: b */
        public final Set<bx0.InterfaceC0893a> f28276b;

        /* renamed from: c */
        public final wm1 f28277c;

        /* renamed from: d */
        public final boolean f28278d;

        /* renamed from: e */
        public final int f28279e;

        /* renamed from: f */
        public final int f28280f;

        /* renamed from: g */
        public final boolean f28281g;

        /* renamed from: h */
        public final boolean f28282h;

        /* renamed from: i */
        public final boolean f28283i;

        /* renamed from: j */
        public final boolean f28284j;

        /* renamed from: k */
        public final boolean f28285k;

        /* renamed from: l */
        public final boolean f28286l;

        public C3149b(yw0 yw0Var, yw0 yw0Var2, Set<bx0.InterfaceC0893a> set, wm1 wm1Var, boolean z, int i, int i2, boolean z2, boolean z3, boolean z4) {
            this.f28275a = yw0Var;
            this.f28276b = set;
            this.f28277c = wm1Var;
            this.f28278d = z;
            this.f28279e = i;
            this.f28280f = i2;
            this.f28281g = z2;
            this.f28282h = z3;
            this.f28283i = z4 || yw0Var2.f34184f != yw0Var.f34184f;
            this.f28284j = (yw0Var2.f34179a == yw0Var.f34179a && yw0Var2.f34180b == yw0Var.f34180b) ? false : true;
            this.f28285k = yw0Var2.f34185g != yw0Var.f34185g;
            this.f28286l = yw0Var2.f34187i != yw0Var.f34187i;
        }

        /* renamed from: a */
        public void m8670a() {
            if (this.f28284j || this.f28280f == 0) {
                for (bx0.InterfaceC0893a interfaceC0893a : this.f28276b) {
                    yw0 yw0Var = this.f28275a;
                    interfaceC0893a.mo13805v(yw0Var.f34179a, yw0Var.f34180b, this.f28280f);
                }
            }
            if (this.f28278d) {
                for (bx0.InterfaceC0893a interfaceC0893a2 : this.f28276b) {
                    interfaceC0893a2.mo13819e(this.f28279e);
                }
            }
            if (this.f28286l) {
                this.f28277c.mo1548b(this.f28275a.f34187i.f32794d);
                for (bx0.InterfaceC0893a interfaceC0893a3 : this.f28276b) {
                    yw0 yw0Var2 = this.f28275a;
                    interfaceC0893a3.mo13813m(yw0Var2.f34186h, yw0Var2.f34187i.f32793c);
                }
            }
            if (this.f28285k) {
                for (bx0.InterfaceC0893a interfaceC0893a4 : this.f28276b) {
                    interfaceC0893a4.mo13820d(this.f28275a.f34185g);
                }
            }
            if (this.f28283i) {
                for (bx0.InterfaceC0893a interfaceC0893a5 : this.f28276b) {
                    interfaceC0893a5.mo13808s(this.f28282h, this.f28275a.f34184f);
                }
            }
            if (this.f28281g) {
                for (bx0.InterfaceC0893a interfaceC0893a6 : this.f28276b) {
                    interfaceC0893a6.mo13818g();
                }
            }
        }
    }

    @SuppressLint({"HandlerLeak"})
    public C3147tz(a41[] a41VarArr, wm1 wm1Var, hk0 hk0Var, InterfaceC3836zf interfaceC3836zf) {
        StringBuilder sb = new StringBuilder();
        sb.append("Init ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [");
        sb.append("ExoPlayerLib/2.8.2");
        sb.append("] [");
        sb.append(sq1.f26529e);
        sb.append("]");
        C2914s6.m10685f(a41VarArr.length > 0);
        this.f28252a = (a41[]) C2914s6.m10686e(a41VarArr);
        this.f28253b = (wm1) C2914s6.m10686e(wm1Var);
        this.f28262k = false;
        this.f28263l = 0;
        this.f28264m = false;
        this.f28258g = new CopyOnWriteArraySet<>();
        xm1 xm1Var = new xm1(new c41[a41VarArr.length], new InterfaceC3970c[a41VarArr.length], null);
        this.f28254c = xm1Var;
        this.f28259h = new nl1.C2315c();
        this.f28260i = new nl1.C2314b();
        this.f28268q = zw0.f35604e;
        HandlerC3148a handlerC3148a = new HandlerC3148a(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f28255d = handlerC3148a;
        this.f28270s = new yw0(nl1.f20215a, 0L, TrackGroupArray.f35847s, xm1Var);
        this.f28261j = new ArrayDeque<>();
        C3266uz c3266uz = new C3266uz(a41VarArr, wm1Var, xm1Var, hk0Var, this.f28262k, this.f28263l, this.f28264m, handlerC3148a, this, interfaceC3836zf);
        this.f28256e = c3266uz;
        this.f28257f = new Handler(c3266uz.m7589r());
    }

    @Override // com.daaw.bx0
    /* renamed from: a */
    public void mo8694a() {
        StringBuilder sb = new StringBuilder();
        sb.append("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [");
        sb.append("ExoPlayerLib/2.8.2");
        sb.append("] [");
        sb.append(sq1.f26529e);
        sb.append("] [");
        sb.append(C3387vz.m6642b());
        sb.append("]");
        this.f28256e.m7639F();
        this.f28255d.removeCallbacksAndMessages(null);
    }

    @Override // com.daaw.bx0
    /* renamed from: b */
    public void mo8693b(bx0.InterfaceC0893a interfaceC0893a) {
        this.f28258g.add(interfaceC0893a);
    }

    @Override // com.daaw.bx0
    /* renamed from: c */
    public boolean mo8692c() {
        return this.f28262k;
    }

    @Override // com.daaw.InterfaceC2898rz
    /* renamed from: d */
    public fx0 mo8691d(fx0.InterfaceC1343b interfaceC1343b) {
        return new fx0(this.f28256e, interfaceC1343b, this.f28270s.f34179a, mo8688g(), this.f28257f);
    }

    @Override // com.daaw.bx0
    /* renamed from: e */
    public int mo8690e() {
        if (m8675t()) {
            return this.f28270s.f34181c.f5024c;
        }
        return -1;
    }

    @Override // com.daaw.bx0
    /* renamed from: f */
    public void mo8689f(long j) {
        m8673v(mo8688g(), j);
    }

    @Override // com.daaw.bx0
    /* renamed from: g */
    public int mo8688g() {
        if (m8672w()) {
            return this.f28271t;
        }
        yw0 yw0Var = this.f28270s;
        return yw0Var.f34179a.m15078f(yw0Var.f34181c.f5022a, this.f28260i).f20218c;
    }

    @Override // com.daaw.bx0
    public long getDuration() {
        nl1 nl1Var = this.f28270s.f34179a;
        if (nl1Var.m15073o()) {
            return -9223372036854775807L;
        }
        if (m8675t()) {
            bp0.C0880a c0880a = this.f28270s.f34181c;
            nl1Var.m15078f(c0880a.f5022a, this.f28260i);
            return C1075dd.m24526b(this.f28260i.m15070b(c0880a.f5023b, c0880a.f5024c));
        }
        return nl1Var.m15075k(mo8688g(), this.f28259h).m15053c();
    }

    @Override // com.daaw.bx0
    /* renamed from: h */
    public void mo8687h(boolean z) {
        if (this.f28262k != z) {
            this.f28262k = z;
            this.f28256e.m7619Z(z);
            m8671x(this.f28270s, false, 4, 1, false, true);
        }
    }

    @Override // com.daaw.bx0
    /* renamed from: i */
    public long mo8686i() {
        if (m8675t()) {
            yw0 yw0Var = this.f28270s;
            yw0Var.f34179a.m15078f(yw0Var.f34181c.f5022a, this.f28260i);
            return this.f28260i.m15060l() + C1075dd.m24526b(this.f28270s.f34183e);
        }
        return mo8680o();
    }

    @Override // com.daaw.bx0
    /* renamed from: j */
    public long mo8685j() {
        return m8672w() ? this.f28273v : m8674u(this.f28270s.f34189k);
    }

    @Override // com.daaw.bx0
    /* renamed from: k */
    public int mo8684k() {
        return this.f28270s.f34184f;
    }

    @Override // com.daaw.InterfaceC2898rz
    /* renamed from: l */
    public void mo8683l(bp0 bp0Var, boolean z, boolean z2) {
        this.f28269r = null;
        yw0 m8678q = m8678q(z, z2, 2);
        this.f28266o = true;
        this.f28265n++;
        this.f28256e.m7641D(bp0Var, z, z2);
        m8671x(m8678q, false, 4, 1, false, false);
    }

    @Override // com.daaw.bx0
    /* renamed from: m */
    public int mo8682m() {
        if (m8675t()) {
            return this.f28270s.f34181c.f5023b;
        }
        return -1;
    }

    @Override // com.daaw.bx0
    /* renamed from: n */
    public nl1 mo8681n() {
        return this.f28270s.f34179a;
    }

    @Override // com.daaw.bx0
    /* renamed from: o */
    public long mo8680o() {
        return m8672w() ? this.f28273v : m8674u(this.f28270s.f34188j);
    }

    /* renamed from: p */
    public int m8679p() {
        return m8672w() ? this.f28272u : this.f28270s.f34181c.f5022a;
    }

    /* renamed from: q */
    public final yw0 m8678q(boolean z, boolean z2, int i) {
        long mo8680o;
        if (z) {
            this.f28271t = 0;
            this.f28272u = 0;
            mo8680o = 0;
        } else {
            this.f28271t = mo8688g();
            this.f28272u = m8679p();
            mo8680o = mo8680o();
        }
        this.f28273v = mo8680o;
        nl1 nl1Var = z2 ? nl1.f20215a : this.f28270s.f34179a;
        Object obj = z2 ? null : this.f28270s.f34180b;
        yw0 yw0Var = this.f28270s;
        return new yw0(nl1Var, obj, yw0Var.f34181c, yw0Var.f34182d, yw0Var.f34183e, i, false, z2 ? TrackGroupArray.f35847s : yw0Var.f34186h, z2 ? this.f28254c : yw0Var.f34187i);
    }

    /* renamed from: r */
    public void m8677r(Message message) {
        int i = message.what;
        if (i == 0) {
            yw0 yw0Var = (yw0) message.obj;
            int i2 = message.arg1;
            int i3 = message.arg2;
            m8676s(yw0Var, i2, i3 != -1, i3);
        } else if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException();
            }
            C2802qz c2802qz = (C2802qz) message.obj;
            this.f28269r = c2802qz;
            Iterator<bx0.InterfaceC0893a> it = this.f28258g.iterator();
            while (it.hasNext()) {
                it.next().mo13834A(c2802qz);
            }
        } else {
            zw0 zw0Var = (zw0) message.obj;
            if (this.f28268q.equals(zw0Var)) {
                return;
            }
            this.f28268q = zw0Var;
            Iterator<bx0.InterfaceC0893a> it2 = this.f28258g.iterator();
            while (it2.hasNext()) {
                it2.next().mo13821c(zw0Var);
            }
        }
    }

    /* renamed from: s */
    public final void m8676s(yw0 yw0Var, int i, boolean z, int i2) {
        int i3 = this.f28265n - i;
        this.f28265n = i3;
        if (i3 == 0) {
            if (yw0Var.f34182d == -9223372036854775807L) {
                yw0Var = yw0Var.m3156g(yw0Var.f34181c, 0L, yw0Var.f34183e);
            }
            yw0 yw0Var2 = yw0Var;
            if ((!this.f28270s.f34179a.m15073o() || this.f28266o) && yw0Var2.f34179a.m15073o()) {
                this.f28272u = 0;
                this.f28271t = 0;
                this.f28273v = 0L;
            }
            int i4 = this.f28266o ? 0 : 2;
            boolean z2 = this.f28267p;
            this.f28266o = false;
            this.f28267p = false;
            m8671x(yw0Var2, z, i2, i4, z2, false);
        }
    }

    /* renamed from: t */
    public boolean m8675t() {
        return !m8672w() && this.f28270s.f34181c.m25954b();
    }

    /* renamed from: u */
    public final long m8674u(long j) {
        long m24526b = C1075dd.m24526b(j);
        if (this.f28270s.f34181c.m25954b()) {
            return m24526b;
        }
        yw0 yw0Var = this.f28270s;
        yw0Var.f34179a.m15078f(yw0Var.f34181c.f5022a, this.f28260i);
        return m24526b + this.f28260i.m15060l();
    }

    /* renamed from: v */
    public void m8673v(int i, long j) {
        nl1 nl1Var = this.f28270s.f34179a;
        if (i < 0 || (!nl1Var.m15073o() && i >= nl1Var.mo14375n())) {
            throw new we0(nl1Var, i, j);
        }
        this.f28267p = true;
        this.f28265n++;
        if (m8675t()) {
            this.f28255d.obtainMessage(0, 1, -1, this.f28270s).sendToTarget();
            return;
        }
        this.f28271t = i;
        if (nl1Var.m15073o()) {
            this.f28273v = j == -9223372036854775807L ? 0L : j;
            this.f28272u = 0;
        } else {
            long m15054b = j == -9223372036854775807L ? nl1Var.m15075k(i, this.f28259h).m15054b() : C1075dd.m24527a(j);
            Pair<Integer, Long> m15077i = nl1Var.m15077i(this.f28259h, this.f28260i, i, m15054b);
            this.f28273v = C1075dd.m24526b(m15054b);
            this.f28272u = ((Integer) m15077i.first).intValue();
        }
        this.f28256e.m7628Q(nl1Var, i, C1075dd.m24527a(j));
        Iterator<bx0.InterfaceC0893a> it = this.f28258g.iterator();
        while (it.hasNext()) {
            it.next().mo13819e(1);
        }
    }

    /* renamed from: w */
    public final boolean m8672w() {
        return this.f28270s.f34179a.m15073o() || this.f28265n > 0;
    }

    /* renamed from: x */
    public final void m8671x(yw0 yw0Var, boolean z, int i, int i2, boolean z2, boolean z3) {
        boolean z4 = !this.f28261j.isEmpty();
        this.f28261j.addLast(new C3149b(yw0Var, this.f28270s, this.f28258g, this.f28253b, z, i, i2, z2, this.f28262k, z3));
        this.f28270s = yw0Var;
        if (z4) {
            return;
        }
        while (!this.f28261j.isEmpty()) {
            this.f28261j.peekFirst().m8670a();
            this.f28261j.removeFirst();
        }
    }
}
