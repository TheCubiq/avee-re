package com.daaw;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class ac3 extends mc3 {

    /* renamed from: x */
    public static final int f3064x;

    /* renamed from: y */
    public static final int f3065y;

    /* renamed from: z */
    public static final int f3066z;

    /* renamed from: p */
    public final String f3067p;

    /* renamed from: q */
    public final List f3068q = new ArrayList();

    /* renamed from: r */
    public final List f3069r = new ArrayList();

    /* renamed from: s */
    public final int f3070s;

    /* renamed from: t */
    public final int f3071t;

    /* renamed from: u */
    public final int f3072u;

    /* renamed from: v */
    public final int f3073v;

    /* renamed from: w */
    public final int f3074w;

    static {
        int rgb = Color.rgb(12, 174, 206);
        f3064x = rgb;
        f3065y = Color.rgb(204, 204, 204);
        f3066z = rgb;
    }

    public ac3(String str, List list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        this.f3067p = str;
        for (int i3 = 0; i3 < list.size(); i3++) {
            dc3 dc3Var = (dc3) list.get(i3);
            this.f3068q.add(dc3Var);
            this.f3069r.add(dc3Var);
        }
        this.f3070s = num != null ? num.intValue() : f3065y;
        this.f3071t = num2 != null ? num2.intValue() : f3066z;
        this.f3072u = num3 != null ? num3.intValue() : 12;
        this.f3073v = i;
        this.f3074w = i2;
    }

    /* renamed from: h3 */
    public final int m27535h3() {
        return this.f3072u;
    }

    /* renamed from: i3 */
    public final List m27534i3() {
        return this.f3068q;
    }

    public final int zzb() {
        return this.f3073v;
    }

    public final int zzc() {
        return this.f3074w;
    }

    public final int zzd() {
        return this.f3070s;
    }

    public final int zze() {
        return this.f3071t;
    }

    @Override // com.daaw.nc3
    public final String zzg() {
        return this.f3067p;
    }

    @Override // com.daaw.nc3
    public final List zzh() {
        return this.f3069r;
    }
}
