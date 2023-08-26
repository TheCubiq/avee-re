package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzagd implements Callable<zzaga> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzagc zzckk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzagd(zzagc zzagcVar, Context context) {
        this.zzckk = zzagcVar;
        this.val$context = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ zzaga call() throws Exception {
        WeakHashMap weakHashMap;
        zzaga zzoo;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzckk.zzckj;
        zzage zzageVar = (zzage) weakHashMap.get(this.val$context);
        if (zzageVar != null) {
            if (!(zzageVar.zzckl + ((Long) zzkb.zzik().zzd(zznk.zzazw)).longValue() < com.google.android.gms.ads.internal.zzbv.zzer().currentTimeMillis())) {
                if (((Boolean) zzkb.zzik().zzd(zznk.zzazv)).booleanValue()) {
                    zzoo = new zzagb(this.val$context, zzageVar.zzckm).zzoo();
                    weakHashMap2 = this.zzckk.zzckj;
                    weakHashMap2.put(this.val$context, new zzage(this.zzckk, zzoo));
                    return zzoo;
                }
            }
        }
        zzoo = new zzagb(this.val$context).zzoo();
        weakHashMap2 = this.zzckk.zzckj;
        weakHashMap2.put(this.val$context, new zzage(this.zzckk, zzoo));
        return zzoo;
    }
}
