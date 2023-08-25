package com.daaw;

import android.content.Context;
import android.view.View;
import java.util.Map;
/* loaded from: classes.dex */
public final class vn2 extends no2 {
    public final Map i;
    public final View j;
    public final Context k;

    public vn2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2, Map map, View view, Context context) {
        super(wm2Var, "FdWssDbNTznwvaSwEiy9othUceULqhXS0NiSaXeIdQIZaN4heVunXmsWFB1bgBsj", "TzSf4nrBofZD4sG4/0KqSG9VhwNKl95AgxoEIclkVIM=", hi2Var, i, 85);
        this.i = map;
        this.j = view;
        this.k = context;
    }

    @Override // com.daaw.no2
    public final void a() {
        long[] jArr = {c(1), c(2)};
        Context context = this.k;
        if (context == null) {
            context = this.b.b();
        }
        long[] jArr2 = (long[]) this.f.invoke(null, jArr, context, this.j);
        long j = jArr2[0];
        this.i.put(1, Long.valueOf(jArr2[1]));
        long j2 = jArr2[2];
        this.i.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.e) {
            this.e.t0(j);
            this.e.s0(j2);
        }
    }

    public final long c(int i) {
        Map map = this.i;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return ((Long) this.i.get(valueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }
}
