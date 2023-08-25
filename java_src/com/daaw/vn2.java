package com.daaw;

import android.content.Context;
import android.view.View;
import java.util.Map;
/* loaded from: classes.dex */
public final class vn2 extends no2 {

    /* renamed from: i */
    public final Map f30346i;

    /* renamed from: j */
    public final View f30347j;

    /* renamed from: k */
    public final Context f30348k;

    public vn2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2, Map map, View view, Context context) {
        super(wm2Var, "FdWssDbNTznwvaSwEiy9othUceULqhXS0NiSaXeIdQIZaN4heVunXmsWFB1bgBsj", "TzSf4nrBofZD4sG4/0KqSG9VhwNKl95AgxoEIclkVIM=", hi2Var, i, 85);
        this.f30346i = map;
        this.f30347j = view;
        this.f30348k = context;
    }

    @Override // com.daaw.no2
    /* renamed from: a */
    public final void mo2099a() {
        long[] jArr = {m6997c(1), m6997c(2)};
        Context context = this.f30348k;
        if (context == null) {
            context = this.f20525b.m6004b();
        }
        long[] jArr2 = (long[]) this.f20529f.invoke(null, jArr, context, this.f30347j);
        long j = jArr2[0];
        this.f30346i.put(1, Long.valueOf(jArr2[1]));
        long j2 = jArr2[2];
        this.f30346i.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.f20528e) {
            this.f20528e.m20744t0(j);
            this.f20528e.m20746s0(j2);
        }
    }

    /* renamed from: c */
    public final long m6997c(int i) {
        Map map = this.f30346i;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return ((Long) this.f30346i.get(valueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }
}
