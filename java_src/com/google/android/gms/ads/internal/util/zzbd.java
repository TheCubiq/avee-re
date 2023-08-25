package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class zzbd {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final List c = new ArrayList();

    public final zzbd zza(String str, double d, double d2) {
        int i = 0;
        while (i < this.a.size()) {
            double doubleValue = ((Double) this.c.get(i)).doubleValue();
            double doubleValue2 = ((Double) this.b.get(i)).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.a.add(i, str);
        this.c.add(i, Double.valueOf(d));
        this.b.add(i, Double.valueOf(d2));
        return this;
    }

    public final zzbf zzb() {
        return new zzbf(this, null);
    }
}
