package com.daaw;

import android.text.TextUtils;
import java.util.Map;
/* loaded from: classes.dex */
public final class wf4 implements kf4 {

    /* renamed from: a */
    public final sh6 f31217a;

    public wf4(sh6 sh6Var) {
        this.f31217a = sh6Var;
    }

    @Override // com.daaw.kf4
    /* renamed from: a */
    public final void mo6086a(Map map) {
        String str = (String) map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f31217a.m10341b(Boolean.parseBoolean(str));
        } catch (Exception unused) {
            throw new IllegalStateException("Invalid render_in_browser state");
        }
    }
}
