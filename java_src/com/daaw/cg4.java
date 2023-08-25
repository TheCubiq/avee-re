package com.daaw;

import android.text.TextUtils;
import java.util.Map;
/* loaded from: classes.dex */
public final class cg4 implements kf4 {
    public final dh5 a;

    public cg4(dh5 dh5Var) {
        this.a = dh5Var;
    }

    @Override // com.daaw.kf4
    public final void a(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.m(str.equals("true"));
    }
}
