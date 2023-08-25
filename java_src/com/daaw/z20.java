package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import com.daaw.b30;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public class z20 {

    /* renamed from: a */
    public static final wl0<String, Typeface> f34343a = new wl0<>(16);

    /* renamed from: b */
    public static final ExecutorService f34344b = n41.m15535a("fonts-androidx", 10, 10000);

    /* renamed from: c */
    public static final Object f34345c = new Object();

    /* renamed from: d */
    public static final cd1<String, ArrayList<InterfaceC3222uj<C3798e>>> f34346d = new cd1<>();

    /* renamed from: com.daaw.z20$a */
    /* loaded from: classes.dex */
    public class CallableC3794a implements Callable<C3798e> {

        /* renamed from: a */
        public final /* synthetic */ String f34347a;

        /* renamed from: b */
        public final /* synthetic */ Context f34348b;

        /* renamed from: c */
        public final /* synthetic */ x20 f34349c;

        /* renamed from: d */
        public final /* synthetic */ int f34350d;

        public CallableC3794a(String str, Context context, x20 x20Var, int i) {
            this.f34347a = str;
            this.f34348b = context;
            this.f34349c = x20Var;
            this.f34350d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C3798e call() {
            return z20.m2977c(this.f34347a, this.f34348b, this.f34349c, this.f34350d);
        }
    }

    /* renamed from: com.daaw.z20$b */
    /* loaded from: classes.dex */
    public class C3795b implements InterfaceC3222uj<C3798e> {

        /* renamed from: a */
        public final /* synthetic */ C2027ld f34351a;

        public C3795b(C2027ld c2027ld) {
            this.f34351a = c2027ld;
        }

        @Override // com.daaw.InterfaceC3222uj
        /* renamed from: b */
        public void mo2971a(C3798e c3798e) {
            if (c3798e == null) {
                c3798e = new C3798e(-3);
            }
            this.f34351a.m17048b(c3798e);
        }
    }

    /* renamed from: com.daaw.z20$c */
    /* loaded from: classes.dex */
    public class CallableC3796c implements Callable<C3798e> {

        /* renamed from: a */
        public final /* synthetic */ String f34352a;

        /* renamed from: b */
        public final /* synthetic */ Context f34353b;

        /* renamed from: c */
        public final /* synthetic */ x20 f34354c;

        /* renamed from: d */
        public final /* synthetic */ int f34355d;

        public CallableC3796c(String str, Context context, x20 x20Var, int i) {
            this.f34352a = str;
            this.f34353b = context;
            this.f34354c = x20Var;
            this.f34355d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C3798e call() {
            try {
                return z20.m2977c(this.f34352a, this.f34353b, this.f34354c, this.f34355d);
            } catch (Throwable unused) {
                return new C3798e(-3);
            }
        }
    }

    /* renamed from: com.daaw.z20$d */
    /* loaded from: classes.dex */
    public class C3797d implements InterfaceC3222uj<C3798e> {

        /* renamed from: a */
        public final /* synthetic */ String f34356a;

        public C3797d(String str) {
            this.f34356a = str;
        }

        @Override // com.daaw.InterfaceC3222uj
        /* renamed from: b */
        public void mo2971a(C3798e c3798e) {
            synchronized (z20.f34345c) {
                cd1<String, ArrayList<InterfaceC3222uj<C3798e>>> cd1Var = z20.f34346d;
                ArrayList<InterfaceC3222uj<C3798e>> arrayList = cd1Var.get(this.f34356a);
                if (arrayList == null) {
                    return;
                }
                cd1Var.remove(this.f34356a);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).mo2971a(c3798e);
                }
            }
        }
    }

    /* renamed from: com.daaw.z20$e */
    /* loaded from: classes.dex */
    public static final class C3798e {

        /* renamed from: a */
        public final Typeface f34357a;

        /* renamed from: b */
        public final int f34358b;

        public C3798e(int i) {
            this.f34357a = null;
            this.f34358b = i;
        }

        @SuppressLint({"WrongConstant"})
        public C3798e(Typeface typeface) {
            this.f34357a = typeface;
            this.f34358b = 0;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: a */
        public boolean m2969a() {
            return this.f34358b == 0;
        }
    }

    /* renamed from: a */
    public static String m2979a(x20 x20Var, int i) {
        return x20Var.m5612d() + "-" + i;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    public static int m2978b(b30.C0804a c0804a) {
        int i = 1;
        if (c0804a.m26508c() != 0) {
            return c0804a.m26508c() != 1 ? -3 : -2;
        }
        b30.C0805b[] m26509b = c0804a.m26509b();
        if (m26509b != null && m26509b.length != 0) {
            i = 0;
            for (b30.C0805b c0805b : m26509b) {
                int m26506b = c0805b.m26506b();
                if (m26506b != 0) {
                    if (m26506b < 0) {
                        return -3;
                    }
                    return m26506b;
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    public static C3798e m2977c(String str, Context context, x20 x20Var, int i) {
        wl0<String, Typeface> wl0Var = f34343a;
        Typeface m6023c = wl0Var.m6023c(str);
        if (m6023c != null) {
            return new C3798e(m6023c);
        }
        try {
            b30.C0804a m6584e = w20.m6584e(context, x20Var, null);
            int m2978b = m2978b(m6584e);
            if (m2978b != 0) {
                return new C3798e(m2978b);
            }
            Typeface m8915b = to1.m8915b(context, null, m6584e.m26509b(), i);
            if (m8915b != null) {
                wl0Var.m6022d(str, m8915b);
                return new C3798e(m8915b);
            }
            return new C3798e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C3798e(-1);
        }
    }

    /* renamed from: d */
    public static Typeface m2976d(Context context, x20 x20Var, int i, Executor executor, C2027ld c2027ld) {
        String m2979a = m2979a(x20Var, i);
        Typeface m6023c = f34343a.m6023c(m2979a);
        if (m6023c != null) {
            c2027ld.m17048b(new C3798e(m6023c));
            return m6023c;
        }
        C3795b c3795b = new C3795b(c2027ld);
        synchronized (f34345c) {
            cd1<String, ArrayList<InterfaceC3222uj<C3798e>>> cd1Var = f34346d;
            ArrayList<InterfaceC3222uj<C3798e>> arrayList = cd1Var.get(m2979a);
            if (arrayList != null) {
                arrayList.add(c3795b);
                return null;
            }
            ArrayList<InterfaceC3222uj<C3798e>> arrayList2 = new ArrayList<>();
            arrayList2.add(c3795b);
            cd1Var.put(m2979a, arrayList2);
            CallableC3796c callableC3796c = new CallableC3796c(m2979a, context, x20Var, i);
            if (executor == null) {
                executor = f34344b;
            }
            n41.m15534b(executor, callableC3796c, new C3797d(m2979a));
            return null;
        }
    }

    /* renamed from: e */
    public static Typeface m2975e(Context context, x20 x20Var, C2027ld c2027ld, int i, int i2) {
        String m2979a = m2979a(x20Var, i);
        Typeface m6023c = f34343a.m6023c(m2979a);
        if (m6023c != null) {
            c2027ld.m17048b(new C3798e(m6023c));
            return m6023c;
        } else if (i2 == -1) {
            C3798e m2977c = m2977c(m2979a, context, x20Var, i);
            c2027ld.m17048b(m2977c);
            return m2977c.f34357a;
        } else {
            try {
                C3798e c3798e = (C3798e) n41.m15533c(f34344b, new CallableC3794a(m2979a, context, x20Var, i), i2);
                c2027ld.m17048b(c3798e);
                return c3798e.f34357a;
            } catch (InterruptedException unused) {
                c2027ld.m17048b(new C3798e(-3));
                return null;
            }
        }
    }
}
