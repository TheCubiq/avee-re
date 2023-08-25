package com.daaw;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.daaw.bp0;
import com.daaw.fx0;
import com.daaw.mr;
import com.daaw.nl1;
import com.daaw.qo0;
import com.daaw.wm1;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class uz implements Handler.Callback, qo0.a, wm1.a, bp0.b, mr.a, fx0.a {
    public final long A;
    public final boolean B;
    public final mr C;
    public final ArrayList<c> E;
    public final zf F;
    public yw0 I;
    public bp0 J;
    public a41[] K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public boolean P;
    public int Q;
    public e R;
    public long S;
    public int T;
    public final a41[] p;
    public final b41[] q;
    public final wm1 r;
    public final xm1 s;
    public final hk0 t;
    public final u80 u;
    public final HandlerThread v;
    public final Handler w;
    public final rz x;
    public final nl1.c y;
    public final nl1.b z;
    public final to0 G = new to0();
    public ea1 H = ea1.g;
    public final d D = new d(null);

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ fx0 p;

        public a(fx0 fx0Var) {
            this.p = fx0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                uz.this.f(this.p);
            } catch (qz e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final bp0 a;
        public final nl1 b;
        public final Object c;

        public b(bp0 bp0Var, nl1 nl1Var, Object obj) {
            this.a = bp0Var;
            this.b = nl1Var;
            this.c = obj;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Comparable<c> {
        public final fx0 p;
        public int q;
        public long r;
        public Object s;

        public c(fx0 fx0Var) {
            this.p = fx0Var;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(c cVar) {
            Object obj = this.s;
            if ((obj == null) != (cVar.s == null)) {
                return obj != null ? -1 : 1;
            } else if (obj == null) {
                return 0;
            } else {
                int i = this.q - cVar.q;
                return i != 0 ? i : sq1.j(this.r, cVar.r);
            }
        }

        public void b(int i, long j, Object obj) {
            this.q = i;
            this.r = j;
            this.s = obj;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public yw0 a;
        public int b;
        public boolean c;
        public int d;

        public d() {
        }

        public /* synthetic */ d(a aVar) {
            this();
        }

        public boolean d(yw0 yw0Var) {
            return yw0Var != this.a || this.b > 0 || this.c;
        }

        public void e(int i) {
            this.b += i;
        }

        public void f(yw0 yw0Var) {
            this.a = yw0Var;
            this.b = 0;
            this.c = false;
        }

        public void g(int i) {
            if (this.c && this.d != 4) {
                s6.a(i == 4);
                return;
            }
            this.c = true;
            this.d = i;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public final nl1 a;
        public final int b;
        public final long c;

        public e(nl1 nl1Var, int i, long j) {
            this.a = nl1Var;
            this.b = i;
            this.c = j;
        }
    }

    public uz(a41[] a41VarArr, wm1 wm1Var, xm1 xm1Var, hk0 hk0Var, boolean z, int i, boolean z2, Handler handler, rz rzVar, zf zfVar) {
        this.p = a41VarArr;
        this.r = wm1Var;
        this.s = xm1Var;
        this.t = hk0Var;
        this.M = z;
        this.O = i;
        this.P = z2;
        this.w = handler;
        this.x = rzVar;
        this.F = zfVar;
        this.A = hk0Var.d();
        this.B = hk0Var.b();
        this.I = new yw0(nl1.a, -9223372036854775807L, TrackGroupArray.s, xm1Var);
        this.q = new b41[a41VarArr.length];
        for (int i2 = 0; i2 < a41VarArr.length; i2++) {
            a41VarArr[i2].e(i2);
            this.q[i2] = a41VarArr[i2].n();
        }
        this.C = new mr(this, zfVar);
        this.E = new ArrayList<>();
        this.K = new a41[0];
        this.y = new nl1.c();
        this.z = new nl1.b();
        wm1Var.a(this);
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.v = handlerThread;
        handlerThread.start();
        this.u = zfVar.d(handlerThread.getLooper(), this);
    }

    public static Format[] p(com.google.android.exoplayer2.trackselection.c cVar) {
        int length = cVar != null ? cVar.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i = 0; i < length; i++) {
            formatArr[i] = cVar.d(i);
        }
        return formatArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        if (r6.T < r6.E.size()) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
        r1 = r6.E.get(r6.T);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
        if (r1 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
        if (r1.s == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
        r3 = r1.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
        if (r3 < r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
        if (r3 != r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
        if (r1.r > r7) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
        r1 = r6.T + 1;
        r6.T = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
        if (r1 >= r6.E.size()) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
        if (r1 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
        if (r1.s == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008c, code lost:
        if (r1.q != r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
        r3 = r1.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
        if (r3 <= r7) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0096, code lost:
        if (r3 > r9) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0098, code lost:
        W(r1.p);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a3, code lost:
        if (r1.p.b() != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ab, code lost:
        if (r1.p.j() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ae, code lost:
        r6.T++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b5, code lost:
        r6.E.remove(r6.T);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c4, code lost:
        if (r6.T >= r6.E.size()) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c6, code lost:
        r1 = r6.E.get(r6.T);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d1, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0033 -> B:15:0x0034). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x004a -> B:13:0x002a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0062 -> B:28:0x0063). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0081 -> B:26:0x0057). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(long r7, long r9) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.uz.A(long, long):void");
    }

    public final void B() {
        this.G.v(this.S);
        if (this.G.B()) {
            so0 m = this.G.m(this.S, this.I);
            if (m == null) {
                this.J.e();
                return;
            }
            this.G.e(this.q, this.r, this.t.h(), this.J, this.I.a.g(m.a.a, this.z, true).b, m).p(this, m.b);
            Y(true);
        }
    }

    @Override // com.daaw.gb1.a
    /* renamed from: C */
    public void n(qo0 qo0Var) {
        this.u.f(10, qo0Var).sendToTarget();
    }

    public void D(bp0 bp0Var, boolean z, boolean z2) {
        this.u.c(0, z ? 1 : 0, z2 ? 1 : 0, bp0Var).sendToTarget();
    }

    public final void E(bp0 bp0Var, boolean z, boolean z2) {
        this.Q++;
        J(true, z, z2);
        this.t.a();
        this.J = bp0Var;
        f0(2);
        bp0Var.f(this.x, true, this);
        this.u.b(2);
    }

    public synchronized void F() {
        if (this.L) {
            return;
        }
        this.u.b(7);
        boolean z = false;
        while (!this.L) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final void G() {
        J(true, true, true);
        this.t.g();
        f0(1);
        this.v.quit();
        synchronized (this) {
            this.L = true;
            notifyAll();
        }
    }

    public final boolean H(a41 a41Var) {
        ro0 ro0Var = this.G.o().i;
        return ro0Var != null && ro0Var.f && a41Var.j();
    }

    public final void I() {
        if (this.G.r()) {
            float f = this.C.h().a;
            ro0 o = this.G.o();
            boolean z = true;
            for (ro0 n = this.G.n(); n != null && n.f; n = n.i) {
                if (n.o(f)) {
                    if (z) {
                        ro0 n2 = this.G.n();
                        boolean w = this.G.w(n2);
                        boolean[] zArr = new boolean[this.p.length];
                        long b2 = n2.b(this.I.j, w, zArr);
                        l0(n2.j, n2.k);
                        yw0 yw0Var = this.I;
                        if (yw0Var.f != 4 && b2 != yw0Var.j) {
                            yw0 yw0Var2 = this.I;
                            this.I = yw0Var2.g(yw0Var2.c, b2, yw0Var2.e);
                            this.D.g(4);
                            K(b2);
                        }
                        boolean[] zArr2 = new boolean[this.p.length];
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            a41[] a41VarArr = this.p;
                            if (i >= a41VarArr.length) {
                                break;
                            }
                            a41 a41Var = a41VarArr[i];
                            zArr2[i] = a41Var.getState() != 0;
                            d81 d81Var = n2.c[i];
                            if (d81Var != null) {
                                i2++;
                            }
                            if (zArr2[i]) {
                                if (d81Var != a41Var.b()) {
                                    g(a41Var);
                                } else if (zArr[i]) {
                                    a41Var.t(this.S);
                                }
                            }
                            i++;
                        }
                        this.I = this.I.f(n2.j, n2.k);
                        l(zArr2, i2);
                    } else {
                        this.G.w(n);
                        if (n.f) {
                            n.a(Math.max(n.h.b, n.p(this.S)), false);
                            l0(n.j, n.k);
                        }
                    }
                    if (this.I.f != 4) {
                        x();
                        n0();
                        this.u.b(2);
                        return;
                    }
                    return;
                }
                if (n == o) {
                    z = false;
                }
            }
        }
    }

    public final void J(boolean z, boolean z2, boolean z3) {
        bp0 bp0Var;
        this.u.e(2);
        this.N = false;
        this.C.i();
        this.S = 0L;
        for (a41 a41Var : this.K) {
            try {
                g(a41Var);
            } catch (qz | RuntimeException unused) {
            }
        }
        this.K = new a41[0];
        this.G.d(!z2);
        Y(false);
        if (z2) {
            this.R = null;
        }
        if (z3) {
            this.G.A(nl1.a);
            Iterator<c> it = this.E.iterator();
            while (it.hasNext()) {
                it.next().p.k(false);
            }
            this.E.clear();
            this.T = 0;
        }
        nl1 nl1Var = z3 ? nl1.a : this.I.a;
        Object obj = z3 ? null : this.I.b;
        bp0.a aVar = z2 ? new bp0.a(o()) : this.I.c;
        long j = z2 ? -9223372036854775807L : this.I.j;
        long j2 = z2 ? -9223372036854775807L : this.I.e;
        yw0 yw0Var = this.I;
        this.I = new yw0(nl1Var, obj, aVar, j, j2, yw0Var.f, false, z3 ? TrackGroupArray.s : yw0Var.h, z3 ? this.s : yw0Var.i);
        if (!z || (bp0Var = this.J) == null) {
            return;
        }
        bp0Var.h(this);
        this.J = null;
    }

    public final void K(long j) {
        if (this.G.r()) {
            j = this.G.n().q(j);
        }
        this.S = j;
        this.C.e(j);
        for (a41 a41Var : this.K) {
            a41Var.t(this.S);
        }
    }

    public final boolean L(c cVar) {
        Object obj = cVar.s;
        if (obj == null) {
            Pair<Integer, Long> N = N(new e(cVar.p.g(), cVar.p.i(), dd.a(cVar.p.e())), false);
            if (N == null) {
                return false;
            }
            cVar.b(((Integer) N.first).intValue(), ((Long) N.second).longValue(), this.I.a.g(((Integer) N.first).intValue(), this.z, true).b);
        } else {
            int b2 = this.I.a.b(obj);
            if (b2 == -1) {
                return false;
            }
            cVar.q = b2;
        }
        return true;
    }

    public final void M() {
        for (int size = this.E.size() - 1; size >= 0; size--) {
            if (!L(this.E.get(size))) {
                this.E.get(size).p.k(false);
                this.E.remove(size);
            }
        }
        Collections.sort(this.E);
    }

    public final Pair<Integer, Long> N(e eVar, boolean z) {
        int O;
        nl1 nl1Var = this.I.a;
        nl1 nl1Var2 = eVar.a;
        if (nl1Var.o()) {
            return null;
        }
        if (nl1Var2.o()) {
            nl1Var2 = nl1Var;
        }
        try {
            Pair<Integer, Long> i = nl1Var2.i(this.y, this.z, eVar.b, eVar.c);
            if (nl1Var == nl1Var2) {
                return i;
            }
            int b2 = nl1Var.b(nl1Var2.g(((Integer) i.first).intValue(), this.z, true).b);
            if (b2 != -1) {
                return Pair.create(Integer.valueOf(b2), i.second);
            }
            if (!z || (O = O(((Integer) i.first).intValue(), nl1Var2, nl1Var)) == -1) {
                return null;
            }
            return q(nl1Var, nl1Var.f(O, this.z).c, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new we0(nl1Var, eVar.b, eVar.c);
        }
    }

    public final int O(int i, nl1 nl1Var, nl1 nl1Var2) {
        int h = nl1Var.h();
        int i2 = i;
        int i3 = -1;
        for (int i4 = 0; i4 < h && i3 == -1; i4++) {
            i2 = nl1Var.d(i2, this.z, this.y, this.O, this.P);
            if (i2 == -1) {
                break;
            }
            i3 = nl1Var2.b(nl1Var.g(i2, this.z, true).b);
        }
        return i3;
    }

    public final void P(long j, long j2) {
        this.u.e(2);
        this.u.d(2, j + j2);
    }

    public void Q(nl1 nl1Var, int i, long j) {
        this.u.f(3, new e(nl1Var, i, j)).sendToTarget();
    }

    public final void R(boolean z) {
        bp0.a aVar = this.G.n().h.a;
        long U = U(aVar, this.I.j, true);
        if (U != this.I.j) {
            yw0 yw0Var = this.I;
            this.I = yw0Var.g(aVar, U, yw0Var.e);
            if (z) {
                this.D.g(4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[Catch: all -> 0x00db, TryCatch #0 {all -> 0x00db, blocks: (B:15:0x005d, B:17:0x0061, B:22:0x006a, B:23:0x0072, B:25:0x007c, B:29:0x0088, B:31:0x0092, B:33:0x00a2, B:39:0x00b9, B:43:0x00c3, B:44:0x00c7), top: B:57:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072 A[Catch: all -> 0x00db, TryCatch #0 {all -> 0x00db, blocks: (B:15:0x005d, B:17:0x0061, B:22:0x006a, B:23:0x0072, B:25:0x007c, B:29:0x0088, B:31:0x0092, B:33:0x00a2, B:39:0x00b9, B:43:0x00c3, B:44:0x00c7), top: B:57:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(com.daaw.uz.e r21) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.uz.S(com.daaw.uz$e):void");
    }

    public final long T(bp0.a aVar, long j) {
        return U(aVar, j, this.G.n() != this.G.o());
    }

    public final long U(bp0.a aVar, long j, boolean z) {
        k0();
        this.N = false;
        f0(2);
        ro0 n = this.G.n();
        ro0 ro0Var = n;
        while (true) {
            if (ro0Var == null) {
                break;
            } else if (g0(aVar, j, ro0Var)) {
                this.G.w(ro0Var);
                break;
            } else {
                ro0Var = this.G.a();
            }
        }
        if (n != ro0Var || z) {
            for (a41 a41Var : this.K) {
                g(a41Var);
            }
            this.K = new a41[0];
            n = null;
        }
        if (ro0Var != null) {
            o0(n);
            if (ro0Var.g) {
                long m = ro0Var.a.m(j);
                ro0Var.a.t(m - this.A, this.B);
                j = m;
            }
            K(j);
            x();
        } else {
            this.G.d(true);
            K(j);
        }
        this.u.b(2);
        return j;
    }

    public final void V(fx0 fx0Var) {
        if (fx0Var.e() == -9223372036854775807L) {
            W(fx0Var);
        } else if (this.J == null || this.Q > 0) {
            this.E.add(new c(fx0Var));
        } else {
            c cVar = new c(fx0Var);
            if (!L(cVar)) {
                fx0Var.k(false);
                return;
            }
            this.E.add(cVar);
            Collections.sort(this.E);
        }
    }

    public final void W(fx0 fx0Var) {
        if (fx0Var.c().getLooper() != this.u.g()) {
            this.u.f(15, fx0Var).sendToTarget();
            return;
        }
        f(fx0Var);
        int i = this.I.f;
        if (i == 3 || i == 2) {
            this.u.b(2);
        }
    }

    public final void X(fx0 fx0Var) {
        fx0Var.c().post(new a(fx0Var));
    }

    public final void Y(boolean z) {
        yw0 yw0Var = this.I;
        if (yw0Var.g != z) {
            this.I = yw0Var.b(z);
        }
    }

    public void Z(boolean z) {
        this.u.a(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void a0(boolean z) {
        this.N = false;
        this.M = z;
        if (!z) {
            k0();
            n0();
            return;
        }
        int i = this.I.f;
        if (i == 3) {
            i0();
        } else if (i != 2) {
            return;
        }
        this.u.b(2);
    }

    @Override // com.daaw.fx0.a
    public synchronized void b(fx0 fx0Var) {
        if (this.L) {
            fx0Var.k(false);
        } else {
            this.u.f(14, fx0Var).sendToTarget();
        }
    }

    public final void b0(zw0 zw0Var) {
        this.C.f(zw0Var);
    }

    @Override // com.daaw.mr.a
    public void c(zw0 zw0Var) {
        this.w.obtainMessage(1, zw0Var).sendToTarget();
        p0(zw0Var.a);
    }

    public final void c0(int i) {
        this.O = i;
        if (this.G.E(i)) {
            return;
        }
        R(true);
    }

    @Override // com.daaw.bp0.b
    public void d(bp0 bp0Var, nl1 nl1Var, Object obj) {
        this.u.f(8, new b(bp0Var, nl1Var, obj)).sendToTarget();
    }

    public final void d0(ea1 ea1Var) {
        this.H = ea1Var;
    }

    public final void e0(boolean z) {
        this.P = z;
        if (this.G.F(z)) {
            return;
        }
        R(true);
    }

    public final void f(fx0 fx0Var) {
        if (fx0Var.j()) {
            return;
        }
        try {
            fx0Var.f().r(fx0Var.h(), fx0Var.d());
        } finally {
            fx0Var.k(true);
        }
    }

    public final void f0(int i) {
        yw0 yw0Var = this.I;
        if (yw0Var.f != i) {
            this.I = yw0Var.d(i);
        }
    }

    public final void g(a41 a41Var) {
        this.C.c(a41Var);
        m(a41Var);
        a41Var.g();
    }

    public final boolean g0(bp0.a aVar, long j, ro0 ro0Var) {
        if (aVar.equals(ro0Var.h.a) && ro0Var.f) {
            this.I.a.f(ro0Var.h.a.a, this.z);
            int d2 = this.z.d(j);
            return d2 == -1 || this.z.f(d2) == ro0Var.h.c;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.uz.h():void");
    }

    public final boolean h0(boolean z) {
        if (this.K.length == 0) {
            return w();
        }
        if (z) {
            if (this.I.g) {
                ro0 i = this.G.i();
                long h = i.h(!i.h.g);
                return h == Long.MIN_VALUE || this.t.e(h - i.p(this.S), this.C.h().a, this.N);
            }
            return true;
        }
        return false;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Handler handler;
        qz e2;
        try {
            switch (message.what) {
                case 0:
                    E((bp0) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    a0(message.arg1 != 0);
                    break;
                case 2:
                    h();
                    break;
                case 3:
                    S((e) message.obj);
                    break;
                case 4:
                    b0((zw0) message.obj);
                    break;
                case 5:
                    d0((ea1) message.obj);
                    break;
                case 6:
                    j0(message.arg1 != 0, true);
                    break;
                case 7:
                    G();
                    return true;
                case 8:
                    v((b) message.obj);
                    break;
                case 9:
                    t((qo0) message.obj);
                    break;
                case 10:
                    s((qo0) message.obj);
                    break;
                case 11:
                    I();
                    break;
                case 12:
                    c0(message.arg1);
                    break;
                case 13:
                    e0(message.arg1 != 0);
                    break;
                case 14:
                    V((fx0) message.obj);
                    break;
                case 15:
                    X((fx0) message.obj);
                    break;
                default:
                    return false;
            }
            y();
        } catch (qz e3) {
            e2 = e3;
            j0(false, false);
            handler = this.w;
            handler.obtainMessage(2, e2).sendToTarget();
            y();
            return true;
        } catch (IOException e4) {
            j0(false, false);
            handler = this.w;
            e2 = qz.b(e4);
            handler.obtainMessage(2, e2).sendToTarget();
            y();
            return true;
        } catch (RuntimeException e5) {
            j0(false, false);
            handler = this.w;
            e2 = qz.c(e5);
            handler.obtainMessage(2, e2).sendToTarget();
            y();
            return true;
        }
        return true;
    }

    public final void i(int i, boolean z, int i2) {
        ro0 n = this.G.n();
        a41 a41Var = this.p[i];
        this.K[i2] = a41Var;
        if (a41Var.getState() == 0) {
            xm1 xm1Var = n.k;
            c41 c41Var = xm1Var.b[i];
            Format[] p = p(xm1Var.c.a(i));
            boolean z2 = this.M && this.I.f == 3;
            a41Var.k(c41Var, p, n.c[i], this.S, !z && z2, n.j());
            this.C.d(a41Var);
            if (z2) {
                a41Var.start();
            }
        }
    }

    public final void i0() {
        this.N = false;
        this.C.g();
        for (a41 a41Var : this.K) {
            a41Var.start();
        }
    }

    @Override // com.daaw.qo0.a
    public void j(qo0 qo0Var) {
        this.u.f(9, qo0Var).sendToTarget();
    }

    public final void j0(boolean z, boolean z2) {
        J(true, z, z);
        this.D.e(this.Q + (z2 ? 1 : 0));
        this.Q = 0;
        this.t.i();
        f0(1);
    }

    public final void k0() {
        this.C.i();
        for (a41 a41Var : this.K) {
            m(a41Var);
        }
    }

    public final void l(boolean[] zArr, int i) {
        this.K = new a41[i];
        ro0 n = this.G.n();
        int i2 = 0;
        for (int i3 = 0; i3 < this.p.length; i3++) {
            if (n.k.c(i3)) {
                i(i3, zArr[i3], i2);
                i2++;
            }
        }
    }

    public final void l0(TrackGroupArray trackGroupArray, xm1 xm1Var) {
        this.t.c(this.p, trackGroupArray, xm1Var.c);
    }

    public final void m(a41 a41Var) {
        if (a41Var.getState() == 2) {
            a41Var.stop();
        }
    }

    public final void m0() {
        bp0 bp0Var = this.J;
        if (bp0Var == null) {
            return;
        }
        if (this.Q > 0) {
            bp0Var.e();
            return;
        }
        B();
        ro0 i = this.G.i();
        int i2 = 0;
        if (i == null || i.l()) {
            Y(false);
        } else if (!this.I.g) {
            x();
        }
        if (!this.G.r()) {
            return;
        }
        ro0 n = this.G.n();
        ro0 o = this.G.o();
        boolean z = false;
        while (this.M && n != o && this.S >= n.i.e) {
            if (z) {
                y();
            }
            int i3 = n.h.f ? 0 : 3;
            ro0 a2 = this.G.a();
            o0(n);
            yw0 yw0Var = this.I;
            so0 so0Var = a2.h;
            this.I = yw0Var.g(so0Var.a, so0Var.b, so0Var.d);
            this.D.g(i3);
            n0();
            n = a2;
            z = true;
        }
        if (o.h.g) {
            while (true) {
                a41[] a41VarArr = this.p;
                if (i2 >= a41VarArr.length) {
                    return;
                }
                a41 a41Var = a41VarArr[i2];
                d81 d81Var = o.c[i2];
                if (d81Var != null && a41Var.b() == d81Var && a41Var.j()) {
                    a41Var.l();
                }
                i2++;
            }
        } else {
            ro0 ro0Var = o.i;
            if (ro0Var == null || !ro0Var.f) {
                return;
            }
            int i4 = 0;
            while (true) {
                a41[] a41VarArr2 = this.p;
                if (i4 < a41VarArr2.length) {
                    a41 a41Var2 = a41VarArr2[i4];
                    d81 d81Var2 = o.c[i4];
                    if (a41Var2.b() != d81Var2) {
                        return;
                    }
                    if (d81Var2 != null && !a41Var2.j()) {
                        return;
                    }
                    i4++;
                } else {
                    xm1 xm1Var = o.k;
                    ro0 b2 = this.G.b();
                    xm1 xm1Var2 = b2.k;
                    boolean z2 = b2.a.q() != -9223372036854775807L;
                    int i5 = 0;
                    while (true) {
                        a41[] a41VarArr3 = this.p;
                        if (i5 >= a41VarArr3.length) {
                            return;
                        }
                        a41 a41Var3 = a41VarArr3[i5];
                        if (xm1Var.c(i5)) {
                            if (!z2) {
                                if (!a41Var3.u()) {
                                    com.google.android.exoplayer2.trackselection.c a3 = xm1Var2.c.a(i5);
                                    boolean c2 = xm1Var2.c(i5);
                                    boolean z3 = this.q[i5].i() == 5;
                                    c41 c41Var = xm1Var.b[i5];
                                    c41 c41Var2 = xm1Var2.b[i5];
                                    if (c2 && c41Var2.equals(c41Var) && !z3) {
                                        a41Var3.m(p(a3), b2.c[i5], b2.j());
                                    }
                                }
                            }
                            a41Var3.l();
                        }
                        i5++;
                    }
                }
            }
        }
    }

    public final void n0() {
        if (this.G.r()) {
            ro0 n = this.G.n();
            long q = n.a.q();
            if (q != -9223372036854775807L) {
                K(q);
                if (q != this.I.j) {
                    yw0 yw0Var = this.I;
                    this.I = yw0Var.g(yw0Var.c, q, yw0Var.e);
                    this.D.g(4);
                }
            } else {
                long j = this.C.j();
                this.S = j;
                long p = n.p(j);
                A(this.I.j, p);
                this.I.j = p;
            }
            this.I.k = this.K.length == 0 ? n.h.e : n.h(true);
        }
    }

    public final int o() {
        nl1 nl1Var = this.I.a;
        if (nl1Var.o()) {
            return 0;
        }
        return nl1Var.k(nl1Var.a(this.P), this.y).f;
    }

    public final void o0(ro0 ro0Var) {
        ro0 n = this.G.n();
        if (n == null || ro0Var == n) {
            return;
        }
        boolean[] zArr = new boolean[this.p.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            a41[] a41VarArr = this.p;
            if (i >= a41VarArr.length) {
                this.I = this.I.f(n.j, n.k);
                l(zArr, i2);
                return;
            }
            a41 a41Var = a41VarArr[i];
            zArr[i] = a41Var.getState() != 0;
            if (n.k.c(i)) {
                i2++;
            }
            if (zArr[i] && (!n.k.c(i) || (a41Var.u() && a41Var.b() == ro0Var.c[i]))) {
                g(a41Var);
            }
            i++;
        }
    }

    public final void p0(float f) {
        com.google.android.exoplayer2.trackselection.c[] b2;
        for (ro0 h = this.G.h(); h != null; h = h.i) {
            xm1 xm1Var = h.k;
            if (xm1Var != null) {
                for (com.google.android.exoplayer2.trackselection.c cVar : xm1Var.c.b()) {
                    if (cVar != null) {
                        cVar.m(f);
                    }
                }
            }
        }
    }

    public final Pair<Integer, Long> q(nl1 nl1Var, int i, long j) {
        return nl1Var.i(this.y, this.z, i, j);
    }

    public Looper r() {
        return this.v.getLooper();
    }

    public final void s(qo0 qo0Var) {
        if (this.G.u(qo0Var)) {
            this.G.v(this.S);
            x();
        }
    }

    public final void t(qo0 qo0Var) {
        if (this.G.u(qo0Var)) {
            ro0 i = this.G.i();
            i.k(this.C.h().a);
            l0(i.j, i.k);
            if (!this.G.r()) {
                K(this.G.a().h.b);
                o0(null);
            }
            x();
        }
    }

    public final void u() {
        f0(4);
        J(false, true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
        if (r11.b() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009c, code lost:
        if (r11.b() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009e, code lost:
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a0, code lost:
        r12 = r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(com.daaw.uz.b r20) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.uz.v(com.daaw.uz$b):void");
    }

    public final boolean w() {
        ro0 ro0Var;
        ro0 n = this.G.n();
        long j = n.h.e;
        return j == -9223372036854775807L || this.I.j < j || ((ro0Var = n.i) != null && (ro0Var.f || ro0Var.h.a.b()));
    }

    public final void x() {
        ro0 i = this.G.i();
        long i2 = i.i();
        if (i2 == Long.MIN_VALUE) {
            Y(false);
            return;
        }
        boolean f = this.t.f(i2 - i.p(this.S), this.C.h().a);
        Y(f);
        if (f) {
            i.d(this.S);
        }
    }

    public final void y() {
        if (this.D.d(this.I)) {
            this.w.obtainMessage(0, this.D.b, this.D.c ? this.D.d : -1, this.I).sendToTarget();
            this.D.f(this.I);
        }
    }

    public final void z() {
        ro0 i = this.G.i();
        ro0 o = this.G.o();
        if (i == null || i.f) {
            return;
        }
        if (o == null || o.i == i) {
            for (a41 a41Var : this.K) {
                if (!a41Var.j()) {
                    return;
                }
            }
            i.a.l();
        }
    }
}
