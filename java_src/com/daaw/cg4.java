package com.daaw;

import android.text.TextUtils;
import java.util.Map;
/* loaded from: classes.dex */
public final class cg4 implements kf4 {

    /* renamed from: a */
    public final dh5 f5794a;

    public cg4(dh5 dh5Var) {
        this.f5794a = dh5Var;
    }

    @Override // com.daaw.kf4
    /* renamed from: a */
    public final void mo6086a(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f5794a.m24398m(str.equals("true"));
    }
}
