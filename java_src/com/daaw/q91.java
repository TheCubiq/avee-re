package com.daaw;

import android.content.Context;
import com.daaw.tx0;
/* loaded from: classes.dex */
public class q91 implements m10<tx0> {

    /* renamed from: a */
    public Context f23781a;

    public q91(Context context) {
        this.f23781a = context;
    }

    @Override // com.daaw.m10
    /* renamed from: a */
    public String mo11570a(String str) {
        return str.toLowerCase();
    }

    @Override // com.daaw.m10
    /* renamed from: d */
    public boolean mo11569b(String str, tx0 tx0Var) {
        tx0.C3143b m8742j = tx0Var.m8742j(this.f23781a);
        if (m8742j != null) {
            return m8742j.f28210h.toLowerCase().contains(str) || m8742j.f28207e.toLowerCase().contains(str);
        }
        return false;
    }

    @Override // com.daaw.m10
    /* renamed from: e */
    public void mo11568c(tx0 tx0Var) {
        tx0Var.m8744h();
    }
}
