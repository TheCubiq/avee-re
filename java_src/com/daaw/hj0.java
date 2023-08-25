package com.daaw;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.daaw.avee.MainActivity;
import com.daaw.avee.R;
import com.daaw.gh0;
import com.daaw.jh0;
import com.daaw.kw1;
import com.daaw.qk;
import com.daaw.qw1;
import com.daaw.rw1;
import com.daaw.sw1;
import com.daaw.tw1;
import com.daaw.tx0;
import com.daaw.vw1;
import com.daaw.ww1;
import com.daaw.yw1;
import com.daaw.zt1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class hj0 {
    public lo1<Integer, Boolean> c;
    public lo1<Integer, Boolean> d;
    public List<Object> a = new LinkedList();
    public boolean b = true;
    public int e = 0;

    /* loaded from: classes.dex */
    public class a implements sw1.a<Context, String, String> {
        public a() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(Context context, String str, String str2) {
            j5.e().I(str, str2, context);
            hj0.this.A();
        }
    }

    /* loaded from: classes.dex */
    public class a0 implements ww1.a<Integer, Boolean> {
        public a0() {
        }

        @Override // com.daaw.ww1.a
        /* renamed from: a */
        public Boolean b(Integer num) {
            return Boolean.valueOf(j5.e().h(num.intValue()));
        }
    }

    /* loaded from: classes.dex */
    public class b implements rw1.a<Context, List<String>> {
        public b() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(Context context, List<String> list) {
            hj0.this.d(context, list);
        }
    }

    /* loaded from: classes.dex */
    public class b0 implements qw1.a<al> {
        public b0() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(al alVar) {
            am1.a(alVar);
        }
    }

    /* loaded from: classes.dex */
    public class c implements vw1.a<Boolean> {
        public c() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Boolean a() {
            return Boolean.valueOf(j5.e().h(j5.q));
        }
    }

    /* loaded from: classes.dex */
    public class c0 implements rw1.a<Boolean, Class<?>> {
        public c0() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(Boolean bool, Class<?> cls) {
            j5 e;
            int i;
            if (!cls.equals(gk.class)) {
                if (cls.equals(hk.class)) {
                    e = j5.e();
                    i = j5.w;
                }
                hj0.this.A();
            }
            e = j5.e();
            i = j5.v;
            e.a0(i, bool.booleanValue());
            hj0.this.A();
        }
    }

    /* loaded from: classes.dex */
    public class d implements tw1.a<i2, ImageView, Boolean, Boolean> {
        public d() {
        }

        @Override // com.daaw.tw1.a
        /* renamed from: b */
        public void a(i2 i2Var, ImageView imageView, Boolean bool, Boolean bool2) {
            new g2().t(i2Var.a, i2Var.b, i2Var.c, imageView, bool.booleanValue());
        }
    }

    /* loaded from: classes.dex */
    public class d0 implements vw1.a<er0<tx0, vd0>> {
        public d0() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public er0<tx0, vd0> a() {
            l01 c = l01.c();
            return c != null ? c.l() : new er0<>();
        }
    }

    /* loaded from: classes.dex */
    public class e implements tw1.a<i2, ImageView, Boolean, Boolean> {
        public e() {
        }

        @Override // com.daaw.tw1.a
        /* renamed from: b */
        public void a(i2 i2Var, ImageView imageView, Boolean bool, Boolean bool2) {
            hj0.this.p(i2Var, imageView, bool);
        }
    }

    /* loaded from: classes.dex */
    public class e0 implements vw1.a<be0> {
        public e0() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public be0 a() {
            l01 c = l01.c();
            if (c != null) {
                return c.p();
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class f implements vw1.a<Boolean> {
        public f() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Boolean a() {
            return Boolean.valueOf(j5.e().h(j5.s));
        }
    }

    /* loaded from: classes.dex */
    public class f0 implements vw1.a<Integer> {
        public f0() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Integer a() {
            l01 c = l01.c();
            return Integer.valueOf(c != null ? c.o() : 0);
        }
    }

    /* loaded from: classes.dex */
    public class g implements rw1.a<al, List<gh0.d>> {
        public g() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(al alVar, List<gh0.d> list) {
            tx0 a;
            if (list.size() >= 1 && (a = list.get(list.size() - 1).a()) != null) {
                fe1.a(alVar, alVar.b(), a);
            }
        }
    }

    /* loaded from: classes.dex */
    public class g0 implements rw1.a<al, String> {
        public g0() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(al alVar, String str) {
            tx0 tx0Var = new tx0(str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(tx0Var);
            l01 c = l01.c();
            if (c != null) {
                c.E(arrayList, 0, 0, null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class h implements ww1.a<wc0, lo1<Integer, Boolean>> {
        public h() {
        }

        @Override // com.daaw.ww1.a
        /* renamed from: a */
        public lo1<Integer, Boolean> b(wc0 wc0Var) {
            return "/".equals(wc0Var.e()) ? hj0.this.q() : hj0.this.r();
        }
    }

    /* loaded from: classes.dex */
    public class h0 implements rw1.a<String, String> {
        public h0() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(String str, String str2) {
            if (str.equals("/") && "6".equals(str2)) {
                hj0.this.e = 1;
                hj0.this.A();
                return;
            }
            m30 o0 = MainActivity.o0();
            if (o0 != null) {
                o0.s(null, str2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class i implements vw1.a<Integer> {
        public i() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Integer a() {
            return Integer.valueOf(hj0.this.e);
        }
    }

    /* loaded from: classes.dex */
    public class i0 implements sw1.a<al, Integer, View> {
        public i0() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(al alVar, Integer num, View view) {
            j5 e;
            int i;
            Context b = dx0.b();
            if (b == null) {
                return;
            }
            FragmentManager c = alVar.c();
            int intValue = num.intValue();
            if (intValue == 120) {
                st.g(alVar, "libraryAddFolder", R.string.dialog_add_folder_title, "");
            } else if (intValue == 125) {
                if (view != null) {
                    zt1.b(alVar, view, "");
                }
            } else if (intValue == 1110) {
                l01 c2 = l01.c();
                if (c2 != null) {
                    c2.E(new ArrayList(), -1, -1, null);
                }
            } else {
                switch (intValue) {
                    case 110:
                        if (c != null) {
                            f1.c(alVar);
                            return;
                        }
                        return;
                    case 111:
                        vy.a.a(b.getResources().getString(R.string.hold_to_clear_queue));
                        return;
                    case 112:
                        l01 c3 = l01.c();
                        if (c3 != null) {
                            ox0.c(alVar, c3.l().w(), Boolean.TRUE);
                            return;
                        }
                        return;
                    case 113:
                        hj0.this.w();
                        return;
                    case 114:
                        e = j5.e();
                        i = j5.q;
                        break;
                    case 115:
                        e = j5.e();
                        i = j5.s;
                        break;
                    default:
                        return;
                }
                e.k0(i);
            }
        }
    }

    /* loaded from: classes.dex */
    public class j implements rw1.a<Integer, Boolean> {
        public j() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(Integer num, Boolean bool) {
            if (num.intValue() == j5.q) {
                dj0.i(bool.booleanValue());
                return;
            }
            if (num.intValue() == j5.s) {
                dj0.j(bool.booleanValue());
            } else if (num.intValue() != j5.C) {
                return;
            }
            hj0.this.A();
            hj0.this.B();
        }
    }

    /* loaded from: classes.dex */
    public class k implements kw1.a<uk, tx0.b, Boolean> {
        public k() {
        }

        @Override // com.daaw.kw1.a
        /* renamed from: b */
        public void a(uk ukVar, tx0.b bVar, Boolean bool) {
            hj0.this.z(ukVar, bVar, bool.booleanValue());
        }
    }

    /* loaded from: classes.dex */
    public class l implements sw1.a<Integer, Integer, Boolean> {
        public l() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(Integer num, Integer num2, Boolean bool) {
            if (num.intValue() == j5.V) {
                lo1 x = hj0.this.x(num2);
                if (x != null) {
                    hj0.this.d = x;
                }
                hj0.this.A();
                hj0.this.B();
            }
        }
    }

    /* loaded from: classes.dex */
    public class m implements sw1.a<al, String, String> {
        public m() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(al alVar, String str, String str2) {
            if (str2.equals("libraryAddFolder")) {
                hj0.this.e(alVar.b(), new String[]{str});
            }
        }
    }

    /* loaded from: classes.dex */
    public class n implements rw1.a<jh0.a<Object>, Boolean> {
        public n() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(jh0.a<Object> aVar, Boolean bool) {
            hj0.this.y(aVar.c());
        }
    }

    /* loaded from: classes.dex */
    public class o implements qw1.a<sd0> {
        public o() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(sd0 sd0Var) {
            hj0.this.y(sd0Var);
        }
    }

    /* loaded from: classes.dex */
    public class p implements rw1.a<Collection<tx0>, Integer> {
        public p() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(Collection<tx0> collection, Integer num) {
            l01 c = l01.c();
            if (c != null) {
                c.d(collection, num.intValue(), 0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class q implements sw1.a<Integer, Integer, List<Integer>> {
        public q() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(Integer num, Integer num2, List<Integer> list) {
            l01 c = l01.c();
            if (c != null) {
                c.r(num.intValue(), num2.intValue(), list, 0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class r implements sw1.a<List<tx0>, Integer, be0> {
        public r() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(List<tx0> list, Integer num, be0 be0Var) {
            l01 c = l01.c();
            if (c != null) {
                c.E(list, num.intValue(), -1, be0Var);
            }
        }
    }

    /* loaded from: classes.dex */
    public class s implements sw1.a<List<tx0>, Integer, be0> {
        public s() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(List<tx0> list, Integer num, be0 be0Var) {
            hj0.this.v(list, num, be0Var);
        }
    }

    /* loaded from: classes.dex */
    public class t implements sw1.a<List<tx0>, Integer, be0> {
        public t() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(List<tx0> list, Integer num, be0 be0Var) {
            hj0.this.v(list, num, be0Var);
        }
    }

    /* loaded from: classes.dex */
    public class u implements qw1.a<Object> {
        public u() {
        }

        @Override // com.daaw.qw1.a
        public void b(Object obj) {
            if (obj instanceof qk.s) {
                qk.s sVar = (qk.s) obj;
                l01 c = l01.c();
                if (c != null) {
                    c.Q(sVar.c, 0);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class v implements ww1.a<Class<?>, Boolean> {
        public v() {
        }

        @Override // com.daaw.ww1.a
        /* renamed from: a */
        public Boolean b(Class<?> cls) {
            j5 e;
            int i;
            if (cls.equals(gk.class)) {
                e = j5.e();
                i = j5.v;
            } else if (!cls.equals(hk.class)) {
                return Boolean.TRUE;
            } else {
                e = j5.e();
                i = j5.w;
            }
            return Boolean.valueOf(e.h(i));
        }
    }

    /* loaded from: classes.dex */
    public class w implements qw1.a<List<vd0>> {
        public w() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(List<vd0> list) {
            l01 c = l01.c();
            if (c != null) {
                c.M(list);
            }
        }
    }

    /* loaded from: classes.dex */
    public class x implements qw1.a<Integer> {
        public x() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Integer num) {
            l01 c = l01.c();
            if (c != null) {
                c.R(num.intValue());
            }
        }
    }

    /* loaded from: classes.dex */
    public class y implements qw1.a<vd0> {
        public y() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(vd0 vd0Var) {
            l01 c = l01.c();
            if (c != null) {
                c.O(vd0Var);
            }
        }
    }

    /* loaded from: classes.dex */
    public class z implements rw1.a<er0<tx0, vd0>, be0> {
        public z() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(er0<tx0, vd0> er0Var, be0 be0Var) {
            n30 p0 = MainActivity.p0();
            if (p0 != null) {
                p0.v(er0Var);
            }
        }
    }

    public hj0() {
        this.c = null;
        this.d = null;
        this.d = r();
        this.c = q();
        dj0.l0.b(new k(), this.a);
        dj0.b0.b(new v(), this.a);
        dj0.c0.b(new c0(), this.a);
        dj0.v.b(new d0(), this.a);
        dj0.u.b(new e0(), this.a);
        dj0.p.b(new f0(), this.a);
        f1.q.b(new g0(), this.a);
        dj0.q.b(new h0(), this.a);
        dj0.Q.b(new i0(), this.a);
        dj0.L.b(new a(), this.a);
        dj0.M.b(new b(), this.a);
        dj0.T.b(new c(), this.a);
        fe1.p.b(new d(), this.a);
        dj0.e0.b(new e(), this.a);
        dj0.f0.b(new f(), this.a);
        dj0.A.b(new g(), this.a);
        dj0.k0.b(new h(), this.a);
        dj0.s.b(new i(), this.a);
        j5.h.b(new j(), this.a);
        j5.g.b(new l(), this.a);
        st.t.b(new m(), this.a);
        el.g.b(new n(), this.a);
        el.h.b(new o(), this.a);
        dj0.y.b(new p(), this.a);
        dj0.d0.b(new q(), this.a);
        dj0.z.b(new r(), this.a);
        dj0.G.b(new s(), this.a);
        dj0.H.b(new t(), this.a);
        dj0.P.b(new u(), this.a);
        dj0.D.b(new w(), this.a);
        dj0.w.b(new x(), this.a);
        dj0.C.b(new y(), this.a);
        l01.v.b(new z(), this.a);
        dj0.E.b(new a0(), this.a);
        dj0.F.b(new b0(), this.a);
        zt1.c.b(new yw1.a() { // from class: com.daaw.gj0
            @Override // com.daaw.yw1.a
            public final Object a(Object obj, Object obj2, Object obj3) {
                zt1.c s2;
                s2 = hj0.s((Integer) obj, (sd0) obj2, (String) obj3);
                return s2;
            }
        }, this.a);
        zt1.d.b(new sw1.a() { // from class: com.daaw.fj0
            @Override // com.daaw.sw1.a
            public final void a(Object obj, Object obj2, Object obj3) {
                hj0.t((Integer) obj, (sd0) obj2, (zt1.c) obj3);
            }
        }, this.a);
        MainActivity.i0.b(new qw1.a() { // from class: com.daaw.ej0
            @Override // com.daaw.qw1.a
            public final void b(Object obj) {
                hj0.u((Activity) obj);
            }
        }, this.a);
    }

    public static /* synthetic */ zt1.c s(Integer num, sd0 sd0Var, String str) {
        zt1.c cVar = new zt1.c();
        cVar.a = j5.e().k(j5.V);
        cVar.b = j5.e().h(j5.s);
        return cVar;
    }

    public static /* synthetic */ void t(Integer num, sd0 sd0Var, zt1.c cVar) {
        j5.e().c0(j5.V, cVar.a);
        j5.e().a0(j5.s, cVar.b);
    }

    public static /* synthetic */ void u(Activity activity) {
        Context e2 = dx0.e();
        if (e2 != null && i5.a(e2, null) && l01.c().l().isEmpty()) {
            l01.c().D(wj.j0(e2, 0, null), -1, 2, null, null, 0, false);
        }
    }

    public void A() {
        m30 o0 = MainActivity.o0();
        if (o0 != null) {
            o0.A();
        }
    }

    public void B() {
        n30 p0 = MainActivity.p0();
        if (p0 != null) {
            p0.r();
        }
    }

    public final void d(Context context, Collection<String> collection) {
        for (String str : collection) {
            j5.e().D(str, context);
        }
        A();
    }

    public final void e(Context context, String[] strArr) {
        for (String str : strArr) {
            j5.e().D(str, context);
        }
        A();
    }

    public final void p(i2 i2Var, ImageView imageView, Boolean bool) {
        new g2().t(i2Var.a, i2Var.b, i2Var.c, imageView, bool.booleanValue());
    }

    public lo1<Integer, Boolean> q() {
        if (this.c == null) {
            this.c = x(-1);
        }
        if (this.c == null) {
            this.c = new lo1<>(56, Boolean.TRUE);
        }
        return this.c;
    }

    public lo1<Integer, Boolean> r() {
        if (this.d == null) {
            this.d = x(-1);
        }
        if (this.d == null) {
            this.d = new lo1<>(56, Boolean.TRUE);
        }
        return this.d;
    }

    public final void v(List<tx0> list, Integer num, be0 be0Var) {
        if (list == null) {
            Context e2 = dx0.e();
            if (e2 != null) {
                vy.a.a(e2.getResources().getString(R.string.failed_to_open_network_error));
                return;
            }
            return;
        }
        l01 c2 = l01.c();
        if (c2 != null) {
            c2.L(-1);
            c2.D(list, num.intValue(), 0, null, null, -1, false);
        }
    }

    public final void w() {
        l01 c2 = l01.c();
        int i2 = 0;
        int o2 = c2 != null ? c2.o() : 0;
        if (o2 == 0) {
            i2 = 1;
        } else if (o2 != 1) {
            i2 = o2;
        }
        if (c2 != null) {
            c2.T(i2, true);
        }
    }

    public final lo1<Integer, Boolean> x(Integer num) {
        int intValue = num.intValue();
        int i2 = intValue != 0 ? (intValue == 1 || intValue != 2) ? 56 : 112 : 28;
        Context e2 = dx0.e();
        if (e2 == null) {
            return null;
        }
        return new lo1<>(Integer.valueOf((int) TypedValue.applyDimension(1, i2, e2.getResources().getDisplayMetrics())), Boolean.valueOf(i2 >= 56));
    }

    public final void y(sd0 sd0Var) {
        m30 o0 = MainActivity.o0();
        if (o0 != null) {
            o0.x(sd0Var);
        }
        n30 p0 = MainActivity.p0();
        if (p0 != null) {
            p0.q(sd0Var);
        }
    }

    public void z(uk ukVar, tx0.b bVar, boolean z2) {
        String str;
        if (z2) {
            ukVar.x.setVisibility(0);
            ukVar.V(-1);
            p(new i2(bVar.a, bVar.d(), bVar.b()), ukVar.x, Boolean.TRUE);
        } else {
            ukVar.x.setVisibility(8);
            ukVar.U(null);
        }
        if (bVar.i()) {
            ukVar.z.setText(bVar.e);
            ukVar.d0(0);
            if (bVar.g()) {
                str = bVar.h + "   |   " + bVar.f;
            } else {
                str = bVar.h;
            }
            ukVar.c0(str);
        } else {
            ukVar.z.setText(bVar.e);
            ukVar.d0(8);
        }
        ukVar.B.setText(!bVar.c ? br1.o(bVar.j / 1000) : "");
    }
}
