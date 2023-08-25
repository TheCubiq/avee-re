package com.daaw;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class vg4 {
    public final String a;
    public final jm3 b;
    public final Executor c;
    public ah4 d;
    public final zg3 e = new sg4(this);
    public final zg3 f = new ug4(this);

    public vg4(String str, jm3 jm3Var, Executor executor) {
        this.a = str;
        this.b = jm3Var;
        this.c = executor;
    }

    public static /* bridge */ /* synthetic */ boolean g(vg4 vg4Var, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(vg4Var.a);
    }

    public final void c(ah4 ah4Var) {
        this.b.b("/updateActiveView", this.e);
        this.b.b("/untrackActiveViewUnit", this.f);
        this.d = ah4Var;
    }

    public final void d(a74 a74Var) {
        a74Var.y("/updateActiveView", this.e);
        a74Var.y("/untrackActiveViewUnit", this.f);
    }

    public final void e() {
        this.b.c("/updateActiveView", this.e);
        this.b.c("/untrackActiveViewUnit", this.f);
    }

    public final void f(a74 a74Var) {
        a74Var.x("/updateActiveView", this.e);
        a74Var.x("/untrackActiveViewUnit", this.f);
    }
}
