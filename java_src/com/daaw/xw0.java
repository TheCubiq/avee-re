package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.daaw.avee.MainActivity;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.oz;
import com.daaw.pw1;
import com.daaw.qw1;
import com.daaw.rw1;
import com.daaw.sw1;
import com.daaw.tw1;
import com.daaw.tx0;
import com.daaw.uw1;
import com.daaw.vw1;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class xw0 {
    public static volatile boolean d;
    public static volatile boolean e;
    public static volatile tx0 f = tx0.k;
    public static volatile tx0.b g = tx0.h;
    public static volatile hx0 h = hx0.c;
    public static volatile long i = 0;
    public static volatile int j = 0;
    public static volatile int k = 10;
    public static volatile boolean l = false;
    public static volatile boolean m = true;
    public uf1 a;
    public List<Object> b = new LinkedList();
    public Handler c = new Handler();

    /* loaded from: classes.dex */
    public class a implements qw1.a<Boolean> {
        public a() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Boolean bool) {
            xw0.l = bool.booleanValue();
        }
    }

    /* loaded from: classes.dex */
    public class a0 implements qw1.a<Integer> {
        public a0() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Integer num) {
            com.daaw.avee.comp.playback.c.j.a(num);
        }
    }

    /* loaded from: classes.dex */
    public class b implements vw1.a<Boolean> {
        public b() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Boolean a() {
            return Boolean.valueOf(j5.e().h(j5.r));
        }
    }

    /* loaded from: classes.dex */
    public class b0 implements vw1.a<lo1<tx0.b, hx0>> {
        public b0() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public lo1<tx0.b, hx0> a() {
            return new lo1<>(xw0.g, xw0.h);
        }
    }

    /* loaded from: classes.dex */
    public class c implements vw1.a<Float> {
        public c() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Float a() {
            return Float.valueOf(j5.e().k(j5.O) * 0.01f);
        }
    }

    /* loaded from: classes.dex */
    public class c0 implements vw1.a<lo1<Boolean, Boolean>> {
        public c0() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public lo1<Boolean, Boolean> a() {
            return new lo1<>(Boolean.valueOf(xw0.d), Boolean.valueOf(xw0.e));
        }
    }

    /* loaded from: classes.dex */
    public class d implements vw1.a<Float> {
        public d() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Float a() {
            return Float.valueOf(j5.e().k(j5.P) * 0.001f * xw0.this.e());
        }
    }

    /* loaded from: classes.dex */
    public class d0 implements pw1.a {
        public d0() {
        }

        @Override // com.daaw.pw1.a
        public void a() {
            com.daaw.avee.comp.playback.c.c.a();
        }
    }

    /* loaded from: classes.dex */
    public class e implements pw1.a {

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l01 c = l01.c();
                if (c != null) {
                    if (c.o() == 0) {
                        c.T(1, true);
                    } else {
                        c.T(0, true);
                    }
                }
            }
        }

        public e() {
        }

        @Override // com.daaw.pw1.a
        public void a() {
            xw0.this.c.post(new a());
        }
    }

    /* loaded from: classes.dex */
    public class e0 implements qw1.a<Activity> {
        public e0() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Activity activity) {
            xw0.m = false;
            com.daaw.avee.comp.playback.c.g.a();
            com.daaw.avee.comp.playback.c.h.a(Boolean.FALSE);
        }
    }

    /* loaded from: classes.dex */
    public class f implements pw1.a {

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l01.c().H();
            }
        }

        public f() {
        }

        @Override // com.daaw.pw1.a
        public void a() {
            xw0.this.c.post(new a());
        }
    }

    /* loaded from: classes.dex */
    public class f0 implements qw1.a<Activity> {
        public f0() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Activity activity) {
            xw0.m = true;
            com.daaw.avee.comp.playback.c.h.a(Boolean.TRUE);
        }
    }

    /* loaded from: classes.dex */
    public class g implements pw1.a {

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l01.c().t();
            }
        }

        public g() {
        }

        @Override // com.daaw.pw1.a
        public void a() {
            xw0.this.c.post(new a());
        }
    }

    /* loaded from: classes.dex */
    public class g0 implements vw1.a<Boolean> {
        public g0() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Boolean a() {
            return Boolean.valueOf(xw0.m);
        }
    }

    /* loaded from: classes.dex */
    public class h implements uw1.a<Context, i2, af0, Integer, Integer> {

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ i2 p;
            public final /* synthetic */ af0 q;
            public final /* synthetic */ Integer r;
            public final /* synthetic */ Integer s;

            public a(i2 i2Var, af0 af0Var, Integer num, Integer num2) {
                this.p = i2Var;
                this.q = af0Var;
                this.r = num;
                this.s = num2;
            }

            @Override // java.lang.Runnable
            public void run() {
                g2 g2Var = new g2();
                i2 i2Var = this.p;
                g2Var.v(false, i2Var.a, i2Var.b, i2Var.c, this.q, this.r.intValue(), this.s.intValue(), 0, -1, false, null, null);
            }
        }

        public h() {
        }

        @Override // com.daaw.uw1.a
        /* renamed from: b */
        public void a(Context context, i2 i2Var, af0 af0Var, Integer num, Integer num2) {
            xw0.this.c.post(new a(i2Var, af0Var, num, num2));
        }
    }

    /* loaded from: classes.dex */
    public class h0 implements sw1.a<Integer, Integer, Boolean> {
        public h0() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(Integer num, Integer num2, Boolean bool) {
            iw1<Float> iw1Var;
            float intValue;
            float e;
            if (num.intValue() == j5.K) {
                xw0.this.k(num2);
                return;
            }
            if (num.intValue() == j5.O) {
                ko0 q = ko0.q();
                if (q != null) {
                    q.u(xw0.this.j());
                }
                iw1Var = com.daaw.avee.comp.playback.c.s;
                intValue = num2.intValue();
                e = 0.01f;
            } else if (num.intValue() != j5.P) {
                return;
            } else {
                iw1Var = com.daaw.avee.comp.playback.c.t;
                intValue = num2.intValue() * 0.001f;
                e = xw0.this.e();
            }
            iw1Var.a(Float.valueOf(intValue * e));
        }
    }

    /* loaded from: classes.dex */
    public class i implements qw1.a<Integer> {
        public i() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Integer num) {
            if (num.intValue() == 0) {
                j5.e().c0(j5.K, 0);
            } else if (num.intValue() == 1) {
                j5.e().c0(j5.K, 1);
            }
        }
    }

    /* loaded from: classes.dex */
    public class i0 implements rw1.a<Integer, Boolean> {
        public i0() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(Integer num, Boolean bool) {
            if (num.intValue() == j5.r) {
                ko0 q = ko0.q();
                if (q != null) {
                    q.A(bool.booleanValue());
                }
                com.daaw.avee.comp.playback.c.q.a(bool);
            }
        }
    }

    /* loaded from: classes.dex */
    public class j implements qw1.a<al> {
        public j() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(al alVar) {
            oz.e.b.a(alVar.a(), "Select track");
        }
    }

    /* loaded from: classes.dex */
    public class j0 implements Runnable {
        public final /* synthetic */ boolean p;
        public final /* synthetic */ tx0 q;
        public final /* synthetic */ Long r;
        public final /* synthetic */ Integer s;

        public j0(boolean z, tx0 tx0Var, Long l, Integer num) {
            this.p = z;
            this.q = tx0Var;
            this.r = l;
            this.s = num;
        }

        @Override // java.lang.Runnable
        public void run() {
            l01 c;
            l01 c2;
            if (this.p && xw0.this.a.a(this.q)) {
                c2 = l01.c();
                if (c2 == null) {
                    return;
                }
            } else if (this.s.intValue() != 1) {
                if (this.s.intValue() == 2) {
                    c = l01.c();
                    if (c == null) {
                        return;
                    }
                    if (c.q()) {
                        c.G(this.r);
                        return;
                    }
                } else {
                    c = l01.c();
                    if (c == null) {
                        return;
                    }
                }
                c.s(this.r);
                return;
            } else {
                c2 = l01.c();
                if (c2 == null) {
                    return;
                }
            }
            c2.F(this.r);
        }
    }

    /* loaded from: classes.dex */
    public class k implements qw1.a<Activity> {
        public k() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Activity activity) {
            l01 c = l01.c();
            if (c != null) {
                c.x(activity);
            }
            com.daaw.avee.comp.playback.c.b.a();
        }
    }

    /* loaded from: classes.dex */
    public class k0 implements Runnable {
        public final /* synthetic */ String p;
        public final /* synthetic */ Boolean q;
        public final /* synthetic */ Boolean r;
        public final /* synthetic */ boolean s;

        public k0(String str, Boolean bool, Boolean bool2, boolean z) {
            this.p = str;
            this.q = bool;
            this.r = bool2;
            this.s = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = this.p;
            if (str != null && str.length() > 0) {
                vy.a.a(this.p);
            }
            ko0 q = ko0.q();
            if (q != null) {
                q.H(this.q.booleanValue(), this.r.booleanValue());
            }
            MainActivity r0 = MainActivity.r0();
            if (r0 != null) {
                r0.K0(this.s || (r0.N == 2 && this.q.booleanValue()), this.s);
            }
        }
    }

    /* loaded from: classes.dex */
    public class l implements pw1.a {
        public l() {
        }

        @Override // com.daaw.pw1.a
        public void a() {
            j5.e().k0(j5.r);
        }
    }

    /* loaded from: classes.dex */
    public class l0 implements Runnable {
        public final /* synthetic */ boolean p;

        public l0(boolean z) {
            this.p = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            MainActivity r0 = MainActivity.r0();
            if (r0 != null) {
                r0.K0(this.p || (r0.N == 2 && xw0.d), this.p);
            }
        }
    }

    /* loaded from: classes.dex */
    public class m implements vw1.a<Integer> {
        public m() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Integer a() {
            return Integer.valueOf(xw0.this.h());
        }
    }

    /* loaded from: classes.dex */
    public class m0 implements vw1.a<Integer> {
        public m0() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Integer a() {
            return Integer.valueOf(xw0.this.h());
        }
    }

    /* loaded from: classes.dex */
    public class n implements vw1.a<Boolean> {
        public n() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Boolean a() {
            return Boolean.valueOf(j5.e().h(j5.r));
        }
    }

    /* loaded from: classes.dex */
    public class n0 implements tw1.a<tx0, vd0, tx0.b, hx0> {

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ tx0.b p;

            public a(tx0.b bVar) {
                this.p = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                MainActivity r0 = MainActivity.r0();
                if (r0 != null) {
                    r0.Q0(this.p);
                }
                ko0 q = ko0.q();
                if (q != null) {
                    q.I(xw0.g, xw0.h);
                }
            }
        }

        public n0() {
        }

        @Override // com.daaw.tw1.a
        /* renamed from: b */
        public void a(tx0 tx0Var, vd0 vd0Var, tx0.b bVar, hx0 hx0Var) {
            xw0.f = tx0Var;
            xw0.h = hx0Var;
            xw0.g = bVar;
            xw0.this.c.post(new a(bVar));
        }
    }

    /* loaded from: classes.dex */
    public class o implements vw1.a<Boolean> {
        public o() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Boolean a() {
            return Boolean.valueOf(xw0.this.j());
        }
    }

    /* loaded from: classes.dex */
    public class o0 implements qw1.a<Long> {
        public o0() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Long l) {
            xw0.i = l.longValue();
        }
    }

    /* loaded from: classes.dex */
    public class p implements vw1.a<lo1<Integer, Integer>> {
        public p() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public lo1<Integer, Integer> a() {
            return new lo1<>(Integer.valueOf(com.daaw.avee.comp.playback.c.p.a(0).intValue()), Integer.valueOf(xw0.k));
        }
    }

    /* loaded from: classes.dex */
    public class p0 implements qw1.a<Integer> {

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ko0 q = ko0.q();
                if (q != null) {
                    q.y(xw0.j);
                }
            }
        }

        public p0() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Integer num) {
            xw0.j = num.intValue();
            xw0.this.c.post(new a());
        }
    }

    /* loaded from: classes.dex */
    public class q implements vw1.a<lo1<Integer, Integer>> {
        public q() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public lo1<Integer, Integer> a() {
            return new lo1<>(Integer.valueOf((j5.e().k(j5.O) / 20) + 5), 10);
        }
    }

    /* loaded from: classes.dex */
    public class q0 implements qw1.a<Context> {

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ko0 q = ko0.q();
                if (q != null) {
                    q.H(false, false);
                }
            }
        }

        public q0() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Context context) {
            xw0.this.c.post(new a());
        }
    }

    /* loaded from: classes.dex */
    public class r implements vw1.a<lo1<Integer, Integer>> {
        public r() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public lo1<Integer, Integer> a() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class r0 implements qw1.a<Integer> {
        public r0() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Integer num) {
            xw0.k = num.intValue();
        }
    }

    /* loaded from: classes.dex */
    public class s implements vw1.a<mo1<Integer, Integer, Float>> {
        public s() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public mo1<Integer, Integer, Float> a() {
            return new mo1<>(Integer.valueOf((j5.e().k(j5.P) / 1000) + 1), 10, Float.valueOf(xw0.this.e()));
        }
    }

    /* loaded from: classes.dex */
    public class t implements rw1.a<Integer, Integer> {
        public t() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(Integer num, Integer num2) {
            com.daaw.avee.comp.playback.c.n.a(num);
        }
    }

    /* loaded from: classes.dex */
    public class u implements rw1.a<Integer, Integer> {
        public u() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(Integer num, Integer num2) {
            j5.e().c0(j5.O, (num.intValue() - 5) * 20);
        }
    }

    /* loaded from: classes.dex */
    public class v implements qw1.a<Context> {
        public v() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Context context) {
            gr1.c();
            l01 c = l01.c();
            if (c != null) {
                c.x(context);
            }
        }
    }

    /* loaded from: classes.dex */
    public class w implements rw1.a<Integer, Integer> {
        public w() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(Integer num, Integer num2) {
            j5.e().c0(j5.P, (num.intValue() - 1) * 1000);
        }
    }

    /* loaded from: classes.dex */
    public class x implements vw1.a<Boolean> {
        public x() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Boolean a() {
            return Boolean.valueOf(j5.e().h(j5.z));
        }
    }

    /* loaded from: classes.dex */
    public class y implements qw1.a<Boolean> {
        public y() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Boolean bool) {
            j5.e().a0(j5.z, bool.booleanValue());
        }
    }

    /* loaded from: classes.dex */
    public class z implements vw1.a<Integer> {
        public z() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Integer a() {
            return Integer.valueOf(xw0.j);
        }
    }

    public xw0(uf1 uf1Var) {
        this.a = uf1Var;
        MainActivity.l0.b(new k(), this.b);
        MediaPlaybackService.c0.b(new v(), this.b);
        MediaPlaybackService.f0.b(new g0(), this.b);
        MediaPlaybackService.e0.b(new m0(), this.b);
        MediaPlaybackService.h0.b(new n0(), this.b);
        MediaPlaybackService.s0.b(new o0(), this.b);
        MediaPlaybackService.i0.b(new p0(), this.b);
        MediaPlaybackService.d0.b(new q0(), this.b);
        MediaPlaybackService.j0.b(new r0(), this.b);
        MediaPlaybackService.k0.b(new a(), this.b);
        MediaPlaybackService.l0.b(new b(), this.b);
        MediaPlaybackService.m0.b(new c(), this.b);
        MediaPlaybackService.n0.b(new d(), this.b);
        MediaPlaybackService.o0.b(new e(), this.b);
        MediaPlaybackService.r0.b(new f(), this.b);
        MediaPlaybackService.q0.b(new g(), this.b);
        MediaPlaybackService.z0.b(new h(), this.b);
        ko0.g0.b(new i(), this.b);
        ko0.h0.b(new j(), this.b);
        ko0.Y.b(new l(), this.b);
        ko0.f0.b(new m(), this.b);
        ko0.F.b(new n(), this.b);
        ko0.G.b(new o(), this.b);
        ko0.P.b(new p(), this.b);
        ko0.Q.b(new q(), this.b);
        ko0.R.b(new r(), this.b);
        ko0.S.b(new s(), this.b);
        ko0.T.b(new t(), this.b);
        ko0.U.b(new u(), this.b);
        ko0.V.b(new w(), this.b);
        ko0.W.b(new x(), this.b);
        ko0.X.b(new y(), this.b);
        ko0.d0.b(new z(), this.b);
        ko0.e0.b(new a0(), this.b);
        ko0.M.b(new b0(), this.b);
        ko0.N.b(new c0(), this.b);
        MainActivity.o0.b(new d0(), this.b);
        MainActivity.i0.b(new e0(), this.b);
        MainActivity.l0.b(new f0(), this.b);
        j5.g.b(new h0(), this.b);
        j5.h.b(new i0(), this.b);
    }

    public final float e() {
        return 1.0f;
    }

    public void f(Boolean bool, Boolean bool2, Integer num, String str, tx0 tx0Var, boolean z2) {
        d = bool.booleanValue();
        e = bool2.booleanValue();
        this.c.post(new k0(str, bool, bool2, z2));
    }

    public void g(Integer num, Boolean bool, Long l2, boolean z2, tx0 tx0Var) {
        if (bool.booleanValue()) {
            this.c.post(new j0(z2, tx0Var, l2, num));
        }
    }

    public final int h() {
        return j5.e().k(j5.K);
    }

    public void i(Integer num, Activity activity, boolean z2) {
        MainActivity r02 = MainActivity.r0();
        if (r02 != null) {
            r02.K0(z2 || (num.intValue() == 2 && d), z2);
        }
    }

    public final boolean j() {
        return j5.e().k(j5.O) != 0;
    }

    public void k(Integer num) {
        com.daaw.avee.comp.playback.c.v.a(num);
        ko0 q2 = ko0.q();
        if (q2 != null) {
            q2.x(num.intValue());
        }
    }

    public void l(boolean z2) {
        this.c.post(new l0(z2));
    }
}
