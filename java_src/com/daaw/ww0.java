package com.daaw;

import com.daaw.avee.MainActivity;
import com.daaw.avee.comp.playback.C0743c;
import com.daaw.tx0;
import com.daaw.uw1;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class ww0 {

    /* renamed from: b */
    public static volatile tx0 f31595b = tx0.f28191k;

    /* renamed from: c */
    public static volatile vd0 f31596c = null;

    /* renamed from: d */
    public static volatile tx0.C3143b f31597d = tx0.f28188h;

    /* renamed from: e */
    public static volatile int f31598e = -1;

    /* renamed from: a */
    public List<Object> f31599a = new LinkedList();

    /* renamed from: com.daaw.ww0$a */
    /* loaded from: classes.dex */
    public class C3476a implements uw1.InterfaceC3263a<lo1<tx0, vd0>, Integer, Boolean, Boolean, Object> {
        public C3476a() {
        }

        @Override // com.daaw.uw1.InterfaceC3263a
        /* renamed from: b */
        public void mo3116a(lo1<tx0, vd0> lo1Var, Integer num, Boolean bool, Boolean bool2, Object obj) {
            vd0 vd0Var;
            tx0 tx0Var;
            tx0 tx0Var2 = null;
            if (lo1Var != null) {
                tx0Var2 = lo1Var.f17576a;
                vd0Var = lo1Var.f17577b;
            } else {
                vd0Var = null;
            }
            if (tx0Var2 == null) {
                tx0Var2 = tx0.f28191k;
            }
            tx0.C3143b m8742j = tx0Var2.m8742j(dx0.m23837e());
            ww0.f31596c = vd0Var;
            ww0.f31598e = num.intValue();
            ww0.f31595b = tx0Var2;
            ww0.f31597d = m8742j;
            m30 m26906o0 = MainActivity.m26906o0();
            if (m26906o0 != null) {
                m26906o0.m16259E();
            }
            n30 m26905p0 = MainActivity.m26905p0();
            if (m26905p0 != null) {
                m26905p0.m15552u(ww0.f31598e, tx0Var2, m8742j, ww0.f31596c);
            }
            if (bool2.booleanValue()) {
                if (bool.booleanValue()) {
                    C0743c.f4012f.m19309a(3);
                } else {
                    C0743c.f4011e.m16455a((lo1Var == null || (tx0Var = lo1Var.f17576a) == null) ? "" : tx0Var.m8745g(), Boolean.TRUE, 0L, (Long) obj);
                }
            }
        }
    }

    public ww0() {
        f31598e = l01.m17249c().m17239m();
        lo1<tx0, vd0> m17241k = l01.m17249c().m17241k();
        if (m17241k != null) {
            f31595b = m17241k.f17576a;
            f31596c = m17241k.f17577b;
            f31597d = f31595b.m8742j(dx0.m23837e());
        }
        l01.f16924u.m7666b(new C3476a(), this.f31599a);
    }
}
