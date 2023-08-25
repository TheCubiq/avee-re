package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.daaw.InterfaceC1539hj;
/* loaded from: classes.dex */
public class r41 implements qj0 {

    /* renamed from: p */
    public final Context f24817p;

    /* renamed from: q */
    public final mj0 f24818q;

    /* renamed from: r */
    public final u41 f24819r;

    /* renamed from: s */
    public final v41 f24820s;

    /* renamed from: t */
    public final e70 f24821t;

    /* renamed from: u */
    public final C2823d f24822u;

    /* renamed from: v */
    public InterfaceC2820b f24823v;

    /* renamed from: com.daaw.r41$a */
    /* loaded from: classes.dex */
    public class RunnableC2819a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ mj0 f24824p;

        public RunnableC2819a(mj0 mj0Var) {
            this.f24824p = mj0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24824p.mo11891a(r41.this);
        }
    }

    /* renamed from: com.daaw.r41$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2820b {
        /* renamed from: a */
        <T> void m11764a(f60<T, ?, ?, ?> f60Var);
    }

    /* renamed from: com.daaw.r41$c */
    /* loaded from: classes.dex */
    public final class C2821c<A, T> {

        /* renamed from: a */
        public final mq0<A, T> f24826a;

        /* renamed from: b */
        public final Class<T> f24827b;

        /* renamed from: com.daaw.r41$c$a */
        /* loaded from: classes.dex */
        public final class C2822a {

            /* renamed from: a */
            public final A f24829a;

            /* renamed from: b */
            public final Class<A> f24830b;

            /* renamed from: c */
            public final boolean f24831c = true;

            public C2822a(A a) {
                this.f24829a = a;
                this.f24830b = r41.m11772s(a);
            }

            /* renamed from: a */
            public <Z> g60<A, T, Z> m11760a(Class<Z> cls) {
                g60<A, T, Z> g60Var = (g60) r41.this.f24822u.m11759a(new g60(r41.this.f24817p, r41.this.f24821t, this.f24830b, C2821c.this.f24826a, C2821c.this.f24827b, cls, r41.this.f24820s, r41.this.f24818q, r41.this.f24822u));
                if (this.f24831c) {
                    g60Var.m22904t(this.f24829a);
                }
                return g60Var;
            }
        }

        public C2821c(mq0<A, T> mq0Var, Class<T> cls) {
            this.f24826a = mq0Var;
            this.f24827b = cls;
        }

        /* renamed from: c */
        public C2821c<A, T>.C2822a m11761c(A a) {
            return new C2822a(a);
        }
    }

    /* renamed from: com.daaw.r41$d */
    /* loaded from: classes.dex */
    public class C2823d {
        public C2823d() {
        }

        /* renamed from: a */
        public <A, X extends f60<A, ?, ?, ?>> X m11759a(X x) {
            if (r41.this.f24823v != null) {
                r41.this.f24823v.m11764a(x);
            }
            return x;
        }
    }

    /* renamed from: com.daaw.r41$e */
    /* loaded from: classes.dex */
    public static class C2824e implements InterfaceC1539hj.InterfaceC1540a {

        /* renamed from: a */
        public final v41 f24834a;

        public C2824e(v41 v41Var) {
            this.f24834a = v41Var;
        }

        @Override // com.daaw.InterfaceC1539hj.InterfaceC1540a
        /* renamed from: a */
        public void mo11758a(boolean z) {
            if (z) {
                this.f24834a.m7461d();
            }
        }
    }

    public r41(Context context, mj0 mj0Var, u41 u41Var) {
        this(context, mj0Var, u41Var, new v41(), new C1712ij());
    }

    public r41(Context context, mj0 mj0Var, u41 u41Var, v41 v41Var, C1712ij c1712ij) {
        this.f24817p = context.getApplicationContext();
        this.f24818q = mj0Var;
        this.f24819r = u41Var;
        this.f24820s = v41Var;
        this.f24821t = e70.m23685j(context);
        this.f24822u = new C2823d();
        InterfaceC1539hj m19759a = c1712ij.m19759a(context, new C2824e(v41Var));
        if (tq1.m8862i()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC2819a(mj0Var));
        } else {
            mj0Var.mo11891a(this);
        }
        mj0Var.mo11891a(m19759a);
    }

    /* renamed from: s */
    public static <T> Class<T> m11772s(T t) {
        if (t != null) {
            return (Class<T>) t.getClass();
        }
        return null;
    }

    /* renamed from: A */
    public <A, T> C2821c<A, T> m11782A(mq0<A, T> mq0Var, Class<T> cls) {
        return new C2821c<>(mq0Var, cls);
    }

    @Override // com.daaw.qj0
    /* renamed from: a */
    public void mo3969a() {
        m11765z();
    }

    @Override // com.daaw.qj0
    /* renamed from: h */
    public void mo3966h() {
        m11766y();
    }

    @Override // com.daaw.qj0
    public void onDestroy() {
        this.f24820s.m7464a();
    }

    /* renamed from: q */
    public C3260uu<Integer> m11774q() {
        return (C3260uu) m11769v(Integer.class).mo9854x(C2690q5.m12770a(this.f24817p));
    }

    /* renamed from: r */
    public C3260uu<Uri> m11773r() {
        return m11769v(Uri.class);
    }

    /* renamed from: t */
    public C3260uu<Uri> m11771t(Uri uri) {
        return (C3260uu) m11773r().m9868L(uri);
    }

    /* renamed from: u */
    public C3260uu<Integer> m11770u(Integer num) {
        return (C3260uu) m11774q().m9868L(num);
    }

    /* renamed from: v */
    public final <T> C3260uu<T> m11769v(Class<T> cls) {
        mq0 m23690e = e70.m23690e(cls, this.f24817p);
        mq0 m23693b = e70.m23693b(cls, this.f24817p);
        if (cls == null || m23690e != null || m23693b != null) {
            C2823d c2823d = this.f24822u;
            return (C3260uu) c2823d.m11759a(new C3260uu(cls, m23690e, m23693b, this.f24817p, this.f24821t, this.f24820s, this.f24818q, c2823d));
        }
        throw new IllegalArgumentException("Unknown type " + cls + ". You must provide a Model of a type for which there is a registered ModelLoader, if you are using a custom model, you must first call Glide#register with a ModelLoaderFactory for your custom model class");
    }

    /* renamed from: w */
    public void m11768w() {
        this.f24821t.m23686i();
    }

    /* renamed from: x */
    public void m11767x(int i) {
        this.f24821t.m23676s(i);
    }

    /* renamed from: y */
    public void m11766y() {
        tq1.m8869b();
        this.f24820s.m7463b();
    }

    /* renamed from: z */
    public void m11765z() {
        tq1.m8869b();
        this.f24820s.m7460e();
    }
}
