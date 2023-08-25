package com.daaw;

import android.content.Context;
import com.daaw.tx0;
/* loaded from: classes.dex */
public class o91 implements m10<lo1<tx0, vd0>> {
    public Context a;

    public o91(Context context) {
        this.a = context;
    }

    @Override // com.daaw.m10
    public String a(String str) {
        return str.toLowerCase();
    }

    @Override // com.daaw.m10
    /* renamed from: d */
    public boolean b(String str, lo1<tx0, vd0> lo1Var) {
        tx0.b j = lo1Var.a.j(this.a);
        if (j != null) {
            return j.h.toLowerCase().contains(str) || j.e.toLowerCase().contains(str);
        }
        return false;
    }

    @Override // com.daaw.m10
    /* renamed from: e */
    public void c(lo1<tx0, vd0> lo1Var) {
        lo1Var.a.h();
    }
}
