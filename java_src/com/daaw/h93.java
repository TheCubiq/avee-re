package com.daaw;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class h93 {
    /* renamed from: a */
    public static List m20926a() {
        ArrayList arrayList = new ArrayList();
        m20924c(arrayList, ma3.m16139c("gad:dynamite_module:experiment_id", ""));
        m20924c(arrayList, xa3.f32277a);
        m20924c(arrayList, xa3.f32278b);
        m20924c(arrayList, xa3.f32279c);
        m20924c(arrayList, xa3.f32280d);
        m20924c(arrayList, xa3.f32281e);
        m20924c(arrayList, xa3.f32297u);
        m20924c(arrayList, xa3.f32282f);
        m20924c(arrayList, xa3.f32289m);
        m20924c(arrayList, xa3.f32290n);
        m20924c(arrayList, xa3.f32291o);
        m20924c(arrayList, xa3.f32292p);
        m20924c(arrayList, xa3.f32293q);
        m20924c(arrayList, xa3.f32294r);
        m20924c(arrayList, xa3.f32295s);
        m20924c(arrayList, xa3.f32296t);
        m20924c(arrayList, xa3.f32283g);
        m20924c(arrayList, xa3.f32284h);
        m20924c(arrayList, xa3.f32285i);
        m20924c(arrayList, xa3.f32286j);
        m20924c(arrayList, xa3.f32287k);
        m20924c(arrayList, xa3.f32288l);
        return arrayList;
    }

    /* renamed from: b */
    public static List m20925b() {
        ArrayList arrayList = new ArrayList();
        m20924c(arrayList, pb3.f22804a);
        return arrayList;
    }

    /* renamed from: c */
    public static void m20924c(List list, ma3 ma3Var) {
        String str = (String) ma3Var.m16137e();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
