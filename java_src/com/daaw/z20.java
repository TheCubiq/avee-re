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
    public static final wl0<String, Typeface> a = new wl0<>(16);
    public static final ExecutorService b = n41.a("fonts-androidx", 10, 10000);
    public static final Object c = new Object();
    public static final cd1<String, ArrayList<uj<e>>> d = new cd1<>();

    /* loaded from: classes.dex */
    public class a implements Callable<e> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ x20 c;
        public final /* synthetic */ int d;

        public a(String str, Context context, x20 x20Var, int i) {
            this.a = str;
            this.b = context;
            this.c = x20Var;
            this.d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public e call() {
            return z20.c(this.a, this.b, this.c, this.d);
        }
    }

    /* loaded from: classes.dex */
    public class b implements uj<e> {
        public final /* synthetic */ ld a;

        public b(ld ldVar) {
            this.a = ldVar;
        }

        @Override // com.daaw.uj
        /* renamed from: b */
        public void a(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.a.b(eVar);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Callable<e> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ x20 c;
        public final /* synthetic */ int d;

        public c(String str, Context context, x20 x20Var, int i) {
            this.a = str;
            this.b = context;
            this.c = x20Var;
            this.d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public e call() {
            try {
                return z20.c(this.a, this.b, this.c, this.d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements uj<e> {
        public final /* synthetic */ String a;

        public d(String str) {
            this.a = str;
        }

        @Override // com.daaw.uj
        /* renamed from: b */
        public void a(e eVar) {
            synchronized (z20.c) {
                cd1<String, ArrayList<uj<e>>> cd1Var = z20.d;
                ArrayList<uj<e>> arrayList = cd1Var.get(this.a);
                if (arrayList == null) {
                    return;
                }
                cd1Var.remove(this.a);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).a(eVar);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public final Typeface a;
        public final int b;

        public e(int i) {
            this.a = null;
            this.b = i;
        }

        @SuppressLint({"WrongConstant"})
        public e(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }

        @SuppressLint({"WrongConstant"})
        public boolean a() {
            return this.b == 0;
        }
    }

    public static String a(x20 x20Var, int i) {
        return x20Var.d() + "-" + i;
    }

    @SuppressLint({"WrongConstant"})
    public static int b(b30.a aVar) {
        int i = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        b30.b[] b2 = aVar.b();
        if (b2 != null && b2.length != 0) {
            i = 0;
            for (b30.b bVar : b2) {
                int b3 = bVar.b();
                if (b3 != 0) {
                    if (b3 < 0) {
                        return -3;
                    }
                    return b3;
                }
            }
        }
        return i;
    }

    public static e c(String str, Context context, x20 x20Var, int i) {
        wl0<String, Typeface> wl0Var = a;
        Typeface c2 = wl0Var.c(str);
        if (c2 != null) {
            return new e(c2);
        }
        try {
            b30.a e2 = w20.e(context, x20Var, null);
            int b2 = b(e2);
            if (b2 != 0) {
                return new e(b2);
            }
            Typeface b3 = to1.b(context, null, e2.b(), i);
            if (b3 != null) {
                wl0Var.d(str, b3);
                return new e(b3);
            }
            return new e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    public static Typeface d(Context context, x20 x20Var, int i, Executor executor, ld ldVar) {
        String a2 = a(x20Var, i);
        Typeface c2 = a.c(a2);
        if (c2 != null) {
            ldVar.b(new e(c2));
            return c2;
        }
        b bVar = new b(ldVar);
        synchronized (c) {
            cd1<String, ArrayList<uj<e>>> cd1Var = d;
            ArrayList<uj<e>> arrayList = cd1Var.get(a2);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<uj<e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            cd1Var.put(a2, arrayList2);
            c cVar = new c(a2, context, x20Var, i);
            if (executor == null) {
                executor = b;
            }
            n41.b(executor, cVar, new d(a2));
            return null;
        }
    }

    public static Typeface e(Context context, x20 x20Var, ld ldVar, int i, int i2) {
        String a2 = a(x20Var, i);
        Typeface c2 = a.c(a2);
        if (c2 != null) {
            ldVar.b(new e(c2));
            return c2;
        } else if (i2 == -1) {
            e c3 = c(a2, context, x20Var, i);
            ldVar.b(c3);
            return c3.a;
        } else {
            try {
                e eVar = (e) n41.c(b, new a(a2, context, x20Var, i), i2);
                ldVar.b(eVar);
                return eVar.a;
            } catch (InterruptedException unused) {
                ldVar.b(new e(-3));
                return null;
            }
        }
    }
}
