package com.daaw;

import android.content.Context;
import com.daaw.ww1;
import com.daaw.yw1;
import com.google.android.gms.ads.MobileAds;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public final class i1 {
    public final az0 a;
    public final List<Object> b;

    /* loaded from: classes.dex */
    public static final class a implements yw1.a<d1, Integer, Integer, Boolean> {
        public a() {
        }

        @Override // com.daaw.yw1.a
        /* renamed from: b */
        public Boolean a(d1 d1Var, Integer num, Integer num2) {
            if ((d1Var == null ? null : d1Var.a) == null || num == null || num2 == null) {
                return Boolean.FALSE;
            }
            vw1<Boolean> vw1Var = nc0.g;
            Boolean bool = Boolean.TRUE;
            Boolean a = vw1Var.a(bool);
            ug0.e(a, "isPremium.invoke(true)");
            if (((a.booleanValue() || !nc0.m) && i1.this.a.d()) || (num.intValue() != 0 && ((num.intValue() == 1 || num.intValue() == 2) && num2.intValue() < i1.this.e()))) {
                d1Var.a.setVisibility(8);
                return Boolean.FALSE;
            }
            d1Var.a.loadAd(a1.a.b());
            return bool;
        }
    }

    public i1(Context context, az0 az0Var) {
        ug0.f(context, "context");
        ug0.f(az0Var, "preferences");
        this.a = az0Var;
        LinkedList linkedList = new LinkedList();
        this.b = linkedList;
        MobileAds.initialize(context);
        MobileAds.setRequestConfiguration(a1.a.a());
        dj0.X.b(new a(), linkedList);
        nc0.i.b(new ww1.a() { // from class: com.daaw.h1
            @Override // com.daaw.ww1.a
            public final Object b(Object obj) {
                Boolean b;
                b = i1.b(i1.this, (Boolean) obj);
                return b;
            }
        }, linkedList);
    }

    public static final Boolean b(i1 i1Var, Boolean bool) {
        ug0.f(i1Var, "this$0");
        return bool == null ? Boolean.FALSE : Boolean.valueOf(i1Var.f(bool.booleanValue()));
    }

    public final int e() {
        int k = j5.e().k(j5.V);
        if (k != 0) {
            return k != 1 ? 20 : 10;
        }
        return 5;
    }

    public final boolean f(boolean z) {
        return true;
    }
}
