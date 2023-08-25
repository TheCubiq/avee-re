package com.daaw;

import android.os.AsyncTask;
import com.daaw.avee.MainActivity;
import com.daaw.qw1;
import com.daaw.rw1;
import com.daaw.sw1;
import com.daaw.tw1;
import com.daaw.vw1;
import com.daaw.xw1;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class ui {
    public static t91 b = new t91();
    public List<Object> a = new LinkedList();

    /* loaded from: classes.dex */
    public class a implements sw1.a<AsyncTask, Integer, Object> {
        public a() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(AsyncTask asyncTask, Integer num, Object obj) {
            ui.b.d(asyncTask, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public class b implements tw1.a<Integer, Integer, ee0, Boolean> {
        public b() {
        }

        @Override // com.daaw.tw1.a
        /* renamed from: b */
        public void a(Integer num, Integer num2, ee0 ee0Var, Boolean bool) {
            n30 p0;
            if (ee0Var == null || ee0Var.c() == null || ee0Var.c().isEmpty()) {
                ui.b.b(num2.intValue());
            }
            MainActivity r0 = MainActivity.r0();
            if (r0 == null) {
                return;
            }
            if (num.equals(num2)) {
                r0.U0(ee0Var);
            }
            if (!bool.booleanValue() || ee0Var == null) {
                return;
            }
            if (num2.intValue() == 0) {
                m30 o0 = MainActivity.o0();
                if (o0 != null) {
                    o0.D(r0, ee0Var.c());
                }
            } else if (num2.intValue() != 1 || (p0 = MainActivity.p0()) == null) {
            } else {
                p0.t(r0, ee0Var.c());
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements rw1.a<Integer, String> {
        public c() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(Integer num, String str) {
            s70 c = s70.c();
            if (c == null) {
                return;
            }
            c.g(str);
        }
    }

    /* loaded from: classes.dex */
    public class d implements rw1.a<Integer, String> {
        public d() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(Integer num, String str) {
            s70 c = s70.c();
            if (c == null) {
                return;
            }
            c.f(num.intValue(), str);
        }
    }

    /* loaded from: classes.dex */
    public class e implements qw1.a<Boolean> {
        public e() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Boolean bool) {
            s70 c = s70.c();
            if (c == null) {
                return;
            }
            c.g(null);
        }
    }

    /* loaded from: classes.dex */
    public class f implements qw1.a<Integer> {
        public f() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Integer num) {
            n30 p0;
            s70 c = s70.c();
            if (c == null) {
                return;
            }
            m91 m91Var = m91.d;
            if (num.intValue() == 0) {
                m30 o0 = MainActivity.o0();
                if (o0 != null) {
                    m91Var = o0.n();
                }
            } else if (num.intValue() == 1 && (p0 = MainActivity.p0()) != null) {
                m91Var = p0.m();
            }
            if (m91Var != m91.d) {
                if (m91Var != null) {
                    c.i(num.intValue(), m91Var.a, m91Var.b, m91Var.c);
                } else {
                    c.i(num.intValue(), false, "", null);
                }
            }
            c.h(num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public class g implements vw1.a<ee0> {
        public g() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public ee0 a() {
            s70 c = s70.c();
            if (c == null) {
                return null;
            }
            return c.b();
        }
    }

    /* loaded from: classes.dex */
    public class h implements xw1.a<Integer, sd0, String> {
        public h() {
        }

        @Override // com.daaw.xw1.a
        /* renamed from: a */
        public String c(Integer num, sd0 sd0Var) {
            l91 d;
            s70 c = s70.c();
            if (c == null || (d = c.d(num.intValue())) == null || !br1.g(d.d(), sd0Var)) {
                return null;
            }
            return d.c();
        }
    }

    /* loaded from: classes.dex */
    public class i implements tw1.a<Integer, Boolean, String, sd0> {
        public i() {
        }

        @Override // com.daaw.tw1.a
        /* renamed from: b */
        public void a(Integer num, Boolean bool, String str, sd0 sd0Var) {
            s70 c = s70.c();
            if (c == null) {
                return;
            }
            c.i(num.intValue(), bool.booleanValue(), str, sd0Var);
        }
    }

    /* loaded from: classes.dex */
    public class j implements xw1.a<AsyncTask, Integer, Boolean> {
        public j() {
        }

        @Override // com.daaw.xw1.a
        /* renamed from: a */
        public Boolean c(AsyncTask asyncTask, Integer num) {
            return Boolean.valueOf(ui.b.c(asyncTask, num.intValue()));
        }
    }

    public ui() {
        s70.c.b(new b(), this.a);
        MainActivity.v0.b(new c(), this.a);
        t91.c.b(new d(), this.a);
        MainActivity.w0.b(new e(), this.a);
        MainActivity.x0.b(new f(), this.a);
        MainActivity.y0.b(new g(), this.a);
        dj0.Y.b(new h(), this.a);
        dj0.r.b(new i(), this.a);
        dj0.h0.b(new j(), this.a);
        dj0.i0.b(new a(), this.a);
    }
}
