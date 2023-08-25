package com.daaw;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class rl2 extends ql2 {
    public rl2(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static rl2 p(String str, Context context, boolean z) {
        ql2.l(context, false);
        return new rl2(context, str, false);
    }

    @Deprecated
    public static rl2 q(String str, Context context, boolean z, int i) {
        ql2.l(context, z);
        return new rl2(context, str, z);
    }

    @Override // com.daaw.ql2
    public final List j(wm2 wm2Var, Context context, hi2 hi2Var, ai2 ai2Var) {
        if (wm2Var.k() == null || !this.J) {
            return super.j(wm2Var, context, hi2Var, null);
        }
        int a = wm2Var.a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.j(wm2Var, context, hi2Var, null));
        arrayList.add(new sn2(wm2Var, "dJwO6Cl9MRqD0Gc5K3JTdZycyClQqkAPKU0XDLxQQPeGCWqiQha6f2rP1wtqtwx3", "rLNLoOjJQBnuvnCDgD+yaoADKoI2087E89SpHXw4yFg=", hi2Var, a, 24));
        return arrayList;
    }
}
