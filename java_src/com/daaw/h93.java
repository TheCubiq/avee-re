package com.daaw;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class h93 {
    public static List a() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, ma3.c("gad:dynamite_module:experiment_id", ""));
        c(arrayList, xa3.a);
        c(arrayList, xa3.b);
        c(arrayList, xa3.c);
        c(arrayList, xa3.d);
        c(arrayList, xa3.e);
        c(arrayList, xa3.u);
        c(arrayList, xa3.f);
        c(arrayList, xa3.m);
        c(arrayList, xa3.n);
        c(arrayList, xa3.o);
        c(arrayList, xa3.p);
        c(arrayList, xa3.q);
        c(arrayList, xa3.r);
        c(arrayList, xa3.s);
        c(arrayList, xa3.t);
        c(arrayList, xa3.g);
        c(arrayList, xa3.h);
        c(arrayList, xa3.i);
        c(arrayList, xa3.j);
        c(arrayList, xa3.k);
        c(arrayList, xa3.l);
        return arrayList;
    }

    public static List b() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, pb3.a);
        return arrayList;
    }

    public static void c(List list, ma3 ma3Var) {
        String str = (String) ma3Var.e();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
