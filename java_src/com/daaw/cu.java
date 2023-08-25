package com.daaw;

import com.daaw.p51;
import java.util.concurrent.CancellationException;
/* loaded from: classes2.dex */
public final class cu {
    public static final pi1 a = new pi1("UNDEFINED");
    public static final pi1 b = new pi1("REUSABLE_CLAIMED");

    public static final /* synthetic */ pi1 a() {
        return a;
    }

    public static final <T> void b(gl<? super T> glVar, Object obj, z40<? super Throwable, lp1> z40Var) {
        boolean z;
        if (!(glVar instanceof bu)) {
            glVar.b(obj);
            return;
        }
        bu buVar = (bu) glVar;
        Object c = rh.c(obj, z40Var);
        if (buVar.s.U(buVar.getContext())) {
            buVar.u = c;
            buVar.r = 1;
            buVar.s.T(buVar.getContext(), buVar);
            return;
        }
        dy a2 = cl1.a.a();
        if (a2.c0()) {
            buVar.u = c;
            buVar.r = 1;
            a2.Y(buVar);
            return;
        }
        a2.a0(true);
        try {
            mh0 mh0Var = (mh0) buVar.getContext().get(mh0.d);
            if (mh0Var == null || mh0Var.d()) {
                z = false;
            } else {
                CancellationException q = mh0Var.q();
                buVar.c(c, q);
                p51.a aVar = p51.p;
                buVar.b(p51.a(s51.a(q)));
                z = true;
            }
            if (!z) {
                gl<T> glVar2 = buVar.t;
                Object obj2 = buVar.v;
                nl context = glVar2.getContext();
                Object c2 = bl1.c(context, obj2);
                ip1<?> c3 = c2 != bl1.a ? ol.c(glVar2, context, c2) : null;
                buVar.t.b(obj);
                lp1 lp1Var = lp1.a;
                if (c3 == null || c3.l0()) {
                    bl1.a(context, c2);
                }
            }
            do {
            } while (a2.e0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void c(gl glVar, Object obj, z40 z40Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            z40Var = null;
        }
        b(glVar, obj, z40Var);
    }
}
