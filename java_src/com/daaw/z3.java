package com.daaw;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.daaw.f5;
import com.daaw.n0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class z3 {
    public static f5.a p = new f5.a(new f5.b());
    public static int q = -100;
    public static rk0 r = null;
    public static rk0 s = null;
    public static Boolean t = null;
    public static boolean u = false;
    public static Object v = null;
    public static Context w = null;
    public static final j6<WeakReference<z3>> x = new j6<>();
    public static final Object y = new Object();
    public static final Object z = new Object();

    /* loaded from: classes.dex */
    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    public static /* synthetic */ void B(Context context) {
        f5.c(context);
        u = true;
    }

    public static void K(z3 z3Var) {
        synchronized (y) {
            L(z3Var);
        }
    }

    public static void L(z3 z3Var) {
        synchronized (y) {
            Iterator<WeakReference<z3>> it = x.iterator();
            while (it.hasNext()) {
                z3 z3Var2 = it.next().get();
                if (z3Var2 == z3Var || z3Var2 == null) {
                    it.remove();
                }
            }
        }
    }

    public static void N(Context context) {
        w = context;
    }

    public static void O(rk0 rk0Var) {
        Objects.requireNonNull(rk0Var);
        if (Build.VERSION.SDK_INT >= 33) {
            Object s2 = s();
            if (s2 != null) {
                b.b(s2, a.a(rk0Var.h()));
            }
        } else if (rk0Var.equals(r)) {
        } else {
            synchronized (y) {
                r = rk0Var;
                h();
            }
        }
    }

    public static void W(final Context context) {
        if (z(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (u) {
                    return;
                }
                p.execute(new Runnable() { // from class: com.daaw.x3
                    @Override // java.lang.Runnable
                    public final void run() {
                        z3.B(context);
                    }
                });
                return;
            }
            synchronized (z) {
                rk0 rk0Var = r;
                if (rk0Var == null) {
                    if (s == null) {
                        s = rk0.c(f5.b(context));
                    }
                    if (s.f()) {
                        return;
                    }
                    r = s;
                } else if (!rk0Var.equals(s)) {
                    rk0 rk0Var2 = r;
                    s = rk0Var2;
                    f5.a(context, rk0Var2.h());
                }
            }
        }
    }

    public static void e(z3 z3Var) {
        synchronized (y) {
            L(z3Var);
            x.add(new WeakReference<>(z3Var));
        }
    }

    public static void h() {
        Iterator<WeakReference<z3>> it = x.iterator();
        while (it.hasNext()) {
            z3 z3Var = it.next().get();
            if (z3Var != null) {
                z3Var.g();
            }
        }
    }

    public static z3 l(Activity activity, t3 t3Var) {
        return new a4(activity, t3Var);
    }

    public static z3 m(Dialog dialog, t3 t3Var) {
        return new a4(dialog, t3Var);
    }

    public static rk0 o() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object s2 = s();
            if (s2 != null) {
                return rk0.i(b.a(s2));
            }
        } else {
            rk0 rk0Var = r;
            if (rk0Var != null) {
                return rk0Var;
            }
        }
        return rk0.e();
    }

    public static int q() {
        return q;
    }

    public static Object s() {
        Context p2;
        Object obj = v;
        if (obj != null) {
            return obj;
        }
        if (w == null) {
            Iterator<WeakReference<z3>> it = x.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                z3 z3Var = it.next().get();
                if (z3Var != null && (p2 = z3Var.p()) != null) {
                    w = p2;
                    break;
                }
            }
        }
        Context context = w;
        if (context != null) {
            v = context.getSystemService("locale");
        }
        return v;
    }

    public static rk0 u() {
        return r;
    }

    public static rk0 v() {
        return s;
    }

    public static boolean z(Context context) {
        if (t == null) {
            try {
                Bundle bundle = d5.a(context).metaData;
                if (bundle != null) {
                    t = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                t = Boolean.FALSE;
            }
        }
        return t.booleanValue();
    }

    public abstract void C(Configuration configuration);

    public abstract void D(Bundle bundle);

    public abstract void E();

    public abstract void F(Bundle bundle);

    public abstract void G();

    public abstract void H(Bundle bundle);

    public abstract void I();

    public abstract void J();

    public abstract boolean M(int i);

    public abstract void P(int i);

    public abstract void Q(View view);

    public abstract void R(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void S(Toolbar toolbar);

    public void T(int i) {
    }

    public abstract void U(CharSequence charSequence);

    public abstract n0 V(n0.a aVar);

    public abstract void f(View view, ViewGroup.LayoutParams layoutParams);

    public boolean g() {
        return false;
    }

    public void i(final Context context) {
        p.execute(new Runnable() { // from class: com.daaw.y3
            @Override // java.lang.Runnable
            public final void run() {
                z3.W(context);
            }
        });
    }

    @Deprecated
    public void j(Context context) {
    }

    public Context k(Context context) {
        j(context);
        return context;
    }

    public abstract <T extends View> T n(int i);

    public Context p() {
        return null;
    }

    public int r() {
        return -100;
    }

    public abstract MenuInflater t();

    public abstract i0 w();

    public abstract void x();

    public abstract void y();
}
