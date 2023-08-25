package com.daaw;

import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.client.zzej;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class tn5 extends fj3 {
    public final /* synthetic */ zzej p;

    public /* synthetic */ tn5(zzej zzejVar, zzeh zzehVar) {
        this.p = zzejVar;
    }

    @Override // com.daaw.gj3
    public final void k2(List list) {
        int i;
        ArrayList arrayList;
        synchronized (zzej.e(this.p)) {
            zzej.h(this.p, false);
            zzej.g(this.p, true);
            arrayList = new ArrayList(zzej.f(this.p));
            zzej.f(this.p).clear();
        }
        InitializationStatus d = zzej.d(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(d);
        }
    }
}
