package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public class p91 implements m10<h60> {
    public p91(Context context) {
    }

    @Override // com.daaw.m10
    public String a(String str) {
        return str.toLowerCase();
    }

    @Override // com.daaw.m10
    /* renamed from: d */
    public boolean b(String str, h60 h60Var) {
        return h60Var.a.toLowerCase().contains(str);
    }

    @Override // com.daaw.m10
    /* renamed from: e */
    public void c(h60 h60Var) {
    }
}
