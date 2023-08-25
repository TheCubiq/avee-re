package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import com.daaw.a30;
import com.daaw.b30;
import com.daaw.j51;
/* loaded from: classes.dex */
public class to1 {
    public static final zo1 a;
    public static final wl0<String, Typeface> b;

    /* loaded from: classes.dex */
    public static class a extends b30.c {
        public j51.f a;

        public a(j51.f fVar) {
            this.a = fVar;
        }

        @Override // com.daaw.b30.c
        public void a(int i) {
            j51.f fVar = this.a;
            if (fVar != null) {
                fVar.f(i);
            }
        }

        @Override // com.daaw.b30.c
        public void b(Typeface typeface) {
            j51.f fVar = this.a;
            if (fVar != null) {
                fVar.g(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        a = i >= 29 ? new yo1() : i >= 28 ? new xo1() : i >= 26 ? new wo1() : (i < 24 || !vo1.m()) ? i >= 21 ? new uo1() : new zo1() : new vo1();
        b = new wl0<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        Typeface g;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (g = g(context, typeface, i)) == null) ? Typeface.create(typeface, i) : g;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, b30.b[] bVarArr, int i) {
        return a.c(context, cancellationSignal, bVarArr, i);
    }

    public static Typeface c(Context context, a30.b bVar, Resources resources, int i, String str, int i2, int i3, j51.f fVar, Handler handler, boolean z) {
        Typeface b2;
        if (bVar instanceof a30.e) {
            a30.e eVar = (a30.e) bVar;
            Typeface h = h(eVar.c());
            if (h != null) {
                if (fVar != null) {
                    fVar.d(h, handler);
                }
                return h;
            }
            b2 = b30.c(context, eVar.b(), i3, !z ? fVar != null : eVar.a() != 0, z ? eVar.d() : -1, j51.f.e(handler), new a(fVar));
        } else {
            b2 = a.b(context, (a30.c) bVar, resources, i3);
            if (fVar != null) {
                if (b2 != null) {
                    fVar.d(b2, handler);
                } else {
                    fVar.c(-3, handler);
                }
            }
        }
        if (b2 != null) {
            b.d(e(resources, i, str, i2, i3), b2);
        }
        return b2;
    }

    public static Typeface d(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface e = a.e(context, resources, i, str, i3);
        if (e != null) {
            b.d(e(resources, i, str, i2, i3), e);
        }
        return e;
    }

    public static String e(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface f(Resources resources, int i, String str, int i2, int i3) {
        return b.c(e(resources, i, str, i2, i3));
    }

    public static Typeface g(Context context, Typeface typeface, int i) {
        zo1 zo1Var = a;
        a30.c i2 = zo1Var.i(typeface);
        if (i2 == null) {
            return null;
        }
        return zo1Var.b(context, i2, context.getResources(), i);
    }

    public static Typeface h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
