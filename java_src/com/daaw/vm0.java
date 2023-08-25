package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.view.WindowManager;
import com.daaw.avee.MainActivity;
import com.daaw.pw1;
import com.daaw.qw1;
import com.daaw.rw1;
import com.daaw.sw1;
import com.daaw.tw1;
import com.daaw.tx0;
import com.daaw.vw1;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class vm0 {
    public List<Object> a = new LinkedList();
    public int b = 0;
    public int c = 0;

    /* loaded from: classes.dex */
    public class a implements vw1.a<tx0.b> {
        public a() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public tx0.b a() {
            return xw0.g;
        }
    }

    /* loaded from: classes.dex */
    public class b implements tw1.a<i2, af0, Integer, Integer> {
        public b() {
        }

        @Override // com.daaw.tw1.a
        /* renamed from: b */
        public void a(i2 i2Var, af0 af0Var, Integer num, Integer num2) {
            new g2().v(false, i2Var.a, i2Var.b, i2Var.c, af0Var, num.intValue(), num2.intValue(), 0, -1, true, null, null);
        }
    }

    /* loaded from: classes.dex */
    public class c implements rw1.a<Integer, al> {
        public c() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(Integer num, al alVar) {
            if (num.intValue() == 2) {
                vm0.this.e(false);
                vm0.this.f();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements sw1.a<Integer, Integer, Boolean> {
        public d() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(Integer num, Integer num2, Boolean bool) {
            if (num.intValue() == j5.J) {
                vm0.this.g(num2.intValue());
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements vw1.a<Boolean> {
        public e() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Boolean a() {
            int i = vm0.this.b;
            if (i != 0) {
                return Boolean.valueOf(i != 0);
            }
            return Boolean.valueOf(j5.e().k(j5.J) != 0);
        }
    }

    /* loaded from: classes.dex */
    public class f implements rw1.a<List<tx0>, Integer> {
        public f() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(List<tx0> list, Integer num) {
            l01 c = l01.c();
            if (c != null) {
                c.J(list, num.intValue(), null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements pw1.a {
        public g() {
        }

        @Override // com.daaw.pw1.a
        public void a() {
            MainActivity r0 = MainActivity.r0();
            if (r0 != null) {
                r0.m0();
            }
        }
    }

    /* loaded from: classes.dex */
    public class h implements rw1.a<Integer, Activity> {
        public h() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(Integer num, Activity activity) {
            j5.e().c0(j5.G, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public class i implements qw1.a<Context> {
        public i() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Context context) {
            m30 o0 = MainActivity.o0();
            if (o0 != null) {
                o0.q();
            }
        }
    }

    /* loaded from: classes.dex */
    public class j implements rw1.a<Float, Context> {
        public j() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(Float f, Context context) {
            m30 o0 = MainActivity.o0();
            if (o0 != null) {
                o0.r(f.floatValue());
            }
        }
    }

    public vm0() {
        MainActivity.s0.b(new b(), this.a);
        MainActivity.r0.b(new c(), this.a);
        j5.g.b(new d(), this.a);
        MainActivity.u0.b(new e(), this.a);
        MainActivity.z0.b(new f(), this.a);
        uy.a.b(new g(), this.a);
        MainActivity.p0.b(new h(), this.a);
        MainActivity.B0.b(new i(), this.a);
        MainActivity.C0.b(new j(), this.a);
        MainActivity.G0.b(new a(), this.a);
    }

    public int c(MainActivity mainActivity) {
        int rotation = ((WindowManager) mainActivity.getSystemService("window")).getDefaultDisplay().getRotation();
        if (mainActivity.getResources().getConfiguration().orientation == 1) {
            if (rotation != 0) {
                if (rotation == 1 || rotation == 2) {
                    return 3;
                }
                return rotation != 3 ? 0 : 1;
            }
            return 1;
        } else if (mainActivity.getResources().getConfiguration().orientation == 2) {
            if (rotation == 0 || rotation == 1) {
                return 2;
            }
            return (rotation == 2 || rotation == 3) ? 4 : 0;
        } else {
            return 0;
        }
    }

    public void d(MainActivity mainActivity, int i2) {
        if (i2 == 0 || !(i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4)) {
            mainActivity.setRequestedOrientation(-1);
        } else {
            mainActivity.setRequestedOrientation(14);
        }
    }

    public void e(boolean z) {
        int i2;
        this.b = 0;
        if (z) {
            MainActivity r0 = MainActivity.r0();
            if (r0 != null) {
                this.b = c(r0);
            }
            this.c = j5.e().k(j5.J);
            i2 = this.b;
        } else {
            i2 = this.c;
        }
        g(i2);
    }

    public final void f() {
        int k = j5.e().k(j5.J);
        if (k == 0) {
            MainActivity r0 = MainActivity.r0();
            if (r0 != null) {
                k = c(r0);
            }
        } else {
            k = 0;
        }
        j5.e().c0(j5.J, k);
    }

    public final void g(int i2) {
        MainActivity r0 = MainActivity.r0();
        if (r0 != null) {
            r0.R0(i2 != 0, false);
            if (i2 == 0) {
                r0.setRequestedOrientation(-1);
            } else if (r0.getRequestedOrientation() == -1) {
                d(r0, i2);
            }
        }
    }
}
