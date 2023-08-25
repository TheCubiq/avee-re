package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public class r91 implements m10<sc1> {
    public Context a;

    public r91(Context context) {
        this.a = context;
    }

    @Override // com.daaw.m10
    public String a(String str) {
        return str.toLowerCase();
    }

    @Override // com.daaw.m10
    /* renamed from: d */
    public boolean b(String str, sc1 sc1Var) {
        if (sc1Var != null) {
            return sc1Var.a.toLowerCase().contains(str) || sc1Var.a().toLowerCase().contains(str);
        }
        return false;
    }

    @Override // com.daaw.m10
    /* renamed from: e */
    public void c(sc1 sc1Var) {
    }
}
