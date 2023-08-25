package com.daaw;

import android.app.Application;
import com.daaw.hn;
import java.util.Objects;
/* loaded from: classes.dex */
public class jt1 {
    public final mt1 a;
    public final b b;
    public final hn c;

    /* loaded from: classes.dex */
    public static class a extends c {
        public static final C0056a d = new C0056a(null);
        public static final hn.b<Application> e = C0056a.C0057a.a;

        /* renamed from: com.daaw.jt1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0056a {

            /* renamed from: com.daaw.jt1$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0057a implements hn.b<Application> {
                public static final C0057a a = new C0057a();
            }

            public C0056a() {
            }

            public /* synthetic */ C0056a(pq pqVar) {
                this();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        public static final a a = a.a;

        /* loaded from: classes.dex */
        public static final class a {
            public static final /* synthetic */ a a = new a();
        }

        <T extends ht1> T a(Class<T> cls);

        <T extends ht1> T b(Class<T> cls, hn hnVar);
    }

    /* loaded from: classes.dex */
    public static class c implements b {
        public static final a b = new a(null);
        public static final hn.b<String> c = a.C0058a.a;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: com.daaw.jt1$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0058a implements hn.b<String> {
                public static final C0058a a = new C0058a();
            }

            public a() {
            }

            public /* synthetic */ a(pq pqVar) {
                this();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public void a(ht1 ht1Var) {
            ug0.f(ht1Var, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jt1(mt1 mt1Var, b bVar) {
        this(mt1Var, bVar, null, 4, null);
        ug0.f(mt1Var, "store");
        ug0.f(bVar, "factory");
    }

    public jt1(mt1 mt1Var, b bVar, hn hnVar) {
        ug0.f(mt1Var, "store");
        ug0.f(bVar, "factory");
        ug0.f(hnVar, "defaultCreationExtras");
        this.a = mt1Var;
        this.b = bVar;
        this.c = hnVar;
    }

    public /* synthetic */ jt1(mt1 mt1Var, b bVar, hn hnVar, int i, pq pqVar) {
        this(mt1Var, bVar, (i & 4) != 0 ? hn.a.b : hnVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jt1(com.daaw.nt1 r3, com.daaw.jt1.b r4) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            com.daaw.ug0.f(r3, r0)
            java.lang.String r0 = "factory"
            com.daaw.ug0.f(r4, r0)
            com.daaw.mt1 r0 = r3.g()
            java.lang.String r1 = "owner.viewModelStore"
            com.daaw.ug0.e(r0, r1)
            com.daaw.hn r3 = com.daaw.lt1.a(r3)
            r2.<init>(r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.jt1.<init>(com.daaw.nt1, com.daaw.jt1$b):void");
    }

    public <T extends ht1> T a(Class<T> cls) {
        ug0.f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends ht1> T b(String str, Class<T> cls) {
        ug0.f(str, "key");
        ug0.f(cls, "modelClass");
        T t = (T) this.a.b(str);
        if (!cls.isInstance(t)) {
            ir0 ir0Var = new ir0(this.c);
            ir0Var.b(c.c, str);
            T t2 = (T) this.b.b(cls, ir0Var);
            this.a.d(str, t2);
            return t2;
        }
        b bVar = this.b;
        d dVar = bVar instanceof d ? (d) bVar : null;
        if (dVar != null) {
            ug0.e(t, "viewModel");
            dVar.a(t);
        }
        Objects.requireNonNull(t, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return t;
    }
}
