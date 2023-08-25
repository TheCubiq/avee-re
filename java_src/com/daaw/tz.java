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
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes.dex */
public final class tz implements rz {
    public final a41[] a;
    public final wm1 b;
    public final xm1 c;
    public final Handler d;
    public final uz e;
    public final Handler f;
    public final CopyOnWriteArraySet<bx0.a> g;
    public final nl1.c h;
    public final nl1.b i;
    public final ArrayDeque<b> j;
    public boolean k;
    public int l;
    public boolean m;
    public int n;
    public boolean o;
    public boolean p;
    public zw0 q;
    public qz r;
    public yw0 s;
    public int t;
    public int u;
    public long v;

    /* loaded from: classes.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            tz.this.r(message);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final yw0 a;
        public final Set<bx0.a> b;
        public final wm1 c;
        public final boolean d;
        public final int e;
        public final int f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final boolean k;
        public final boolean l;

        public b(yw0 yw0Var, yw0 yw0Var2, Set<bx0.a> set, wm1 wm1Var, boolean z, int i, int i2, boolean z2, boolean z3, boolean z4) {
            this.a = yw0Var;
            this.b = set;
            this.c = wm1Var;
            this.d = z;
            this.e = i;
            this.f = i2;
            this.g = z2;
            this.h = z3;
            this.i = z4 || yw0Var2.f != yw0Var.f;
            this.j = (yw0Var2.a == yw0Var.a && yw0Var2.b == yw0Var.b) ? false : true;
            this.k = yw0Var2.g != yw0Var.g;
            this.l = yw0Var2.i != yw0Var.i;
        }

        public void a() {
            if (this.j || this.f == 0) {
                for (bx0.a aVar : this.b) {
                    yw0 yw0Var = this.a;
                    aVar.v(yw0Var.a, yw0Var.b, this.f);
                }
            }
            if (this.d) {
                for (bx0.a aVar2 : this.b) {
                    aVar2.e(this.e);
                }
            }
            if (this.l) {
                this.c.b(this.a.i.d);
                for (bx0.a aVar3 : this.b) {
                    yw0 yw0Var2 = this.a;
                    aVar3.m(yw0Var2.h, yw0Var2.i.c);
                }
            }
            if (this.k) {
                for (bx0.a aVar4 : this.b) {
                    aVar4.d(this.a.g);
                }
            }
            if (this.i) {
                for (bx0.a aVar5 : this.b) {
                    aVar5.s(this.h, this.a.f);
                }
            }
            if (this.g) {
                for (bx0.a aVar6 : this.b) {
                    aVar6.g();
                }
            }
        }
    }

    @SuppressLint({"HandlerLeak"})
    public tz(a41[] a41VarArr, wm1 wm1Var, hk0 hk0Var, zf zfVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Init ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [");
        sb.append("ExoPlayerLib/2.8.2");
        sb.append("] [");
        sb.append(sq1.e);
        sb.append("]");
        s6.f(a41VarArr.length > 0);
        this.a = (a41[]) s6.e(a41VarArr);
        this.b = (wm1) s6.e(wm1Var);
        this.k = false;
        this.l = 0;
        this.m = false;
        this.g = new CopyOnWriteArraySet<>();
        xm1 xm1Var = new xm1(new c41[a41VarArr.length], new com.google.android.exoplayer2.trackselection.c[a41VarArr.length], null);
        this.c = xm1Var;
        this.h = new nl1.c();
        this.i = new nl1.b();
        this.q = zw0.e;
        a aVar = new a(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.d = aVar;
        this.s = new yw0(nl1.a, 0L, TrackGroupArray.s, xm1Var);
        this.j = new ArrayDeque<>();
        uz uzVar = new uz(a41VarArr, wm1Var, xm1Var, hk0Var, this.k, this.l, this.m, aVar, this, zfVar);
        this.e = uzVar;
        this.f = new Handler(uzVar.r());
    }

    @Override // com.daaw.bx0
    public void a() {
        StringBuilder sb = new StringBuilder();
        sb.append("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [");
        sb.append("ExoPlayerLib/2.8.2");
        sb.append("] [");
        sb.append(sq1.e);
        sb.append("] [");
        sb.append(vz.b());
        sb.append("]");
        this.e.F();
        this.d.removeCallbacksAndMessages(null);
    }

    @Override // com.daaw.bx0
    public void b(bx0.a aVar) {
        this.g.add(aVar);
    }

    @Override // com.daaw.bx0
    public boolean c() {
        return this.k;
    }

    @Override // com.daaw.rz
    public fx0 d(fx0.b bVar) {
        return new fx0(this.e, bVar, this.s.a, g(), this.f);
    }

    @Override // com.daaw.bx0
    public int e() {
        if (t()) {
            return this.s.c.c;
        }
        return -1;
    }

    @Override // com.daaw.bx0
    public void f(long j) {
        v(g(), j);
    }

    @Override // com.daaw.bx0
    public int g() {
        if (w()) {
            return this.t;
        }
        yw0 yw0Var = this.s;
        return yw0Var.a.f(yw0Var.c.a, this.i).c;
    }

    @Override // com.daaw.bx0
    public long getDuration() {
        nl1 nl1Var = this.s.a;
        if (nl1Var.o()) {
            return -9223372036854775807L;
        }
        if (t()) {
            bp0.a aVar = this.s.c;
            nl1Var.f(aVar.a, this.i);
            return dd.b(this.i.b(aVar.b, aVar.c));
        }
        return nl1Var.k(g(), this.h).c();
    }

    @Override // com.daaw.bx0
    public void h(boolean z) {
        if (this.k != z) {
            this.k = z;
            this.e.Z(z);
            x(this.s, false, 4, 1, false, true);
        }
    }

    @Override // com.daaw.bx0
    public long i() {
        if (t()) {
            yw0 yw0Var = this.s;
            yw0Var.a.f(yw0Var.c.a, this.i);
            return this.i.l() + dd.b(this.s.e);
        }
        return o();
    }

    @Override // com.daaw.bx0
    public long j() {
        return w() ? this.v : u(this.s.k);
    }

    @Override // com.daaw.bx0
    public int k() {
        return this.s.f;
    }

    @Override // com.daaw.rz
    public void l(bp0 bp0Var, boolean z, boolean z2) {
        this.r = null;
        yw0 q = q(z, z2, 2);
        this.o = true;
        this.n++;
        this.e.D(bp0Var, z, z2);
        x(q, false, 4, 1, false, false);
    }

    @Override // com.daaw.bx0
    public int m() {
        if (t()) {
            return this.s.c.b;
        }
        return -1;
    }

    @Override // com.daaw.bx0
    public nl1 n() {
        return this.s.a;
    }

    @Override // com.daaw.bx0
    public long o() {
        return w() ? this.v : u(this.s.j);
    }

    public int p() {
        return w() ? this.u : this.s.c.a;
    }

    public final yw0 q(boolean z, boolean z2, int i) {
        long o;
        if (z) {
            this.t = 0;
            this.u = 0;
            o = 0;
        } else {
            this.t = g();
            this.u = p();
            o = o();
        }
        this.v = o;
        nl1 nl1Var = z2 ? nl1.a : this.s.a;
        Object obj = z2 ? null : this.s.b;
        yw0 yw0Var = this.s;
        return new yw0(nl1Var, obj, yw0Var.c, yw0Var.d, yw0Var.e, i, false, z2 ? TrackGroupArray.s : yw0Var.h, z2 ? this.c : yw0Var.i);
    }

    public void r(Message message) {
        int i = message.what;
        if (i == 0) {
            yw0 yw0Var = (yw0) message.obj;
            int i2 = message.arg1;
            int i3 = message.arg2;
            s(yw0Var, i2, i3 != -1, i3);
        } else if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException();
            }
            qz qzVar = (qz) message.obj;
            this.r = qzVar;
            Iterator<bx0.a> it = this.g.iterator();
            while (it.hasNext()) {
                it.next().A(qzVar);
            }
        } else {
            zw0 zw0Var = (zw0) message.obj;
            if (this.q.equals(zw0Var)) {
                return;
            }
            this.q = zw0Var;
            Iterator<bx0.a> it2 = this.g.iterator();
            while (it2.hasNext()) {
                it2.next().c(zw0Var);
            }
        }
    }

    public final void s(yw0 yw0Var, int i, boolean z, int i2) {
        int i3 = this.n - i;
        this.n = i3;
        if (i3 == 0) {
            if (yw0Var.d == -9223372036854775807L) {
                yw0Var = yw0Var.g(yw0Var.c, 0L, yw0Var.e);
            }
            yw0 yw0Var2 = yw0Var;
            if ((!this.s.a.o() || this.o) && yw0Var2.a.o()) {
                this.u = 0;
                this.t = 0;
                this.v = 0L;
            }
            int i4 = this.o ? 0 : 2;
            boolean z2 = this.p;
            this.o = false;
            this.p = false;
            x(yw0Var2, z, i2, i4, z2, false);
        }
    }

    public boolean t() {
        return !w() && this.s.c.b();
    }

    public final long u(long j) {
        long b2 = dd.b(j);
        if (this.s.c.b()) {
            return b2;
        }
        yw0 yw0Var = this.s;
        yw0Var.a.f(yw0Var.c.a, this.i);
        return b2 + this.i.l();
    }

    public void v(int i, long j) {
        nl1 nl1Var = this.s.a;
        if (i < 0 || (!nl1Var.o() && i >= nl1Var.n())) {
            throw new we0(nl1Var, i, j);
        }
        this.p = true;
        this.n++;
        if (t()) {
            this.d.obtainMessage(0, 1, -1, this.s).sendToTarget();
            return;
        }
        this.t = i;
        if (nl1Var.o()) {
            this.v = j == -9223372036854775807L ? 0L : j;
            this.u = 0;
        } else {
            long b2 = j == -9223372036854775807L ? nl1Var.k(i, this.h).b() : dd.a(j);
            Pair<Integer, Long> i2 = nl1Var.i(this.h, this.i, i, b2);
            this.v = dd.b(b2);
            this.u = ((Integer) i2.first).intValue();
        }
        this.e.Q(nl1Var, i, dd.a(j));
        Iterator<bx0.a> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().e(1);
        }
    }

    public final boolean w() {
        return this.s.a.o() || this.n > 0;
    }

    public final void x(yw0 yw0Var, boolean z, int i, int i2, boolean z2, boolean z3) {
        boolean z4 = !this.j.isEmpty();
        this.j.addLast(new b(yw0Var, this.s, this.g, this.b, z, i, i2, z2, this.k, z3));
        this.s = yw0Var;
        if (z4) {
            return;
        }
        while (!this.j.isEmpty()) {
            this.j.peekFirst().a();
            this.j.removeFirst();
        }
    }
}
