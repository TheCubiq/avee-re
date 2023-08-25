package com.daaw;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.daaw.bp0;
import com.daaw.cp0;
import com.daaw.jk0;
import com.daaw.lk0;
import com.daaw.mp;
import com.daaw.vv0;
import com.daaw.we1;
import com.daaw.xe1;
import java.io.IOException;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class af1 extends ua implements jk0.a<vv0<xe1>> {
    public final long A;
    public final cp0.a B;
    public final vv0.a<? extends xe1> C;
    public final ArrayList<ze1> D;
    public final Object E;
    public mp F;
    public jk0 G;
    public lk0 H;
    public long I;
    public xe1 J;
    public Handler K;
    public final boolean u;
    public final Uri v;
    public final mp.a w;
    public final we1.a x;
    public final wi y;
    public final int z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            af1.this.x();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final we1.a a;
        public final mp.a b;
        public vv0.a<? extends xe1> c;
        public boolean g;
        public Object h;
        public int e = 3;
        public long f = 30000;
        public wi d = new nq();

        public b(we1.a aVar, mp.a aVar2) {
            this.a = (we1.a) s6.e(aVar);
            this.b = aVar2;
        }

        public af1 a(Uri uri) {
            this.g = true;
            if (this.c == null) {
                this.c = new ye1();
            }
            return new af1(null, (Uri) s6.e(uri), this.b, this.c, this.a, this.d, this.e, this.f, this.h, null);
        }

        public b b(vv0.a<? extends xe1> aVar) {
            s6.f(!this.g);
            this.c = (vv0.a) s6.e(aVar);
            return this;
        }
    }

    static {
        vz.a("goog.exo.smoothstreaming");
    }

    public af1(xe1 xe1Var, Uri uri, mp.a aVar, vv0.a<? extends xe1> aVar2, we1.a aVar3, wi wiVar, int i, long j, Object obj) {
        s6.f(xe1Var == null || !xe1Var.d);
        this.J = xe1Var;
        this.v = uri == null ? null : bf1.a(uri);
        this.w = aVar;
        this.C = aVar2;
        this.x = aVar3;
        this.y = wiVar;
        this.z = i;
        this.A = j;
        this.B = j(null);
        this.E = obj;
        this.u = xe1Var != null;
        this.D = new ArrayList<>();
    }

    public /* synthetic */ af1(xe1 xe1Var, Uri uri, mp.a aVar, vv0.a aVar2, we1.a aVar3, wi wiVar, int i, long j, Object obj, a aVar4) {
        this(xe1Var, uri, aVar, aVar2, aVar3, wiVar, i, j, obj);
    }

    @Override // com.daaw.bp0
    public void a(qo0 qo0Var) {
        ((ze1) qo0Var).v();
        this.D.remove(qo0Var);
    }

    @Override // com.daaw.bp0
    public void e() {
        this.H.a();
    }

    @Override // com.daaw.bp0
    public qo0 g(bp0.a aVar, l2 l2Var) {
        s6.a(aVar.a == 0);
        ze1 ze1Var = new ze1(this.J, this.x, this.y, this.z, j(aVar), this.H, l2Var);
        this.D.add(ze1Var);
        return ze1Var;
    }

    @Override // com.daaw.ua
    public void m(rz rzVar, boolean z) {
        if (this.u) {
            this.H = new lk0.a();
            v();
            return;
        }
        this.F = this.w.a();
        jk0 jk0Var = new jk0("Loader:Manifest");
        this.G = jk0Var;
        this.H = jk0Var;
        this.K = new Handler();
        x();
    }

    @Override // com.daaw.ua
    public void p() {
        this.J = this.u ? this.J : null;
        this.F = null;
        this.I = 0L;
        jk0 jk0Var = this.G;
        if (jk0Var != null) {
            jk0Var.i();
            this.G = null;
        }
        Handler handler = this.K;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.K = null;
        }
    }

    @Override // com.daaw.jk0.a
    /* renamed from: s */
    public void k(vv0<xe1> vv0Var, long j, long j2, boolean z) {
        this.B.f(vv0Var.a, vv0Var.b, j, j2, vv0Var.c());
    }

    @Override // com.daaw.jk0.a
    /* renamed from: t */
    public void o(vv0<xe1> vv0Var, long j, long j2) {
        this.B.i(vv0Var.a, vv0Var.b, j, j2, vv0Var.c());
        this.J = vv0Var.d();
        this.I = j - j2;
        v();
        w();
    }

    @Override // com.daaw.jk0.a
    /* renamed from: u */
    public int r(vv0<xe1> vv0Var, long j, long j2, IOException iOException) {
        boolean z = iOException instanceof tv0;
        this.B.l(vv0Var.a, vv0Var.b, j, j2, vv0Var.c(), iOException, z);
        return z ? 3 : 0;
    }

    public final void v() {
        xe1.b[] bVarArr;
        od1 od1Var;
        for (int i = 0; i < this.D.size(); i++) {
            this.D.get(i).x(this.J);
        }
        long j = Long.MIN_VALUE;
        long j2 = Long.MAX_VALUE;
        for (xe1.b bVar : this.J.f) {
            if (bVar.k > 0) {
                j2 = Math.min(j2, bVar.e(0));
                j = Math.max(j, bVar.e(bVar.k - 1) + bVar.c(bVar.k - 1));
            }
        }
        if (j2 == Long.MAX_VALUE) {
            od1Var = new od1(this.J.d ? -9223372036854775807L : 0L, 0L, 0L, 0L, true, this.J.d, this.E);
        } else {
            xe1 xe1Var = this.J;
            if (xe1Var.d) {
                long j3 = xe1Var.h;
                if (j3 != -9223372036854775807L && j3 > 0) {
                    j2 = Math.max(j2, j - j3);
                }
                long j4 = j2;
                long j5 = j - j4;
                long a2 = j5 - dd.a(this.A);
                if (a2 < 5000000) {
                    a2 = Math.min(5000000L, j5 / 2);
                }
                od1Var = new od1(-9223372036854775807L, j5, j4, a2, true, true, this.E);
            } else {
                long j6 = xe1Var.g;
                long j7 = j6 != -9223372036854775807L ? j6 : j - j2;
                od1Var = new od1(j2 + j7, j7, j2, 0L, true, false, this.E);
            }
        }
        n(od1Var, this.J);
    }

    public final void w() {
        if (this.J.d) {
            this.K.postDelayed(new a(), Math.max(0L, (this.I + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    public final void x() {
        vv0 vv0Var = new vv0(this.F, this.v, 4, this.C);
        this.B.o(vv0Var.a, vv0Var.b, this.G.k(vv0Var, this, this.z));
    }
}
