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
/* loaded from: classes.dex */
public class fl {
    public boolean a = false;
    public HashMap<sd0, jh0<Object>> b = new HashMap<>();
    public List<Object> c = new LinkedList();

    /* loaded from: classes.dex */
    public class a implements ww1.a<jh0.a, Boolean> {
        public a() {
        }

        @Override // com.daaw.ww1.a
        /* renamed from: a */
        public Boolean b(jh0.a aVar) {
            return Boolean.valueOf(fl.this.d(aVar));
        }
    }

    /* loaded from: classes.dex */
    public class b implements vw1.a<al> {
        public b() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public al a() {
            return new al(MainActivity.r0());
        }
    }

    /* loaded from: classes.dex */
    public class c implements qw1.a<Boolean> {
        public c() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Boolean bool) {
            fl.this.a = bool.booleanValue();
        }
    }

    /* loaded from: classes.dex */
    public class d implements rw1.a<jh0.a<Object>, Boolean> {
        public d() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(jh0.a<Object> aVar, Boolean bool) {
            jh0 jh0Var = (jh0) fl.this.b.get(aVar.c());
            if (jh0Var == null) {
                jh0Var = new jh0(aVar.c());
                fl.this.b.put(aVar.c(), jh0Var);
            }
            if (bool.booleanValue()) {
                jh0Var.a(aVar);
            } else {
                jh0Var.c(aVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements qw1.a<sd0> {
        public e() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(sd0 sd0Var) {
            fl.this.b.remove(sd0Var);
        }
    }

    /* loaded from: classes.dex */
    public class f implements pw1.a {
        public f() {
        }

        @Override // com.daaw.pw1.a
        public void a() {
            for (sd0 sd0Var : new ArrayList(fl.this.b.keySet())) {
                el.h.a(sd0Var);
            }
            fl.this.b.clear();
        }
    }

    /* loaded from: classes.dex */
    public class g implements qw1.a<Activity> {
        public g() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Activity activity) {
            el j = el.j();
            if (j != null) {
                j.n();
            }
        }
    }

    /* loaded from: classes.dex */
    public class h implements qw1.a<al> {
        public h() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(al alVar) {
            el j = el.j();
            if (j != null) {
                j.k();
            }
        }
    }

    /* loaded from: classes.dex */
    public class i implements sw1.a<l0[], Boolean, jh0.a<Object>> {
        public i() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(l0[] l0VarArr, Boolean bool, jh0.a<Object> aVar) {
            el j = el.j();
            if (j != null) {
                j.l(l0VarArr, bool, aVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public class j implements vw1.a<Boolean> {
        public j() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Boolean a() {
            return Boolean.valueOf(fl.this.a);
        }
    }

    public fl() {
        el.e.b(new b(), this.c);
        el.f.b(new c(), this.c);
        el.g.b(new d(), this.c);
        el.h.b(new e(), this.c);
        el.i.b(new f(), this.c);
        MainActivity.h0.b(new g(), this.c);
        MainActivity.n0.b(new h(), this.c);
        dj0.N.b(new i(), this.c);
        dj0.O.b(new j(), this.c);
        dj0.g0.b(new a(), this.c);
    }

    public boolean d(jh0.a aVar) {
        jh0<Object> jh0Var = this.b.get(aVar.c());
        return jh0Var != null && jh0Var.b(aVar.d());
    }
}
