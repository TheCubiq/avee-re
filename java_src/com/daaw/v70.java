package com.daaw;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.daaw.C1897k3;
import com.daaw.C1897k3.InterfaceC1901d;
import com.daaw.C3536xf;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* loaded from: classes.dex */
public abstract class v70<O extends C1897k3.InterfaceC1901d> {

    /* renamed from: a */
    public final Context f29961a;

    /* renamed from: b */
    public final String f29962b;

    /* renamed from: c */
    public final C1897k3<O> f29963c;

    /* renamed from: d */
    public final O f29964d;

    /* renamed from: e */
    public final C2396o3<O> f29965e;

    /* renamed from: f */
    public final Looper f29966f;

    /* renamed from: g */
    public final int f29967g;
    @NotOnlyInitialized

    /* renamed from: h */
    public final y70 f29968h;

    /* renamed from: i */
    public final vf1 f29969i;

    /* renamed from: j */
    public final z70 f29970j;

    /* renamed from: com.daaw.v70$a */
    /* loaded from: classes.dex */
    public static class C3306a {

        /* renamed from: c */
        public static final C3306a f29971c = new C3307a().m7376a();

        /* renamed from: a */
        public final vf1 f29972a;

        /* renamed from: b */
        public final Looper f29973b;

        /* renamed from: com.daaw.v70$a$a */
        /* loaded from: classes.dex */
        public static class C3307a {

            /* renamed from: a */
            public vf1 f29974a;

            /* renamed from: b */
            public Looper f29975b;

            /* renamed from: a */
            public C3306a m7376a() {
                if (this.f29974a == null) {
                    this.f29974a = new C2147m3();
                }
                if (this.f29975b == null) {
                    this.f29975b = Looper.getMainLooper();
                }
                return new C3306a(this.f29974a, this.f29975b);
            }
        }

        public C3306a(vf1 vf1Var, Account account, Looper looper) {
            this.f29972a = vf1Var;
            this.f29973b = looper;
        }
    }

    public v70(Context context, Activity activity, C1897k3<O> c1897k3, O o, C3306a c3306a) {
        ry0.m10829k(context, "Null context is not permitted.");
        ry0.m10829k(c1897k3, "Api must not be null.");
        ry0.m10829k(c3306a, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f29961a = context.getApplicationContext();
        String str = null;
        if (vw0.m6694k()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f29962b = str;
        this.f29963c = c1897k3;
        this.f29964d = o;
        this.f29966f = c3306a.f29973b;
        C2396o3<O> m14600a = C2396o3.m14600a(c1897k3, o, str);
        this.f29965e = m14600a;
        this.f29968h = new n02(this);
        z70 m2736x = z70.m2736x(this.f29961a);
        this.f29970j = m2736x;
        this.f29967g = m2736x.m2747m();
        this.f29969i = c3306a.f29972a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            uz1.m7568u(activity, m2736x, m14600a);
        }
        m2736x.m2758b(this);
    }

    public v70(Context context, C1897k3<O> c1897k3, O o, C3306a c3306a) {
        this(context, null, c1897k3, o, c3306a);
    }

    /* renamed from: c */
    public C3536xf.C3537a m7385c() {
        Account m18068b;
        GoogleSignInAccount m18067a;
        GoogleSignInAccount m18067a2;
        C3536xf.C3537a c3537a = new C3536xf.C3537a();
        O o = this.f29964d;
        if (!(o instanceof C1897k3.InterfaceC1901d.InterfaceC1903b) || (m18067a2 = ((C1897k3.InterfaceC1901d.InterfaceC1903b) o).m18067a()) == null) {
            O o2 = this.f29964d;
            m18068b = o2 instanceof C1897k3.InterfaceC1901d.InterfaceC1902a ? ((C1897k3.InterfaceC1901d.InterfaceC1902a) o2).m18068b() : null;
        } else {
            m18068b = m18067a2.m1219h();
        }
        c3537a.m5155d(m18068b);
        O o3 = this.f29964d;
        c3537a.m5156c((!(o3 instanceof C1897k3.InterfaceC1901d.InterfaceC1903b) || (m18067a = ((C1897k3.InterfaceC1901d.InterfaceC1903b) o3).m18067a()) == null) ? Collections.emptySet() : m18067a.m1211y());
        c3537a.m5154e(this.f29961a.getClass().getName());
        c3537a.m5157b(this.f29961a.getPackageName());
        return c3537a;
    }

    /* renamed from: d */
    public <TResult, A extends C1897k3.InterfaceC1899b> rj1<TResult> m7384d(sj1<A, TResult> sj1Var) {
        return m7377k(2, sj1Var);
    }

    /* renamed from: e */
    public <TResult, A extends C1897k3.InterfaceC1899b> rj1<TResult> m7383e(sj1<A, TResult> sj1Var) {
        return m7377k(0, sj1Var);
    }

    /* renamed from: f */
    public final C2396o3<O> m7382f() {
        return this.f29965e;
    }

    /* renamed from: g */
    public String m7381g() {
        return this.f29962b;
    }

    /* renamed from: h */
    public final int m7380h() {
        return this.f29967g;
    }

    /* renamed from: i */
    public final C1897k3.InterfaceC1906f m7379i(Looper looper, i02<O> i02Var) {
        C1897k3.InterfaceC1906f mo1753b = ((C1897k3.AbstractC1898a) ry0.m10830j(this.f29963c.m18070a())).mo1753b(this.f29961a, looper, m7385c().m5158a(), this.f29964d, i02Var, i02Var);
        String m7381g = m7381g();
        if (m7381g != null && (mo1753b instanceof AbstractC2527pa)) {
            ((AbstractC2527pa) mo1753b).setAttributionTag(m7381g);
        }
        if (m7381g != null && (mo1753b instanceof at0)) {
            ((at0) mo1753b).m27091e(m7381g);
        }
        return mo1753b;
    }

    /* renamed from: j */
    public final f12 m7378j(Context context, Handler handler) {
        return new f12(context, handler, m7385c().m5158a());
    }

    /* renamed from: k */
    public final <TResult, A extends C1897k3.InterfaceC1899b> rj1<TResult> m7377k(int i, sj1<A, TResult> sj1Var) {
        tj1 tj1Var = new tj1();
        this.f29970j.m2762D(this, i, sj1Var, tj1Var, this.f29969i);
        return tj1Var.m9082a();
    }
}
