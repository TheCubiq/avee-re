package com.daaw;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.daaw.InterfaceC2200mp;
import com.daaw.bp0;
import com.daaw.cp0;
import com.daaw.jk0;
import com.daaw.lk0;
import com.daaw.vv0;
import com.daaw.we1;
import com.daaw.xe1;
import java.io.IOException;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class af1 extends AbstractC3190ua implements jk0.InterfaceC1834a<vv0<xe1>> {

    /* renamed from: A */
    public final long f3140A;

    /* renamed from: B */
    public final cp0.C0975a f3141B;

    /* renamed from: C */
    public final vv0.InterfaceC3379a<? extends xe1> f3142C;

    /* renamed from: D */
    public final ArrayList<ze1> f3143D;

    /* renamed from: E */
    public final Object f3144E;

    /* renamed from: F */
    public InterfaceC2200mp f3145F;

    /* renamed from: G */
    public jk0 f3146G;

    /* renamed from: H */
    public lk0 f3147H;

    /* renamed from: I */
    public long f3148I;

    /* renamed from: J */
    public xe1 f3149J;

    /* renamed from: K */
    public Handler f3150K;

    /* renamed from: u */
    public final boolean f3151u;

    /* renamed from: v */
    public final Uri f3152v;

    /* renamed from: w */
    public final InterfaceC2200mp.InterfaceC2201a f3153w;

    /* renamed from: x */
    public final we1.InterfaceC3434a f3154x;

    /* renamed from: y */
    public final InterfaceC3441wi f3155y;

    /* renamed from: z */
    public final int f3156z;

    /* renamed from: com.daaw.af1$a */
    /* loaded from: classes.dex */
    public class RunnableC0621a implements Runnable {
        public RunnableC0621a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            af1.this.m27498x();
        }
    }

    /* renamed from: com.daaw.af1$b */
    /* loaded from: classes.dex */
    public static final class C0622b {

        /* renamed from: a */
        public final we1.InterfaceC3434a f3158a;

        /* renamed from: b */
        public final InterfaceC2200mp.InterfaceC2201a f3159b;

        /* renamed from: c */
        public vv0.InterfaceC3379a<? extends xe1> f3160c;

        /* renamed from: g */
        public boolean f3164g;

        /* renamed from: h */
        public Object f3165h;

        /* renamed from: e */
        public int f3162e = 3;

        /* renamed from: f */
        public long f3163f = 30000;

        /* renamed from: d */
        public InterfaceC3441wi f3161d = new C2358nq();

        public C0622b(we1.InterfaceC3434a interfaceC3434a, InterfaceC2200mp.InterfaceC2201a interfaceC2201a) {
            this.f3158a = (we1.InterfaceC3434a) C2914s6.m10686e(interfaceC3434a);
            this.f3159b = interfaceC2201a;
        }

        /* renamed from: a */
        public af1 m27497a(Uri uri) {
            this.f3164g = true;
            if (this.f3160c == null) {
                this.f3160c = new ye1();
            }
            return new af1(null, (Uri) C2914s6.m10686e(uri), this.f3159b, this.f3160c, this.f3158a, this.f3161d, this.f3162e, this.f3163f, this.f3165h, null);
        }

        /* renamed from: b */
        public C0622b m27496b(vv0.InterfaceC3379a<? extends xe1> interfaceC3379a) {
            C2914s6.m10685f(!this.f3164g);
            this.f3160c = (vv0.InterfaceC3379a) C2914s6.m10686e(interfaceC3379a);
            return this;
        }
    }

    static {
        C3387vz.m6643a("goog.exo.smoothstreaming");
    }

    public af1(xe1 xe1Var, Uri uri, InterfaceC2200mp.InterfaceC2201a interfaceC2201a, vv0.InterfaceC3379a<? extends xe1> interfaceC3379a, we1.InterfaceC3434a interfaceC3434a, InterfaceC3441wi interfaceC3441wi, int i, long j, Object obj) {
        C2914s6.m10685f(xe1Var == null || !xe1Var.f32609d);
        this.f3149J = xe1Var;
        this.f3152v = uri == null ? null : bf1.m26190a(uri);
        this.f3153w = interfaceC2201a;
        this.f3142C = interfaceC3379a;
        this.f3154x = interfaceC3434a;
        this.f3155y = interfaceC3441wi;
        this.f3156z = i;
        this.f3140A = j;
        this.f3141B = m8400j(null);
        this.f3144E = obj;
        this.f3151u = xe1Var != null;
        this.f3143D = new ArrayList<>();
    }

    public /* synthetic */ af1(xe1 xe1Var, Uri uri, InterfaceC2200mp.InterfaceC2201a interfaceC2201a, vv0.InterfaceC3379a interfaceC3379a, we1.InterfaceC3434a interfaceC3434a, InterfaceC3441wi interfaceC3441wi, int i, long j, Object obj, RunnableC0621a runnableC0621a) {
        this(xe1Var, uri, interfaceC2201a, interfaceC3379a, interfaceC3434a, interfaceC3441wi, i, j, obj);
    }

    @Override // com.daaw.bp0
    /* renamed from: a */
    public void mo16120a(qo0 qo0Var) {
        ((ze1) qo0Var).m2421v();
        this.f3143D.remove(qo0Var);
    }

    @Override // com.daaw.bp0
    /* renamed from: e */
    public void mo16119e() {
        this.f3147H.mo16893a();
    }

    @Override // com.daaw.bp0
    /* renamed from: g */
    public qo0 mo16118g(bp0.C0880a c0880a, InterfaceC2006l2 interfaceC2006l2) {
        C2914s6.m10690a(c0880a.f5022a == 0);
        ze1 ze1Var = new ze1(this.f3149J, this.f3154x, this.f3155y, this.f3156z, m8400j(c0880a), this.f3147H, interfaceC2006l2);
        this.f3143D.add(ze1Var);
        return ze1Var;
    }

    @Override // com.daaw.AbstractC3190ua
    /* renamed from: m */
    public void mo8398m(InterfaceC2898rz interfaceC2898rz, boolean z) {
        if (this.f3151u) {
            this.f3147H = new lk0.C2054a();
            m27500v();
            return;
        }
        this.f3145F = this.f3153w.mo9376a();
        jk0 jk0Var = new jk0("Loader:Manifest");
        this.f3146G = jk0Var;
        this.f3147H = jk0Var;
        this.f3150K = new Handler();
        m27498x();
    }

    @Override // com.daaw.AbstractC3190ua
    /* renamed from: p */
    public void mo8396p() {
        this.f3149J = this.f3151u ? this.f3149J : null;
        this.f3145F = null;
        this.f3148I = 0L;
        jk0 jk0Var = this.f3146G;
        if (jk0Var != null) {
            jk0Var.m18463i();
            this.f3146G = null;
        }
        Handler handler = this.f3150K;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f3150K = null;
        }
    }

    @Override // com.daaw.jk0.InterfaceC1834a
    /* renamed from: s */
    public void mo11472k(vv0<xe1> vv0Var, long j, long j2, boolean z) {
        this.f3141B.m25162f(vv0Var.f30638a, vv0Var.f30639b, j, j2, vv0Var.m6738c());
    }

    @Override // com.daaw.jk0.InterfaceC1834a
    /* renamed from: t */
    public void mo11469o(vv0<xe1> vv0Var, long j, long j2) {
        this.f3141B.m25159i(vv0Var.f30638a, vv0Var.f30639b, j, j2, vv0Var.m6738c());
        this.f3149J = vv0Var.m6737d();
        this.f3148I = j - j2;
        m27500v();
        m27499w();
    }

    @Override // com.daaw.jk0.InterfaceC1834a
    /* renamed from: u */
    public int mo11468r(vv0<xe1> vv0Var, long j, long j2, IOException iOException) {
        boolean z = iOException instanceof tv0;
        this.f3141B.m25156l(vv0Var.f30638a, vv0Var.f30639b, j, j2, vv0Var.m6738c(), iOException, z);
        return z ? 3 : 0;
    }

    /* renamed from: v */
    public final void m27500v() {
        xe1.C3535b[] c3535bArr;
        od1 od1Var;
        for (int i = 0; i < this.f3143D.size(); i++) {
            this.f3143D.get(i).m2419x(this.f3149J);
        }
        long j = Long.MIN_VALUE;
        long j2 = Long.MAX_VALUE;
        for (xe1.C3535b c3535b : this.f3149J.f32611f) {
            if (c3535b.f32626k > 0) {
                j2 = Math.min(j2, c3535b.m5183e(0));
                j = Math.max(j, c3535b.m5183e(c3535b.f32626k - 1) + c3535b.m5185c(c3535b.f32626k - 1));
            }
        }
        if (j2 == Long.MAX_VALUE) {
            od1Var = new od1(this.f3149J.f32609d ? -9223372036854775807L : 0L, 0L, 0L, 0L, true, this.f3149J.f32609d, this.f3144E);
        } else {
            xe1 xe1Var = this.f3149J;
            if (xe1Var.f32609d) {
                long j3 = xe1Var.f32613h;
                if (j3 != -9223372036854775807L && j3 > 0) {
                    j2 = Math.max(j2, j - j3);
                }
                long j4 = j2;
                long j5 = j - j4;
                long m24527a = j5 - C1075dd.m24527a(this.f3140A);
                if (m24527a < 5000000) {
                    m24527a = Math.min(5000000L, j5 / 2);
                }
                od1Var = new od1(-9223372036854775807L, j5, j4, m24527a, true, true, this.f3144E);
            } else {
                long j6 = xe1Var.f32612g;
                long j7 = j6 != -9223372036854775807L ? j6 : j - j2;
                od1Var = new od1(j2 + j7, j7, j2, 0L, true, false, this.f3144E);
            }
        }
        m8397n(od1Var, this.f3149J);
    }

    /* renamed from: w */
    public final void m27499w() {
        if (this.f3149J.f32609d) {
            this.f3150K.postDelayed(new RunnableC0621a(), Math.max(0L, (this.f3148I + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    /* renamed from: x */
    public final void m27498x() {
        vv0 vv0Var = new vv0(this.f3145F, this.f3152v, 4, this.f3142C);
        this.f3141B.m25153o(vv0Var.f30638a, vv0Var.f30639b, this.f3146G.m18461k(vv0Var, this, this.f3156z));
    }
}
