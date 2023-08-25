package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public class r91 implements m10<sc1> {

    /* renamed from: a */
    public Context f24984a;

    public r91(Context context) {
        this.f24984a = context;
    }

    @Override // com.daaw.m10
    /* renamed from: a */
    public String mo11570a(String str) {
        return str.toLowerCase();
    }

    @Override // com.daaw.m10
    /* renamed from: d */
    public boolean mo11569b(String str, sc1 sc1Var) {
        if (sc1Var != null) {
            return sc1Var.f22889a.toLowerCase().contains(str) || sc1Var.m10461a().toLowerCase().contains(str);
        }
        return false;
    }

    @Override // com.daaw.m10
    /* renamed from: e */
    public void mo11568c(sc1 sc1Var) {
    }
}
