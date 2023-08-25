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
import com.daaw.AbstractC2228n0;
import com.daaw.C1249f5;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;
/* renamed from: com.daaw.z3 */
/* loaded from: classes.dex */
public abstract class AbstractC3800z3 {

    /* renamed from: p */
    public static C1249f5.ExecutorC1250a f34382p = new C1249f5.ExecutorC1250a(new C1249f5.ExecutorC1251b());

    /* renamed from: q */
    public static int f34383q = -100;

    /* renamed from: r */
    public static rk0 f34384r = null;

    /* renamed from: s */
    public static rk0 f34385s = null;

    /* renamed from: t */
    public static Boolean f34386t = null;

    /* renamed from: u */
    public static boolean f34387u = false;

    /* renamed from: v */
    public static Object f34388v = null;

    /* renamed from: w */
    public static Context f34389w = null;

    /* renamed from: x */
    public static final C1798j6<WeakReference<AbstractC3800z3>> f34390x = new C1798j6<>();

    /* renamed from: y */
    public static final Object f34391y = new Object();

    /* renamed from: z */
    public static final Object f34392z = new Object();

    /* renamed from: com.daaw.z3$a */
    /* loaded from: classes.dex */
    public static class C3801a {
        /* renamed from: a */
        public static LocaleList m2911a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* renamed from: com.daaw.z3$b */
    /* loaded from: classes.dex */
    public static class C3802b {
        /* renamed from: a */
        public static LocaleList m2910a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        /* renamed from: b */
        public static void m2909b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* renamed from: B */
    public static /* synthetic */ void m2957B(Context context) {
        C1249f5.m22921c(context);
        f34387u = true;
    }

    /* renamed from: K */
    public static void m2948K(AbstractC3800z3 abstractC3800z3) {
        synchronized (f34391y) {
            m2947L(abstractC3800z3);
        }
    }

    /* renamed from: L */
    public static void m2947L(AbstractC3800z3 abstractC3800z3) {
        synchronized (f34391y) {
            Iterator<WeakReference<AbstractC3800z3>> it = f34390x.iterator();
            while (it.hasNext()) {
                AbstractC3800z3 abstractC3800z32 = it.next().get();
                if (abstractC3800z32 == abstractC3800z3 || abstractC3800z32 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: N */
    public static void m2945N(Context context) {
        f34389w = context;
    }

    /* renamed from: O */
    public static void m2944O(rk0 rk0Var) {
        Objects.requireNonNull(rk0Var);
        if (Build.VERSION.SDK_INT >= 33) {
            Object m2919s = m2919s();
            if (m2919s != null) {
                C3802b.m2909b(m2919s, C3801a.m2911a(rk0Var.m11220h()));
            }
        } else if (rk0Var.equals(f34384r)) {
        } else {
            synchronized (f34391y) {
                f34384r = rk0Var;
                m2930h();
            }
        }
    }

    /* renamed from: W */
    public static void m2936W(final Context context) {
        if (m2912z(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f34387u) {
                    return;
                }
                f34382p.execute(new Runnable() { // from class: com.daaw.x3
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC3800z3.m2957B(context);
                    }
                });
                return;
            }
            synchronized (f34392z) {
                rk0 rk0Var = f34384r;
                if (rk0Var == null) {
                    if (f34385s == null) {
                        f34385s = rk0.m11225c(C1249f5.m22922b(context));
                    }
                    if (f34385s.m11222f()) {
                        return;
                    }
                    f34384r = f34385s;
                } else if (!rk0Var.equals(f34385s)) {
                    rk0 rk0Var2 = f34384r;
                    f34385s = rk0Var2;
                    C1249f5.m22923a(context, rk0Var2.m11220h());
                }
            }
        }
    }

    /* renamed from: e */
    public static void m2933e(AbstractC3800z3 abstractC3800z3) {
        synchronized (f34391y) {
            m2947L(abstractC3800z3);
            f34390x.add(new WeakReference<>(abstractC3800z3));
        }
    }

    /* renamed from: h */
    public static void m2930h() {
        Iterator<WeakReference<AbstractC3800z3>> it = f34390x.iterator();
        while (it.hasNext()) {
            AbstractC3800z3 abstractC3800z3 = it.next().get();
            if (abstractC3800z3 != null) {
                abstractC3800z3.mo2931g();
            }
        }
    }

    /* renamed from: l */
    public static AbstractC3800z3 m2926l(Activity activity, InterfaceC3010t3 interfaceC3010t3) {
        return new LayoutInflater$Factory2C0573a4(activity, interfaceC3010t3);
    }

    /* renamed from: m */
    public static AbstractC3800z3 m2925m(Dialog dialog, InterfaceC3010t3 interfaceC3010t3) {
        return new LayoutInflater$Factory2C0573a4(dialog, interfaceC3010t3);
    }

    /* renamed from: o */
    public static rk0 m2923o() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object m2919s = m2919s();
            if (m2919s != null) {
                return rk0.m11219i(C3802b.m2910a(m2919s));
            }
        } else {
            rk0 rk0Var = f34384r;
            if (rk0Var != null) {
                return rk0Var;
            }
        }
        return rk0.m11223e();
    }

