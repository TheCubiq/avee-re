package com.daaw;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ImageView;
import com.daaw.avee.R;
import com.daaw.ie1;
import com.daaw.jh0;
import com.daaw.wc0;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public abstract class yj implements wc0 {
    public wc0.c a;
    public WeakReference<wc0.a> b;
    public WeakReference<wc0.b> c;
    public me0<String> d;
    public int e;
    public String f;
    public int g;
    public int h;
    public int i;
    public int j;
    public sd0 k;
    public int l;
    public String m;
    public boolean n;
    public boolean o;
    public static tw1<i2, ImageView, Boolean, Boolean> p = new tw1<>();
    public static vw1<Boolean> q = new vw1<>();
    public static xw1<Integer, sd0, String> r = new xw1<>();
    public static xw1<Integer, sd0, ie1.h> s = new xw1<>();
    public static yw1<Integer, sd0, File, Boolean> t = new yw1<>();
    public static ww1<Class<?>, Boolean> u = new ww1<>();
    public static rw1<Boolean, Class<?>> v = new rw1<>();
    public static sw1<Integer, Integer, List<Integer>> w = new sw1<>();
    public static ww1<jh0.a, Boolean> x = new ww1<>();
    public static xw1<AsyncTask, Integer, Boolean> y = new xw1<>();
    public static sw1<AsyncTask, Integer, Object> z = new sw1<>();
    public static qw1<Integer> A = new qw1<>();
    public static ww1<wc0, lo1<Integer, Boolean>> B = new ww1<>();

    /* loaded from: classes.dex */
    public static class a implements be0, sd0 {
        public String a;

        public a(String str) {
            this.a = str;
        }

        @Override // com.daaw.be0, com.daaw.sd0
        public boolean equals(Object obj) {
            return (obj instanceof a) && this.a.compareTo(((a) obj).a) == 0;
        }

        @Override // com.daaw.sd0
        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public yj(Context context, String str, me0<String> me0Var, int i, int i2) {
        this(context, str, me0Var, i, i2, new WeakReference(null));
    }

    public yj(Context context, String str, me0<String> me0Var, int i, int i2, WeakReference<wc0.b> weakReference) {
        this.b = new WeakReference<>(null);
        this.m = null;
        this.n = false;
        this.o = false;
        this.l = i2;
        this.d = me0Var;
        this.e = i;
        this.f = str;
        q(weakReference);
        this.g = gr1.m(context.getTheme(), R.attr.containerFG);
        this.h = gr1.m(context.getTheme(), R.attr.containerFGw);
        this.i = gr1.m(context.getTheme(), R.attr.containerFG);
        this.j = gr1.m(context.getTheme(), R.attr.containerBackgroundDark);
        this.k = K(str);
    }

    public static sd0 K(String str) {
        return new a(str);
    }

    public abstract boolean A();

    public boolean B(String str, boolean z2) {
        if (this.m == null || !C(str)) {
            if (z2) {
                this.m = str;
                return false;
            }
            return false;
        }
        return true;
    }

    public boolean C(String str) {
        String str2 = this.m;
        return (str2 == null || str == null || !br1.h(str2, str)) ? false : true;
    }

    public void D() {
        this.m = null;
    }

    public abstract ts1 E(Context context, int i);

    public ts1 F(Context context) {
        return G(context, -1);
    }

    public ts1 G(Context context, int i) {
        return E(context, i);
    }

    public abstract String H(int i);

    public int I() {
        return this.l;
    }

    public sd0 J() {
        return this.k;
    }

    public void L(boolean z2) {
        this.o = z2;
        wc0.a aVar = this.b.get();
        if (aVar != null) {
            aVar.b(a(), 0, this.n, z2);
        }
    }

    public void M(wc0.c cVar) {
        this.a = cVar;
    }

    public void N(boolean z2, boolean z3) {
        this.n = z2;
        wc0.a aVar = this.b.get();
        if (aVar != null) {
            aVar.b(z3 ? a() : -1, 0, this.n, this.o);
        }
    }

    public void O(String str) {
        wc0.a aVar = this.b.get();
        if (aVar != null) {
            aVar.a(str);
        }
    }

    @Override // com.daaw.wc0, com.daaw.ts1.a
    public abstract int a();

    @Override // com.daaw.wc0
    public boolean b() {
        return q.a(Boolean.TRUE).booleanValue();
    }

    @Override // com.daaw.wc0
    public void c(boolean z2) {
    }

    @Override // com.daaw.wc0
    public String e() {
        return this.f;
    }

    @Override // com.daaw.wc0
    public void g(al alVar, int i) {
    }

    @Override // com.daaw.wc0
    public boolean h(boolean z2) {
        if (z2) {
            D();
        }
        return A();
    }

    @Override // com.daaw.wc0
    public int i() {
        return this.e;
    }

    @Override // com.daaw.wc0
    public me0<String> l() {
        return this.d;
    }

    @Override // com.daaw.wc0
    public boolean m(int i, Context context) {
        wc0.b bVar = this.c.get();
        if (bVar != null) {
            bVar.a(e(), H(i));
            return false;
        }
        return false;
    }

    @Override // com.daaw.wc0
    public void n(WeakReference<wc0.a> weakReference) {
        this.b = weakReference;
        wc0.a aVar = weakReference.get();
        if (aVar != null) {
            aVar.b(a(), 0, this.n, this.o);
        }
    }

    @Override // com.daaw.wc0
    public String p(String str) {
        wc0.b bVar = this.c.get();
        return bVar != null ? bVar.f(e(), str) : e();
    }

    @Override // com.daaw.wc0
    public void q(WeakReference<wc0.b> weakReference) {
        this.c = weakReference;
    }

    @Override // com.daaw.wc0
    public lo1<Integer, Boolean> s() {
        return B.a(this, new lo1<>(56, Boolean.TRUE));
    }

    @Override // com.daaw.wc0
    public wc0.c u() {
        return this.a;
    }

    @Override // com.daaw.wc0
    public wc0.b w() {
        return this.c.get();
    }

    @Override // com.daaw.wc0
    public void x(Context context, String[] strArr, sd0[] sd0VarArr) {
        strArr[0] = null;
        sd0VarArr[0] = null;
    }

    @Override // com.daaw.wc0
    public boolean y(sd0 sd0Var) {
        return this.k.equals(sd0Var);
    }

    @Override // com.daaw.wc0
    public boolean z() {
        return true;
    }
}
