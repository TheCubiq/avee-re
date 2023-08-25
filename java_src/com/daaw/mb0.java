package com.daaw;

import android.net.Uri;
import com.daaw.bp0;
import com.daaw.lb0;
import com.daaw.mp;
import com.daaw.pb0;
import com.daaw.vv0;
import java.util.List;
/* loaded from: classes.dex */
public final class mb0 extends ua implements pb0.d {
    public final pb0 A;
    public final Object B;
    public final gb0 u;
    public final Uri v;
    public final fb0 w;
    public final wi x;
    public final int y;
    public final boolean z;

    /* loaded from: classes.dex */
    public static final class b {
        public final fb0 a;
        public gb0 b;
        public vv0.a<nb0> c;
        public pb0 d;
        public wi e;
        public int f;
        public boolean g;
        public boolean h;
        public Object i;

        public b(fb0 fb0Var) {
            this.a = (fb0) s6.e(fb0Var);
            this.b = gb0.a;
            this.f = 3;
            this.e = new nq();
        }

        public b(mp.a aVar) {
            this(new dr(aVar));
        }

        public mb0 a(Uri uri) {
            this.h = true;
            if (this.d == null) {
                fb0 fb0Var = this.a;
                int i = this.f;
                vv0.a aVar = this.c;
                if (aVar == null) {
                    aVar = new ob0();
                }
                this.d = new fr(fb0Var, i, aVar);
            }
            return new mb0(uri, this.a, this.b, this.e, this.f, this.d, this.g, this.i);
        }

        public b b(vv0.a<nb0> aVar) {
            s6.f(!this.h);
            s6.g(this.d == null, "A playlist tracker has already been set.");
            this.c = (vv0.a) s6.e(aVar);
            return this;
        }
    }

    static {
        vz.a("goog.exo.hls");
    }

    public mb0(Uri uri, fb0 fb0Var, gb0 gb0Var, wi wiVar, int i, pb0 pb0Var, boolean z, Object obj) {
        this.v = uri;
        this.w = fb0Var;
        this.u = gb0Var;
        this.x = wiVar;
        this.y = i;
        this.A = pb0Var;
        this.z = z;
        this.B = obj;
    }

    @Override // com.daaw.bp0
    public void a(qo0 qo0Var) {
        ((kb0) qo0Var).y();
    }

    @Override // com.daaw.pb0.d
    public void d(lb0 lb0Var) {
        od1 od1Var;
        long j;
        long b2 = lb0Var.m ? dd.b(lb0Var.e) : -9223372036854775807L;
        int i = lb0Var.c;
        long j2 = (i == 2 || i == 1) ? b2 : -9223372036854775807L;
        long j3 = lb0Var.d;
        if (this.A.g()) {
            long f = lb0Var.e - this.A.f();
            long j4 = lb0Var.l ? f + lb0Var.p : -9223372036854775807L;
            List<lb0.a> list = lb0Var.o;
            if (j3 == -9223372036854775807L) {
                j = list.isEmpty() ? 0L : list.get(Math.max(0, list.size() - 3)).t;
            } else {
                j = j3;
            }
            od1Var = new od1(j2, b2, j4, lb0Var.p, f, j, true, !lb0Var.l, this.B);
        } else {
            long j5 = j3 == -9223372036854775807L ? 0L : j3;
            long j6 = lb0Var.p;
            od1Var = new od1(j2, b2, j6, j6, 0L, j5, true, false, this.B);
        }
        n(od1Var, new hb0(this.A.i(), lb0Var));
    }

    @Override // com.daaw.bp0
    public void e() {
        this.A.j();
    }

    @Override // com.daaw.bp0
    public qo0 g(bp0.a aVar, l2 l2Var) {
        s6.a(aVar.a == 0);
        return new kb0(this.u, this.A, this.w, this.y, j(aVar), l2Var, this.x, this.z);
    }

    @Override // com.daaw.ua
    public void m(rz rzVar, boolean z) {
        this.A.b(this.v, j(null), this);
    }

    @Override // com.daaw.ua
    public void p() {
        pb0 pb0Var = this.A;
        if (pb0Var != null) {
            pb0Var.a();
        }
    }
}