    /* renamed from: q */
    public static int m2921q() {
        return f34383q;
    }

    /* renamed from: s */
    public static Object m2919s() {
        Context mo2922p;
        Object obj = f34388v;
        if (obj != null) {
            return obj;
        }
        if (f34389w == null) {
            Iterator<WeakReference<AbstractC3800z3>> it = f34390x.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC3800z3 abstractC3800z3 = it.next().get();
                if (abstractC3800z3 != null && (mo2922p = abstractC3800z3.mo2922p()) != null) {
                    f34389w = mo2922p;
                    break;
                }
            }
        }
        Context context = f34389w;
        if (context != null) {
            f34388v = context.getSystemService("locale");
        }
        return f34388v;
    }

    /* renamed from: u */
    public static rk0 m2917u() {
        return f34384r;
    }

    /* renamed from: v */
    public static rk0 m2916v() {
        return f34385s;
    }

    /* renamed from: z */
    public static boolean m2912z(Context context) {
        if (f34386t == null) {
            try {
                Bundle bundle = ServiceC1051d5.m24643a(context).metaData;
                if (bundle != null) {
                    f34386t = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f34386t = Boolean.FALSE;
            }
        }
        return f34386t.booleanValue();
    }

    /* renamed from: C */
    public abstract void mo2956C(Configuration configuration);

    /* renamed from: D */
    public abstract void mo2955D(Bundle bundle);

    /* renamed from: E */
    public abstract void mo2954E();

    /* renamed from: F */
    public abstract void mo2953F(Bundle bundle);

    /* renamed from: G */
    public abstract void mo2952G();

    /* renamed from: H */
    public abstract void mo2951H(Bundle bundle);

    /* renamed from: I */
    public abstract void mo2950I();

    /* renamed from: J */
    public abstract void mo2949J();

    /* renamed from: M */
    public abstract boolean mo2946M(int i);

    /* renamed from: P */
    public abstract void mo2943P(int i);

    /* renamed from: Q */
    public abstract void mo2942Q(View view);

    /* renamed from: R */
    public abstract void mo2941R(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: S */
    public abstract void mo2940S(Toolbar toolbar);

    /* renamed from: T */
    public void mo2939T(int i) {
    }

    /* renamed from: U */
    public abstract void mo2938U(CharSequence charSequence);

    /* renamed from: V */
    public abstract AbstractC2228n0 mo2937V(AbstractC2228n0.InterfaceC2229a interfaceC2229a);

    /* renamed from: f */
    public abstract void mo2932f(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: g */
    public boolean mo2931g() {
        return false;
    }

    /* renamed from: i */
    public void m2929i(final Context context) {
        f34382p.execute(new Runnable() { // from class: com.daaw.y3
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3800z3.m2936W(context);
            }
        });
    }

    @Deprecated
    /* renamed from: j */
    public void m2928j(Context context) {
    }

    /* renamed from: k */
    public Context mo2927k(Context context) {
        m2928j(context);
        return context;
    }

    /* renamed from: n */
    public abstract <T extends View> T mo2924n(int i);

    /* renamed from: p */
    public Context mo2922p() {
        return null;
    }

    /* renamed from: r */
    public int mo2920r() {
        return -100;
    }

    /* renamed from: t */
    public abstract MenuInflater mo2918t();

    /* renamed from: w */
    public abstract AbstractC1643i0 mo2915w();

    /* renamed from: x */
    public abstract void mo2914x();

    /* renamed from: y */
    public abstract void mo2913y();
}
