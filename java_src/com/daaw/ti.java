package com.daaw;

import android.content.Context;
import com.daaw.qw1;
import com.daaw.wc0;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public class ti implements wc0 {
    public wc0.c a;
    public wc0[] b;
    public b[] c;
    public c[] e;
    public me0<String> g;
    public int h;
    public a i;
    public wc0.a d = null;
    public wc0.b f = null;

    /* loaded from: classes.dex */
    public interface a {
        ts1 a(Context context, int i, wc0 wc0Var);
    }

    /* loaded from: classes.dex */
    public class b implements wc0.a {
        public int a = 0;
        public int b = 0;
        public boolean c = false;
        public boolean d = false;
        public String e = "";

        public b() {
        }

        @Override // com.daaw.wc0.a
        public void a(String str) {
            this.e = str;
            ti.this.B();
        }

        @Override // com.daaw.wc0.a
        public void b(int i, int i2, boolean z, boolean z2) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = z2;
            ti.this.A();
        }
    }

    /* loaded from: classes.dex */
    public class c implements wc0.b {
        public int p;

        public c(int i) {
            this.p = i;
        }

        @Override // com.daaw.wc0.b
        public void a(String str, String str2) {
            wc0.b bVar = ti.this.f;
            bVar.a(str, ti.v(this.p) + str2);
        }

        @Override // com.daaw.wc0.b
        public void b(qw1.a<Integer> aVar, List<Object> list) {
            ti.this.f.b(aVar, list);
        }

        @Override // com.daaw.wc0.b
        public int c() {
            return ti.this.f.c();
        }

        @Override // com.daaw.wc0.b
        public int d() {
            return ti.this.f.d();
        }

        @Override // com.daaw.wc0.b
        public void e(qw1.a<Boolean> aVar, List<Object> list) {
            ti.this.f.e(aVar, list);
        }

        @Override // com.daaw.wc0.b
        public String f(String str, String str2) {
            wc0.b bVar = ti.this.f;
            return bVar.f(str, ti.v(this.p) + str2);
        }

        @Override // com.daaw.wc0.b
        public void g(qw1.a<Boolean> aVar, List<Object> list) {
            ti.this.f.g(aVar, list);
        }
    }

    public ti(wc0[] wc0VarArr, me0<String> me0Var, int i, a aVar) {
        this.b = wc0VarArr;
        this.g = me0Var;
        this.h = i;
        this.i = aVar;
        this.c = new b[wc0VarArr.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            b[] bVarArr = this.c;
            if (i3 >= bVarArr.length) {
                break;
            }
            bVarArr[i3] = new b();
            i3++;
        }
        this.e = new c[wc0VarArr.length];
        while (true) {
            c[] cVarArr = this.e;
            if (i2 >= cVarArr.length) {
                return;
            }
            cVarArr[i2] = new c(i2);
            i2++;
        }
    }

    public static String v(int i) {
        return String.format(Locale.US, "%05d", Integer.valueOf(i));
    }

    public final void A() {
        b[] bVarArr;
        if (this.d == null) {
            return;
        }
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        for (b bVar : this.c) {
            i += bVar.a;
            i2 += bVar.b;
            if (bVar.c) {
                z = true;
            }
            if (bVar.d) {
                z2 = true;
            }
        }
        this.d.b(i, i2, z, z2);
    }

    public final void B() {
        b[] bVarArr;
        if (this.d == null) {
            return;
        }
        String str = "";
        for (b bVar : this.c) {
            str = str + bVar.e;
        }
        this.d.a(str);
    }

    @Override // com.daaw.wc0, com.daaw.ts1.a
    public int a() {
        int i = 0;
        for (wc0 wc0Var : this.b) {
            i += wc0Var.a();
        }
        return i;
    }

    @Override // com.daaw.wc0
    public boolean b() {
        return this.b[0].b();
    }

    @Override // com.daaw.wc0
    public void c(boolean z) {
    }

    @Override // com.daaw.wc0
    public ts1 d(Context context, String str) {
        StringBuilder sb;
        if (str.length() > 5) {
            String substring = str.substring(0, 5);
            String substring2 = str.substring(5);
            int x = br1.x(substring, -1);
            if (x >= 0) {
                wc0[] wc0VarArr = this.b;
                if (x < wc0VarArr.length) {
                    return wc0VarArr[x].d(context, substring2);
                }
            }
            sb = new StringBuilder();
            sb.append("invalid prefix value ");
            sb.append(x);
        } else {
            sb = new StringBuilder();
            sb.append("invalid relativeAddressItem <");
            sb.append(str);
            sb.append(">");
        }
        lz1.c(sb.toString());
        return null;
    }

    @Override // com.daaw.wc0
    public String e() {
        return this.b[0].e();
    }

    @Override // com.daaw.wc0
    public void g(al alVar, int i) {
        for (wc0 wc0Var : this.b) {
            wc0Var.g(alVar, i);
        }
    }

    @Override // com.daaw.wc0
    public boolean h(boolean z) {
        boolean z2 = true;
        int i = 0;
        while (true) {
            wc0[] wc0VarArr = this.b;
            if (i >= wc0VarArr.length) {
                return z2;
            }
            if (!wc0VarArr[i].h(z)) {
                z2 = false;
            }
            i++;
        }
    }

    @Override // com.daaw.wc0
    public int i() {
        return this.h;
    }

    @Override // com.daaw.wc0
    public me0<String> l() {
        return this.g;
    }

    @Override // com.daaw.wc0
    public boolean m(int i, Context context) {
        q6.j();
        return false;
    }

    @Override // com.daaw.wc0
    public void n(WeakReference<wc0.a> weakReference) {
        this.d = weakReference.get();
        int i = 0;
        while (true) {
            wc0[] wc0VarArr = this.b;
            if (i >= wc0VarArr.length) {
                return;
            }
            wc0VarArr[i].n(new WeakReference<>(this.c[i]));
            i++;
        }
    }

    @Override // com.daaw.wc0
    public void o(Context context, String str) {
        for (wc0 wc0Var : this.b) {
            wc0Var.o(context, str);
        }
    }

    @Override // com.daaw.wc0
    public String p(String str) {
        return this.b[0].p(str);
    }

    @Override // com.daaw.wc0
    public void q(WeakReference<wc0.b> weakReference) {
        this.f = weakReference.get();
        int i = 0;
        while (true) {
            wc0[] wc0VarArr = this.b;
            if (i >= wc0VarArr.length) {
                return;
            }
            wc0VarArr[i].q(new WeakReference<>(this.e[i]));
            i++;
        }
    }

    public ts1 r(Context context) {
        return t(context, -1);
    }

    @Override // com.daaw.wc0
    public lo1<Integer, Boolean> s() {
        return this.b[0].s();
    }

    public ts1 t(Context context, int i) {
        return this.i.a(context, i, this);
    }

    @Override // com.daaw.wc0
    public wc0.c u() {
        return this.a;
    }

    @Override // com.daaw.wc0
    public wc0.b w() {
        wc0[] wc0VarArr = this.b;
        if (wc0VarArr.length > 0) {
            return wc0VarArr[0].w();
        }
        return null;
    }

    @Override // com.daaw.wc0
    public void x(Context context, String[] strArr, sd0[] sd0VarArr) {
        this.b[0].x(context, strArr, sd0VarArr);
    }

    @Override // com.daaw.wc0
    public boolean y(sd0 sd0Var) {
        for (wc0 wc0Var : this.b) {
            if (wc0Var.y(sd0Var)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.wc0
    public boolean z() {
        return true;
    }
}
