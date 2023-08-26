package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzci;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbs implements Callable<zzci> {
    private final /* synthetic */ zzbp zzaba;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbs(zzbp zzbpVar) {
        this.zzaba = zzbpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ zzci call() throws Exception {
        zzang zzangVar;
        Context context;
        zzangVar = this.zzaba.zzyf;
        String str = zzangVar.zzcw;
        context = this.zzaba.mContext;
        return new zzci(zzch.zza(str, context, false));
    }
}
