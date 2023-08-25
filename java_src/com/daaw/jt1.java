package com.daaw;

import android.app.Application;
import com.daaw.AbstractC1589hn;
import java.util.Objects;
/* loaded from: classes.dex */
public class jt1 {

    /* renamed from: a */
    public final mt1 f15380a;

    /* renamed from: b */
    public final InterfaceC1864b f15381b;

    /* renamed from: c */
    public final AbstractC1589hn f15382c;

    /* renamed from: com.daaw.jt1$a */
    /* loaded from: classes.dex */
    public static class C1861a extends C1866c {

        /* renamed from: d */
        public static final C1862a f15383d = new C1862a(null);

        /* renamed from: e */
        public static final AbstractC1589hn.InterfaceC1591b<Application> f15384e = C1862a.C1863a.f15385a;

        /* renamed from: com.daaw.jt1$a$a */
        /* loaded from: classes.dex */
        public static final class C1862a {

            /* renamed from: com.daaw.jt1$a$a$a */
            /* loaded from: classes.dex */
            public static final class C1863a implements AbstractC1589hn.InterfaceC1591b<Application> {

                /* renamed from: a */
                public static final C1863a f15385a = new C1863a();
            }

            public C1862a() {
            }

            public /* synthetic */ C1862a(C2575pq c2575pq) {
                this();
            }
        }
    }

    /* renamed from: com.daaw.jt1$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1864b {

        /* renamed from: a */
        public static final C1865a f15386a = C1865a.f15387a;

        /* renamed from: com.daaw.jt1$b$a */
        /* loaded from: classes.dex */
        public static final class C1865a {

            /* renamed from: a */
            public static final /* synthetic */ C1865a f15387a = new C1865a();
        }

        /* renamed from: a */
        <T extends ht1> T mo5153a(Class<T> cls);

        /* renamed from: b */
        <T extends ht1> T mo5152b(Class<T> cls, AbstractC1589hn abstractC1589hn);
    }

    /* renamed from: com.daaw.jt1$c */
    /* loaded from: classes.dex */
    public static class C1866c implements InterfaceC1864b {

        /* renamed from: b */
        public static final C1867a f15388b = new C1867a(null);

        /* renamed from: c */
        public static final AbstractC1589hn.InterfaceC1591b<String> f15389c = C1867a.C1868a.f15390a;

        /* renamed from: com.daaw.jt1$c$a */
        /* loaded from: classes.dex */
        public static final class C1867a {

            /* renamed from: com.daaw.jt1$c$a$a */
            /* loaded from: classes.dex */
            public static final class C1868a implements AbstractC1589hn.InterfaceC1591b<String> {

                /* renamed from: a */
                public static final C1868a f15390a = new C1868a();
            }

            public C1867a() {
            }

            public /* synthetic */ C1867a(C2575pq c2575pq) {
                this();
            }
        }
    }

    /* renamed from: com.daaw.jt1$d */
    /* loaded from: classes.dex */
    public static class C1869d {
        /* renamed from: a */
        public void m18253a(ht1 ht1Var) {
            ug0.m8268f(ht1Var, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jt1(mt1 mt1Var, InterfaceC1864b interfaceC1864b) {
        this(mt1Var, interfaceC1864b, null, 4, null);
        ug0.m8268f(mt1Var, "store");
        ug0.m8268f(interfaceC1864b, "factory");
    }

    public jt1(mt1 mt1Var, InterfaceC1864b interfaceC1864b, AbstractC1589hn abstractC1589hn) {
        ug0.m8268f(mt1Var, "store");
        ug0.m8268f(interfaceC1864b, "factory");
        ug0.m8268f(abstractC1589hn, "defaultCreationExtras");
        this.f15380a = mt1Var;
        this.f15381b = interfaceC1864b;
        this.f15382c = abstractC1589hn;
    }

    public /* synthetic */ jt1(mt1 mt1Var, InterfaceC1864b interfaceC1864b, AbstractC1589hn abstractC1589hn, int i, C2575pq c2575pq) {
        this(mt1Var, interfaceC1864b, (i & 4) != 0 ? AbstractC1589hn.C1590a.f12681b : abstractC1589hn);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jt1(nt1 nt1Var, InterfaceC1864b interfaceC1864b) {
        this(r0, interfaceC1864b, lt1.m16571a(nt1Var));
        ug0.m8268f(nt1Var, "owner");
        ug0.m8268f(interfaceC1864b, "factory");
        mt1 mo13652g = nt1Var.mo13652g();
        ug0.m8269e(mo13652g, "owner.viewModelStore");
    }

    /* renamed from: a */
    public <T extends ht1> T m18255a(Class<T> cls) {
        ug0.m8268f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) m18254b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public <T extends ht1> T m18254b(String str, Class<T> cls) {
        ug0.m8268f(str, "key");
        ug0.m8268f(cls, "modelClass");
        T t = (T) this.f15380a.m15777b(str);
        if (!cls.isInstance(t)) {
            ir0 ir0Var = new ir0(this.f15382c);
            ir0Var.m19488b(C1866c.f15389c, str);
            T t2 = (T) this.f15381b.mo5152b(cls, ir0Var);
            this.f15380a.m15775d(str, t2);
            return t2;
        }
        InterfaceC1864b interfaceC1864b = this.f15381b;
        C1869d c1869d = interfaceC1864b instanceof C1869d ? (C1869d) interfaceC1864b : null;
        if (c1869d != null) {
            ug0.m8269e(t, "viewModel");
            c1869d.m18253a(t);
        }
        Objects.requireNonNull(t, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return t;
    }
}
