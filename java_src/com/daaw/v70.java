package com.daaw;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.daaw.k3;
import com.daaw.k3.d;
import com.daaw.xf;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* loaded from: classes.dex */
public abstract class v70<O extends k3.d> {
    public final Context a;
    public final String b;
    public final k3<O> c;
    public final O d;
    public final o3<O> e;
    public final Looper f;
    public final int g;
    @NotOnlyInitialized
    public final y70 h;
    public final vf1 i;
    public final z70 j;

    /* loaded from: classes.dex */
    public static class a {
        public static final a c = new C0090a().a();
        public final vf1 a;
        public final Looper b;

        /* renamed from: com.daaw.v70$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0090a {
            public vf1 a;
            public Looper b;

            public a a() {
                if (this.a == null) {
                    this.a = new m3();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new a(this.a, this.b);
            }
        }

        public a(vf1 vf1Var, Account account, Looper looper) {
            this.a = vf1Var;
            this.b = looper;
        }
    }

    public v70(Context context, Activity activity, k3<O> k3Var, O o, a aVar) {
        ry0.k(context, "Null context is not permitted.");
        ry0.k(k3Var, "Api must not be null.");
        ry0.k(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = context.getApplicationContext();
        String str = null;
        if (vw0.k()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.b = str;
        this.c = k3Var;
        this.d = o;
        this.f = aVar.b;
        o3<O> a2 = o3.a(k3Var, o, str);
        this.e = a2;
        this.h = new n02(this);
        z70 x = z70.x(this.a);
        this.j = x;
        this.g = x.m();
        this.i = aVar.a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            uz1.u(activity, x, a2);
        }
        x.b(this);
    }

    public v70(Context context, k3<O> k3Var, O o, a aVar) {
        this(context, null, k3Var, o, aVar);
    }

    public xf.a c() {
        Account b;
        GoogleSignInAccount a2;
        GoogleSignInAccount a3;
        xf.a aVar = new xf.a();
        O o = this.d;
        if (!(o instanceof k3.d.b) || (a3 = ((k3.d.b) o).a()) == null) {
            O o2 = this.d;
            b = o2 instanceof k3.d.a ? ((k3.d.a) o2).b() : null;
        } else {
            b = a3.h();
        }
        aVar.d(b);
        O o3 = this.d;
        aVar.c((!(o3 instanceof k3.d.b) || (a2 = ((k3.d.b) o3).a()) == null) ? Collections.emptySet() : a2.y());
        aVar.e(this.a.getClass().getName());
        aVar.b(this.a.getPackageName());
        return aVar;
    }

    public <TResult, A extends k3.b> rj1<TResult> d(sj1<A, TResult> sj1Var) {
        return k(2, sj1Var);
    }

    public <TResult, A extends k3.b> rj1<TResult> e(sj1<A, TResult> sj1Var) {
        return k(0, sj1Var);
    }

    public final o3<O> f() {
        return this.e;
    }

    public String g() {
        return this.b;
    }

    public final int h() {
        return this.g;
    }

    public final k3.f i(Looper looper, i02<O> i02Var) {
        k3.f b = ((k3.a) ry0.j(this.c.a())).b(this.a, looper, c().a(), this.d, i02Var, i02Var);
        String g = g();
        if (g != null && (b instanceof pa)) {
            ((pa) b).setAttributionTag(g);
        }
        if (g != null && (b instanceof at0)) {
            ((at0) b).e(g);
        }
        return b;
    }

    public final f12 j(Context context, Handler handler) {
        return new f12(context, handler, c().a());
    }

    public final <TResult, A extends k3.b> rj1<TResult> k(int i, sj1<A, TResult> sj1Var) {
        tj1 tj1Var = new tj1();
        this.j.D(this, i, sj1Var, tj1Var, this.i);
        return tj1Var.a();
    }
}
