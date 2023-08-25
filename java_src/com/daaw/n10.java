package com.daaw;

import android.content.Context;
import android.os.AsyncTask;
import com.daaw.s91;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public abstract class n10<T, V extends List<T>> extends bk0<T, V> {
    public V G;
    public V H;
    public String I;
    public s91.b<T> J;

    /* loaded from: classes.dex */
    public class a implements s91.b<T> {
        public a() {
        }

        @Override // com.daaw.s91.b
        public void a(AsyncTask asyncTask, boolean z) {
            if (d(asyncTask)) {
                n10 n10Var = n10.this;
                if (n10Var.H == null) {
                    return;
                }
                n10Var.N(false, true);
                n10.this.A();
            }
        }

        @Override // com.daaw.s91.b
        public void b(AsyncTask asyncTask) {
            if (d(asyncTask)) {
                n10 n10Var = n10.this;
                if (n10Var.H == null) {
                    return;
                }
                n10Var.N(true, false);
                n10.this.H.clear();
                n10.this.A();
            }
        }

        @Override // com.daaw.s91.b
        public void c(AsyncTask asyncTask, T t) {
            if (n10.this.H != null && d(asyncTask)) {
                n10.this.U(t);
            }
        }

        public boolean d(AsyncTask asyncTask) {
            return yj.y.a(asyncTask, Integer.valueOf(n10.this.l), Boolean.FALSE).booleanValue();
        }
    }

    public n10(Context context, r40<yj, V> r40Var, w40<V> w40Var, String str, me0<String> me0Var, int i, m10<T> m10Var, int i2) {
        super(context, r40Var, w40Var, str, me0Var, i, i2);
        this.I = null;
        this.J = new a();
        W(context, yj.r.a(Integer.valueOf(i2), J(), ""), m10Var);
    }

    @Override // com.daaw.bk0
    public lo1<V, String> Q(boolean z) {
        V v = this.H;
        if (v == null) {
            return super.Q(z);
        }
        if (z) {
            v = null;
        }
        return new lo1<>(v, this.I + this.H.size());
    }

    public void U(T t) {
        this.H.add(t);
    }

    public final void V(String str, m10<T> m10Var, V v) {
        Context e = dx0.e();
        if (e == null) {
            return;
        }
        s91 s91Var = new s91(e, v, m10Var, new WeakReference(this.J));
        yj.z.a(s91Var, Integer.valueOf(this.l), str);
        s91Var.execute(str);
    }

    public void W(Context context, String str, m10<T> m10Var) {
        if (str == null || str.isEmpty() || m10Var == null) {
            this.H = null;
            this.I = null;
            this.G = null;
            N(false, true);
            A();
            return;
        }
        this.H = this.E.a();
        this.I = str;
        N(true, false);
        if (this.G == null) {
            this.G = (V) super.S();
        }
        A();
        V(str, m10Var, this.G);
    }
}
