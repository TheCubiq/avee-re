package com.daaw;

import android.net.Uri;
import com.daaw.InterfaceC2200mp;
import com.daaw.bp0;
import com.daaw.lb0;
import com.daaw.pb0;
import com.daaw.vv0;
import java.util.List;
/* loaded from: classes.dex */
public final class mb0 extends AbstractC3190ua implements pb0.InterfaceC2539d {

    /* renamed from: A */
    public final pb0 f18737A;

    /* renamed from: B */
    public final Object f18738B;

    /* renamed from: u */
    public final gb0 f18739u;

    /* renamed from: v */
    public final Uri f18740v;

    /* renamed from: w */
    public final fb0 f18741w;

    /* renamed from: x */
    public final InterfaceC3441wi f18742x;

    /* renamed from: y */
    public final int f18743y;

    /* renamed from: z */
    public final boolean f18744z;

    /* renamed from: com.daaw.mb0$b */
    /* loaded from: classes.dex */
    public static final class C2164b {

        /* renamed from: a */
        public final fb0 f18745a;

        /* renamed from: b */
        public gb0 f18746b;

        /* renamed from: c */
        public vv0.InterfaceC3379a<nb0> f18747c;

        /* renamed from: d */
        public pb0 f18748d;

        /* renamed from: e */
        public InterfaceC3441wi f18749e;

        /* renamed from: f */
        public int f18750f;

        /* renamed from: g */
        public boolean f18751g;

        /* renamed from: h */
        public boolean f18752h;

        /* renamed from: i */
        public Object f18753i;

        public C2164b(fb0 fb0Var) {
            this.f18745a = (fb0) C2914s6.m10686e(fb0Var);
            this.f18746b = gb0.f10996a;
            this.f18750f = 3;
            this.f18749e = new C2358nq();
        }

        public C2164b(InterfaceC2200mp.InterfaceC2201a interfaceC2201a) {
            this(new C1128dr(interfaceC2201a));
        }

        /* renamed from: a */
        public mb0 m16117a(Uri uri) {
            this.f18752h = true;
            if (this.f18748d == null) {
                fb0 fb0Var = this.f18745a;
                int i = this.f18750f;
                vv0.InterfaceC3379a interfaceC3379a = this.f18747c;
                if (interfaceC3379a == null) {
                    interfaceC3379a = new ob0();
                }
                this.f18748d = new C1322fr(fb0Var, i, interfaceC3379a);
            }
            return new mb0(uri, this.f18745a, this.f18746b, this.f18749e, this.f18750f, this.f18748d, this.f18751g, this.f18753i);
        }

        /* renamed from: b */
        public C2164b m16116b(vv0.InterfaceC3379a<nb0> interfaceC3379a) {
            C2914s6.m10685f(!this.f18752h);
            C2914s6.m10684g(this.f18748d == null, "A playlist tracker has already been set.");
            this.f18747c = (vv0.InterfaceC3379a) C2914s6.m10686e(interfaceC3379a);
            return this;
        }
    }

    static {
        C3387vz.m6643a("goog.exo.hls");
    }

    public mb0(Uri uri, fb0 fb0Var, gb0 gb0Var, InterfaceC3441wi interfaceC3441wi, int i, pb0 pb0Var, boolean z, Object obj) {
        this.f18740v = uri;
        this.f18741w = fb0Var;
        this.f18739u = gb0Var;
        this.f18742x = interfaceC3441wi;
        this.f18743y = i;
        this.f18737A = pb0Var;
        this.f18744z = z;
        this.f18738B = obj;
    }

    @Override // com.daaw.bp0
    /* renamed from: a */
    public void mo16120a(qo0 qo0Var) {
        ((kb0) qo0Var).m17837y();
    }

    @Override // com.daaw.pb0.InterfaceC2539d
    /* renamed from: d */
    public void mo13493d(lb0 lb0Var) {
        od1 od1Var;
        long j;
        long m24526b = lb0Var.f17195m ? C1075dd.m24526b(lb0Var.f17187e) : -9223372036854775807L;
        int i = lb0Var.f17185c;
        long j2 = (i == 2 || i == 1) ? m24526b : -9223372036854775807L;
        long j3 = lb0Var.f17186d;
        if (this.f18737A.mo13501g()) {
            long mo13502f = lb0Var.f17187e - this.f18737A.mo13502f();
            long j4 = lb0Var.f17194l ? mo13502f + lb0Var.f17198p : -9223372036854775807L;
            List<lb0.C2025a> list = lb0Var.f17197o;
            if (j3 == -9223372036854775807L) {
                j = list.isEmpty() ? 0L : list.get(Math.max(0, list.size() - 3)).f17203t;
            } else {
                j = j3;
            }
            od1Var = new od1(j2, m24526b, j4, lb0Var.f17198p, mo13502f, j, true, !lb0Var.f17194l, this.f18738B);
        } else {
            long j5 = j3 == -9223372036854775807L ? 0L : j3;
            long j6 = lb0Var.f17198p;
            od1Var = new od1(j2, m24526b, j6, j6, 0L, j5, true, false, this.f18738B);
        }
        m8397n(od1Var, new hb0(this.f18737A.mo13499i(), lb0Var));
    }

    @Override // com.daaw.bp0
    /* renamed from: e */
    public void mo16119e() {
        this.f18737A.mo13498j();
    }

    @Override // com.daaw.bp0
    /* renamed from: g */
    public qo0 mo16118g(bp0.C0880a c0880a, InterfaceC2006l2 interfaceC2006l2) {
        C2914s6.m10690a(c0880a.f5022a == 0);
        return new kb0(this.f18739u, this.f18737A, this.f18741w, this.f18743y, m8400j(c0880a), interfaceC2006l2, this.f18742x, this.f18744z);
    }

    @Override // com.daaw.AbstractC3190ua
    /* renamed from: m */
    public void mo8398m(InterfaceC2898rz interfaceC2898rz, boolean z) {
        this.f18737A.mo13506b(this.f18740v, m8400j(null), this);
    }

    @Override // com.daaw.AbstractC3190ua
    /* renamed from: p */
    public void mo8396p() {
        pb0 pb0Var = this.f18737A;
        if (pb0Var != null) {
            pb0Var.mo13507a();
        }
    }
}
