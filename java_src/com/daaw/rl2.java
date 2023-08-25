package com.daaw;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class rl2 extends ql2 {
    public rl2(Context context, String str, boolean z) {
        super(context, str, z);
    }

    /* renamed from: p */
    public static rl2 m11197p(String str, Context context, boolean z) {
        ql2.m12348l(context, false);
        return new rl2(context, str, false);
    }

    @Deprecated
    /* renamed from: q */
    public static rl2 m11196q(String str, Context context, boolean z, int i) {
        ql2.m12348l(context, z);
        return new rl2(context, str, z);
    }

    @Override // com.daaw.ql2
    /* renamed from: j */
    public final List mo11198j(wm2 wm2Var, Context context, hi2 hi2Var, ai2 ai2Var) {
        if (wm2Var.m5995k() == null || !this.f24139J) {
            return super.mo11198j(wm2Var, context, hi2Var, null);
        }
        int m6005a = wm2Var.m6005a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.mo11198j(wm2Var, context, hi2Var, null));
        arrayList.add(new sn2(wm2Var, "dJwO6Cl9MRqD0Gc5K3JTdZycyClQqkAPKU0XDLxQQPeGCWqiQha6f2rP1wtqtwx3", "rLNLoOjJQBnuvnCDgD+yaoADKoI2087E89SpHXw4yFg=", hi2Var, m6005a, 24));
        return arrayList;
    }
}
