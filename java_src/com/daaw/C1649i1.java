package com.daaw;

import android.content.Context;
import com.daaw.ww1;
import com.daaw.yw1;
import com.google.android.gms.ads.MobileAds;
import java.util.LinkedList;
import java.util.List;
/* renamed from: com.daaw.i1 */
/* loaded from: classes.dex */
public final class C1649i1 {

    /* renamed from: a */
    public final az0 f13148a;

    /* renamed from: b */
    public final List<Object> f13149b;

    /* renamed from: com.daaw.i1$a */
    /* loaded from: classes.dex */
    public static final class C1650a implements yw1.InterfaceC3757a<C1034d1, Integer, Integer, Boolean> {
        public C1650a() {
        }

        @Override // com.daaw.yw1.InterfaceC3757a
        /* renamed from: b */
        public Boolean mo3153a(C1034d1 c1034d1, Integer num, Integer num2) {
            if ((c1034d1 == null ? null : c1034d1.f6358a) == null || num == null || num2 == null) {
                return Boolean.FALSE;
            }
            vw1<Boolean> vw1Var = nc0.f19989g;
            Boolean bool = Boolean.TRUE;
            Boolean m6692a = vw1Var.m6692a(bool);
            ug0.m8269e(m6692a, "isPremium.invoke(true)");
            if (((m6692a.booleanValue() || !nc0.f19995m) && C1649i1.this.f13148a.m26590d()) || (num.intValue() != 0 && ((num.intValue() == 1 || num.intValue() == 2) && num2.intValue() < C1649i1.this.m20222e()))) {
                c1034d1.f6358a.setVisibility(8);
                return Boolean.FALSE;
            }
            c1034d1.f6358a.loadAd(C0563a1.f2690a.m27751b());
            return bool;
        }
    }

    public C1649i1(Context context, az0 az0Var) {
        ug0.m8268f(context, "context");
        ug0.m8268f(az0Var, "preferences");
        this.f13148a = az0Var;
        LinkedList linkedList = new LinkedList();
        this.f13149b = linkedList;
        MobileAds.initialize(context);
        MobileAds.setRequestConfiguration(C0563a1.f2690a.m27752a());
        dj0.f7160X.m3154b(new C1650a(), linkedList);
        nc0.f19991i.m5752b(new ww1.InterfaceC3477a() { // from class: com.daaw.h1
            @Override // com.daaw.ww1.InterfaceC3477a
            /* renamed from: b */
            public final Object mo5751b(Object obj) {
                Boolean m20225b;
                m20225b = C1649i1.m20225b(C1649i1.this, (Boolean) obj);
                return m20225b;
            }
        }, linkedList);
    }

    /* renamed from: b */
    public static final Boolean m20225b(C1649i1 c1649i1, Boolean bool) {
        ug0.m8268f(c1649i1, "this$0");
        return bool == null ? Boolean.FALSE : Boolean.valueOf(c1649i1.m20221f(bool.booleanValue()));
    }

    /* renamed from: e */
    public final int m20222e() {
        int m18916k = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14286V);
        if (m18916k != 0) {
            return m18916k != 1 ? 20 : 10;
        }
        return 5;
    }

    /* renamed from: f */
    public final boolean m20221f(boolean z) {
        return true;
    }
}
