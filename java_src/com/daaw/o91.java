package com.daaw;

import android.content.Context;
import com.daaw.tx0;
/* loaded from: classes.dex */
public class o91 implements m10<lo1<tx0, vd0>> {

    /* renamed from: a */
    public Context f21172a;

    public o91(Context context) {
        this.f21172a = context;
    }

    @Override // com.daaw.m10
    /* renamed from: a */
    public String mo11570a(String str) {
        return str.toLowerCase();
    }

    @Override // com.daaw.m10
    /* renamed from: d */
    public boolean mo11569b(String str, lo1<tx0, vd0> lo1Var) {
        tx0.C3143b m8742j = lo1Var.f17576a.m8742j(this.f21172a);
        if (m8742j != null) {
            return m8742j.f28210h.toLowerCase().contains(str) || m8742j.f28207e.toLowerCase().contains(str);
        }
        return false;
    }

    @Override // com.daaw.m10
    /* renamed from: e */
    public void mo11568c(lo1<tx0, vd0> lo1Var) {
        lo1Var.f17576a.m8744h();
    }
}
