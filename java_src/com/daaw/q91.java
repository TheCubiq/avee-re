package com.daaw;

import android.content.Context;
import com.daaw.tx0;
/* loaded from: classes.dex */
public class q91 implements m10<tx0> {
    public Context a;

    public q91(Context context) {
        this.a = context;
    }

    @Override // com.daaw.m10
    public String a(String str) {
        return str.toLowerCase();
    }

    @Override // com.daaw.m10
    /* renamed from: d */
    public boolean b(String str, tx0 tx0Var) {
        tx0.b j = tx0Var.j(this.a);
        if (j != null) {
            return j.h.toLowerCase().contains(str) || j.e.toLowerCase().contains(str);
        }
        return false;
    }

    @Override // com.daaw.m10
    /* renamed from: e */
    public void c(tx0 tx0Var) {
        tx0Var.h();
    }
}
