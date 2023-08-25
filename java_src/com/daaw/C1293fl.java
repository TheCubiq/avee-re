package com.daaw;

import android.app.Activity;
import com.daaw.avee.MainActivity;
import com.daaw.jh0;
import com.daaw.pw1;
import com.daaw.qw1;
import com.daaw.rw1;
import com.daaw.sw1;
import com.daaw.vw1;
import com.daaw.ww1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
/* renamed from: com.daaw.fl */
/* loaded from: classes.dex */
public class C1293fl {

    /* renamed from: a */
    public boolean f9642a = false;

    /* renamed from: b */
    public HashMap<sd0, jh0<Object>> f9643b = new HashMap<>();

    /* renamed from: c */
    public List<Object> f9644c = new LinkedList();

    /* renamed from: com.daaw.fl$a */
    /* loaded from: classes.dex */
    public class C1294a implements ww1.InterfaceC3477a<jh0.C1829a, Boolean> {
        public C1294a() {
        }

        @Override // com.daaw.ww1.InterfaceC3477a
        /* renamed from: a */
        public Boolean mo5751b(jh0.C1829a c1829a) {
            return Boolean.valueOf(C1293fl.this.m22524d(c1829a));
        }
    }

    /* renamed from: com.daaw.fl$b */
    /* loaded from: classes.dex */
    public class C1295b implements vw1.InterfaceC3381a<C0645al> {
        public C1295b() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public C0645al mo3126a() {
            return new C0645al(MainActivity.m26903r0());
        }
    }

    /* renamed from: com.daaw.fl$c */
    /* loaded from: classes.dex */
    public class C1296c implements qw1.InterfaceC2788a<Boolean> {
        public C1296c() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Boolean bool) {
            C1293fl.this.f9642a = bool.booleanValue();
        }
    }

    /* renamed from: com.daaw.fl$d */
    /* loaded from: classes.dex */
    public class C1297d implements rw1.InterfaceC2894a<jh0.C1829a<Object>, Boolean> {
        public C1297d() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(jh0.C1829a<Object> c1829a, Boolean bool) {
            jh0 jh0Var = (jh0) C1293fl.this.f9643b.get(c1829a.m18518c());
            if (jh0Var == null) {
                jh0Var = new jh0(c1829a.m18518c());
                C1293fl.this.f9643b.put(c1829a.m18518c(), jh0Var);
            }
            if (bool.booleanValue()) {
                jh0Var.m18523a(c1829a);
            } else {
                jh0Var.m18521c(c1829a);
            }
        }
    }

    /* renamed from: com.daaw.fl$e */
    /* loaded from: classes.dex */
    public class C1298e implements qw1.InterfaceC2788a<sd0> {
        public C1298e() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(sd0 sd0Var) {
            C1293fl.this.f9643b.remove(sd0Var);
        }
    }

    /* renamed from: com.daaw.fl$f */
    /* loaded from: classes.dex */
    public class C1299f implements pw1.InterfaceC2649a {
        public C1299f() {
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            for (sd0 sd0Var : new ArrayList(C1293fl.this.f9643b.keySet())) {
                C1195el.f8548h.m12018a(sd0Var);
            }
            C1293fl.this.f9643b.clear();
        }
    }

    /* renamed from: com.daaw.fl$g */
    /* loaded from: classes.dex */
    public class C1300g implements qw1.InterfaceC2788a<Activity> {
        public C1300g() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Activity activity) {
            C1195el m23403j = C1195el.m23403j();
            if (m23403j != null) {
                m23403j.m23399n();
            }
        }
    }

    /* renamed from: com.daaw.fl$h */
    /* loaded from: classes.dex */
    public class C1301h implements qw1.InterfaceC2788a<C0645al> {
        public C1301h() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(C0645al c0645al) {
            C1195el m23403j = C1195el.m23403j();
            if (m23403j != null) {
                m23403j.m23402k();
            }
        }
    }

    /* renamed from: com.daaw.fl$i */
    /* loaded from: classes.dex */
    public class C1302i implements sw1.InterfaceC2987a<AbstractC2004l0[], Boolean, jh0.C1829a<Object>> {
        public C1302i() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(AbstractC2004l0[] abstractC2004l0Arr, Boolean bool, jh0.C1829a<Object> c1829a) {
            C1195el m23403j = C1195el.m23403j();
            if (m23403j != null) {
                m23403j.m23401l(abstractC2004l0Arr, bool, c1829a);
            }
        }
    }

    /* renamed from: com.daaw.fl$j */
    /* loaded from: classes.dex */
    public class C1303j implements vw1.InterfaceC3381a<Boolean> {
        public C1303j() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Boolean mo3126a() {
            return Boolean.valueOf(C1293fl.this.f9642a);
        }
    }

    public C1293fl() {
        C1195el.f8545e.m6691b(new C1295b(), this.f9644c);
        C1195el.f8546f.m12017b(new C1296c(), this.f9644c);
        C1195el.f8547g.m10861b(new C1297d(), this.f9644c);
        C1195el.f8548h.m12017b(new C1298e(), this.f9644c);
        C1195el.f8549i.m12989b(new C1299f(), this.f9644c);
        MainActivity.f3715h0.m12017b(new C1300g(), this.f9644c);
        MainActivity.f3721n0.m12017b(new C1301h(), this.f9644c);
        dj0.f7150N.m9794b(new C1302i(), this.f9644c);
        dj0.f7151O.m6691b(new C1303j(), this.f9644c);
        dj0.f7169g0.m5752b(new C1294a(), this.f9644c);
    }

    /* renamed from: d */
    public boolean m22524d(jh0.C1829a c1829a) {
        jh0<Object> jh0Var = this.f9643b.get(c1829a.m18518c());
        return jh0Var != null && jh0Var.m18522b(c1829a.m18517d());
    }
}
