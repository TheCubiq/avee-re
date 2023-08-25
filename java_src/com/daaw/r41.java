package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.daaw.hj;
/* loaded from: classes.dex */
public class r41 implements qj0 {
    public final Context p;
    public final mj0 q;
    public final u41 r;
    public final v41 s;
    public final e70 t;
    public final d u;
    public b v;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ mj0 p;

        public a(mj0 mj0Var) {
            this.p = mj0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.p.a(r41.this);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        <T> void a(f60<T, ?, ?, ?> f60Var);
    }

    /* loaded from: classes.dex */
    public final class c<A, T> {
        public final mq0<A, T> a;
        public final Class<T> b;

        /* loaded from: classes.dex */
        public final class a {
            public final A a;
            public final Class<A> b;
            public final boolean c = true;

            public a(A a) {
                this.a = a;
                this.b = r41.s(a);
            }

            public <Z> g60<A, T, Z> a(Class<Z> cls) {
                g60<A, T, Z> g60Var = (g60) r41.this.u.a(new g60(r41.this.p, r41.this.t, this.b, c.this.a, c.this.b, cls, r41.this.s, r41.this.q, r41.this.u));
                if (this.c) {
                    g60Var.t(this.a);
                }
                return g60Var;
            }
        }

        public c(mq0<A, T> mq0Var, Class<T> cls) {
            this.a = mq0Var;
            this.b = cls;
        }

        public c<A, T>.a c(A a2) {
            return new a(a2);
        }
    }

    /* loaded from: classes.dex */
    public class d {
        public d() {
        }

        public <A, X extends f60<A, ?, ?, ?>> X a(X x) {
            if (r41.this.v != null) {
                r41.this.v.a(x);
            }
            return x;
        }
    }

    /* loaded from: classes.dex */
    public static class e implements hj.a {
        public final v41 a;

        public e(v41 v41Var) {
            this.a = v41Var;
        }

        @Override // com.daaw.hj.a
        public void a(boolean z) {
            if (z) {
                this.a.d();
            }
        }
    }

    public r41(Context context, mj0 mj0Var, u41 u41Var) {
        this(context, mj0Var, u41Var, new v41(), new ij());
    }

    public r41(Context context, mj0 mj0Var, u41 u41Var, v41 v41Var, ij ijVar) {
        this.p = context.getApplicationContext();
        this.q = mj0Var;
        this.r = u41Var;
        this.s = v41Var;
        this.t = e70.j(context);
        this.u = new d();
        hj a2 = ijVar.a(context, new e(v41Var));
        if (tq1.i()) {
            new Handler(Looper.getMainLooper()).post(new a(mj0Var));
        } else {
            mj0Var.a(this);
        }
        mj0Var.a(a2);
    }

    public static <T> Class<T> s(T t) {
        if (t != null) {
            return (Class<T>) t.getClass();
        }
        return null;
    }

    public <A, T> c<A, T> A(mq0<A, T> mq0Var, Class<T> cls) {
        return new c<>(mq0Var, cls);
    }

    @Override // com.daaw.qj0
    public void a() {
        z();
    }

    @Override // com.daaw.qj0
    public void h() {
        y();
    }

    @Override // com.daaw.qj0
    public void onDestroy() {
        this.s.a();
    }

    public uu<Integer> q() {
        return (uu) v(Integer.class).x(q5.a(this.p));
    }

    public uu<Uri> r() {
        return v(Uri.class);
    }

    public uu<Uri> t(Uri uri) {
        return (uu) r().L(uri);
    }

    public uu<Integer> u(Integer num) {
        return (uu) q().L(num);
    }

    public final <T> uu<T> v(Class<T> cls) {
        mq0 e2 = e70.e(cls, this.p);
        mq0 b2 = e70.b(cls, this.p);
        if (cls == null || e2 != null || b2 != null) {
            d dVar = this.u;
            return (uu) dVar.a(new uu(cls, e2, b2, this.p, this.t, this.s, this.q, dVar));
        }
        throw new IllegalArgumentException("Unknown type " + cls + ". You must provide a Model of a type for which there is a registered ModelLoader, if you are using a custom model, you must first call Glide#register with a ModelLoaderFactory for your custom model class");
    }

    public void w() {
        this.t.i();
    }

    public void x(int i) {
        this.t.s(i);
    }

    public void y() {
        tq1.b();
        this.s.b();
    }

    public void z() {
        tq1.b();
        this.s.e();
    }
}
