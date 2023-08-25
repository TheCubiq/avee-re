package com.daaw;

import com.daaw.p51;
/* loaded from: classes2.dex */
public final class fu {
    public static final <T> void a(eu<? super T> euVar, int i) {
        gl<? super T> d = euVar.d();
        boolean z = i == 4;
        if (z || !(d instanceof bu) || b(i) != b(euVar.r)) {
            d(euVar, d, z);
            return;
        }
        pl plVar = ((bu) d).s;
        nl context = d.getContext();
        if (plVar.U(context)) {
            plVar.T(context, euVar);
        } else {
            e(euVar);
        }
    }

    public static final boolean b(int i) {
        return i == 1 || i == 2;
    }

    public static final boolean c(int i) {
        return i == 2;
    }

    public static final <T> void d(eu<? super T> euVar, gl<? super T> glVar, boolean z) {
        Object f;
        Object h = euVar.h();
        Throwable e = euVar.e(h);
        if (e != null) {
            p51.a aVar = p51.p;
            f = s51.a(e);
        } else {
            p51.a aVar2 = p51.p;
            f = euVar.f(h);
        }
        Object a = p51.a(f);
        if (!z) {
            glVar.b(a);
            return;
        }
        bu buVar = (bu) glVar;
        gl<T> glVar2 = buVar.t;
        Object obj = buVar.v;
        nl context = glVar2.getContext();
        Object c = bl1.c(context, obj);
        ip1<?> c2 = c != bl1.a ? ol.c(glVar2, context, c) : null;
        try {
            buVar.t.b(a);
            lp1 lp1Var = lp1.a;
        } finally {
            if (c2 == null || c2.l0()) {
                bl1.a(context, c);
            }
        }
    }

    public static final void e(eu<?> euVar) {
        dy a = cl1.a.a();
        if (a.c0()) {
            a.Y(euVar);
            return;
        }
        a.a0(true);
        try {
            d(euVar, euVar.d(), true);
            do {
            } while (a.e0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
