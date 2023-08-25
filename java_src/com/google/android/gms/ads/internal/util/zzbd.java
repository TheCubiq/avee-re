package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class zzbd {

    /* renamed from: a */
    public final List f36266a = new ArrayList();

    /* renamed from: b */
    public final List f36267b = new ArrayList();

    /* renamed from: c */
    public final List f36268c = new ArrayList();

    public final zzbd zza(String str, double d, double d2) {
        int i = 0;
        while (i < this.f36266a.size()) {
            double doubleValue = ((Double) this.f36268c.get(i)).doubleValue();
            double doubleValue2 = ((Double) this.f36267b.get(i)).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.f36266a.add(i, str);
        this.f36268c.add(i, Double.valueOf(d));
        this.f36267b.add(i, Double.valueOf(d2));
        return this;
    }

    public final zzbf zzb() {
        return new zzbf(this, null);
    }
}
