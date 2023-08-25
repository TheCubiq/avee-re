package com.daaw;

import com.daaw.avee.MainActivity;
import com.daaw.tx0;
import com.daaw.uw1;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class ww0 {
    public static volatile tx0 b = tx0.k;
    public static volatile vd0 c = null;
    public static volatile tx0.b d = tx0.h;
    public static volatile int e = -1;
    public List<Object> a = new LinkedList();

    /* loaded from: classes.dex */
    public class a implements uw1.a<lo1<tx0, vd0>, Integer, Boolean, Boolean, Object> {
        public a() {
        }

        @Override // com.daaw.uw1.a
        /* renamed from: b */
        public void a(lo1<tx0, vd0> lo1Var, Integer num, Boolean bool, Boolean bool2, Object obj) {
            vd0 vd0Var;
            tx0 tx0Var;
            tx0 tx0Var2 = null;
            if (lo1Var != null) {
                tx0Var2 = lo1Var.a;
                vd0Var = lo1Var.b;
            } else {
                vd0Var = null;
            }
            if (tx0Var2 == null) {
                tx0Var2 = tx0.k;
            }
            tx0.b j = tx0Var2.j(dx0.e());
            ww0.c = vd0Var;
            ww0.e = num.intValue();
            ww0.b = tx0Var2;
            ww0.d = j;
            m30 o0 = MainActivity.o0();
            if (o0 != null) {
                o0.E();
            }
            n30 p0 = MainActivity.p0();
            if (p0 != null) {
                p0.u(ww0.e, tx0Var2, j, ww0.c);
            }
            if (bool2.booleanValue()) {
                if (bool.booleanValue()) {
                    com.daaw.avee.comp.playback.c.f.a(3);
                } else {
                    com.daaw.avee.comp.playback.c.e.a((lo1Var == null || (tx0Var = lo1Var.a) == null) ? "" : tx0Var.g(), Boolean.TRUE, 0L, (Long) obj);
                }
            }
        }
    }

    public ww0() {
        e = l01.c().m();
        lo1<tx0, vd0> k = l01.c().k();
        if (k != null) {
            b = k.a;
            c = k.b;
            d = b.j(dx0.e());
        }
        l01.u.b(new a(), this.a);
    }
}
