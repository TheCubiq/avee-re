package com.daaw;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class ac3 extends mc3 {
    public static final int x;
    public static final int y;
    public static final int z;
    public final String p;
    public final List q = new ArrayList();
    public final List r = new ArrayList();
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;

    static {
        int rgb = Color.rgb(12, 174, 206);
        x = rgb;
        y = Color.rgb(204, 204, 204);
        z = rgb;
    }

    public ac3(String str, List list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z2) {
        this.p = str;
        for (int i3 = 0; i3 < list.size(); i3++) {
            dc3 dc3Var = (dc3) list.get(i3);
            this.q.add(dc3Var);
            this.r.add(dc3Var);
        }
        this.s = num != null ? num.intValue() : y;
        this.t = num2 != null ? num2.intValue() : z;
        this.u = num3 != null ? num3.intValue() : 12;
        this.v = i;
        this.w = i2;
    }

    public final int h3() {
        return this.u;
    }

    public final List i3() {
        return this.q;
    }

    public final int zzb() {
        return this.v;
    }

    public final int zzc() {
        return this.w;
    }

    public final int zzd() {
        return this.s;
    }

    public final int zze() {
        return this.t;
    }

    @Override // com.daaw.nc3
    public final String zzg() {
        return this.p;
    }

    @Override // com.daaw.nc3
    public final List zzh() {
        return this.r;
    }
}
