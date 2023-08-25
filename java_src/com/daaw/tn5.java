package com.daaw;

import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.client.zzej;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class tn5 extends fj3 {

    /* renamed from: p */
    public final /* synthetic */ zzej f27896p;

    public /* synthetic */ tn5(zzej zzejVar, zzeh zzehVar) {
        this.f27896p = zzejVar;
    }

    @Override // com.daaw.gj3
    /* renamed from: k2 */
    public final void mo8956k2(List list) {
        int i;
        ArrayList arrayList;
        synchronized (zzej.m1403e(this.f27896p)) {
            zzej.m1400h(this.f27896p, false);
            zzej.m1401g(this.f27896p, true);
            arrayList = new ArrayList(zzej.m1402f(this.f27896p));
            zzej.m1402f(this.f27896p).clear();
        }
        InitializationStatus m1404d = zzej.m1404d(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(m1404d);
        }
    }
}
